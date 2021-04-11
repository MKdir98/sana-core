
package ir.iais.sana.service;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.3.5
 * 2021-03-27T14:44:15.368+04:30
 * Generated source version: 3.3.5
 */

@WebFault(name = "DomainException", targetNamespace = "http://servicebus.sana.ir/PushSana/v4/")
public class DomainExceptionException extends Exception {

    private DomainException domainException;

    public DomainExceptionException() {
        super();
    }

    public DomainExceptionException(String message) {
        super(message);
    }

    public DomainExceptionException(String message, Throwable cause) {
        super(message, cause);
    }

    public DomainExceptionException(String message, DomainException domainException) {
        super(message);
        this.domainException = domainException;
    }

    public DomainExceptionException(String message, DomainException domainException, Throwable cause) {
        super(message, cause);
        this.domainException = domainException;
    }

    public DomainException getFaultInfo() {
        return this.domainException;
    }
}