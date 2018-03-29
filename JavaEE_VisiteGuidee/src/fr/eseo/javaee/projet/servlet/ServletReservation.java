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
	public static final String ATT_NEW_SEARCH = "newSearch";

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
		// TODO Auto-generated method stub
		System.out.println("newSearch => "+request.getAttribute("newSearch"));
		if("newSearch".equals(request.getAttribute(ATT_NEW_SEARCH))) {
			RequestDispatcher dispatcher = request.getRequestDispatcher(VUE_RECHERCHE);
			dispatcher.forward(request, response);
		}
		/**
		 * initialisation des objets
		 */
		/**
		 * récupération de la session
		 */
		HttpSession session = request.getSession();
		Reservation reservation = new Reservation();
		Visite visite = new Visite();
		Client client = new Client();
		client.setIdClient(Convertisseur.asInt(session.getAttribute(ATT_ID_CLIENT).toString()));
		visite.setCodeVisite(Convertisseur.asInt(request.getParameter(ATT_ID_VISITE).toString()));

		//		String voyage = request.getParameter("voyage");
		//		String[] parts = voyage.split(" - ");
		//		visite.setTypeDeVisite(parts[0]);
		//		visite.setVille(parts[1]);
		//		visite.setDateVisite(Convertisseur.asXMLGregorianCalendar(parts[2]));
		//		visite.setPrix(Convertisseur.asInt(parts[3]));
		//
		//		/**
		//		 * fonction utilisateur pas encore implantée
		//		 */
		//		client.setAdresse("");
		//		client.setCodePostal(0);
		//		client.setIdClient(0);
		//		client.setMail("");
		//		client.setNom("");
		//		client.setNumTelephone(0);
		//		client.setPays("");
		//		client.setPrenom("");
		//
		//		/**
		//		 * fonction utilisateur pas encore implantée
		//		 */
		//		client.setAdresse("");
		//		client.setCodePostal(0);
		//		client.setIdClient(0);
		//		client.setMail("");
		//		client.setNom("");
		//		client.setNumTelephone(0);
		//		client.setPays("");
		//		client.setPrenom("");

		/**
		 * maj de la reservation
		 */
		reservation.setVisite(visite); //  visite "vide" dont l'id correspond à celui de la visite choisie
		reservation.setClient(client); // doit être celui chargé dans la session

		/**
		 * initialisation des services
		 */
		ReservationVisiteService service = new ReservationVisiteService();
		ReservationVisiteSEI port = service.getReservationVisitePort();
		int code = 0;
		System.out.println(code);
		try {
			code = port.reserverVisite(reservation);
		} catch (Exception e) {
			// TODO G�rer l'exception pour la transmettre � l'IHM
			e.printStackTrace();
		}

		session.setAttribute("resultat", code);

		RequestDispatcher dispatcher = request.getRequestDispatcher(VUE_PAIEMENT);
		dispatcher.forward(request, response);
	}
}
