<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Confirmation paiement</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/styles/main.css" />	
</head>
<body>
	Paiement
	<fieldset>
		<% if(request.getParameter("resultat") == null) { %>	
			Paiement confirmé.<br>
			Votre réservation a été prise en compte.<br>
			Récapitulatif<br>
			voyage <%= request.getParameter("voyage") %><br>
		<% } else { %>
			Erreur lors de la réservation.<br>
		<% } %>
	</fieldset><br>
	<% if(request.getParameter("resultat") == null) { %>
			<a href="Recherche.jsp"><input type="submit" value="Faire une autre reservation."/></a>
		<% } else { %>
			<a href="Recherche.jsp"><input type="submit" value="Retour"/></a>
		<% } %>
	<a href="index.jsp"><input type="submit" value="Quitter"/></a>
</body>
</html>