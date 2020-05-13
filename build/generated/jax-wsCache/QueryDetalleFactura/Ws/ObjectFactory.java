
package Ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the Ws package. 
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

    private final static QName _ELIMINARDETALLE_QNAME = new QName("http://EjemploWS.InduccionWs.guatx.com/", "ELIMINAR__DETALLE");
    private final static QName _ELIMINARDETALLEResponse_QNAME = new QName("http://EjemploWS.InduccionWs.guatx.com/", "ELIMINAR__DETALLEResponse");
    private final static QName _INSERTARDETALLE_QNAME = new QName("http://EjemploWS.InduccionWs.guatx.com/", "INSERTAR_DETALLE");
    private final static QName _INSERTARDETALLEResponse_QNAME = new QName("http://EjemploWS.InduccionWs.guatx.com/", "INSERTAR_DETALLEResponse");
    private final static QName _LASTNUMDETALLE_QNAME = new QName("http://EjemploWS.InduccionWs.guatx.com/", "LAST_NUMDETALLE");
    private final static QName _LASTNUMDETALLEResponse_QNAME = new QName("http://EjemploWS.InduccionWs.guatx.com/", "LAST_NUMDETALLEResponse");
    private final static QName _LISTARDETALLES_QNAME = new QName("http://EjemploWS.InduccionWs.guatx.com/", "LISTAR_DETALLES");
    private final static QName _LISTARDETALLESResponse_QNAME = new QName("http://EjemploWS.InduccionWs.guatx.com/", "LISTAR_DETALLESResponse");
    private final static QName _LISTARDETALLESFACTURA_QNAME = new QName("http://EjemploWS.InduccionWs.guatx.com/", "LISTAR_DETALLES_FACTURA");
    private final static QName _LISTARDETALLESFACTURAResponse_QNAME = new QName("http://EjemploWS.InduccionWs.guatx.com/", "LISTAR_DETALLES_FACTURAResponse");
    private final static QName _MODIFICARDETALLE_QNAME = new QName("http://EjemploWS.InduccionWs.guatx.com/", "MODIFICAR_DETALLE");
    private final static QName _MODIFICARDETALLEResponse_QNAME = new QName("http://EjemploWS.InduccionWs.guatx.com/", "MODIFICAR_DETALLEResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: Ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ELIMINARDETALLE }
     * 
     */
    public ELIMINARDETALLE createELIMINARDETALLE() {
        return new ELIMINARDETALLE();
    }

    /**
     * Create an instance of {@link ELIMINARDETALLEResponse }
     * 
     */
    public ELIMINARDETALLEResponse createELIMINARDETALLEResponse() {
        return new ELIMINARDETALLEResponse();
    }

    /**
     * Create an instance of {@link INSERTARDETALLE }
     * 
     */
    public INSERTARDETALLE createINSERTARDETALLE() {
        return new INSERTARDETALLE();
    }

    /**
     * Create an instance of {@link INSERTARDETALLEResponse }
     * 
     */
    public INSERTARDETALLEResponse createINSERTARDETALLEResponse() {
        return new INSERTARDETALLEResponse();
    }

    /**
     * Create an instance of {@link LASTNUMDETALLE }
     * 
     */
    public LASTNUMDETALLE createLASTNUMDETALLE() {
        return new LASTNUMDETALLE();
    }

    /**
     * Create an instance of {@link LASTNUMDETALLEResponse }
     * 
     */
    public LASTNUMDETALLEResponse createLASTNUMDETALLEResponse() {
        return new LASTNUMDETALLEResponse();
    }

    /**
     * Create an instance of {@link LISTARDETALLES }
     * 
     */
    public LISTARDETALLES createLISTARDETALLES() {
        return new LISTARDETALLES();
    }

    /**
     * Create an instance of {@link LISTARDETALLESResponse }
     * 
     */
    public LISTARDETALLESResponse createLISTARDETALLESResponse() {
        return new LISTARDETALLESResponse();
    }

    /**
     * Create an instance of {@link LISTARDETALLESFACTURA }
     * 
     */
    public LISTARDETALLESFACTURA createLISTARDETALLESFACTURA() {
        return new LISTARDETALLESFACTURA();
    }

    /**
     * Create an instance of {@link LISTARDETALLESFACTURAResponse }
     * 
     */
    public LISTARDETALLESFACTURAResponse createLISTARDETALLESFACTURAResponse() {
        return new LISTARDETALLESFACTURAResponse();
    }

    /**
     * Create an instance of {@link MODIFICARDETALLE }
     * 
     */
    public MODIFICARDETALLE createMODIFICARDETALLE() {
        return new MODIFICARDETALLE();
    }

    /**
     * Create an instance of {@link MODIFICARDETALLEResponse }
     * 
     */
    public MODIFICARDETALLEResponse createMODIFICARDETALLEResponse() {
        return new MODIFICARDETALLEResponse();
    }

    /**
     * Create an instance of {@link DetalleFactura }
     * 
     */
    public DetalleFactura createDetalleFactura() {
        return new DetalleFactura();
    }

    /**
     * Create an instance of {@link Factura }
     * 
     */
    public Factura createFactura() {
        return new Factura();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ELIMINARDETALLE }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ELIMINARDETALLE }{@code >}
     */
    @XmlElementDecl(namespace = "http://EjemploWS.InduccionWs.guatx.com/", name = "ELIMINAR__DETALLE")
    public JAXBElement<ELIMINARDETALLE> createELIMINARDETALLE(ELIMINARDETALLE value) {
        return new JAXBElement<ELIMINARDETALLE>(_ELIMINARDETALLE_QNAME, ELIMINARDETALLE.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ELIMINARDETALLEResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ELIMINARDETALLEResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://EjemploWS.InduccionWs.guatx.com/", name = "ELIMINAR__DETALLEResponse")
    public JAXBElement<ELIMINARDETALLEResponse> createELIMINARDETALLEResponse(ELIMINARDETALLEResponse value) {
        return new JAXBElement<ELIMINARDETALLEResponse>(_ELIMINARDETALLEResponse_QNAME, ELIMINARDETALLEResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link INSERTARDETALLE }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link INSERTARDETALLE }{@code >}
     */
    @XmlElementDecl(namespace = "http://EjemploWS.InduccionWs.guatx.com/", name = "INSERTAR_DETALLE")
    public JAXBElement<INSERTARDETALLE> createINSERTARDETALLE(INSERTARDETALLE value) {
        return new JAXBElement<INSERTARDETALLE>(_INSERTARDETALLE_QNAME, INSERTARDETALLE.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link INSERTARDETALLEResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link INSERTARDETALLEResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://EjemploWS.InduccionWs.guatx.com/", name = "INSERTAR_DETALLEResponse")
    public JAXBElement<INSERTARDETALLEResponse> createINSERTARDETALLEResponse(INSERTARDETALLEResponse value) {
        return new JAXBElement<INSERTARDETALLEResponse>(_INSERTARDETALLEResponse_QNAME, INSERTARDETALLEResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LASTNUMDETALLE }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LASTNUMDETALLE }{@code >}
     */
    @XmlElementDecl(namespace = "http://EjemploWS.InduccionWs.guatx.com/", name = "LAST_NUMDETALLE")
    public JAXBElement<LASTNUMDETALLE> createLASTNUMDETALLE(LASTNUMDETALLE value) {
        return new JAXBElement<LASTNUMDETALLE>(_LASTNUMDETALLE_QNAME, LASTNUMDETALLE.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LASTNUMDETALLEResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LASTNUMDETALLEResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://EjemploWS.InduccionWs.guatx.com/", name = "LAST_NUMDETALLEResponse")
    public JAXBElement<LASTNUMDETALLEResponse> createLASTNUMDETALLEResponse(LASTNUMDETALLEResponse value) {
        return new JAXBElement<LASTNUMDETALLEResponse>(_LASTNUMDETALLEResponse_QNAME, LASTNUMDETALLEResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LISTARDETALLES }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LISTARDETALLES }{@code >}
     */
    @XmlElementDecl(namespace = "http://EjemploWS.InduccionWs.guatx.com/", name = "LISTAR_DETALLES")
    public JAXBElement<LISTARDETALLES> createLISTARDETALLES(LISTARDETALLES value) {
        return new JAXBElement<LISTARDETALLES>(_LISTARDETALLES_QNAME, LISTARDETALLES.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LISTARDETALLESResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LISTARDETALLESResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://EjemploWS.InduccionWs.guatx.com/", name = "LISTAR_DETALLESResponse")
    public JAXBElement<LISTARDETALLESResponse> createLISTARDETALLESResponse(LISTARDETALLESResponse value) {
        return new JAXBElement<LISTARDETALLESResponse>(_LISTARDETALLESResponse_QNAME, LISTARDETALLESResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LISTARDETALLESFACTURA }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LISTARDETALLESFACTURA }{@code >}
     */
    @XmlElementDecl(namespace = "http://EjemploWS.InduccionWs.guatx.com/", name = "LISTAR_DETALLES_FACTURA")
    public JAXBElement<LISTARDETALLESFACTURA> createLISTARDETALLESFACTURA(LISTARDETALLESFACTURA value) {
        return new JAXBElement<LISTARDETALLESFACTURA>(_LISTARDETALLESFACTURA_QNAME, LISTARDETALLESFACTURA.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LISTARDETALLESFACTURAResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LISTARDETALLESFACTURAResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://EjemploWS.InduccionWs.guatx.com/", name = "LISTAR_DETALLES_FACTURAResponse")
    public JAXBElement<LISTARDETALLESFACTURAResponse> createLISTARDETALLESFACTURAResponse(LISTARDETALLESFACTURAResponse value) {
        return new JAXBElement<LISTARDETALLESFACTURAResponse>(_LISTARDETALLESFACTURAResponse_QNAME, LISTARDETALLESFACTURAResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MODIFICARDETALLE }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MODIFICARDETALLE }{@code >}
     */
    @XmlElementDecl(namespace = "http://EjemploWS.InduccionWs.guatx.com/", name = "MODIFICAR_DETALLE")
    public JAXBElement<MODIFICARDETALLE> createMODIFICARDETALLE(MODIFICARDETALLE value) {
        return new JAXBElement<MODIFICARDETALLE>(_MODIFICARDETALLE_QNAME, MODIFICARDETALLE.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MODIFICARDETALLEResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MODIFICARDETALLEResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://EjemploWS.InduccionWs.guatx.com/", name = "MODIFICAR_DETALLEResponse")
    public JAXBElement<MODIFICARDETALLEResponse> createMODIFICARDETALLEResponse(MODIFICARDETALLEResponse value) {
        return new JAXBElement<MODIFICARDETALLEResponse>(_MODIFICARDETALLEResponse_QNAME, MODIFICARDETALLEResponse.class, null, value);
    }

}
