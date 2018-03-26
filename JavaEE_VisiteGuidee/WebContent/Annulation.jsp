<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Gestion Visites - Annulation</title>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/styles/main.css" />	
	</head>
	<body>
		<br>
		<% if(request.getParameter("resultat") == null) { %>	
			Annulation confirmée.<br>
			Votre annulation a été prise en compte.<br>
		<% } else { %>
			Erreur lors de la réservation.<br>
		<% } %>
		<br>
	</body>
</html>