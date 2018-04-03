
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package fr.eseo.javaee.projet.visiteguidee;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.2.2
 * 2018-03-31T16:19:38.705+02:00
 * Generated source version: 3.2.2
 *
 */

@javax.jws.WebService(
                      serviceName = "ReservationVisiteService",
                      portName = "ReservationVisitePort",
                      targetNamespace = "http://visiteguidee.projet.javaee.eseo.fr/",
                      wsdlLocation = "http://localhost:8080/GestionVisites/services/ReservationVisitePort?wsdl",
                      endpointInterface = "fr.eseo.javaee.projet.visiteguidee.ReservationVisiteSEI")

public class ReservationVisitePortImpl implements ReservationVisiteSEI {

    private static final Logger LOG = Logger.getLogger(ReservationVisitePortImpl.class.getName());

    /* (non-Javadoc)
     * @see fr.eseo.javaee.projet.visiteguidee.ReservationVisiteSEI#trouverVisite(fr.eseo.javaee.projet.visiteguidee.Visite arg0)*
     */
    public java.util.List<fr.eseo.javaee.projet.visiteguidee.Visite> trouverVisite(fr.eseo.javaee.projet.visiteguidee.Visite arg0) {
        LOG.info("Executing operation trouverVisite");
        System.out.println(arg0);
        try {
            java.util.List<fr.eseo.javaee.projet.visiteguidee.Visite> _return = new java.util.ArrayList<fr.eseo.javaee.projet.visiteguidee.Visite>();
            fr.eseo.javaee.projet.visiteguidee.Visite _returnVal1 = new fr.eseo.javaee.projet.visiteguidee.Visite();
            _returnVal1.setCodeVisite(-79056382);
            _returnVal1.setDateVisite(javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar("2018-03-31T16:19:38.715+02:00"));
            _returnVal1.setPrix(0.110230684f);
            _returnVal1.setTypeDeVisite("TypeDeVisite2099636817");
            _returnVal1.setVille("Ville385378956");
            _return.add(_returnVal1);
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see fr.eseo.javaee.projet.visiteguidee.ReservationVisiteSEI#annulerVisite(int arg0)*
     */
    public boolean annulerVisite(int arg0) {
        LOG.info("Executing operation annulerVisite");
        System.out.println(arg0);
        try {
            boolean _return = true;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see fr.eseo.javaee.projet.visiteguidee.ReservationVisiteSEI#reserverVisite(fr.eseo.javaee.projet.visiteguidee.Reservation arg0)*
     */
    public int reserverVisite(fr.eseo.javaee.projet.visiteguidee.Reservation arg0) {
        LOG.info("Executing operation reserverVisite");
        System.out.println(arg0);
        try {
            int _return = -1985377937;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see fr.eseo.javaee.projet.visiteguidee.ReservationVisiteSEI#payerVisite(int arg0)*
     */
    public boolean payerVisite(int arg0) {
        LOG.info("Executing operation payerVisite");
        System.out.println(arg0);
        try {
            boolean _return = false;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see fr.eseo.javaee.projet.visiteguidee.ReservationVisiteSEI#trouverReservationByIdClient(int arg0)*
     */
    public java.util.List<fr.eseo.javaee.projet.visiteguidee.Reservation> trouverReservationByIdClient(int arg0) {
        LOG.info("Executing operation trouverReservationByIdClient");
        System.out.println(arg0);
        try {
            java.util.List<fr.eseo.javaee.projet.visiteguidee.Reservation> _return = new java.util.ArrayList<fr.eseo.javaee.projet.visiteguidee.Reservation>();
            fr.eseo.javaee.projet.visiteguidee.Reservation _returnVal1 = new fr.eseo.javaee.projet.visiteguidee.Reservation();
            fr.eseo.javaee.projet.visiteguidee.Client _returnVal1Client = new fr.eseo.javaee.projet.visiteguidee.Client();
            _returnVal1Client.setAdresse("Adresse-952341420");
            _returnVal1Client.setCodePostal(1136155952);
            _returnVal1Client.setIdClient(1264709184);
            _returnVal1Client.setMail("Mail729039308");
            _returnVal1Client.setNom("Nom1990558447");
            _returnVal1Client.setNumTelephone(1089473344);
            _returnVal1Client.setPays("Pays578285683");
            _returnVal1Client.setPrenom("Prenom1155999496");
            _returnVal1.setClient(_returnVal1Client);
            _returnVal1.setCodeReservation(-2146333010);
            _returnVal1.setNombrePersonnes(33690997);
            _returnVal1.setPaiementEffectue(false);
            fr.eseo.javaee.projet.visiteguidee.Visite _returnVal1Visite = new fr.eseo.javaee.projet.visiteguidee.Visite();
            _returnVal1Visite.setCodeVisite(1433517047);
            _returnVal1Visite.setDateVisite(javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar("2018-03-31T16:19:38.719+02:00"));
            _returnVal1Visite.setPrix(0.71236664f);
            _returnVal1Visite.setTypeDeVisite("TypeDeVisite1697078804");
            _returnVal1Visite.setVille("Ville1328202408");
            _returnVal1.setVisite(_returnVal1Visite);
            _return.add(_returnVal1);
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see fr.eseo.javaee.projet.visiteguidee.ReservationVisiteSEI#trouverClient(java.lang.String arg0, java.lang.String arg1)*
     */
    public fr.eseo.javaee.projet.visiteguidee.Client trouverClient(java.lang.String arg0, java.lang.String arg1) {
        LOG.info("Executing operation trouverClient");
        System.out.println(arg0);
        System.out.println(arg1);
        try {
            fr.eseo.javaee.projet.visiteguidee.Client _return = new fr.eseo.javaee.projet.visiteguidee.Client();
            _return.setAdresse("Adresse-2001793352");
            _return.setCodePostal(1740828561);
            _return.setIdClient(-113150730);
            _return.setMail("Mail-2041387051");
            _return.setNom("Nom1302923903");
            _return.setNumTelephone(-225646214);
            _return.setPays("Pays-1165666473");
            _return.setPrenom("Prenom2026738436");
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
