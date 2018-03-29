package fr.eseo.javaee.projet.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fr.eseo.javaee.projet.tool.Convertisseur;
import fr.eseo.javaee.projet.visiteguidee.ReservationVisiteSEI;
import fr.eseo.javaee.projet.visiteguidee.ReservationVisiteService;
import fr.eseo.javaee.projet.visiteguidee.Visite;

/**
 * Servlet implementation class ServletRecherche
 */
@WebServlet("/ServletRecherche")
public class ServletRecherche extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private static final String VUE_RESULTAT_RECHERCHE = "GestionVisites.jsp";

	public static final String ATT_TYPE = "typeVisite";
	public static final String ATT_VILLE = "ville";
	public static final String ATT_DATE_VISITE = "dateVisite";
	public static final String ATT_PRIX = "prix";
	public static final String ATT_VISITES = "visites";

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletRecherche() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		/**
		 * initialisation des objets
		 */
		Visite visite = new Visite();
		String typeVisite = request.getParameter(ATT_TYPE);
		String ville = request.getParameter(ATT_VILLE);
		String dateTime = request.getParameter(ATT_DATE_VISITE);
		String prix = request.getParameter(ATT_PRIX);
		visite.setTypeDeVisite(typeVisite);
		visite.setVille(ville);
		visite.setDateVisite(Convertisseur.asXMLGregorianCalendar(dateTime));
		visite.setPrix(Convertisseur.asInt(prix));

		/**
		 * initialisation des services
		 */
		ReservationVisiteService service = new ReservationVisiteService();
		ReservationVisiteSEI port = service.getReservationVisitePort();

		List<Visite> visites = new ArrayList<>();
		visites = port.trouverVisite(visite);
		int nbr = visites.size();

		/**
		 * récupération de la session
		 */
		HttpSession session = request.getSession();
		session.setAttribute(ATT_VISITES, visites);

		RequestDispatcher dispatcher = request.getRequestDispatcher(VUE_RESULTAT_RECHERCHE);
		dispatcher.forward(request, response);
	}
}