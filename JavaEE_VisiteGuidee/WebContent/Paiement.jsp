<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<<<<<<< HEAD
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Confirmation paiement</title>
</head>
<body>
	<% if(request.getParameter("resultat") == null) { %>	
		Paiement confirmé.<br>
		Votre réservation a été pris en compte.<br>
		Récapitulatif<br>
		voyage <%= request.getParameter("voyage") %><br>
		<a href="Recherche.jsp"><input type="submit" value="Faire une autre reservation."/></a>
	<% } else { %>
		Erreur lors de la réservation.<br>
		<a href="Recherche.jsp"><input type="submit" value="Retour"/></a>
	<% } %>
=======
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Confirmation paiement</title>
	</head>
	<body>
		voyage <%= request.getParameter("voyage") %>
		resultat <%= session.getAttribute("resultat") %>

		<% if(request.getParameter("resultat").equals("")) { %>	
			Paiement confirmé.
			Votre réservation a été pris en compte.
			Récapitulatif
		<% } else { %>
			Erreur lors de la réservation.
			<a href=Recherche.jsp"><button type="button">Faire une autre réservation.</button></a>
		<% } %>
>>>>>>> branch 'dev' of https://github.com/guiguibubu/JavaEE_VisiteGuidee

<<<<<<< HEAD
<a href="index.jsp"><input type="submit" value="Quitter"/></a>
</body>
=======
		<a href=index.jsp"><button type="button">Quitter</button></a>
	</body>
>>>>>>> branch 'dev' of https://github.com/guiguibubu/JavaEE_VisiteGuidee
</html>