
package br.leona.estacao.controller;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.leona.estacao.controller package. 
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

    private final static QName _MoverEsquerdaResponse_QNAME = new QName("http://controller.estacao.leona.br/", "MoverEsquerdaResponse");
    private final static QName _MoverEsquerda_QNAME = new QName("http://controller.estacao.leona.br/", "MoverEsquerda");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.leona.estacao.controller
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MoverEsquerda }
     * 
     */
    public MoverEsquerda createMoverEsquerda() {
        return new MoverEsquerda();
    }

    /**
     * Create an instance of {@link MoverEsquerdaResponse }
     * 
     */
    public MoverEsquerdaResponse createMoverEsquerdaResponse() {
        return new MoverEsquerdaResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MoverEsquerdaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controller.estacao.leona.br/", name = "MoverEsquerdaResponse")
    public JAXBElement<MoverEsquerdaResponse> createMoverEsquerdaResponse(MoverEsquerdaResponse value) {
        return new JAXBElement<MoverEsquerdaResponse>(_MoverEsquerdaResponse_QNAME, MoverEsquerdaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MoverEsquerda }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controller.estacao.leona.br/", name = "MoverEsquerda")
    public JAXBElement<MoverEsquerda> createMoverEsquerda(MoverEsquerda value) {
        return new JAXBElement<MoverEsquerda>(_MoverEsquerda_QNAME, MoverEsquerda.class, null, value);
    }

}
