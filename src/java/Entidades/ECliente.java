/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import Ws.Cliente;
import javafx.collections.ObservableList;
import javafx.collections.FXCollections;

/**
 *
 * @author AHERNANDEZ
 */
public class ECliente implements Serializable {

    private String nombre;
    private String nit;
    private String direccion;
    private String id;

    //------------------------------------ GETTERS AND SETTERS-----------------------------------------//
    public ECliente() {
        nombre="";
        nit="";
        direccion="";
        id="";
    }

    public ECliente(String nombre, String nit, String direccion, String id) {
        this.nombre = nombre;
        this.nit = nit;
        this.direccion = direccion;
        this.id = id;
    }

    public ECliente(Cliente cl) {
        this.nombre = cl.getNombre();
        this.nit = cl.getNit();
        this.direccion = cl.getDireccion();
        this.id = String.valueOf(cl.getId());
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
