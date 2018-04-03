package fr.eseo.javaee.projet.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fr.eseo.gestionparking.GestionParkingSEI;
import fr.eseo.gestionparking.GestionParkingService;
import fr.eseo.gestionparking.Parking;
import fr.eseo.javaee.projet.tool.Convertisseur;
import fr.eseo.javaee.projet.tool.ServletTools;
import fr.eseo.javaee.projet.visiteguidee.ReservationVisiteSEI;
import fr.eseo.javaee.projet.visiteguidee.ReservationVisiteService;
import fr.eseo.javaee.projet.visiteguidee.Visite;

/**
 * Servlet implementation class ServletRecherche
 */
@WebServlet("/ServletRecherche")
public class ServletRecherche extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletRecherche() {
		super();
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		ServletTools.verifConnexionClient(request, response);
		/**
		 * initialisation des objets
		 */
		Visite visite = new Visite();
		String typeVisite = request.getParameter(ChampSession.ATT_TYPE_VISITE);
		String ville = request.getParameter(ChampSession.ATT_VILLE);
		String dateTime = request.getParameter(ChampSession.ATT_DATE_VISITE);
		String prix = request.getParameter(ChampSession.ATT_PRIX);
		visite.setTypeDeVisite(typeVisite);
		visite.setVille(ville);
		visite.setDateVisite(Convertisseur.asXMLGregorianCalendar(dateTime));
		visite.setPrix(Convertisseur.asInt(prix));

		/**
		 * initialisation des services
		 */
		ReservationVisiteService service = new ReservationVisiteService();
		ReservationVisiteSEI port = service.getReservationVisitePort();

		List<Visite> visites = port.trouverVisite(visite);

		/*
		 * On récupère les parking dans la  ville
		 */
		List<Parking> parkings = null;
		Parking parking = new Parking();
		parking.setVille(ville);

		GestionParkingService serviceParking = new GestionParkingService();
		GestionParkingSEI portParking = serviceParking.getGestionParkingPort();

		parkings = portParking.trouverParking(parking);

		/**
		 * récupération de la session
		 */
		HttpSession session = request.getSession();
		session.setAttribute(ChampSession.ATT_LISTE_VISITES, visites);

		if(parkings != null) {
			session.setAttribute(ChampSession.ATT_LISTE_PARKING, parkings);
		}

		RequestDispatcher dispatcher = request.getRequestDispatcher(ChampSession.VUE_RESULTAT_RECHERCHE);
		dispatcher.forward(request, response);
	}
}