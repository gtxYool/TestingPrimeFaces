/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import java.io.Serializable;
import javax.inject.Named;
//import javax.enterprise.context.RequestScoped;
import javax.annotation.PostConstruct;
import javax.faces.bean.*;
import org.primefaces.context.RequestContext;
/**
 *
 * @author AHERNANDEZ
 */
//@Named(value = "userBean")
@ManagedBean(name = "userBean")
@RequestScoped
public class UserBean implements Serializable{

   private String nombre;
   private String nit;
   
  @PostConstruct
   public void Init(){
       nombre="";
       nit="";
   }
    public void test(){
        System.out.println(nombre+" "+nit);
        RequestContext context = RequestContext.getCurrentInstance();
        context.reset("form1");
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
    
}
