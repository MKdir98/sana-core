
package ir.iais.sana.service;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dataType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dataType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SANAMA"/&gt;
 *     &lt;enumeration value="SANA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "dataType")
@XmlEnum
public enum DataType {

    SANAMA,
    SANA;

    public String value() {
        return name();
    }

    public static DataType fromValue(String v) {
        return valueOf(v);
    }

}
