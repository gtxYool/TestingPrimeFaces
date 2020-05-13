
package Ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para INSERTAR_DETALLE complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="INSERTAR_DETALLE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Detalle_Factura" type="{http://EjemploWS.InduccionWs.guatx.com/}detalleFactura" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "INSERTAR_DETALLE", propOrder = {
    "detalleFactura"
})
public class INSERTARDETALLE {

    @XmlElement(name = "Detalle_Factura")
    protected DetalleFactura detalleFactura;

    /**
     * Obtiene el valor de la propiedad detalleFactura.
     * 
     * @return
     *     possible object is
     *     {@link DetalleFactura }
     *     
     */
    public DetalleFactura getDetalleFactura() {
        return detalleFactura;
    }

    /**
     * Define el valor de la propiedad detalleFactura.
     * 
     * @param value
     *     allowed object is
     *     {@link DetalleFactura }
     *     
     */
    public void setDetalleFactura(DetalleFactura value) {
        this.detalleFactura = value;
    }

}
