<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Confirmation paiement</title>
	</head>
	<body>
		voyage <%= request.getParameter("voyage") %>
		resultat <%= session.getAttribute("resultat") %>

		<% if(request.getParameter("resultat").equals("")) { %>	
			Paiement confirme.
			Votre réservation a été pris en compte.
			Récapitulatif
		<% } else { %>
			Erreur lors de la réservation.
			<a href=Recherche.jsp"><button type="button">Faire une autre réservation.</button></a>
		<% } %>

		<a href=index.jsp"><button type="button">Quitter</button></a>
	</body>
</html>