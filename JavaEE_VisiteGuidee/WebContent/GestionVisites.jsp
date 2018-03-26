<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="fr.eseo.javaee.projet.visiteguidee.Visite" %>
<!-- Création d'un menu déroulant pour des filtres de sélection -->
<html>
	<head>
		<meta charset="UTF-8">
		<title>Reservation Visites</title>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/styles/main.css" />	
	</head>
	<body>
		<form method="post" action="Servlet">
			Reservation
			<!--  faire une boucle qui va générer les balises "option"  -->
			<%for(int i = 1; i<=(int)session.getAttribute("taille")
								/*((List<Visite>)session.getAttribute("visites")).size()*/
								; i++) { %>
			<%String affichage = new String(); %>
			<%affichage = 	((List<Visite>)session.getAttribute("visites")).get(i-1).getTypeDeVisite() + ((List<Visite>)session.getAttribute("visites")).get(i-1).getVille() + ((List<Visite>)session.getAttribute("visites")).get(i-1).getDateVisite() + ((List<Visite>)session.getAttribute("visites")).get(i-1).getPrix();%>
			<option value="num">voyage <%=i%> - <%=affichage%></option>
			<%}%>
			
		</form>
		<%= session.getAttribute("type") %>
		<a href="Paiement.jsp"><input type="submit" value="envoyer"/></a>
	</body>
</html>