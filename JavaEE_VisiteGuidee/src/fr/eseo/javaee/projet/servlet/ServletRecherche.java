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

	//	private static final String DATE_FORMATTER_STRING = "yyyy-MM-dd";
	//	private static final String DATE_TIME_FORMATTER_STRING = "yyyy-MM-dd HH:mm:ss";
	//	private static final DateFormat dateFormatter = new SimpleDateFormat(DATE_FORMATTER_STRING);
	//	private static final DateFormat dateTimeFormatter = new SimpleDateFormat(DATE_TIME_FORMATTER_STRING);

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
		String typeVisite = request.getParameter("typeDeVisite");
		String ville = request.getParameter("ville");
		String dateTime = request.getParameter("dateVisite");
		String prix = request.getParameter("prix");
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
		 * creation de la session
		 */
		HttpSession session = request.getSession();
		session.setAttribute("visites", visites);
		session.setAttribute("taille", nbr);

		RequestDispatcher dispatcher = request.getRequestDispatcher("GestionVisites.jsp");
		dispatcher.forward(request, response);
	}
}