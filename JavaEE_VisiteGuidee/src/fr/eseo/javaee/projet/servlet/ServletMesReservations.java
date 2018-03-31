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

import fr.eseo.javaee.projet.tool.ServletTools;
import fr.eseo.javaee.projet.visiteguidee.Reservation;
import fr.eseo.javaee.projet.visiteguidee.ReservationVisiteSEI;
import fr.eseo.javaee.projet.visiteguidee.ReservationVisiteService;

/**
 * Servlet implementation class Servlet
 */
@WebServlet(description = "Servlet avoir les réservations du client", urlPatterns = { "/ServletMesReservations" })
public class ServletMesReservations extends HttpServlet {
	private static final long serialVersionUID = 1L;

	//	private static final String VUE_RECHERCHE = "Recherche.jsp";
	//	private static final String VUE_PAIEMENT = "Paiement.jsp";
	//
	//	public static final String ATT_ID_CLIENT = "idClient";
	//	public static final String ATT_ID_VISITE = ServletAuthentification.ATT_ID_CLIENT;
	//	public static final String ATT_ID_RESERVATION = "idReservation";
	//	public static final String ATT_NEW_SEARCH = "newSearch";
	//
	//	public static final String ATT_ERREUR = "erreur";

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletMesReservations() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		ServletTools.verifConnexionClient(request, response);

		/**
		 * récupération de la session
		 */
		HttpSession session = request.getSession();
		/*
		 * On valorise les éléments pour la requête au WebService
		 */
		int idClient = (int) session.getAttribute(ChampSession.ATT_ID_CLIENT);

		/**
		 * initialisation des services
		 */
		ReservationVisiteService service = new ReservationVisiteService();
		ReservationVisiteSEI port = service.getReservationVisitePort();

		List<Reservation> listeReservation = port.trouverReservationByIdClient(idClient);
		session.setAttribute(ChampSession.ATT_LISTE_RESERVATIONS, listeReservation);

		RequestDispatcher dispatcher = request.getRequestDispatcher(ChampSession.VUE_MES_RESERVATION);
		dispatcher.forward(request, response);
	}
}
