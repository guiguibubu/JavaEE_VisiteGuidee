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
import fr.eseo.javaee.projet.visiteguidee.Reservation;
import fr.eseo.javaee.projet.visiteguidee.ReservationVisiteSEI;
import fr.eseo.javaee.projet.visiteguidee.ReservationVisiteService;
import fr.eseo.javaee.projet.visiteguidee.Visite;

/**
 * Servlet implementation class Servlet
 */
@WebServlet(description = "Servlet principale", urlPatterns = { "/Servlet" })
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Servlet() {
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
		Reservation reservation = new Reservation();
		Visite visite = new Visite();
		Client client = new Client();
		visite.setCodeVisite(Integer.parseInt(request.getParameter("voyage")));

		/**
		 * maj de la reservation
		 */
		reservation.setCodeVisite(visite);
		reservation.setCodeClient(client);

		/**
		 * initialisation des services
		 */
//		ReservationVisiteService service = new ReservationVisiteService();
//		ReservationVisiteSEI port = service.getReservationVisitePort();
//
//		int code = port.reserverVisite(reservation);
//
		/**
		 * creation de la session
		 */
//		HttpSession session = request.getSession();
//		session.setAttribute("resultat", code);

		RequestDispatcher dispatcher = request.getRequestDispatcher("GestionVisites.jsp");
		dispatcher.forward(request, response);
	}
}
