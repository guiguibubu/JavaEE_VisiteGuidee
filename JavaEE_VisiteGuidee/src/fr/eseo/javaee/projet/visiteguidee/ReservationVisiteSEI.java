package fr.eseo.javaee.projet.visiteguidee;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.2.2
 * 2018-03-31T16:19:38.720+02:00
 * Generated source version: 3.2.2
 *
 */
@WebService(targetNamespace = "http://visiteguidee.projet.javaee.eseo.fr/", name = "ReservationVisiteSEI")
@XmlSeeAlso({ObjectFactory.class})
public interface ReservationVisiteSEI {

    @WebMethod(action = "urn:TrouverVisite")
    @RequestWrapper(localName = "trouverVisite", targetNamespace = "http://visiteguidee.projet.javaee.eseo.fr/", className = "fr.eseo.javaee.projet.visiteguidee.TrouverVisite")
    @ResponseWrapper(localName = "trouverVisiteResponse", targetNamespace = "http://visiteguidee.projet.javaee.eseo.fr/", className = "fr.eseo.javaee.projet.visiteguidee.TrouverVisiteResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.util.List<fr.eseo.javaee.projet.visiteguidee.Visite> trouverVisite(
        @WebParam(name = "arg0", targetNamespace = "")
        fr.eseo.javaee.projet.visiteguidee.Visite arg0
    );

    @WebMethod(action = "urn:AnnulerVisite")
    @RequestWrapper(localName = "annulerVisite", targetNamespace = "http://visiteguidee.projet.javaee.eseo.fr/", className = "fr.eseo.javaee.projet.visiteguidee.AnnulerVisite")
    @ResponseWrapper(localName = "annulerVisiteResponse", targetNamespace = "http://visiteguidee.projet.javaee.eseo.fr/", className = "fr.eseo.javaee.projet.visiteguidee.AnnulerVisiteResponse")
    @WebResult(name = "return", targetNamespace = "")
    public boolean annulerVisite(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0
    );

    @WebMethod(action = "urn:ReserverVisite")
    @RequestWrapper(localName = "reserverVisite", targetNamespace = "http://visiteguidee.projet.javaee.eseo.fr/", className = "fr.eseo.javaee.projet.visiteguidee.ReserverVisite")
    @ResponseWrapper(localName = "reserverVisiteResponse", targetNamespace = "http://visiteguidee.projet.javaee.eseo.fr/", className = "fr.eseo.javaee.projet.visiteguidee.ReserverVisiteResponse")
    @WebResult(name = "return", targetNamespace = "")
    public int reserverVisite(
        @WebParam(name = "arg0", targetNamespace = "")
        fr.eseo.javaee.projet.visiteguidee.Reservation arg0
    );

    @WebMethod(action = "urn:PayerVisite")
    @RequestWrapper(localName = "payerVisite", targetNamespace = "http://visiteguidee.projet.javaee.eseo.fr/", className = "fr.eseo.javaee.projet.visiteguidee.PayerVisite")
    @ResponseWrapper(localName = "payerVisiteResponse", targetNamespace = "http://visiteguidee.projet.javaee.eseo.fr/", className = "fr.eseo.javaee.projet.visiteguidee.PayerVisiteResponse")
    @WebResult(name = "return", targetNamespace = "")
    public boolean payerVisite(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0
    );

    @WebMethod(action = "urn:TrouverReservationByIdClient")
    @RequestWrapper(localName = "trouverReservationByIdClient", targetNamespace = "http://visiteguidee.projet.javaee.eseo.fr/", className = "fr.eseo.javaee.projet.visiteguidee.TrouverReservationByIdClient")
    @ResponseWrapper(localName = "trouverReservationByIdClientResponse", targetNamespace = "http://visiteguidee.projet.javaee.eseo.fr/", className = "fr.eseo.javaee.projet.visiteguidee.TrouverReservationByIdClientResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.util.List<fr.eseo.javaee.projet.visiteguidee.Reservation> trouverReservationByIdClient(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0
    );

    @WebMethod(action = "urn:TrouverClient")
    @RequestWrapper(localName = "trouverClient", targetNamespace = "http://visiteguidee.projet.javaee.eseo.fr/", className = "fr.eseo.javaee.projet.visiteguidee.TrouverClient")
    @ResponseWrapper(localName = "trouverClientResponse", targetNamespace = "http://visiteguidee.projet.javaee.eseo.fr/", className = "fr.eseo.javaee.projet.visiteguidee.TrouverClientResponse")
    @WebResult(name = "return", targetNamespace = "")
    public fr.eseo.javaee.projet.visiteguidee.Client trouverClient(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        java.lang.String arg1
    );
}
