package fr.eseo.javaee.projet.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ServletAnnulation
 */
@WebServlet("/ServletAnnulation")
public class ServletAnnulation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletAnnulation() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

//		/**
//		 * initialisation des services
//		 */
//		ReservationVisiteService service = new ReservationVisiteService();
//		ReservationVisiteSEI port = service.getReservationVisitePort();
//
		String annulation = "Succes";
		
//		try {
//			annulation = port.annulerVisite(request.getParameter("code"));
//		} catch (SQLException_Exception e) {
//			// TODO G�rer l'exception pour la transmettre � l'IHM
//			e.printStackTrace();
//		}
//
//		/**
//		 * creation de la session
//		 */
		HttpSession session = request.getSession();
		session.setAttribute("annulation", annulation);

		RequestDispatcher dispatcher = request.getRequestDispatcher("MesReservations.jsp");
		dispatcher.forward(request, response);	}

}
