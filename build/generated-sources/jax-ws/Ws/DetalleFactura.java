
package Ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para detalleFactura complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="detalleFactura"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cantidad" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="codproducto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numdetalle" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="numerofactura" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="observaciones" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="precio" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="seriefactura" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "detalleFactura", propOrder = {
    "cantidad",
    "codproducto",
    "numdetalle",
    "numerofactura",
    "observaciones",
    "precio",
    "seriefactura"
})
public class DetalleFactura {

    protected int cantidad;
    protected String codproducto;
    protected int numdetalle;
    protected String numerofactura;
    protected String observaciones;
    protected double precio;
    protected String seriefactura;

    /**
     * Obtiene el valor de la propiedad cantidad.
     * 
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * Define el valor de la propiedad cantidad.
     * 
     */
    public void setCantidad(int value) {
        this.cantidad = value;
    }

    /**
     * Obtiene el valor de la propiedad codproducto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodproducto() {
        return codproducto;
    }

    /**
     * Define el valor de la propiedad codproducto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodproducto(String value) {
        this.codproducto = value;
    }

    /**
     * Obtiene el valor de la propiedad numdetalle.
     * 
     */
    public int getNumdetalle() {
        return numdetalle;
    }

    /**
     * Define el valor de la propiedad numdetalle.
     * 
     */
    public void setNumdetalle(int value) {
        this.numdetalle = value;
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
     * Obtiene el valor de la propiedad observaciones.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservaciones() {
        return observaciones;
    }

    /**
     * Define el valor de la propiedad observaciones.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservaciones(String value) {
        this.observaciones = value;
    }

    /**
     * Obtiene el valor de la propiedad precio.
     * 
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Define el valor de la propiedad precio.
     * 
     */
    public void setPrecio(double value) {
        this.precio = value;
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

}
