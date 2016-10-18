
package br.com.edumelo.primer.ws.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.com.edumelo.primer.ws.client package. 
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

    private final static QName _SayHelloToNames_QNAME = new QName("http://www.jboss.org/eap/quickstarts/wshelloworld/HelloWorld", "sayHelloToNames");
    private final static QName _SayHello_QNAME = new QName("http://www.jboss.org/eap/quickstarts/wshelloworld/HelloWorld", "sayHello");
    private final static QName _SayHelloToNameResponse_QNAME = new QName("http://www.jboss.org/eap/quickstarts/wshelloworld/HelloWorld", "sayHelloToNameResponse");
    private final static QName _SayHelloToNamesResponse_QNAME = new QName("http://www.jboss.org/eap/quickstarts/wshelloworld/HelloWorld", "sayHelloToNamesResponse");
    private final static QName _SayHelloResponse_QNAME = new QName("http://www.jboss.org/eap/quickstarts/wshelloworld/HelloWorld", "sayHelloResponse");
    private final static QName _SayHelloToName_QNAME = new QName("http://www.jboss.org/eap/quickstarts/wshelloworld/HelloWorld", "sayHelloToName");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.edumelo.primer.ws.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SayHello }
     * 
     */
    public SayHello createSayHello() {
        return new SayHello();
    }

    /**
     * Create an instance of {@link SayHelloToNames }
     * 
     */
    public SayHelloToNames createSayHelloToNames() {
        return new SayHelloToNames();
    }

    /**
     * Create an instance of {@link SayHelloToNameResponse }
     * 
     */
    public SayHelloToNameResponse createSayHelloToNameResponse() {
        return new SayHelloToNameResponse();
    }

    /**
     * Create an instance of {@link SayHelloResponse }
     * 
     */
    public SayHelloResponse createSayHelloResponse() {
        return new SayHelloResponse();
    }

    /**
     * Create an instance of {@link SayHelloToName }
     * 
     */
    public SayHelloToName createSayHelloToName() {
        return new SayHelloToName();
    }

    /**
     * Create an instance of {@link SayHelloToNamesResponse }
     * 
     */
    public SayHelloToNamesResponse createSayHelloToNamesResponse() {
        return new SayHelloToNamesResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHelloToNames }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.jboss.org/eap/quickstarts/wshelloworld/HelloWorld", name = "sayHelloToNames")
    public JAXBElement<SayHelloToNames> createSayHelloToNames(SayHelloToNames value) {
        return new JAXBElement<SayHelloToNames>(_SayHelloToNames_QNAME, SayHelloToNames.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.jboss.org/eap/quickstarts/wshelloworld/HelloWorld", name = "sayHello")
    public JAXBElement<SayHello> createSayHello(SayHello value) {
        return new JAXBElement<SayHello>(_SayHello_QNAME, SayHello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHelloToNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.jboss.org/eap/quickstarts/wshelloworld/HelloWorld", name = "sayHelloToNameResponse")
    public JAXBElement<SayHelloToNameResponse> createSayHelloToNameResponse(SayHelloToNameResponse value) {
        return new JAXBElement<SayHelloToNameResponse>(_SayHelloToNameResponse_QNAME, SayHelloToNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHelloToNamesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.jboss.org/eap/quickstarts/wshelloworld/HelloWorld", name = "sayHelloToNamesResponse")
    public JAXBElement<SayHelloToNamesResponse> createSayHelloToNamesResponse(SayHelloToNamesResponse value) {
        return new JAXBElement<SayHelloToNamesResponse>(_SayHelloToNamesResponse_QNAME, SayHelloToNamesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.jboss.org/eap/quickstarts/wshelloworld/HelloWorld", name = "sayHelloResponse")
    public JAXBElement<SayHelloResponse> createSayHelloResponse(SayHelloResponse value) {
        return new JAXBElement<SayHelloResponse>(_SayHelloResponse_QNAME, SayHelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHelloToName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.jboss.org/eap/quickstarts/wshelloworld/HelloWorld", name = "sayHelloToName")
    public JAXBElement<SayHelloToName> createSayHelloToName(SayHelloToName value) {
        return new JAXBElement<SayHelloToName>(_SayHelloToName_QNAME, SayHelloToName.class, null, value);
    }

}
