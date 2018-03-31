package fr.eseo.javaee.projet.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fr.eseo.javaee.projet.visiteguidee.Client;
import fr.eseo.javaee.projet.visiteguidee.ReservationVisiteSEI;
import fr.eseo.javaee.projet.visiteguidee.ReservationVisiteService;

/**
 * Servlet implementation class ServletAuthentification
 */
@WebServlet("/ServletAuthentification")
public class ServletAuthentification extends HttpServlet {
	private static final long serialVersionUID = 1L;

	//	private static final String VUE_CONNEXION = "index.jsp";
	//	private static final String VUE_RECHERCHE = "Recherche.jsp";
	//
	//	public static final String ATT_PRENOM = "prenom";
	//	public static final String ATT_NOM = "nom";
	//	public static final String ATT_ID_CLIENT = "idClient";
	//
	//	public static final String ATT_ERREUR = "erreur";

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletAuthentification() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		ReservationVisiteService service = new ReservationVisiteService();
		ReservationVisiteSEI port = service.getReservationVisitePort();

		String prenom = request.getParameter(ChampSession.ATT_PRENOM);
		String nom = request.getParameter(ChampSession.ATT_NOM);

		Client client = port.trouverClient(nom, prenom);
		int idClient = 0;
		if(client != null) {
			idClient = client.getIdClient();
		}

		/*
		 * Récupération de la session
		 */
		HttpSession session = request.getSession();
		if(idClient == -1) {
			session.setAttribute(ChampSession.ATT_ERREUR, "La base de données côté serveur n'est pas disponible");
			RequestDispatcher dispatcher = request.getRequestDispatcher(ChampSession.VUE_CONNEXION);
			dispatcher.forward(request, response);
		} else if(idClient == 0) {
			session.setAttribute(ChampSession.ATT_ERREUR, "Vous n'êtes pas enregistré, vous n'avez pas accès à l'application");
			RequestDispatcher dispatcher = request.getRequestDispatcher(ChampSession.VUE_CONNEXION);
			dispatcher.forward(request, response);
		} else {
			session.removeAttribute(ChampSession.ATT_ERREUR);
			session.setAttribute(ChampSession.ATT_PRENOM, prenom);
			session.setAttribute(ChampSession.ATT_NOM, nom);
			session.setAttribute(ChampSession.ATT_ID_CLIENT, idClient);
			RequestDispatcher dispatcher = request.getRequestDispatcher(ChampSession.VUE_RECHERCHE);
			dispatcher.forward(request, response);
		}
	}

}
