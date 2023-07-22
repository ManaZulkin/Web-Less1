
package generatedCode;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for color.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="color"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="yes"/&gt;
 *     &lt;enumeration value="no"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "color")
@XmlEnum
public enum Color {

    @XmlEnumValue("yes")
    YES("yes"),
    @XmlEnumValue("no")
    NO("no");
    private final String value;

    Color(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Color fromValue(String v) {
        for (Color c: Color.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
