
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
 * 2018-03-19T23:01:52.970+01:00
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
        System.out.println("Invoking reserverVisite...");
        fr.eseo.javaee.projet.visiteguidee.Reservation _reserverVisite_arg0 = new fr.eseo.javaee.projet.visiteguidee.Reservation();
        fr.eseo.javaee.projet.visiteguidee.Client _reserverVisite_arg0CodeClient = new fr.eseo.javaee.projet.visiteguidee.Client();
        _reserverVisite_arg0CodeClient.setAdresse("Adresse-2104134107");
        _reserverVisite_arg0CodeClient.setCodePostal(-1150785663);
        fr.eseo.javaee.projet.visiteguidee.LocalDate _reserverVisite_arg0CodeClientDateNaissance = new fr.eseo.javaee.projet.visiteguidee.LocalDate();
        _reserverVisite_arg0CodeClient.setDateNaissance(_reserverVisite_arg0CodeClientDateNaissance);
        _reserverVisite_arg0CodeClient.setIdClient(1410501998);
        _reserverVisite_arg0CodeClient.setMail("Mail-1157552608");
        _reserverVisite_arg0CodeClient.setNom("Nom-1807199816");
        _reserverVisite_arg0CodeClient.setNumTelephone(-210844038);
        _reserverVisite_arg0CodeClient.setPays("Pays873692376");
        _reserverVisite_arg0CodeClient.setPrenom("Prenom-2091792870");
        _reserverVisite_arg0.setCodeClient(_reserverVisite_arg0CodeClient);
        _reserverVisite_arg0.setCodeReservation(1233389518);
        fr.eseo.javaee.projet.visiteguidee.Visite _reserverVisite_arg0CodeVisite = new fr.eseo.javaee.projet.visiteguidee.Visite();
        _reserverVisite_arg0CodeVisite.setCodeVisite(999666652);
        fr.eseo.javaee.projet.visiteguidee.LocalDateTime _reserverVisite_arg0CodeVisiteDateVisite = new fr.eseo.javaee.projet.visiteguidee.LocalDateTime();
        _reserverVisite_arg0CodeVisite.setDateVisite(_reserverVisite_arg0CodeVisiteDateVisite);
        _reserverVisite_arg0CodeVisite.setPrix(0.87396276f);
        _reserverVisite_arg0CodeVisite.setTypeDeVisite("TypeDeVisite1464133848");
        _reserverVisite_arg0CodeVisite.setVille("Ville1369901068");
        _reserverVisite_arg0.setCodeVisite(_reserverVisite_arg0CodeVisite);
        _reserverVisite_arg0.setNombrePersonnes(-2052810113);
        _reserverVisite_arg0.setPaiementEffectue(true);
        int _reserverVisite__return = port.reserverVisite(_reserverVisite_arg0);
        System.out.println("reserverVisite.result=" + _reserverVisite__return);


        }
        {
        System.out.println("Invoking payerVisite...");
        int _payerVisite_arg0 = -1671871964;
        java.lang.String _payerVisite__return = port.payerVisite(_payerVisite_arg0);
        System.out.println("payerVisite.result=" + _payerVisite__return);


        }
        {
        System.out.println("Invoking trouverVisite...");
        fr.eseo.javaee.projet.visiteguidee.Visite _trouverVisite_arg0 = new fr.eseo.javaee.projet.visiteguidee.Visite();
        _trouverVisite_arg0.setCodeVisite(-1004409480);
        fr.eseo.javaee.projet.visiteguidee.LocalDateTime _trouverVisite_arg0DateVisite = new fr.eseo.javaee.projet.visiteguidee.LocalDateTime();
        _trouverVisite_arg0.setDateVisite(_trouverVisite_arg0DateVisite);
        _trouverVisite_arg0.setPrix(0.8444311f);
        _trouverVisite_arg0.setTypeDeVisite("TypeDeVisite-1590140284");
        _trouverVisite_arg0.setVille("Ville1899227968");
        java.util.List<fr.eseo.javaee.projet.visiteguidee.Visite> _trouverVisite__return = port.trouverVisite(_trouverVisite_arg0);
        System.out.println("trouverVisite.result=" + _trouverVisite__return);


        }
        {
        System.out.println("Invoking annulerVisite...");
        int _annulerVisite_arg0 = 1079421536;
        boolean _annulerVisite__return = port.annulerVisite(_annulerVisite_arg0);
        System.out.println("annulerVisite.result=" + _annulerVisite__return);


        }

        System.exit(0);
    }

}
