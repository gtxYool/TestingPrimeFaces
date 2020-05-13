
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

    private final static QName _BUSCARFACTURA_QNAME = new QName("http://EjemploWS.InduccionWs.guatx.com/", "BUSCAR_FACTURA");
    private final static QName _BUSCARFACTURAResponse_QNAME = new QName("http://EjemploWS.InduccionWs.guatx.com/", "BUSCAR_FACTURAResponse");
    private final static QName _ELIMINARFACTURA_QNAME = new QName("http://EjemploWS.InduccionWs.guatx.com/", "ELIMINAR_FACTURA");
    private final static QName _ELIMINARFACTURAResponse_QNAME = new QName("http://EjemploWS.InduccionWs.guatx.com/", "ELIMINAR_FACTURAResponse");
    private final static QName _FILTRARLISTAFACTURA_QNAME = new QName("http://EjemploWS.InduccionWs.guatx.com/", "FILTRAR_LISTA_FACTURA");
    private final static QName _FILTRARLISTAFACTURAResponse_QNAME = new QName("http://EjemploWS.InduccionWs.guatx.com/", "FILTRAR_LISTA_FACTURAResponse");
    private final static QName _INSERTARFACTURA_QNAME = new QName("http://EjemploWS.InduccionWs.guatx.com/", "INSERTAR_FACTURA");
    private final static QName _INSERTARFACTURAResponse_QNAME = new QName("http://EjemploWS.InduccionWs.guatx.com/", "INSERTAR_FACTURAResponse");
    private final static QName _LISTAR_QNAME = new QName("http://EjemploWS.InduccionWs.guatx.com/", "LISTAR");
    private final static QName _LISTARResponse_QNAME = new QName("http://EjemploWS.InduccionWs.guatx.com/", "LISTARResponse");
    private final static QName _MODIFICARFACTURA_QNAME = new QName("http://EjemploWS.InduccionWs.guatx.com/", "MODIFICAR_FACTURA");
    private final static QName _MODIFICARFACTURAResponse_QNAME = new QName("http://EjemploWS.InduccionWs.guatx.com/", "MODIFICAR_FACTURAResponse");
    private final static QName _GetDetallesFactura_QNAME = new QName("http://EjemploWS.InduccionWs.guatx.com/", "getDetalles_factura");
    private final static QName _GetDetallesFacturaResponse_QNAME = new QName("http://EjemploWS.InduccionWs.guatx.com/", "getDetalles_facturaResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: Ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BUSCARFACTURA }
     * 
     */
    public BUSCARFACTURA createBUSCARFACTURA() {
        return new BUSCARFACTURA();
    }

    /**
     * Create an instance of {@link BUSCARFACTURAResponse }
     * 
     */
    public BUSCARFACTURAResponse createBUSCARFACTURAResponse() {
        return new BUSCARFACTURAResponse();
    }

    /**
     * Create an instance of {@link ELIMINARFACTURA }
     * 
     */
    public ELIMINARFACTURA createELIMINARFACTURA() {
        return new ELIMINARFACTURA();
    }

    /**
     * Create an instance of {@link ELIMINARFACTURAResponse }
     * 
     */
    public ELIMINARFACTURAResponse createELIMINARFACTURAResponse() {
        return new ELIMINARFACTURAResponse();
    }

    /**
     * Create an instance of {@link FILTRARLISTAFACTURA }
     * 
     */
    public FILTRARLISTAFACTURA createFILTRARLISTAFACTURA() {
        return new FILTRARLISTAFACTURA();
    }

    /**
     * Create an instance of {@link FILTRARLISTAFACTURAResponse }
     * 
     */
    public FILTRARLISTAFACTURAResponse createFILTRARLISTAFACTURAResponse() {
        return new FILTRARLISTAFACTURAResponse();
    }

    /**
     * Create an instance of {@link INSERTARFACTURA }
     * 
     */
    public INSERTARFACTURA createINSERTARFACTURA() {
        return new INSERTARFACTURA();
    }

    /**
     * Create an instance of {@link INSERTARFACTURAResponse }
     * 
     */
    public INSERTARFACTURAResponse createINSERTARFACTURAResponse() {
        return new INSERTARFACTURAResponse();
    }

    /**
     * Create an instance of {@link LISTAR }
     * 
     */
    public LISTAR createLISTAR() {
        return new LISTAR();
    }

    /**
     * Create an instance of {@link LISTARResponse }
     * 
     */
    public LISTARResponse createLISTARResponse() {
        return new LISTARResponse();
    }

    /**
     * Create an instance of {@link MODIFICARFACTURA }
     * 
     */
    public MODIFICARFACTURA createMODIFICARFACTURA() {
        return new MODIFICARFACTURA();
    }

    /**
     * Create an instance of {@link MODIFICARFACTURAResponse }
     * 
     */
    public MODIFICARFACTURAResponse createMODIFICARFACTURAResponse() {
        return new MODIFICARFACTURAResponse();
    }

    /**
     * Create an instance of {@link GetDetallesFactura }
     * 
     */
    public GetDetallesFactura createGetDetallesFactura() {
        return new GetDetallesFactura();
    }

    /**
     * Create an instance of {@link GetDetallesFacturaResponse }
     * 
     */
    public GetDetallesFacturaResponse createGetDetallesFacturaResponse() {
        return new GetDetallesFacturaResponse();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link BUSCARFACTURA }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BUSCARFACTURA }{@code >}
     */
    @XmlElementDecl(namespace = "http://EjemploWS.InduccionWs.guatx.com/", name = "BUSCAR_FACTURA")
    public JAXBElement<BUSCARFACTURA> createBUSCARFACTURA(BUSCARFACTURA value) {
        return new JAXBElement<BUSCARFACTURA>(_BUSCARFACTURA_QNAME, BUSCARFACTURA.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BUSCARFACTURAResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BUSCARFACTURAResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://EjemploWS.InduccionWs.guatx.com/", name = "BUSCAR_FACTURAResponse")
    public JAXBElement<BUSCARFACTURAResponse> createBUSCARFACTURAResponse(BUSCARFACTURAResponse value) {
        return new JAXBElement<BUSCARFACTURAResponse>(_BUSCARFACTURAResponse_QNAME, BUSCARFACTURAResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ELIMINARFACTURA }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ELIMINARFACTURA }{@code >}
     */
    @XmlElementDecl(namespace = "http://EjemploWS.InduccionWs.guatx.com/", name = "ELIMINAR_FACTURA")
    public JAXBElement<ELIMINARFACTURA> createELIMINARFACTURA(ELIMINARFACTURA value) {
        return new JAXBElement<ELIMINARFACTURA>(_ELIMINARFACTURA_QNAME, ELIMINARFACTURA.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ELIMINARFACTURAResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ELIMINARFACTURAResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://EjemploWS.InduccionWs.guatx.com/", name = "ELIMINAR_FACTURAResponse")
    public JAXBElement<ELIMINARFACTURAResponse> createELIMINARFACTURAResponse(ELIMINARFACTURAResponse value) {
        return new JAXBElement<ELIMINARFACTURAResponse>(_ELIMINARFACTURAResponse_QNAME, ELIMINARFACTURAResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FILTRARLISTAFACTURA }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FILTRARLISTAFACTURA }{@code >}
     */
    @XmlElementDecl(namespace = "http://EjemploWS.InduccionWs.guatx.com/", name = "FILTRAR_LISTA_FACTURA")
    public JAXBElement<FILTRARLISTAFACTURA> createFILTRARLISTAFACTURA(FILTRARLISTAFACTURA value) {
        return new JAXBElement<FILTRARLISTAFACTURA>(_FILTRARLISTAFACTURA_QNAME, FILTRARLISTAFACTURA.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FILTRARLISTAFACTURAResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FILTRARLISTAFACTURAResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://EjemploWS.InduccionWs.guatx.com/", name = "FILTRAR_LISTA_FACTURAResponse")
    public JAXBElement<FILTRARLISTAFACTURAResponse> createFILTRARLISTAFACTURAResponse(FILTRARLISTAFACTURAResponse value) {
        return new JAXBElement<FILTRARLISTAFACTURAResponse>(_FILTRARLISTAFACTURAResponse_QNAME, FILTRARLISTAFACTURAResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link INSERTARFACTURA }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link INSERTARFACTURA }{@code >}
     */
    @XmlElementDecl(namespace = "http://EjemploWS.InduccionWs.guatx.com/", name = "INSERTAR_FACTURA")
    public JAXBElement<INSERTARFACTURA> createINSERTARFACTURA(INSERTARFACTURA value) {
        return new JAXBElement<INSERTARFACTURA>(_INSERTARFACTURA_QNAME, INSERTARFACTURA.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link INSERTARFACTURAResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link INSERTARFACTURAResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://EjemploWS.InduccionWs.guatx.com/", name = "INSERTAR_FACTURAResponse")
    public JAXBElement<INSERTARFACTURAResponse> createINSERTARFACTURAResponse(INSERTARFACTURAResponse value) {
        return new JAXBElement<INSERTARFACTURAResponse>(_INSERTARFACTURAResponse_QNAME, INSERTARFACTURAResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LISTAR }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LISTAR }{@code >}
     */
    @XmlElementDecl(namespace = "http://EjemploWS.InduccionWs.guatx.com/", name = "LISTAR")
    public JAXBElement<LISTAR> createLISTAR(LISTAR value) {
        return new JAXBElement<LISTAR>(_LISTAR_QNAME, LISTAR.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LISTARResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LISTARResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://EjemploWS.InduccionWs.guatx.com/", name = "LISTARResponse")
    public JAXBElement<LISTARResponse> createLISTARResponse(LISTARResponse value) {
        return new JAXBElement<LISTARResponse>(_LISTARResponse_QNAME, LISTARResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MODIFICARFACTURA }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MODIFICARFACTURA }{@code >}
     */
    @XmlElementDecl(namespace = "http://EjemploWS.InduccionWs.guatx.com/", name = "MODIFICAR_FACTURA")
    public JAXBElement<MODIFICARFACTURA> createMODIFICARFACTURA(MODIFICARFACTURA value) {
        return new JAXBElement<MODIFICARFACTURA>(_MODIFICARFACTURA_QNAME, MODIFICARFACTURA.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MODIFICARFACTURAResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MODIFICARFACTURAResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://EjemploWS.InduccionWs.guatx.com/", name = "MODIFICAR_FACTURAResponse")
    public JAXBElement<MODIFICARFACTURAResponse> createMODIFICARFACTURAResponse(MODIFICARFACTURAResponse value) {
        return new JAXBElement<MODIFICARFACTURAResponse>(_MODIFICARFACTURAResponse_QNAME, MODIFICARFACTURAResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDetallesFactura }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetDetallesFactura }{@code >}
     */
    @XmlElementDecl(namespace = "http://EjemploWS.InduccionWs.guatx.com/", name = "getDetalles_factura")
    public JAXBElement<GetDetallesFactura> createGetDetallesFactura(GetDetallesFactura value) {
        return new JAXBElement<GetDetallesFactura>(_GetDetallesFactura_QNAME, GetDetallesFactura.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDetallesFacturaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetDetallesFacturaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://EjemploWS.InduccionWs.guatx.com/", name = "getDetalles_facturaResponse")
    public JAXBElement<GetDetallesFacturaResponse> createGetDetallesFacturaResponse(GetDetallesFacturaResponse value) {
        return new JAXBElement<GetDetallesFacturaResponse>(_GetDetallesFacturaResponse_QNAME, GetDetallesFacturaResponse.class, null, value);
    }

}
