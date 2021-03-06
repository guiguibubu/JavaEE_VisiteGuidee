
package fr.eseo.javaee.projet.visiteguidee;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.2.2
 * 2018-03-31T16:19:38.645+02:00
 * Generated source version: 3.2.2
 *
 */
public final class ReservationVisiteSEI_ReservationVisitePort_Client {

    private static final QName SERVICE_NAME = new QName("http://visiteguidee.projet.javaee.eseo.fr/", "ReservationVisiteService");

    private ReservationVisiteSEI_ReservationVisitePort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = ReservationVisiteService.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) {
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }

        ReservationVisiteService ss = new ReservationVisiteService(wsdlURL, SERVICE_NAME);
        ReservationVisiteSEI port = ss.getReservationVisitePort();

        {
        System.out.println("Invoking trouverVisite...");
        fr.eseo.javaee.projet.visiteguidee.Visite _trouverVisite_arg0 = new fr.eseo.javaee.projet.visiteguidee.Visite();
        _trouverVisite_arg0.setCodeVisite(-851691723);
        _trouverVisite_arg0.setDateVisite(javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar("2018-03-31T16:19:38.695+02:00"));
        _trouverVisite_arg0.setPrix(0.2428379f);
        _trouverVisite_arg0.setTypeDeVisite("TypeDeVisite478332598");
        _trouverVisite_arg0.setVille("Ville1442075212");
        java.util.List<fr.eseo.javaee.projet.visiteguidee.Visite> _trouverVisite__return = port.trouverVisite(_trouverVisite_arg0);
        System.out.println("trouverVisite.result=" + _trouverVisite__return);


        }
        {
        System.out.println("Invoking annulerVisite...");
        int _annulerVisite_arg0 = -1755827401;
        boolean _annulerVisite__return = port.annulerVisite(_annulerVisite_arg0);
        System.out.println("annulerVisite.result=" + _annulerVisite__return);


        }
        {
        System.out.println("Invoking reserverVisite...");
        fr.eseo.javaee.projet.visiteguidee.Reservation _reserverVisite_arg0 = new fr.eseo.javaee.projet.visiteguidee.Reservation();
        fr.eseo.javaee.projet.visiteguidee.Client _reserverVisite_arg0Client = new fr.eseo.javaee.projet.visiteguidee.Client();
        _reserverVisite_arg0Client.setAdresse("Adresse1255066589");
        _reserverVisite_arg0Client.setCodePostal(1369397363);
        _reserverVisite_arg0Client.setIdClient(1381696193);
        _reserverVisite_arg0Client.setMail("Mail350438072");
        _reserverVisite_arg0Client.setNom("Nom-1059585358");
        _reserverVisite_arg0Client.setNumTelephone(-564111949);
        _reserverVisite_arg0Client.setPays("Pays-1634707782");
        _reserverVisite_arg0Client.setPrenom("Prenom-208353468");
        _reserverVisite_arg0.setClient(_reserverVisite_arg0Client);
        _reserverVisite_arg0.setCodeReservation(-1691070223);
        _reserverVisite_arg0.setNombrePersonnes(-327435187);
        _reserverVisite_arg0.setPaiementEffectue(true);
        fr.eseo.javaee.projet.visiteguidee.Visite _reserverVisite_arg0Visite = new fr.eseo.javaee.projet.visiteguidee.Visite();
        _reserverVisite_arg0Visite.setCodeVisite(-453525927);
        _reserverVisite_arg0Visite.setDateVisite(javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar("2018-03-31T16:19:38.702+02:00"));
        _reserverVisite_arg0Visite.setPrix(0.79658365f);
        _reserverVisite_arg0Visite.setTypeDeVisite("TypeDeVisite-1761481589");
        _reserverVisite_arg0Visite.setVille("Ville493887979");
        _reserverVisite_arg0.setVisite(_reserverVisite_arg0Visite);
        int _reserverVisite__return = port.reserverVisite(_reserverVisite_arg0);
        System.out.println("reserverVisite.result=" + _reserverVisite__return);


        }
        {
        System.out.println("Invoking payerVisite...");
        int _payerVisite_arg0 = 347735866;
        boolean _payerVisite__return = port.payerVisite(_payerVisite_arg0);
        System.out.println("payerVisite.result=" + _payerVisite__return);


        }
        {
        System.out.println("Invoking trouverReservationByIdClient...");
        int _trouverReservationByIdClient_arg0 = 202592745;
        java.util.List<fr.eseo.javaee.projet.visiteguidee.Reservation> _trouverReservationByIdClient__return = port.trouverReservationByIdClient(_trouverReservationByIdClient_arg0);
        System.out.println("trouverReservationByIdClient.result=" + _trouverReservationByIdClient__return);


        }
        {
        System.out.println("Invoking trouverClient...");
        java.lang.String _trouverClient_arg0 = "_trouverClient_arg0-920939234";
        java.lang.String _trouverClient_arg1 = "_trouverClient_arg1-1365373749";
        fr.eseo.javaee.projet.visiteguidee.Client _trouverClient__return = port.trouverClient(_trouverClient_arg0, _trouverClient_arg1);
        System.out.println("trouverClient.result=" + _trouverClient__return);


        }

        System.exit(0);
    }

}
