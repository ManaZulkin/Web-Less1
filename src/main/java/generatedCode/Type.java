
package generatedCode;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="type"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Magazine"/&gt;
 *     &lt;enumeration value="Paper"/&gt;
 *     &lt;enumeration value="Booklet"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "type")
@XmlEnum
public enum Type {

    @XmlEnumValue("Magazine")
    MAGAZINE("Magazine"),
    @XmlEnumValue("Paper")
    PAPER("Paper"),
    @XmlEnumValue("Booklet")
    BOOKLET("Booklet");
    private final String value;

    Type(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Type fromValue(String v) {
        for (Type c: Type.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
