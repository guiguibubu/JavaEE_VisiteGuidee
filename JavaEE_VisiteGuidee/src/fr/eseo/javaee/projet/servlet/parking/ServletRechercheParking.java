package fr.eseo.javaee.projet.servlet.parking;

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
import fr.eseo.javaee.projet.servlet.ChampSession;
import fr.eseo.javaee.projet.tool.ServletTools;

/**
 * Servlet implementation class ServletRecherche
 */
@WebServlet("/ServletRechercheParking")
public class ServletRechercheParking extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletRechercheParking() {
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
		String ville = request.getParameter(ChampSession.ATT_VILLE);

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

		if(parkings != null) {
			session.setAttribute(ChampSession.ATT_LISTE_PARKING, parkings);
		}

		RequestDispatcher dispatcher = request.getRequestDispatcher(ChampSession.VUE_RESULTAT_RECHERCHE_PARKING);
		dispatcher.forward(request, response);
	}
}