<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Confirmation paiement</title>
<jsp:include page="importStyle.jsp"/>
</head>
<body>
	Paiement
	<fieldset>
		<% if(session.getAttribute("resultat").equals(0)) { %>	
			Erreur lors de la réservation.<br>
		<% } else { %>
			Paiement confirmé.<br>
			Votre réservation a été pris en compte.<br>
			Récapitulatif<br>
			Reservation <%= session.getAttribute("resultat") %><br>
		<% } %>
	</fieldset><br>
	<% if(session.getAttribute("resultat").equals(0)) { %>
			<a href="Recherche.jsp"><input type="submit" value="Retour"/></a>
		<% } else { %>
			<a href="Recherche.jsp"><input type="submit" value="Faire une autre reservation."/></a>
		<% } %>
	<a href="index.jsp"><input type="submit" value="Quitter"/></a>
	<%= session.getAttribute("test") %>
</body>
</html>