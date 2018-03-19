
package fr.eseo.javaee.projet.visiteguidee;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour visite complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="visite"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codeVisite" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="dateVisite" type="{http://visiteguidee.projet.javaee.eseo.fr/}localDateTime" minOccurs="0"/&gt;
 *         &lt;element name="prix" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="typeDeVisite" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ville" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "visite", propOrder = {
    "codeVisite",
    "dateVisite",
    "prix",
    "typeDeVisite",
    "ville"
})
public class Visite {

    protected int codeVisite;
    protected LocalDateTime dateVisite;
    protected float prix;
    protected String typeDeVisite;
    protected String ville;

    /**
     * Obtient la valeur de la propri�t� codeVisite.
     * 
     */
    public int getCodeVisite() {
        return codeVisite;
    }

    /**
     * D�finit la valeur de la propri�t� codeVisite.
     * 
     */
    public void setCodeVisite(int value) {
        this.codeVisite = value;
    }

    /**
     * Obtient la valeur de la propri�t� dateVisite.
     * 
     * @return
     *     possible object is
     *     {@link LocalDateTime }
     *     
     */
    public LocalDateTime getDateVisite() {
        return dateVisite;
    }

    /**
     * D�finit la valeur de la propri�t� dateVisite.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalDateTime }
     *     
     */
    public void setDateVisite(LocalDateTime value) {
        this.dateVisite = value;
    }

    /**
     * Obtient la valeur de la propri�t� prix.
     * 
     */
    public float getPrix() {
        return prix;
    }

    /**
     * D�finit la valeur de la propri�t� prix.
     * 
     */
    public void setPrix(float value) {
        this.prix = value;
    }

    /**
     * Obtient la valeur de la propri�t� typeDeVisite.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeDeVisite() {
        return typeDeVisite;
    }

    /**
     * D�finit la valeur de la propri�t� typeDeVisite.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeDeVisite(String value) {
        this.typeDeVisite = value;
    }

    /**
     * Obtient la valeur de la propri�t� ville.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVille() {
        return ville;
    }

    /**
     * D�finit la valeur de la propri�t� ville.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVille(String value) {
        this.ville = value;
    }

}
