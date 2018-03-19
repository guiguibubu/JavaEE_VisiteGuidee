
package fr.eseo.javaee.projet.visiteguidee;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour visite complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
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
     * Obtient la valeur de la propriété codeVisite.
     * 
     */
    public int getCodeVisite() {
        return codeVisite;
    }

    /**
     * Définit la valeur de la propriété codeVisite.
     * 
     */
    public void setCodeVisite(int value) {
        this.codeVisite = value;
    }

    /**
     * Obtient la valeur de la propriété dateVisite.
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
     * Définit la valeur de la propriété dateVisite.
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
     * Obtient la valeur de la propriété prix.
     * 
     */
    public float getPrix() {
        return prix;
    }

    /**
     * Définit la valeur de la propriété prix.
     * 
     */
    public void setPrix(float value) {
        this.prix = value;
    }

    /**
     * Obtient la valeur de la propriété typeDeVisite.
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
     * Définit la valeur de la propriété typeDeVisite.
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
     * Obtient la valeur de la propriété ville.
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
     * Définit la valeur de la propriété ville.
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
