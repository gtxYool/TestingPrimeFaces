/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewCtrl;

import javax.faces.bean.*;
import org.primefaces.context.*;
import org.primefaces.metadata.*;
import javax.annotation.PostConstruct;
import Ws.Cliente;
import Ws.QueryCliente_Service;
import java.io.Serializable;
import javax.xml.ws.WebServiceRef;

@ManagedBean(name = "modificarCliente")
@RequestScoped
public class ModificarClienteView implements Serializable {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_9091/InduccionWs/QueryCliente.wsdl")
    private QueryCliente_Service service;

    private Cliente cliente;

    private String Opcion="";

    public ModificarClienteView() {
        System.out.println("----");
        Opcion = "t";
    }

    @PostConstruct
    public void Init(){
        cliente=new Cliente();
    }
    
    public String EjecutarPetición() {
        System.out.println("Opcion: " + Opcion);
        if (Opcion.equalsIgnoreCase("Delete")) {
            //  EliminarCliente(Opcion);
            System.out.println("Delete");
        } else if (Opcion.equalsIgnoreCase("Update")) {
            System.out.println("Update");

//            Modificar();
        } else {
            System.out.println(Opcion);
        }
        return " ";
    }

    public void Modificar() {
        ModificarCliente(cliente.getNombre(), cliente.getNit(), cliente.getDireccion());
    }

    public void ModificarCliente(String nombre, String nit, String direccion) {
        Cliente cl = new Cliente();
        cl.setNombre(nombre);
        cl.setNit(nit);
        cl.setDireccion(direccion);
        modificarCLIENTE(cl);

    }

    public void EliminarCliente(String nit) {
        Cliente cl = buscarCLIENTE(nit);
        eliminarCLIENTE(cl);
    }

    public void BuscarCliente(String nit) {
        Cliente cl = buscarCLIENTE(nit);
        if (cl != null) {
            cliente.setId(cl.getId());
            cliente.setNit(nit);
            cliente.setNombre(cl.getNombre());
            cliente.setDireccion(cl.getDireccion());
        }
    }

    public String print(String p) {
        System.out.println(" " + p);
        return " ";
    }

    public String getOpcion() {
        return Opcion;
    }

    public void setOpcion(String Opcion) {
        this.Opcion = Opcion;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    private Cliente buscarCLIENTE(java.lang.String nit) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        Ws.QueryCliente port = service.getQueryClientePort();
        return port.buscarCLIENTE(nit);
    }

    private boolean eliminarCLIENTE(Ws.Cliente cliente) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        Ws.QueryCliente port = service.getQueryClientePort();
        return port.eliminarCLIENTE(cliente);
    }

    private boolean modificarCLIENTE(Ws.Cliente cliente) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        Ws.QueryCliente port = service.getQueryClientePort();
        return port.modificarCLIENTE(cliente);
    }

}
