/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewCtrl;

//import Entidades.Cliente;
import Ws.QueryCliente_Service;
import javax.annotation.PostConstruct;
import java.io.Serializable;
import javax.faces.bean.*;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import java.util.List;
import java.util.ArrayList;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.xml.ws.WebServiceRef;
import Ws.Cliente;
import org.primefaces.component.api.UIColumn;
import org.primefaces.event.CellEditEvent;
import org.primefaces.context.RequestContext;

@ManagedBean(name = "clienteList")
@ViewScoped

public class ListarClienteViewCtrl implements Serializable {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_9091/InduccionWs/QueryCliente.wsdl")
    private QueryCliente_Service service;

    private Cliente cliente;
    private List<Cliente> clientesList;

    public ListarClienteViewCtrl() {

    }

    @PostConstruct
    public void init() {

        try {
            clientesList = new ArrayList<Cliente>();

            for (Cliente cl : listarCLIENTE()) {
                Cliente clst = new Cliente();
                clst.setNombre(cl.getNombre());
                clst.setNit(cl.getNit());
                clst.setDireccion(cl.getDireccion());
                clientesList.add(clst);
            }
        } catch (Exception e) {
            System.out.println("Error al recuperar listado de clientes");
        }
    }

    public void onCellEdit(CellEditEvent e) {
        try {
            Object newValue = e.getNewValue();

            int row = e.getRowIndex();

            UIColumn columna = (UIColumn) e.getColumn();
            String nombreColumna = columna.getHeaderText();

            Cliente cl = clientesList.get(row);
            String data = (String) newValue;
            switch (nombreColumna) {
                case "Nombre":
                    cl.setNombre(data);
                    break;
                case "Direccion":
                    cl.setDireccion(data);
                    break;
            }

            Cliente cli = new Cliente();
            cli.setNombre(cl.getNombre());
            cli.setNit(cl.getNit());
            cli.setDireccion(cl.getDireccion());

            modificarCLIENTE(cli);
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Exito al editar campo " + nombreColumna + " :)", ""));

        } catch (Exception ex) {
            System.out.println("Error al editar Cliente ");
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error  al editar " + ex.getMessage() + " !", ""));
        }

    }

    private java.util.List<Ws.Cliente> listarCLIENTE() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        Ws.QueryCliente port = service.getQueryClientePort();
        return port.listarCLIENTE();
    }

    private boolean modificarCLIENTE(Ws.Cliente cliente) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        Ws.QueryCliente port = service.getQueryClientePort();
        return port.modificarCLIENTE(cliente);
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Cliente> getClientesList() {
        return clientesList;
    }

    public void setClientesList(List<Cliente> clientesList) {
        this.clientesList = clientesList;
    }

}
