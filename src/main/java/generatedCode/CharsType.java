
package generatedCode;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for charsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="charsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="color" type="{}color"/&gt;
 *         &lt;element name="pages" type="{}pages"/&gt;
 *         &lt;element name="gloss" type="{}gloss"/&gt;
 *         &lt;element name="index" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "charsType", propOrder = {
    "color",
    "pages",
    "gloss",
    "index"
})
public class CharsType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected Color color;
    @XmlSchemaType(name = "integer")
    protected int pages;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected Gloss gloss;
    @XmlElement(required = true)
    protected String index;

    /**
     * Gets the value of the color property.
     * 
     * @return
     *     possible object is
     *     {@link Color }
     *     
     */
    public Color getColor() {
        return color;
    }

    /**
     * Sets the value of the color property.
     * 
     * @param value
     *     allowed object is
     *     {@link Color }
     *     
     */
    public void setColor(Color value) {
        this.color = value;
    }

    /**
     * Gets the value of the pages property.
     * 
     */
    public int getPages() {
        return pages;
    }

    /**
     * Sets the value of the pages property.
     * 
     */
    public void setPages(int value) {
        this.pages = value;
    }

    /**
     * Gets the value of the gloss property.
     * 
     * @return
     *     possible object is
     *     {@link Gloss }
     *     
     */
    public Gloss getGloss() {
        return gloss;
    }

    /**
     * Sets the value of the gloss property.
     * 
     * @param value
     *     allowed object is
     *     {@link Gloss }
     *     
     */
    public void setGloss(Gloss value) {
        this.gloss = value;
    }

    /**
     * Gets the value of the index property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndex() {
        return index;
    }

    /**
     * Sets the value of the index property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndex(String value) {
        this.index = value;
    }

}
