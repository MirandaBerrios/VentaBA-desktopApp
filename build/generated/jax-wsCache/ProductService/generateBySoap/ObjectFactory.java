
package generateBySoap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the generateBySoap package. 
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

    private final static QName _Hello_QNAME = new QName("http://Service/", "hello");
    private final static QName _GetAllProductResponse_QNAME = new QName("http://Service/", "getAllProductResponse");
    private final static QName _GetAllProduct_QNAME = new QName("http://Service/", "getAllProduct");
    private final static QName _HelloResponse_QNAME = new QName("http://Service/", "helloResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: generateBySoap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link GetAllProductResponse }
     * 
     */
    public GetAllProductResponse createGetAllProductResponse() {
        return new GetAllProductResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link GetAllProduct }
     * 
     */
    public GetAllProduct createGetAllProduct() {
        return new GetAllProduct();
    }

    /**
     * Create an instance of {@link Product }
     * 
     */
    public Product createProduct() {
        return new Product();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllProductResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service/", name = "getAllProductResponse")
    public JAXBElement<GetAllProductResponse> createGetAllProductResponse(GetAllProductResponse value) {
        return new JAXBElement<GetAllProductResponse>(_GetAllProductResponse_QNAME, GetAllProductResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllProduct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service/", name = "getAllProduct")
    public JAXBElement<GetAllProduct> createGetAllProduct(GetAllProduct value) {
        return new JAXBElement<GetAllProduct>(_GetAllProduct_QNAME, GetAllProduct.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

}
