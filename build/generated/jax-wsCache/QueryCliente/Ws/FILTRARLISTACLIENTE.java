
package Ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para FILTRAR_LISTA_CLIENTE complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="FILTRAR_LISTA_CLIENTE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="filtro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="where" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FILTRAR_LISTA_CLIENTE", propOrder = {
    "filtro",
    "where"
})
public class FILTRARLISTACLIENTE {

    protected String filtro;
    protected String where;

    /**
     * Obtiene el valor de la propiedad filtro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFiltro() {
        return filtro;
    }

    /**
     * Define el valor de la propiedad filtro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFiltro(String value) {
        this.filtro = value;
    }

    /**
     * Obtiene el valor de la propiedad where.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWhere() {
        return where;
    }

    /**
     * Define el valor de la propiedad where.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWhere(String value) {
        this.where = value;
    }

}
