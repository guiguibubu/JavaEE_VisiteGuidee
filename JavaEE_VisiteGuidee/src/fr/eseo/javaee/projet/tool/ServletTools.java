package fr.eseo.javaee.projet.tool;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fr.eseo.javaee.projet.servlet.ChampSession;
import fr.eseo.javaee.projet.visiteguidee.Reservation;
import fr.eseo.javaee.projet.visiteguidee.ReservationVisiteSEI;
import fr.eseo.javaee.projet.visiteguidee.ReservationVisiteService;
import fr.eseo.javaee.projet.visiteguidee.Visite;

public class ServletTools {

	private ServletTools() {};

	public static void verifConnexionClient(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		boolean idClientLogged = false;
		int idClient = 0;
		try {
			idClient = (int) session.getAttribute(ChampSession.ATT_ID_CLIENT);
			idClientLogged = idClient > 0;
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(!idClientLogged) {
			RequestDispatcher dispatcher = request.getRequestDispatcher(ChampSession.VUE_CONNEXION);
			dispatcher.forward(request, response);
		}
	}

	public static boolean estDejaReserve(List<Reservation> listeReservation, Visite visite) {
		boolean estDejaReserve = false;
		if(visite != null && listeReservation != null) {
			int i = 0;
			while(!estDejaReserve && i<listeReservation.size()) {
				estDejaReserve = listeReservation.get(i).getVisite().getCodeVisite() == visite.getCodeVisite();
				i++;
			}
		}
		return estDejaReserve;
	}

	public static void chargementReservation(HttpServletRequest request) {
		ReservationVisiteService service = new ReservationVisiteService();
		ReservationVisiteSEI port = service.getReservationVisitePort();

		/*
		 * Récupération de la session
		 */
		HttpSession session = request.getSession();

		int idClient = (int)session.getAttribute(ChampSession.ATT_ID_CLIENT);

		List<Reservation> listeReservation = port.trouverReservationByIdClient(idClient);
		for (Reservation reservation : listeReservation) {
			Visite visite = port.trouverVisite(reservation.getVisite()).get(0);
			reservation.setVisite(visite);
		}

		session.setAttribute(ChampSession.ATT_LISTE_RESERVATIONS, listeReservation);
	}
}