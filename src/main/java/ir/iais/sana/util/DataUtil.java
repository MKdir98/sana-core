package ir.iais.sana.util;

import com.google.gson.Gson;
import ir.iais.sana.domain.sana.*;
import ir.iais.sana.domain.sanama.SanamaInfo;
import ir.iais.sana.service.DataPart;
import org.apache.commons.lang3.SerializationUtils;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DataUtil {

    private static DataUtil dataUtilInstance;


    private DataUtil() {
    }

    public static DataUtil getInstance() {
        if (dataUtilInstance == null) {
            dataUtilInstance = new DataUtil();
        }
        return dataUtilInstance;
    }

    public SanamaInfo convertXmlSanamaFileToSanamaDataObject(File sanamaFile) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(SanamaInfo.class);
        Unmarshaller jaxbUnmarshal = jaxbContext.createUnmarshaller();
        return (SanamaInfo) jaxbUnmarshal.unmarshal(sanamaFile);
    }

    public byte[] convertDataObjectToArrayBytes(Object dataObject) {
        return SerializationUtils.serialize(new Gson().toJson(dataObject));
    }

    public List<DataPart> convertDataBytesToDataParts(byte[] sanamaInfoBytes, long id) {
        List<DataPart> dataParts = new ArrayList<>();
        int packetSize = 100000;
        int number = sanamaInfoBytes.length / packetSize + 1;
        for (int i = 0; i < number; i++) {
            byte[] splitData;
            if (i == number - 1) {
                splitData = new byte[sanamaInfoBytes.length - i * packetSize];
                System.arraycopy(sanamaInfoBytes, i * packetSize, splitData, 0, sanamaInfoBytes.length - i * packetSize);
            } else {
                splitData = new byte[packetSize];
                System.arraycopy(sanamaInfoBytes, i * packetSize, splitData, 0, packetSize);
            }
            DataPart dataPart = new DataPart();
            dataPart.setData(splitData);
            dataPart.setId(id);
            dataPart.setIndex(i);
            dataParts.add(dataPart);
        }
        return dataParts;
    }

    public SanaInfo convertSanaExcelToSanaSanaDataObject(File sanaFile) throws IOException {
        SanaInfo sanaInfo = new SanaInfo();
        try (Workbook workbook = WorkbookFactory.create(sanaFile)) {
            sanaInfo.setProtocolId(PoiObjectUtil.getObjectFromSheet(workbook.getSheet("Protocol_ID"), ProtocolId.class).get(0));
            sanaInfo.setAccVoucherList(PoiObjectUtil.getObjectFromSheet(workbook.getSheet("AccVoucher"), AccVoucher.class));
            sanaInfo.setAccGroupsCodeList(PoiObjectUtil.getObjectFromSheet(workbook.getSheet("AccGroupsCode"), AccGroupsCode.class));
            sanaInfo.setGeneralAccCodeList(PoiObjectUtil.getObjectFromSheet(workbook.getSheet("GeneralACCCode"), GeneralAccCode.class));
            sanaInfo.setLedgerAccCodeList(PoiObjectUtil.getObjectFromSheet(workbook.getSheet("LedgerAccCode"), LedgerAccCode.class));
            sanaInfo.setDetailedAccCode1List(PoiObjectUtil.getObjectFromSheet(workbook.getSheet("DetailedAccCode1"), DetailedAccCode1.class));
            sanaInfo.setDetailedAccCode2List(PoiObjectUtil.getObjectFromSheet(workbook.getSheet("DetailedAccCode2"), DetailedAccCode2.class));
            sanaInfo.setDetailedAccCode3List(PoiObjectUtil.getObjectFromSheet(workbook.getSheet("DetailedAccCode3"), DetailedAccCode3.class));
            sanaInfo.setDetailedAccCode4List(PoiObjectUtil.getObjectFromSheet(workbook.getSheet("DetailedAccCode4"), DetailedAccCode4.class));
            sanaInfo.setDetailedAccCode5List(PoiObjectUtil.getObjectFromSheet(workbook.getSheet("DetailedAccCode5"), DetailedAccCode5.class));
            sanaInfo.setCostCenterList(PoiObjectUtil.getObjectFromSheet(workbook.getSheet("CostCenter"), CostCenter.class));
            sanaInfo.setOrganizationList(PoiObjectUtil.getObjectFromSheet(workbook.getSheet("Organization"), Organization.class));
            sanaInfo.setProgramList(PoiObjectUtil.getObjectFromSheet(workbook.getSheet("Program_"), Program.class));
            sanaInfo.setPlanList(PoiObjectUtil.getObjectFromSheet(workbook.getSheet("Plan"), Plan.class));
            sanaInfo.setProjectList(PoiObjectUtil.getObjectFromSheet(workbook.getSheet("Project_"), Project.class));
            sanaInfo.setIncomeList(PoiObjectUtil.getObjectFromSheet(workbook.getSheet("Income"), Income.class));
            sanaInfo.setBankAccountList(PoiObjectUtil.getObjectFromSheet(workbook.getSheet("BankAccount"), BankAccount.class));
            sanaInfo.setAccountFlowList(PoiObjectUtil.getObjectFromSheet(workbook.getSheet("AccountFlow"), AccountFlow.class));
        }
        return sanaInfo;
    }
}
