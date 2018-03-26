package fr.eseo.javaee.projet.servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

/**
 * Servlet implementation class ServletIndex
 */
@WebServlet("/ServletIndex")
public class ServletIndex extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletIndex() {
        super();
        // TODO Auto-generated constructor stub
    }

	
//	/**
//	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
//	 */
//	@Override
//	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//
//		/**
//		 * initialisation des objets
//		 */
//		Utilisateur utili = new Utilisateur();
//		String motDePasse = request.getParameter("password");
//		
//
//		try {
//			visite.setDateVisite(Convertisseur.asXMLGregorianCalendar(dateTimeFormatter.parse(dateTime)));
//			visite.setPrix(Integer.parseInt(prix));
//		} catch (ParseException e1) {
//			e1.printStackTrace();
//		}
//
//		/**
//		 * initialisation des services
//		 */
//		ReservationVisiteService service = new ReservationVisiteService();
//		ReservationVisiteSEI port = service.getReservationVisitePort();
//
//		List<Visite> visites = new ArrayList<>();
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
//
//		RequestDispatcher dispatcher = request.getRequestDispatcher("GestionVisites.jsp");
//		dispatcher.forward(request, response);
//	
//	
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
