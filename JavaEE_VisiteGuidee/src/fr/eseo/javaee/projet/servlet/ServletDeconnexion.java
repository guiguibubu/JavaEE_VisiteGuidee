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
 * Servlet implementation class ServletAuthentification
 */
@WebServlet("/ServletDeconnexion")
public class ServletDeconnexion extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletDeconnexion() {
		super();
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		/*
		 * Récupération de la session
		 */
		HttpSession session = request.getSession();

		session.removeAttribute(ChampSession.ATT_ID_CLIENT);
		session.removeAttribute(ChampSession.ATT_NOM);
		session.removeAttribute(ChampSession.ATT_PRENOM);

		RequestDispatcher dispatcher = request.getRequestDispatcher(ChampSession.VUE_CONNEXION);
		dispatcher.forward(request, response);
	}
}

