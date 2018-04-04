package fr.eseo.javaee.projet.servlet.parking;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import fr.eseo.gestionparking.GestionParkingSEI;
import fr.eseo.gestionparking.GestionParkingService;
import fr.eseo.gestionparking.Parking;
import fr.eseo.gestionparking.ReservationParking;
import fr.eseo.javaee.projet.servlet.ChampSession;
import fr.eseo.javaee.projet.tool.Convertisseur;
import fr.eseo.javaee.projet.tool.ServletTools;
import fr.eseo.javaee.projet.visiteguidee.Client;
import fr.eseo.javaee.projet.visiteguidee.ReservationVisiteSEI;
import fr.eseo.javaee.projet.visiteguidee.ReservationVisiteService;
import fr.eseo.javaee.projet.visiteguidee.Visite;

/**
 * Servlet implementation class Servlet
 */
@WebServlet(description = "Servlet pour la réservation des parkings", urlPatterns = { "/ServletReservationParking" })
public class ServletReservationParking extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletReservationParking() {
		super();
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		ServletTools.verifConnexionClient(request, response);

		/**
		 * récupération de la session
		 */
		HttpSession session = request.getSession();
		/*
		 * On valorise les éléments pour la requête au WebService
		 */
		Client client = new Client();
		client.setIdClient(Convertisseur.asInt(session.getAttribute(ChampSession.ATT_ID_CLIENT).toString()));
		client.setNom(session.getAttribute(ChampSession.ATT_NOM).toString());
		client.setPrenom(session.getAttribute(ChampSession.ATT_PRENOM).toString());

		Parking parking = new Parking();
		parking.setCode(Convertisseur.asInt(request.getParameter(ChampSession.ATT_ID_PARKING)));

		Visite visite = new Visite();
		visite.setCodeVisite(Convertisseur.asInt(request.getParameter(ChampSession.ATT_ID_VISITE)));
		ReservationVisiteService serviceVisite = new ReservationVisiteService();
		ReservationVisiteSEI portVisite = serviceVisite.getReservationVisitePort();
		visite = portVisite.trouverVisite(visite).get(0);

		ReservationParking reservationParking = new ReservationParking();
		reservationParking.setCodeClient(client.getIdClient()); // doit être celui chargé dans la session
		reservationParking.setCodeParking(parking.getCode()); // correspond à l'ID du parking choisi
		// On réserve le parking 1 heure avant le début de la visite et jusqu'à 4 haures après le début de la visite
		XMLGregorianCalendar dateDebut = (XMLGregorianCalendar)visite.getDateVisite().clone();
		XMLGregorianCalendar dateFin = (XMLGregorianCalendar)visite.getDateVisite().clone();
		try {
			dateDebut.add(DatatypeFactory.newInstance().newDuration(false, 0, 0, 0, 1, 0, 0));
			dateFin.add(DatatypeFactory.newInstance().newDuration(true, 0, 0, 0, 4, 0, 0));
		} catch (DatatypeConfigurationException e) {
			e.printStackTrace();
		}
		reservationParking.setDateDebut(dateDebut);
		reservationParking.setDateFin(dateFin);

		/**
		 * initialisation des services
		 */
		GestionParkingService service = new GestionParkingService();
		GestionParkingSEI port = service.getGestionParkingPort();

		int code = port.reserverParking(reservationParking);
		reservationParking.setCodeResa(code);
		session.setAttribute(ChampSession.ATT_ID_RESERVATION_PARKING, code);
		if (code <= 0) {
			session.setAttribute(ChampSession.ATT_ERREUR, "Réservation impossible.");
		} else {
			session.setAttribute(ChampSession.ATT_SUCCES, "Réservation réussie.");
		}

		RequestDispatcher dispatcher = request.getRequestDispatcher(ChampSession.VUE_MES_RESERVATION);
		dispatcher.forward(request, response);
	}
}
