
package ir.iais.sana.service;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.3.5
 * 2021-03-27T14:44:15.378+04:30
 * Generated source version: 3.3.5
 */

@WebFault(name = "DataTypeNotSupportedException", targetNamespace = "http://servicebus.sana.ir/PushSana/v4/")
public class DataTypeNotSupportedExceptionException extends Exception {

    private DataTypeNotSupportedException dataTypeNotSupportedException;

    public DataTypeNotSupportedExceptionException() {
        super();
    }

    public DataTypeNotSupportedExceptionException(String message) {
        super(message);
    }

    public DataTypeNotSupportedExceptionException(String message, Throwable cause) {
        super(message, cause);
    }

    public DataTypeNotSupportedExceptionException(String message, DataTypeNotSupportedException dataTypeNotSupportedException) {
        super(message);
        this.dataTypeNotSupportedException = dataTypeNotSupportedException;
    }

    public DataTypeNotSupportedExceptionException(String message, DataTypeNotSupportedException dataTypeNotSupportedException, Throwable cause) {
        super(message, cause);
        this.dataTypeNotSupportedException = dataTypeNotSupportedException;
    }

    public DataTypeNotSupportedException getFaultInfo() {
        return this.dataTypeNotSupportedException;
    }
}
