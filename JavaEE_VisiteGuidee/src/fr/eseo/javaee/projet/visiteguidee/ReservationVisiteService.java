package fr.eseo.javaee.projet.visiteguidee;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.2.2
 * 2018-03-31T16:19:38.728+02:00
 * Generated source version: 3.2.2
 *
 */
@WebServiceClient(name = "ReservationVisiteService",
                  wsdlLocation = "http://localhost:8080/GestionVisites/services/ReservationVisitePort?wsdl",
                  targetNamespace = "http://visiteguidee.projet.javaee.eseo.fr/")
public class ReservationVisiteService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://visiteguidee.projet.javaee.eseo.fr/", "ReservationVisiteService");
    public final static QName ReservationVisitePort = new QName("http://visiteguidee.projet.javaee.eseo.fr/", "ReservationVisitePort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8080/GestionVisites/services/ReservationVisitePort?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(ReservationVisiteService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "http://localhost:8080/GestionVisites/services/ReservationVisitePort?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public ReservationVisiteService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public ReservationVisiteService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ReservationVisiteService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public ReservationVisiteService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public ReservationVisiteService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public ReservationVisiteService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns ReservationVisiteSEI
     */
    @WebEndpoint(name = "ReservationVisitePort")
    public ReservationVisiteSEI getReservationVisitePort() {
        return super.getPort(ReservationVisitePort, ReservationVisiteSEI.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ReservationVisiteSEI
     */
    @WebEndpoint(name = "ReservationVisitePort")
    public ReservationVisiteSEI getReservationVisitePort(WebServiceFeature... features) {
        return super.getPort(ReservationVisitePort, ReservationVisiteSEI.class, features);
    }

}
