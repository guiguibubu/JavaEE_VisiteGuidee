
package fr.eseo.javaee.projet.visiteguidee;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour reservation complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="reservation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="client" type="{http://visiteguidee.projet.javaee.eseo.fr/}client" minOccurs="0"/&gt;
 *         &lt;element name="codeReservation" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="nombrePersonnes" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="paiementEffectue" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="visite" type="{http://visiteguidee.projet.javaee.eseo.fr/}visite" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reservation", propOrder = {
    "client",
    "codeReservation",
    "nombrePersonnes",
    "paiementEffectue",
    "visite"
})
public class Reservation {

    protected Client client;
    protected int codeReservation;
    protected int nombrePersonnes;
    protected boolean paiementEffectue;
    protected Visite visite;

    /**
     * Obtient la valeur de la propriété client.
     * 
     * @return
     *     possible object is
     *     {@link Client }
     *     
     */
    public Client getClient() {
        return client;
    }

    /**
     * Définit la valeur de la propriété client.
     * 
     * @param value
     *     allowed object is
     *     {@link Client }
     *     
     */
    public void setClient(Client value) {
        this.client = value;
    }

    /**
     * Obtient la valeur de la propriété codeReservation.
     * 
     */
    public int getCodeReservation() {
        return codeReservation;
    }

    /**
     * Définit la valeur de la propriété codeReservation.
     * 
     */
    public void setCodeReservation(int value) {
        this.codeReservation = value;
    }

    /**
     * Obtient la valeur de la propriété nombrePersonnes.
     * 
     */
    public int getNombrePersonnes() {
        return nombrePersonnes;
    }

    /**
     * Définit la valeur de la propriété nombrePersonnes.
     * 
     */
    public void setNombrePersonnes(int value) {
        this.nombrePersonnes = value;
    }

    /**
     * Obtient la valeur de la propriété paiementEffectue.
     * 
     */
    public boolean isPaiementEffectue() {
        return paiementEffectue;
    }

    /**
     * Définit la valeur de la propriété paiementEffectue.
     * 
     */
    public void setPaiementEffectue(boolean value) {
        this.paiementEffectue = value;
    }

    /**
     * Obtient la valeur de la propriété visite.
     * 
     * @return
     *     possible object is
     *     {@link Visite }
     *     
     */
    public Visite getVisite() {
        return visite;
    }

    /**
     * Définit la valeur de la propriété visite.
     * 
     * @param value
     *     allowed object is
     *     {@link Visite }
     *     
     */
    public void setVisite(Visite value) {
        this.visite = value;
    }

}
