
package fr.eseo.javaee.projet.visiteguidee;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the fr.eseo.javaee.projet.visiteguidee package. 
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

    private final static QName _AnnulerVisite_QNAME = new QName("http://visiteguidee.projet.javaee.eseo.fr/", "annulerVisite");
    private final static QName _AnnulerVisiteResponse_QNAME = new QName("http://visiteguidee.projet.javaee.eseo.fr/", "annulerVisiteResponse");
    private final static QName _PayerVisite_QNAME = new QName("http://visiteguidee.projet.javaee.eseo.fr/", "payerVisite");
    private final static QName _PayerVisiteResponse_QNAME = new QName("http://visiteguidee.projet.javaee.eseo.fr/", "payerVisiteResponse");
    private final static QName _ReserverVisite_QNAME = new QName("http://visiteguidee.projet.javaee.eseo.fr/", "reserverVisite");
    private final static QName _ReserverVisiteResponse_QNAME = new QName("http://visiteguidee.projet.javaee.eseo.fr/", "reserverVisiteResponse");
    private final static QName _TrouverClient_QNAME = new QName("http://visiteguidee.projet.javaee.eseo.fr/", "trouverClient");
    private final static QName _TrouverClientResponse_QNAME = new QName("http://visiteguidee.projet.javaee.eseo.fr/", "trouverClientResponse");
    private final static QName _TrouverReservationByIdClient_QNAME = new QName("http://visiteguidee.projet.javaee.eseo.fr/", "trouverReservationByIdClient");
    private final static QName _TrouverReservationByIdClientResponse_QNAME = new QName("http://visiteguidee.projet.javaee.eseo.fr/", "trouverReservationByIdClientResponse");
    private final static QName _TrouverVisite_QNAME = new QName("http://visiteguidee.projet.javaee.eseo.fr/", "trouverVisite");
    private final static QName _TrouverVisiteResponse_QNAME = new QName("http://visiteguidee.projet.javaee.eseo.fr/", "trouverVisiteResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: fr.eseo.javaee.projet.visiteguidee
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AnnulerVisite }
     * 
     */
    public AnnulerVisite createAnnulerVisite() {
        return new AnnulerVisite();
    }

    /**
     * Create an instance of {@link AnnulerVisiteResponse }
     * 
     */
    public AnnulerVisiteResponse createAnnulerVisiteResponse() {
        return new AnnulerVisiteResponse();
    }

    /**
     * Create an instance of {@link PayerVisite }
     * 
     */
    public PayerVisite createPayerVisite() {
        return new PayerVisite();
    }

    /**
     * Create an instance of {@link PayerVisiteResponse }
     * 
     */
    public PayerVisiteResponse createPayerVisiteResponse() {
        return new PayerVisiteResponse();
    }

    /**
     * Create an instance of {@link ReserverVisite }
     * 
     */
    public ReserverVisite createReserverVisite() {
        return new ReserverVisite();
    }

    /**
     * Create an instance of {@link ReserverVisiteResponse }
     * 
     */
    public ReserverVisiteResponse createReserverVisiteResponse() {
        return new ReserverVisiteResponse();
    }

    /**
     * Create an instance of {@link TrouverClient }
     * 
     */
    public TrouverClient createTrouverClient() {
        return new TrouverClient();
    }

    /**
     * Create an instance of {@link TrouverClientResponse }
     * 
     */
    public TrouverClientResponse createTrouverClientResponse() {
        return new TrouverClientResponse();
    }

    /**
     * Create an instance of {@link TrouverReservationByIdClient }
     * 
     */
    public TrouverReservationByIdClient createTrouverReservationByIdClient() {
        return new TrouverReservationByIdClient();
    }

    /**
     * Create an instance of {@link TrouverReservationByIdClientResponse }
     * 
     */
    public TrouverReservationByIdClientResponse createTrouverReservationByIdClientResponse() {
        return new TrouverReservationByIdClientResponse();
    }

    /**
     * Create an instance of {@link TrouverVisite }
     * 
     */
    public TrouverVisite createTrouverVisite() {
        return new TrouverVisite();
    }

    /**
     * Create an instance of {@link TrouverVisiteResponse }
     * 
     */
    public TrouverVisiteResponse createTrouverVisiteResponse() {
        return new TrouverVisiteResponse();
    }

    /**
     * Create an instance of {@link Visite }
     * 
     */
    public Visite createVisite() {
        return new Visite();
    }

    /**
     * Create an instance of {@link Reservation }
     * 
     */
    public Reservation createReservation() {
        return new Reservation();
    }

    /**
     * Create an instance of {@link Client }
     * 
     */
    public Client createClient() {
        return new Client();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnnulerVisite }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://visiteguidee.projet.javaee.eseo.fr/", name = "annulerVisite")
    public JAXBElement<AnnulerVisite> createAnnulerVisite(AnnulerVisite value) {
        return new JAXBElement<AnnulerVisite>(_AnnulerVisite_QNAME, AnnulerVisite.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnnulerVisiteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://visiteguidee.projet.javaee.eseo.fr/", name = "annulerVisiteResponse")
    public JAXBElement<AnnulerVisiteResponse> createAnnulerVisiteResponse(AnnulerVisiteResponse value) {
        return new JAXBElement<AnnulerVisiteResponse>(_AnnulerVisiteResponse_QNAME, AnnulerVisiteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PayerVisite }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://visiteguidee.projet.javaee.eseo.fr/", name = "payerVisite")
    public JAXBElement<PayerVisite> createPayerVisite(PayerVisite value) {
        return new JAXBElement<PayerVisite>(_PayerVisite_QNAME, PayerVisite.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PayerVisiteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://visiteguidee.projet.javaee.eseo.fr/", name = "payerVisiteResponse")
    public JAXBElement<PayerVisiteResponse> createPayerVisiteResponse(PayerVisiteResponse value) {
        return new JAXBElement<PayerVisiteResponse>(_PayerVisiteResponse_QNAME, PayerVisiteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReserverVisite }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://visiteguidee.projet.javaee.eseo.fr/", name = "reserverVisite")
    public JAXBElement<ReserverVisite> createReserverVisite(ReserverVisite value) {
        return new JAXBElement<ReserverVisite>(_ReserverVisite_QNAME, ReserverVisite.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReserverVisiteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://visiteguidee.projet.javaee.eseo.fr/", name = "reserverVisiteResponse")
    public JAXBElement<ReserverVisiteResponse> createReserverVisiteResponse(ReserverVisiteResponse value) {
        return new JAXBElement<ReserverVisiteResponse>(_ReserverVisiteResponse_QNAME, ReserverVisiteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrouverClient }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://visiteguidee.projet.javaee.eseo.fr/", name = "trouverClient")
    public JAXBElement<TrouverClient> createTrouverClient(TrouverClient value) {
        return new JAXBElement<TrouverClient>(_TrouverClient_QNAME, TrouverClient.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrouverClientResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://visiteguidee.projet.javaee.eseo.fr/", name = "trouverClientResponse")
    public JAXBElement<TrouverClientResponse> createTrouverClientResponse(TrouverClientResponse value) {
        return new JAXBElement<TrouverClientResponse>(_TrouverClientResponse_QNAME, TrouverClientResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrouverReservationByIdClient }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://visiteguidee.projet.javaee.eseo.fr/", name = "trouverReservationByIdClient")
    public JAXBElement<TrouverReservationByIdClient> createTrouverReservationByIdClient(TrouverReservationByIdClient value) {
        return new JAXBElement<TrouverReservationByIdClient>(_TrouverReservationByIdClient_QNAME, TrouverReservationByIdClient.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrouverReservationByIdClientResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://visiteguidee.projet.javaee.eseo.fr/", name = "trouverReservationByIdClientResponse")
    public JAXBElement<TrouverReservationByIdClientResponse> createTrouverReservationByIdClientResponse(TrouverReservationByIdClientResponse value) {
        return new JAXBElement<TrouverReservationByIdClientResponse>(_TrouverReservationByIdClientResponse_QNAME, TrouverReservationByIdClientResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrouverVisite }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://visiteguidee.projet.javaee.eseo.fr/", name = "trouverVisite")
    public JAXBElement<TrouverVisite> createTrouverVisite(TrouverVisite value) {
        return new JAXBElement<TrouverVisite>(_TrouverVisite_QNAME, TrouverVisite.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrouverVisiteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://visiteguidee.projet.javaee.eseo.fr/", name = "trouverVisiteResponse")
    public JAXBElement<TrouverVisiteResponse> createTrouverVisiteResponse(TrouverVisiteResponse value) {
        return new JAXBElement<TrouverVisiteResponse>(_TrouverVisiteResponse_QNAME, TrouverVisiteResponse.class, null, value);
    }

}
