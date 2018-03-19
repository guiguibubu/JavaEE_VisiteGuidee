
package fr.eseo.javaee.projet.visiteguidee;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour reservation complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="reservation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codeClient" type="{http://visiteguidee.projet.javaee.eseo.fr/}client" minOccurs="0"/&gt;
 *         &lt;element name="codeReservation" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="codeVisite" type="{http://visiteguidee.projet.javaee.eseo.fr/}visite" minOccurs="0"/&gt;
 *         &lt;element name="nombrePersonnes" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="paiementEffectue" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
    "codeClient",
    "codeReservation",
    "codeVisite",
    "nombrePersonnes",
    "paiementEffectue"
})
public class Reservation {

    protected Client codeClient;
    protected int codeReservation;
    protected Visite codeVisite;
    protected int nombrePersonnes;
    protected boolean paiementEffectue;

    /**
     * Obtient la valeur de la propri�t� codeClient.
     * 
     * @return
     *     possible object is
     *     {@link Client }
     *     
     */
    public Client getCodeClient() {
        return codeClient;
    }

    /**
     * D�finit la valeur de la propri�t� codeClient.
     * 
     * @param value
     *     allowed object is
     *     {@link Client }
     *     
     */
    public void setCodeClient(Client value) {
        this.codeClient = value;
    }

    /**
     * Obtient la valeur de la propri�t� codeReservation.
     * 
     */
    public int getCodeReservation() {
        return codeReservation;
    }

    /**
     * D�finit la valeur de la propri�t� codeReservation.
     * 
     */
    public void setCodeReservation(int value) {
        this.codeReservation = value;
    }

    /**
     * Obtient la valeur de la propri�t� codeVisite.
     * 
     * @return
     *     possible object is
     *     {@link Visite }
     *     
     */
    public Visite getCodeVisite() {
        return codeVisite;
    }

    /**
     * D�finit la valeur de la propri�t� codeVisite.
     * 
     * @param value
     *     allowed object is
     *     {@link Visite }
     *     
     */
    public void setCodeVisite(Visite value) {
        this.codeVisite = value;
    }

    /**
     * Obtient la valeur de la propri�t� nombrePersonnes.
     * 
     */
    public int getNombrePersonnes() {
        return nombrePersonnes;
    }

    /**
     * D�finit la valeur de la propri�t� nombrePersonnes.
     * 
     */
    public void setNombrePersonnes(int value) {
        this.nombrePersonnes = value;
    }

    /**
     * Obtient la valeur de la propri�t� paiementEffectue.
     * 
     */
    public boolean isPaiementEffectue() {
        return paiementEffectue;
    }

    /**
     * D�finit la valeur de la propri�t� paiementEffectue.
     * 
     */
    public void setPaiementEffectue(boolean value) {
        this.paiementEffectue = value;
    }

}
