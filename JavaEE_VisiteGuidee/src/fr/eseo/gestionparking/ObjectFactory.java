
package fr.eseo.gestionparking;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the fr.eseo.gestionparking package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AnnulerParking_QNAME = new QName("http://gestionparking.eseo.fr/", "annulerParking");
    private final static QName _AnnulerParkingResponse_QNAME = new QName("http://gestionparking.eseo.fr/", "annulerParkingResponse");
    private final static QName _PayerParking_QNAME = new QName("http://gestionparking.eseo.fr/", "payerParking");
    private final static QName _PayerParkingResponse_QNAME = new QName("http://gestionparking.eseo.fr/", "payerParkingResponse");
    private final static QName _ReserverParking_QNAME = new QName("http://gestionparking.eseo.fr/", "reserverParking");
    private final static QName _ReserverParkingResponse_QNAME = new QName("http://gestionparking.eseo.fr/", "reserverParkingResponse");
    private final static QName _TrouverParking_QNAME = new QName("http://gestionparking.eseo.fr/", "trouverParking");
    private final static QName _TrouverParkingResponse_QNAME = new QName("http://gestionparking.eseo.fr/", "trouverParkingResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: fr.eseo.gestionparking
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AnnulerParking }
     * 
     */
    public AnnulerParking createAnnulerParking() {
        return new AnnulerParking();
    }

    /**
     * Create an instance of {@link AnnulerParkingResponse }
     * 
     */
    public AnnulerParkingResponse createAnnulerParkingResponse() {
        return new AnnulerParkingResponse();
    }

    /**
     * Create an instance of {@link PayerParking }
     * 
     */
    public PayerParking createPayerParking() {
        return new PayerParking();
    }

    /**
     * Create an instance of {@link PayerParkingResponse }
     * 
     */
    public PayerParkingResponse createPayerParkingResponse() {
        return new PayerParkingResponse();
    }

    /**
     * Create an instance of {@link ReserverParking }
     * 
     */
    public ReserverParking createReserverParking() {
        return new ReserverParking();
    }

    /**
     * Create an instance of {@link ReserverParkingResponse }
     * 
     */
    public ReserverParkingResponse createReserverParkingResponse() {
        return new ReserverParkingResponse();
    }

    /**
     * Create an instance of {@link TrouverParking }
     * 
     */
    public TrouverParking createTrouverParking() {
        return new TrouverParking();
    }

    /**
     * Create an instance of {@link TrouverParkingResponse }
     * 
     */
    public TrouverParkingResponse createTrouverParkingResponse() {
        return new TrouverParkingResponse();
    }

    /**
     * Create an instance of {@link Parking }
     * 
     */
    public Parking createParking() {
        return new Parking();
    }

    /**
     * Create an instance of {@link ReservationParking }
     * 
     */
    public ReservationParking createReservationParking() {
        return new ReservationParking();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnnulerParking }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://gestionparking.eseo.fr/", name = "annulerParking")
    public JAXBElement<AnnulerParking> createAnnulerParking(AnnulerParking value) {
        return new JAXBElement<AnnulerParking>(_AnnulerParking_QNAME, AnnulerParking.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnnulerParkingResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://gestionparking.eseo.fr/", name = "annulerParkingResponse")
    public JAXBElement<AnnulerParkingResponse> createAnnulerParkingResponse(AnnulerParkingResponse value) {
        return new JAXBElement<AnnulerParkingResponse>(_AnnulerParkingResponse_QNAME, AnnulerParkingResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PayerParking }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://gestionparking.eseo.fr/", name = "payerParking")
    public JAXBElement<PayerParking> createPayerParking(PayerParking value) {
        return new JAXBElement<PayerParking>(_PayerParking_QNAME, PayerParking.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PayerParkingResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://gestionparking.eseo.fr/", name = "payerParkingResponse")
    public JAXBElement<PayerParkingResponse> createPayerParkingResponse(PayerParkingResponse value) {
        return new JAXBElement<PayerParkingResponse>(_PayerParkingResponse_QNAME, PayerParkingResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReserverParking }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://gestionparking.eseo.fr/", name = "reserverParking")
    public JAXBElement<ReserverParking> createReserverParking(ReserverParking value) {
        return new JAXBElement<ReserverParking>(_ReserverParking_QNAME, ReserverParking.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReserverParkingResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://gestionparking.eseo.fr/", name = "reserverParkingResponse")
    public JAXBElement<ReserverParkingResponse> createReserverParkingResponse(ReserverParkingResponse value) {
        return new JAXBElement<ReserverParkingResponse>(_ReserverParkingResponse_QNAME, ReserverParkingResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrouverParking }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://gestionparking.eseo.fr/", name = "trouverParking")
    public JAXBElement<TrouverParking> createTrouverParking(TrouverParking value) {
        return new JAXBElement<TrouverParking>(_TrouverParking_QNAME, TrouverParking.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrouverParkingResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://gestionparking.eseo.fr/", name = "trouverParkingResponse")
    public JAXBElement<TrouverParkingResponse> createTrouverParkingResponse(TrouverParkingResponse value) {
        return new JAXBElement<TrouverParkingResponse>(_TrouverParkingResponse_QNAME, TrouverParkingResponse.class, null, value);
    }

}
