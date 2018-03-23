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

import fr.eseo.javaee.projet.visiteguidee.LocalDateTime;
import fr.eseo.javaee.projet.visiteguidee.ReservationVisiteSEI;
import fr.eseo.javaee.projet.visiteguidee.ReservationVisiteService;
import fr.eseo.javaee.projet.visiteguidee.SQLException_Exception;
import fr.eseo.javaee.projet.visiteguidee.Visite;

/**
 * Servlet implementation class ServletRecherche
 */
@WebServlet("/ServletRecherche")
public class ServletRecherche extends HttpServlet {
	private static final long serialVersionUID = 1L;

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
		// TODO Auto-generated method stub

		/**
		 * initialisation des objets
		 */
		Visite visite = new Visite();
		LocalDateTime dateTime = new LocalDateTime();
		
		visite.setTypeDeVisite(request.getParameter("typeDeVisite"));
		visite.setVille(request.getParameter("ville"));
		String date = request.getParameter("dateVisite");
		visite.setDateVisite(dateTime);
		
		try{
			visite.setPrix(Integer.parseInt(request.getParameter("prix")));
		} catch (Exception e) {
			System.out.println(e);
		}

//		/**
//		 * initialisation des services
//		 */
//		ReservationVisiteService service = new ReservationVisiteService();
//		ReservationVisiteSEI port = service.getReservationVisitePort();
//
//
//		List<Visite> visites = new ArrayList<Visite>();
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

		RequestDispatcher dispatcher = request.getRequestDispatcher("GestionVisites.jsp");
		dispatcher.forward(request, response);
	}
}
