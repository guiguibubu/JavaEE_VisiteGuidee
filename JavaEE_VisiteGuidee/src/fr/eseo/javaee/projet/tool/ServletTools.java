package fr.eseo.javaee.projet.tool;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fr.eseo.javaee.projet.servlet.ChampSession;

public class ServletTools {

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
}
