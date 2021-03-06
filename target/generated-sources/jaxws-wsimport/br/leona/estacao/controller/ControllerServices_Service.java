
package br.leona.estacao.controller;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ControllerServices", targetNamespace = "http://controller.estacao.leona.br/", wsdlLocation = "http://localhost:8080/Estacao_Leona/ControllerServices?wsdl")
public class ControllerServices_Service
    extends Service
{

    private final static URL CONTROLLERSERVICES_WSDL_LOCATION;
    private final static WebServiceException CONTROLLERSERVICES_EXCEPTION;
    private final static QName CONTROLLERSERVICES_QNAME = new QName("http://controller.estacao.leona.br/", "ControllerServices");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/Estacao_Leona/ControllerServices?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CONTROLLERSERVICES_WSDL_LOCATION = url;
        CONTROLLERSERVICES_EXCEPTION = e;
    }

    public ControllerServices_Service() {
        super(__getWsdlLocation(), CONTROLLERSERVICES_QNAME);
    }

    public ControllerServices_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), CONTROLLERSERVICES_QNAME, features);
    }

    public ControllerServices_Service(URL wsdlLocation) {
        super(wsdlLocation, CONTROLLERSERVICES_QNAME);
    }

    public ControllerServices_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CONTROLLERSERVICES_QNAME, features);
    }

    public ControllerServices_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ControllerServices_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ControllerServices
     */
    @WebEndpoint(name = "ControllerServicesPort")
    public ControllerServices getControllerServicesPort() {
        return super.getPort(new QName("http://controller.estacao.leona.br/", "ControllerServicesPort"), ControllerServices.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ControllerServices
     */
    @WebEndpoint(name = "ControllerServicesPort")
    public ControllerServices getControllerServicesPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://controller.estacao.leona.br/", "ControllerServicesPort"), ControllerServices.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CONTROLLERSERVICES_EXCEPTION!= null) {
            throw CONTROLLERSERVICES_EXCEPTION;
        }
        return CONTROLLERSERVICES_WSDL_LOCATION;
    }

}
