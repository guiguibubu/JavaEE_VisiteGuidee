<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Confirmation paiement</title>
</head>
<body>
	<% if(request.getParameter("resultat") == "") { %>	
		Paiement confirmé.<br>
		Votre réservation a été pris en compte.<br>
		Récapitulatif<br>
		voyage <%= request.getParameter("voyage") %><br>
	<% } else { %>
		Erreur lors de la réservation.<br>
		<a href=Recherche.jsp"><button type="button">Faire une autre réservation.</button></a><br>
	<% } %>

<a href=index.jsp"><button type="button">Quitter</button></a>
</body>
</html>