package ir.iais.sana;

import ir.iais.sana.domain.service.PortConfig;
import ir.iais.sana.exceptions.SanaSecurityException;
import ir.iais.sana.service.PushSana;
import ir.iais.sana.service.PushSanaService;
import ir.iais.sana.util.CertificatePasswordCallbackHandler;
import ir.iais.sana.exceptions.CreatePortException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.wss4j.common.crypto.JasyptPasswordEncryptor;
import org.apache.wss4j.common.crypto.Merlin;

import javax.xml.ws.BindingProvider;
import java.io.File;
import java.util.Properties;

public class SanaCore {

    private static final Logger logger = LogManager.getLogger(SanaCore.class);
    private static SanaCore sanaCoreInstance;

    private SanaCore() {
    }

    public static SanaCore getInstance() {
        if (sanaCoreInstance == null) {
            sanaCoreInstance = new SanaCore();
        }
        return sanaCoreInstance;
    }



    public PushSana getPushSanaPort(PortConfig portConfig) throws CreatePortException {
        try {
            PushSanaService pushSanaV4Service = new PushSanaService();
            PushSana pushSanaPort = pushSanaV4Service.getPushSanaPort();
            Merlin signatureMerlin = getSignatureMerlinProperties(portConfig.getKeyPairKeyStoreFile(),
                    portConfig.getKeyPairKeyStorePassword(), portConfig.getKeyPairPassword(), portConfig.getKeyPairIdentifier());
            Merlin encryptionMerlin = getEncryptionMerlinProperties(portConfig.getCertificateKeyStoreFile(), portConfig.getCertificateKeyStorePassword());
            java.util.Map<String, Object> ctx = ((BindingProvider) pushSanaPort).getRequestContext();
            ctx.put("security.signature.crypto", signatureMerlin);
            ctx.put("security.encryption.crypto", encryptionMerlin);
            ctx.put("ws-security.encryption.username", portConfig.getCertificateKeyStoreIdentifier());
            ctx.put("ws-security.asymmetric.signature.algorithm", "http://www.w3.org/2001/04/xmldsig-more#rsa-sha256");
            ctx.put("ws-security.callback-handler", new CertificatePasswordCallbackHandler(portConfig.getKeyPairPassword()));
            return pushSanaPort;
        } catch (Exception ex) {
            logger.error(ex, ex);
            throw new CreatePortException(ex.getMessage());
        }
    }

    private Merlin getEncryptionMerlinProperties(File certificateKeyStoreFile, String certificateKeyStorePassword) {
        try {
            Properties properties = new Properties();
            properties.setProperty("org.apache.ws.security.crypto.provider", "org.apache.ws.security.components.crypto.Merlin");
            properties.setProperty("org.apache.ws.security.crypto.merlin.keystore.type", "jks");
            properties.setProperty("org.apache.ws.security.crypto.merlin.keystore.password", certificateKeyStorePassword);
            properties.setProperty("org.apache.ws.security.crypto.merlin.keystore.file", certificateKeyStoreFile.getAbsolutePath());
            return new Merlin(properties, this.getClass().getClassLoader(), new JasyptPasswordEncryptor("masterPassword"));
        } catch (Exception ex) {
            logger.error(ex, ex);
            throw new SecurityException();
        }
    }

    private Merlin getSignatureMerlinProperties(File keyPairKeyStoreFile, String keyPairKeyStorePassword,
                                                String keyPairPassword, String keyPairIdentifier)
            throws SanaSecurityException {
        try {
            Properties properties = new Properties();
            properties.setProperty("org.apache.ws.security.crypto.merlin.keystore.private.password", keyPairPassword);
            properties.setProperty("org.apache.ws.security.crypto.provider", "org.apache.ws.security.components.crypto.Merlin");
            properties.setProperty("org.apache.ws.security.crypto.merlin.keystore.type", "jks");
            properties.setProperty("org.apache.ws.security.crypto.merlin.keystore.password", keyPairKeyStorePassword);
            properties.setProperty("org.apache.ws.security.crypto.merlin.keystore.file", keyPairKeyStoreFile.getAbsolutePath());
            properties.setProperty("org.apache.ws.security.crypto.merlin.keystore.alias", keyPairIdentifier);
            return new Merlin(properties, this.getClass().getClassLoader(), new JasyptPasswordEncryptor("masterPassword"));
        } catch (Exception ex) {
            logger.error(ex, ex);
            throw new SanaSecurityException(ex.getMessage());
        }
    }
}
