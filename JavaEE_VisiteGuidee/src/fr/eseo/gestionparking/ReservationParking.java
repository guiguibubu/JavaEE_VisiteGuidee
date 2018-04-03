
package fr.eseo.gestionparking;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour reservationParking complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="reservationParking"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codeClient" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="codeParking" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="codeResa" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="dateDebut" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="dateFin" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="paiement" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reservationParking", propOrder = {
    "codeClient",
    "codeParking",
    "codeResa",
    "dateDebut",
    "dateFin",
    "paiement"
})
public class ReservationParking {

    protected int codeClient;
    protected int codeParking;
    protected int codeResa;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateDebut;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateFin;
    protected boolean paiement;

    /**
     * Obtient la valeur de la propriété codeClient.
     * 
     */
    public int getCodeClient() {
        return codeClient;
    }

    /**
     * Définit la valeur de la propriété codeClient.
     * 
     */
    public void setCodeClient(int value) {
        this.codeClient = value;
    }

    /**
     * Obtient la valeur de la propriété codeParking.
     * 
     */
    public int getCodeParking() {
        return codeParking;
    }

    /**
     * Définit la valeur de la propriété codeParking.
     * 
     */
    public void setCodeParking(int value) {
        this.codeParking = value;
    }

    /**
     * Obtient la valeur de la propriété codeResa.
     * 
     */
    public int getCodeResa() {
        return codeResa;
    }

    /**
     * Définit la valeur de la propriété codeResa.
     * 
     */
    public void setCodeResa(int value) {
        this.codeResa = value;
    }

    /**
     * Obtient la valeur de la propriété dateDebut.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateDebut() {
        return dateDebut;
    }

    /**
     * Définit la valeur de la propriété dateDebut.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateDebut(XMLGregorianCalendar value) {
        this.dateDebut = value;
    }

    /**
     * Obtient la valeur de la propriété dateFin.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateFin() {
        return dateFin;
    }

    /**
     * Définit la valeur de la propriété dateFin.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateFin(XMLGregorianCalendar value) {
        this.dateFin = value;
    }

    /**
     * Obtient la valeur de la propriété paiement.
     * 
     */
    public boolean isPaiement() {
        return paiement;
    }

    /**
     * Définit la valeur de la propriété paiement.
     * 
     */
    public void setPaiement(boolean value) {
        this.paiement = value;
    }

}
