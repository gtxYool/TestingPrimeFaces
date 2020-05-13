/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import Ws.Factura;
import java.io.Serializable;
import org.primefaces.model.SelectableDataModel;
import javax.faces.bean.*;


@ManagedBean(name = "factura", eager = true)

public class EFactura implements  Serializable,SelectableDataModel {

    private String numerofactura;
    private String seriefactura;
    private String fecha;
    private String nit;
    private double total;

    public EFactura() {
    }

    public EFactura(String numerofactura, String seriefactura, String fecha, String nit, double total) {
        this.numerofactura = numerofactura;
        this.seriefactura = seriefactura;
        this.fecha = fecha;
        this.nit = nit;
        this.total = total;
    }

    public EFactura(Factura fac) {
        this.numerofactura = fac.getNumerofactura();
        this.seriefactura = fac.getSeriefactura();
        this.fecha = fac.getFecha();
        this.nit = fac.getNit();
    }

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

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
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
