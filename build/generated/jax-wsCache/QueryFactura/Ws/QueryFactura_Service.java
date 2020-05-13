
package Ws;

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
 * JAX-WS RI 2.3.1
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "QueryFactura", targetNamespace = "http://EjemploWS.InduccionWs.guatx.com/", wsdlLocation = "http://localhost:9091/InduccionWs/QueryFactura?WSDL")
public class QueryFactura_Service
    extends Service
{

    private final static URL QUERYFACTURA_WSDL_LOCATION;
    private final static WebServiceException QUERYFACTURA_EXCEPTION;
    private final static QName QUERYFACTURA_QNAME = new QName("http://EjemploWS.InduccionWs.guatx.com/", "QueryFactura");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:9091/InduccionWs/QueryFactura?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        QUERYFACTURA_WSDL_LOCATION = url;
        QUERYFACTURA_EXCEPTION = e;
    }

    public QueryFactura_Service() {
        super(__getWsdlLocation(), QUERYFACTURA_QNAME);
    }

    public QueryFactura_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), QUERYFACTURA_QNAME, features);
    }

    public QueryFactura_Service(URL wsdlLocation) {
        super(wsdlLocation, QUERYFACTURA_QNAME);
    }

    public QueryFactura_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, QUERYFACTURA_QNAME, features);
    }

    public QueryFactura_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public QueryFactura_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns QueryFactura
     */
    @WebEndpoint(name = "QueryFacturaPort")
    public QueryFactura getQueryFacturaPort() {
        return super.getPort(new QName("http://EjemploWS.InduccionWs.guatx.com/", "QueryFacturaPort"), QueryFactura.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns QueryFactura
     */
    @WebEndpoint(name = "QueryFacturaPort")
    public QueryFactura getQueryFacturaPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://EjemploWS.InduccionWs.guatx.com/", "QueryFacturaPort"), QueryFactura.class, features);
    }

    private static URL __getWsdlLocation() {
        if (QUERYFACTURA_EXCEPTION!= null) {
            throw QUERYFACTURA_EXCEPTION;
        }
        return QUERYFACTURA_WSDL_LOCATION;
    }

}