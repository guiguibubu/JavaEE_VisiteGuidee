package fr.eseo.javaee.projet.servlet;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

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
@WebServlet(description = "Servlet principale", urlPatterns = { "/Servlet" })
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String DATE_FORMATTER_STRING = "yyyy-MM-dd";
	private static final DateFormat dateFormatter = new SimpleDateFormat(DATE_FORMATTER_STRING);

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

		String voyage = request.getParameter("voyage");
		String[] parts = voyage.split(" - ");
		visite.setTypeDeVisite(parts[0]);
		visite.setVille(parts[1]);
		visite.setDateVisite(Convertisseur.asXMLGregorianCalendar(parts[2]));
		visite.setPrix(Convertisseur.asInt(parts[3]));

		/**
		 * fonction utilisateur pas encore implantée
		 */
		client.setAdresse("");
		client.setCodePostal(0);
		client.setIdClient(0);
		client.setMail("");
		client.setNom("");
		client.setNumTelephone(0);
		client.setPays("");
		client.setPrenom("");

		/**
		 * fonction utilisateur pas encore implantée
		 */
		client.setAdresse("");
		client.setCodePostal(0);
		client.setIdClient(0);
		client.setMail("");
		client.setNom("");
		client.setNumTelephone(0);
		client.setPays("");
		client.setPrenom("");

		/**
		 * maj de la reservation
		 */
		reservation.setVisite(visite);
		reservation.setClient(client);

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
		/**
		 * creation de la session
		 */
		HttpSession session = request.getSession();
		session.setAttribute("resultat", code);

		RequestDispatcher dispatcher = request.getRequestDispatcher("Paiement.jsp");
		dispatcher.forward(request, response);
	}
}
