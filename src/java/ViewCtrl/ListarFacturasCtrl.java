/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewCtrl;

import util.Mapear;
import java.util.List;
import java.util.ArrayList;
import java.io.Serializable;
import Entidades.EFactura;
import Entidades.EDetalleFactura;
import javax.faces.bean.*;
import Ws.Factura;
import Ws.DetalleFactura;
import org.primefaces.model.SelectableDataModel;
import javax.annotation.PostConstruct;
import javax.faces.context.FacesContext;
import org.primefaces.event.UnselectEvent;
import org.primefaces.event.SelectEvent;
import org.primefaces.event.CellEditEvent;
import org.primefaces.component.api.UIColumn;
import javax.faces.application.FacesMessage;
import org.primefaces.model.TreeNode;
import org.primefaces.model.DefaultTreeNode;

import javax.annotation.PostConstruct;

@ManagedBean(name = "listFacturas")
@ViewScoped

public class ListarFacturasCtrl implements Serializable,SelectableDataModel{
    
    private List<EFactura> facturas;
    private List<EDetalleFactura> detalles;
    private EFactura Selected;
    
    
    @PostConstruct
    public void Init() {
       facturas= new ArrayList<>();
       List<Factura> facts= listar();
       for(Factura fac:facts){
           facturas.add(new EFactura(fac));
       }
    }

//    
    public void clickrow(SelectEvent e) {
        EFactura fcl = (EFactura) e.getObject();
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Seleccionado " + fcl.getNumerofactura() + " !", ""));

        try {
            detalles = new ArrayList<EDetalleFactura>();

            for (DetalleFactura cl : listarDETALLESFACTURA(fcl.getNumerofactura(), fcl.getSeriefactura())) {
                EDetalleFactura dflst = new EDetalleFactura(cl);
                detalles.add(dflst);
            }
        } catch (Exception ex) {
            System.out.println("Error al recuperar listado de detalles ");
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error " + ex.getMessage() + " !", ""));
        }
    }
//    
   
      private static java.util.List<Ws.Factura> listar() {
        Ws.QueryFactura_Service service = new Ws.QueryFactura_Service();
        Ws.QueryFactura port = service.getQueryFacturaPort();
        return port.listar();
    }

    private static java.util.List<Ws.DetalleFactura> listarDETALLESFACTURA(java.lang.String numeroFatura, java.lang.String serieFactura) {
        Ws.QueryDetalleFactura_Service service = new Ws.QueryDetalleFactura_Service();
        Ws.QueryDetalleFactura port = service.getQueryDetalleFacturaPort();
        return port.listarDETALLESFACTURA(numeroFatura, serieFactura);
    }

    public List<EFactura> getFacturas() {
        return facturas;
    }

    public void setFacturas(List<EFactura> facturas) {
        this.facturas = facturas;
    }

    public EFactura getSelected() {
        return Selected;
    }

    public void setSelected(EFactura Selected) {
        this.Selected = Selected;
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
