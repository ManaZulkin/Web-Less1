
package generatedCode;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for monthly.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="monthly"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="monthly"/&gt;
 *     &lt;enumeration value="weekly"/&gt;
 *     &lt;enumeration value="cvartal"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "monthly")
@XmlEnum
public enum Monthly {

    @XmlEnumValue("monthly")
    MONTHLY("monthly"),
    @XmlEnumValue("weekly")
    WEEKLY("weekly"),
    @XmlEnumValue("cvartal")
    CVARTAL("cvartal");
    private final String value;

    Monthly(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Monthly fromValue(String v) {
        for (Monthly c: Monthly.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
