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
 * Servlet implementation class ServletIndex
 */
@WebServlet("/ServletIndex")
public class ServletIndex extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private static final String VUE_CONNEXION = "index.jsp";
	private static final String VUE_RECHCERCHE = "Recherche.jsp";

	public static final String ATT_PRENOM = "prenom";
	public static final String ATT_NOM = "nom";
	public static final String ATT_ID_CLIENT = "idClient";

	public static final String ATT_ERREUR = "erreur";

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletIndex() {
		super();
		// TODO Auto-generated constructor stub
	}


	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Faire une simple vérification si la personne existe en base de donnée (prénom+nom, pas de login+password). Si c'est le cas on charge son ID en session, sinon on recharge la page de connexion avec une erreur

		//		/**
		//		 * initialisation des objets
		//		 */
		//		Utilisateur utili = new Utilisateur();
		//		String motDePasse = request.getParameter("password");
		//
		//
		//		try {
		//			visite.setDateVisite(Convertisseur.asXMLGregorianCalendar(dateTimeFormatter.parse(dateTime)));
		//			visite.setPrix(Integer.parseInt(prix));
		//		} catch (ParseException e1) {
		//			e1.printStackTrace();
		//		}
		//
		//		/**
		//		 * initialisation des services
		//		 */
		//		ReservationVisiteService service = new ReservationVisiteService();
		//		ReservationVisiteSEI port = service.getReservationVisitePort();
		//
		//		List<Visite> visites = new ArrayList<>();
		//		try {
		//			visites = port.trouverVisite(visite);
		//		} catch (SQLException_Exception e) {
		//			// TODO G�rer l'exception pour la transmettre � l'IHM
		//			e.printStackTrace();
		//		}
		//		int nbr = visites.size();
		//
		//		/**
		//		 * creation de la session
		//		 */
		//		HttpSession session = request.getSession();
		//		session.setAttribute("visites", visites);
		//		session.setAttribute("taille", nbr);
		//

		ReservationVisiteService service = new ReservationVisiteService();
		ReservationVisiteSEI port = service.getReservationVisitePort();

		String prenom = request.getParameter(ATT_PRENOM);
		String nom = request.getParameter(ATT_NOM);

		Client client = port.trouverClient(nom, prenom);
		System.out.println(client);
		int idClient = 0;
		if(client != null) {
			idClient = client.getIdClient();
			System.out.println(idClient);
		}

		HttpSession session = request.getSession();
		if(idClient == -1) {
			session.setAttribute(ATT_ERREUR, "La base de données côté serveur n'est pas disponible");
			RequestDispatcher dispatcher = request.getRequestDispatcher(VUE_CONNEXION);
			dispatcher.forward(request, response);
		} else if(idClient == 0) {
			session.setAttribute(ATT_ERREUR, "Vous n'êtes pas enregistré, vous n'avez pas accès à l'application");
			RequestDispatcher dispatcher = request.getRequestDispatcher(VUE_CONNEXION);
			dispatcher.forward(request, response);
		} else {
			session.removeAttribute(ATT_ERREUR);
			session.setAttribute(ATT_PRENOM, prenom);
			session.setAttribute(ATT_NOM, nom);
			session.setAttribute(ATT_ID_CLIENT, idClient);
			RequestDispatcher dispatcher = request.getRequestDispatcher(VUE_RECHCERCHE);
			dispatcher.forward(request, response);
		}
	}
}
