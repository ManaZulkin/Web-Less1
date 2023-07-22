
package generatedCode;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for gloss.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="gloss"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="yes"/&gt;
 *     &lt;enumeration value="no"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "gloss")
@XmlEnum
public enum Gloss {

    @XmlEnumValue("yes")
    YES("yes"),
    @XmlEnumValue("no")
    NO("no");
    private final String value;

    Gloss(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Gloss fromValue(String v) {
        for (Gloss c: Gloss.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
