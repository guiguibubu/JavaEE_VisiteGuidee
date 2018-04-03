package fr.eseo.javaee.projet.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fr.eseo.javaee.projet.tool.Convertisseur;
import fr.eseo.javaee.projet.tool.ServletTools;
import fr.eseo.javaee.projet.visiteguidee.Client;
import fr.eseo.javaee.projet.visiteguidee.Reservation;
import fr.eseo.javaee.projet.visiteguidee.ReservationVisiteSEI;
import fr.eseo.javaee.projet.visiteguidee.ReservationVisiteService;
import fr.eseo.javaee.projet.visiteguidee.Visite;

/**
 * Servlet implementation class Servlet
 */
@WebServlet(description = "Servlet pour la réservation des visites", urlPatterns = { "/ServletReservation" })
public class ServletReservation extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletReservation() {
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

		// nouvelle recherche demandée
		if (ChampSession.ATT_NOUVELLE_RECHERCHE.equals(request.getParameter(ChampSession.ATT_NOUVELLE_RECHERCHE))) {
			RequestDispatcher dispatcher = request.getRequestDispatcher(ChampSession.VUE_RECHERCHE);
			dispatcher.forward(request, response);
		}
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

		Visite visite = new Visite();
		visite.setCodeVisite(Convertisseur.asInt(request.getParameter(ChampSession.ATT_ID_VISITE)));

		Reservation reservation = new Reservation();
		reservation.setVisite(visite); // visite "vide" dont l'id correspond à celui de la visite choisie
		reservation.setClient(client); // doit être celui chargé dans la session

		/**
		 * initialisation des services
		 */
		ReservationVisiteService service = new ReservationVisiteService();
		ReservationVisiteSEI port = service.getReservationVisitePort();

		int code = port.reserverVisite(reservation);
		reservation.setCodeReservation(code);
		session.setAttribute(ChampSession.ATT_ID_RESERVATION, code);
		if (code <= 0) {
			session.setAttribute(ChampSession.ATT_ERREUR, "Réservation impossible");
		} else {
			session.setAttribute(ChampSession.ATT_SUCCES, "Réservation réussie");
		}
		// On charge en session les reservations du client
		ServletTools.chargementReservation(request);

		RequestDispatcher dispatcher = request.getRequestDispatcher(ChampSession.VUE_RESULTAT_RECHERCHE);
		dispatcher.forward(request, response);
	}
}
