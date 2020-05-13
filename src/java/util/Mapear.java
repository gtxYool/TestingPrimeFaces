/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.io.Serializable;

import java.util.List;
import java.util.ArrayList;
import Entidades.EFactura;
import Entidades.EDetalleFactura;
import Ws.Factura;
import Ws.DetalleFactura;
import javax.faces.bean.*;


import org.primefaces.model.TreeNode;
import org.primefaces.model.DefaultTreeNode;

/**
 *
 * @author AHERNANDEZ
 */
@ManagedBean
public class Mapear implements Serializable{

    public TreeNode Mapear() {
        TreeNode root = new DefaultTreeNode(new EFactura(),null);
        List<Factura> facts =listar();
                
        for (Factura fac:facts) {
            TreeNode rama=new DefaultTreeNode(new EFactura(fac),root);
            List<DetalleFactura> defacts = listarDETALLESFACTURA(fac.getNumerofactura(), fac.getSeriefactura());
            if (fac.getDetallefactura() != null) {
                
                fac.getDetallefactura().clear();
                int i = 0;
                for (DetalleFactura defac : defacts) {
                    fac.getDetallefactura().set(i, defac);
                    TreeNode hoja=new DefaultTreeNode(fac.getDetallefactura().get(i++),rama);
                }
            }
        }
        return root;
    }

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

}
