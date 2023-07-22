
package generatedCode;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the generatedCode package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Paper_QNAME = new QName("", "paper");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: generatedCode
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PaperType }
     * 
     */
    public PaperType createPaperType() {
        return new PaperType();
    }

    /**
     * Create an instance of {@link CharsType }
     * 
     */
    public CharsType createCharsType() {
        return new CharsType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaperType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PaperType }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "paper")
    public JAXBElement<PaperType> createPaper(PaperType value) {
        return new JAXBElement<PaperType>(_Paper_QNAME, PaperType.class, null, value);
    }

}
