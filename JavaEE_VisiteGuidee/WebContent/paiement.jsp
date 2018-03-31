<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="fr.eseo.javaee.projet.servlet.ChampSession" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Confirmation paiement</title>
<jsp:include page="importStyle.jsp"/>
</head>
<body>
	<div style="position: absolute; right: 5%; top: 0px; color: white; font-size: 20px;">
		Utilisateur : <%= session.getAttribute(ChampSession.ATT_NOM) %> <%= session.getAttribute(ChampSession.ATT_PRENOM) %>
	</div>
	Paiement
	<fieldset>
		<% if(session.getAttribute("resultat") == "0") { %>	
			Erreur lors de la r�servation.<br>
		<% } else { %>
			Paiement confirm�.<br>
			Votre r�servation a �t� pris en compte.<br>
			R�capitulatif<br>
			Reservation num�ro <%= session.getAttribute("resultat") %><br>
		<% } %>
	</fieldset><br>
	<% if(session.getAttribute("resultat") == "0") { %>
			<a href="Recherche.jsp"><input type="submit" value="Retour"/></a>
		<% } else { %>
			<a href="Recherche.jsp"><input type="submit" value="Faire une autre reservation."/></a>
		<% } %>
	<a href="index.jsp"><input type="submit" value="Quitter"/></a>
</body>
</html>