/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import javax.faces.bean.ManagedBean;
import Ws.DetalleFactura;
import javax.faces.bean.*;
import java.io.Serializable;

/**
 *
 * @author AHERNANDEZ
 */
@ManagedBean(name = "detalle")
@RequestScoped

public class EDetalleFactura implements Serializable,org.primefaces.model.SelectableDataModel {

    private String numerofactura;
    private String seriefactura;
    private int numdetalle;
    private String codproducto;
    private int cantidad;
    private double precio;
    private String observaciones;

 
    public EDetalleFactura() {

    }

    public EDetalleFactura(String numerofactura, String seriefactura, int numdetalle, String codproducto, int cantidad, double precio, String observaciones) {
        this.numerofactura = numerofactura;
        this.seriefactura = seriefactura;
        this.numdetalle = numdetalle;
        this.codproducto = codproducto;
        this.cantidad = cantidad;
        this.precio = precio;
        this.observaciones = observaciones;
    }
    public EDetalleFactura(DetalleFactura defac) {
        this.numerofactura = defac.getNumerofactura();
        this.seriefactura = defac.getSeriefactura();
        this.numdetalle = defac.getNumdetalle();
        this.codproducto = defac.getCodproducto();
        this.cantidad = defac.getCantidad();
        this.precio = defac.getPrecio();
        this.observaciones = defac.getObservaciones();
    }
    
    
    
    //---------------------------------------------------------- Methods
    
    
    //----------------------------------------------------------- GETTERS AND 
    public String getNumerofactura() {
        return numerofactura;
    }

    public void setNumerofactura(String numerofactura) {
        this.numerofactura = numerofactura;
    }

    public String getSeriefactura() {
        return seriefactura;
    }

    public void setSeriefactura(String seriefactura) {
        this.seriefactura = seriefactura;
    }

    public int getNumdetalle() {
        return numdetalle;
    }

    public void setNumdetalle(int numdetalle) {
        this.numdetalle = numdetalle;
    }

    public String getCodproducto() {
        return codproducto;
    }

    public void setCodproducto(String codproducto) {
        this.codproducto = codproducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String Observaciones) {
        this.observaciones = Observaciones;
    }

    @Override
    public Object getRowKey(Object t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object getRowData(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
