<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="fr.eseo.javaee.projet.servlet.ServletAuthentification" %>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Gestion Visites - Annulation</title>
		<jsp:include page="importStyle.jsp"/>
	</head>
	<body>
		Annulation
		<fieldset>
			<% if(request.getParameter("resultat") == null) { %>	
				Paiement confirmé.<br>
				Votre réservation a été pris en compte.<br>
				Récapitulatif<br>
				voyage <%= request.getParameter("voyage") %><br>
			<% } else { %>
				Erreur lors de la réservation.<br>
			<% } %>
		</fieldset><br>
		
	
	</body>
</html>