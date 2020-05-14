/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewCtrl;

import Entidades.*;
import Ws.Cliente;
import Ws.QueryCliente_Service;
import Ws.QueryDetalleFactura_Service;
import Ws.QueryFactura_Service;
import Ws.Factura;
import Ws.DetalleFactura;
import java.util.List;
import java.util.ArrayList;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.bean.*;
import javax.xml.ws.WebServiceRef;

@ManagedBean(name = "agregarFact")
@ViewScoped
public class AgregarFacturaCtrl implements Serializable {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_9091/InduccionWs/QueryDetalleFactura.wsdl")
    private QueryDetalleFactura_Service service_2;

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_9091/InduccionWs/QueryFactura.wsdl")
    private QueryFactura_Service service_1;

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_9091/InduccionWs/QueryCliente.wsdl")
    private QueryCliente_Service service;

    List<EDetalleFactura> detalles;
    private EDetalleFactura defac;
    private EFactura factura;
    private ECliente cliente;

    public AgregarFacturaCtrl() {

    }

    @PostConstruct
    public void Init() {
        detalles = new ArrayList<>();
        defac = new EDetalleFactura();
        factura = new EFactura();
        cliente = new ECliente();

    }

    public void guardar() {
        if (detalles != null) {
            System.out.println("-------SAVE-----");
            for (EDetalleFactura d : detalles) {
                System.out.println(d.getCodproducto());
            }
        }
    }

    public void agregar() {

        if (defac != null) {
            System.out.println("-------- ADD -----");
            detalles.add(defac);
            defac = new EDetalleFactura();
        }
    }

    private Factura cast(EFactura fac) {

        Factura fc = new Factura();
        fc.setFecha(fac.getFecha());
        fc.setNit(fac.getNit());
        fc.setNumerofactura(fac.getNumerofactura());
        fc.setSeriefactura(fac.getSeriefactura());

        return fc;
    }

    private DetalleFactura cast(EDetalleFactura defac) {

        DetalleFactura defc = new DetalleFactura();
        defc.setNumerofactura(defac.getNumerofactura());
        defc.setSeriefactura(defac.getSeriefactura());
        defc.setCantidad(defac.getCantidad());
        defc.setNumdetalle(defac.getNumdetalle());
        defc.setCodproducto(defac.getCodproducto());
        defc.setPrecio(defac.getPrecio());
        defc.setObservaciones(defac.getObservaciones());

        return defc;
    }

    //------------------------------- GETTERS AND SETTERS ------------------------------------------------------------------------
    public EDetalleFactura getDefac() {
        return defac;
    }

    public void setDefac(EDetalleFactura defac) {
        this.defac = defac;
    }

    public EFactura getFactura() {
        return factura;
    }

    public void setFactura(EFactura factura) {
        this.factura = factura;
    }

    public ECliente getCliente() {
        return cliente;
    }

    public void setCliente(ECliente cliente) {
        this.cliente = cliente;
    }

    //-------------------------------------- WS METHODS ----------------------------------------------------------
    private Cliente buscarCLIENTE(java.lang.String nit) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        Ws.QueryCliente port = service.getQueryClientePort();
        return port.buscarCLIENTE(nit);
    }

    private boolean insertarFACTURA(Ws.Factura factura) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        Ws.QueryFactura port = service_1.getQueryFacturaPort();
        return port.insertarFACTURA(factura);
    }

    private boolean insertarDETALLE(Ws.DetalleFactura detalleFactura) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        Ws.QueryDetalleFactura port = service_2.getQueryDetalleFacturaPort();
        return port.insertarDETALLE(detalleFactura);
    }

}
