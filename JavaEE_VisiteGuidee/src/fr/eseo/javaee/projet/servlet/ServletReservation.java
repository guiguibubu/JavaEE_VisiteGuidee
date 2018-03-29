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

	private static final String VUE_RECHERCHE = "Recherche.jsp";
	private static final String VUE_PAIEMENT = "Paiement.jsp";

	public static final String ATT_ID_CLIENT = "idClient";
	public static final String ATT_ID_VISITE = "idVisite";
	public static final String ATT_ID_RESERVATION = "idReservation";
	public static final String ATT_NEW_SEARCH = "newSearch";

	public static final String ATT_ERREUR = "erreur";

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletReservation() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("newSearch => "+request.getAttribute("newSearch"));
		if("newSearch".equals(request.getAttribute(ATT_NEW_SEARCH))) {
			RequestDispatcher dispatcher = request.getRequestDispatcher(VUE_RECHERCHE);
			dispatcher.forward(request, response);
		}
		/**
		 * récupération de la session
		 */
		HttpSession session = request.getSession();
		/**
		 * On allège la session en supprimant la liste des visites en mémoire
		 */
		session.removeAttribute(ServletRecherche.ATT_VISITES);
		/*
		 * On valorise les éléments pour la requête au WebService
		 */
		Client client = new Client();
		client.setIdClient(Convertisseur.asInt(session.getAttribute(ATT_ID_CLIENT).toString()));
		client.setNom(session.getAttribute(ServletAuthentification.ATT_NOM).toString());
		client.setPrenom(session.getAttribute(ServletAuthentification.ATT_PRENOM).toString());

		Visite visite = new Visite();
		visite.setCodeVisite(Convertisseur.asInt(request.getParameter(ATT_ID_VISITE).toString()));

		Reservation reservation = new Reservation();
		reservation.setVisite(visite); //  visite "vide" dont l'id correspond à celui de la visite choisie
		reservation.setClient(client); // doit être celui chargé dans la session

		/**
		 * initialisation des services
		 */
		ReservationVisiteService service = new ReservationVisiteService();
		ReservationVisiteSEI port = service.getReservationVisitePort();

		int code = port.reserverVisite(reservation);
		reservation.setCodeReservation(code);
		session.setAttribute(ATT_ID_RESERVATION, code);
		if(code == -1) {
			session.setAttribute(ATT_ERREUR, "La base de données côté serveur n'est pas disponible");
		}
		RequestDispatcher dispatcher = request.getRequestDispatcher(VUE_PAIEMENT);
		dispatcher.forward(request, response);
	}
}
