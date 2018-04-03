package fr.eseo.javaee.projet.servlet.parking;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fr.eseo.gestionparking.GestionParkingSEI;
import fr.eseo.gestionparking.GestionParkingService;
import fr.eseo.javaee.projet.servlet.ChampSession;
import fr.eseo.javaee.projet.tool.Convertisseur;
import fr.eseo.javaee.projet.tool.ServletTools;

/**
 * Servlet implementation class ServletAnnulation
 */
@WebServlet("/ServletPaiementParking")
public class ServletPaiementParking extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletPaiementParking() {
		super();
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		ServletTools.verifConnexionClient(request, response);
		/**
		 * initialisation des services
		 */
		GestionParkingService service = new GestionParkingService();
		GestionParkingSEI port = service.getGestionParkingPort();

		boolean paiement = false;

		paiement = "Paiement effectué".equals(port.payerParking(Convertisseur.asInt(request.getParameter(ChampSession.ATT_ID_RESERVATION_PARKING))));

		/**
		 * récupération de la session
		 */
		HttpSession session = request.getSession();
		if(paiement) {
			session.setAttribute(ChampSession.ATT_SUCCES, "Paiement réussie");
		} else {
			session.setAttribute(ChampSession.ATT_ERREUR, "Paiement impossible");
		}

		RequestDispatcher dispatcher = request.getRequestDispatcher(ChampSession.VUE_MES_RESERVATION);
		dispatcher.forward(request, response);
	}

}
