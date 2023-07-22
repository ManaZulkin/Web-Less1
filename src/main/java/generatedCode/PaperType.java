
package generatedCode;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for paperType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="paperType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="type" type="{}type"/&gt;
 *         &lt;element name="monthly" type="{}monthly"/&gt;
 *         &lt;element name="chars" type="{}charsType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "paperType", propOrder = {
    "title",
    "type",
    "monthly",
    "chars"
})
public class PaperType {

    @XmlElement(required = true)
    protected String title;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected Type type;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected Monthly monthly;
    @XmlElement(required = true)
    protected CharsType chars;

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link Type }
     *     
     */
    public Type getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link Type }
     *     
     */
    public void setType(Type value) {
        this.type = value;
    }

    /**
     * Gets the value of the monthly property.
     * 
     * @return
     *     possible object is
     *     {@link Monthly }
     *     
     */
    public Monthly getMonthly() {
        return monthly;
    }

    /**
     * Sets the value of the monthly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Monthly }
     *     
     */
    public void setMonthly(Monthly value) {
        this.monthly = value;
    }

    /**
     * Gets the value of the chars property.
     * 
     * @return
     *     possible object is
     *     {@link CharsType }
     *     
     */
    public CharsType getChars() {
        return chars;
    }

    /**
     * Sets the value of the chars property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharsType }
     *     
     */
    public void setChars(CharsType value) {
        this.chars = value;
    }

}
