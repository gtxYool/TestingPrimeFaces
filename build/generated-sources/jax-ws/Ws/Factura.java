
package Ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para factura complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="factura"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="detallefactura" type="{http://EjemploWS.InduccionWs.guatx.com/}detalleFactura" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="fecha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numerofactura" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="seriefactura" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="total" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "factura", propOrder = {
    "detallefactura",
    "fecha",
    "nit",
    "numerofactura",
    "seriefactura",
    "total"
})
public class Factura {

    @XmlElement(nillable = true)
    protected List<DetalleFactura> detallefactura;
    protected String fecha;
    protected String nit;
    protected String numerofactura;
    protected String seriefactura;
    protected double total;

    /**
     * Gets the value of the detallefactura property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the detallefactura property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDetallefactura().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DetalleFactura }
     * 
     * 
     */
    public List<DetalleFactura> getDetallefactura() {
        if (detallefactura == null) {
            detallefactura = new ArrayList<DetalleFactura>();
        }
        return this.detallefactura;
    }

    /**
     * Obtiene el valor de la propiedad fecha.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * Define el valor de la propiedad fecha.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFecha(String value) {
        this.fecha = value;
    }

    /**
     * Obtiene el valor de la propiedad nit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNit() {
        return nit;
    }

    /**
     * Define el valor de la propiedad nit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNit(String value) {
        this.nit = value;
    }

    /**
     * Obtiene el valor de la propiedad numerofactura.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumerofactura() {
        return numerofactura;
    }

    /**
     * Define el valor de la propiedad numerofactura.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumerofactura(String value) {
        this.numerofactura = value;
    }

    /**
     * Obtiene el valor de la propiedad seriefactura.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeriefactura() {
        return seriefactura;
    }

    /**
     * Define el valor de la propiedad seriefactura.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeriefactura(String value) {
        this.seriefactura = value;
    }

    /**
     * Obtiene el valor de la propiedad total.
     * 
     */
    public double getTotal() {
        return total;
    }

    /**
     * Define el valor de la propiedad total.
     * 
     */
    public void setTotal(double value) {
        this.total = value;
    }

}
