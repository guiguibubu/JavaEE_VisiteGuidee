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
import fr.eseo.javaee.projet.visiteguidee.ReservationVisiteSEI;
import fr.eseo.javaee.projet.visiteguidee.ReservationVisiteService;

/**
 * Servlet implementation class ServletAnnulation
 */
@WebServlet("/ServletAnnulation")
public class ServletAnnulation extends HttpServlet {
	private static final long serialVersionUID = 1L;

	//	public static final String VUE_MES_RESERVATION = "MesReservations.jsp";
	//
	//	public static final String ATT_CODE_RESERVATION = "codeReservation";
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
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		ServletTools.verifConnexionClient(request, response);
		/**
		 * initialisation des services
		 */
		ReservationVisiteService service = new ReservationVisiteService();
		ReservationVisiteSEI port = service.getReservationVisitePort();

		boolean annulation = false;

		annulation = port.annulerVisite(Convertisseur.asInt(request.getParameter(ChampSession.ATT_ID_RESERVATION)));

		/**
		 * récupération de la session
		 */
		HttpSession session = request.getSession();
		if(annulation) {
			session.setAttribute(ChampSession.ATT_SUCCES, "Annulation réussie");
		} else {
			session.setAttribute(ChampSession.ATT_ERREUR, "Annulation impossible");
		}

		RequestDispatcher dispatcher = request.getRequestDispatcher(ChampSession.VUE_MES_RESERVATION);
		dispatcher.forward(request, response);
	}

}
