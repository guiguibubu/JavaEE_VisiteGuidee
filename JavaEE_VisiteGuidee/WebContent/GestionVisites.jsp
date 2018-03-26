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
			<fieldset>
				<select name="voyage" size="8">
				<!--  faire une boucle qui va générer les balises "option"  -->
					<%int nbVisite =  (int)session.getAttribute("taille");%>
					<%for(int i = 0; i<nbVisite; i++) { %>
					<option value=<%=((List<Visite>)session.getAttribute("visites")).get(i)%>><%=((List<Visite>)session.getAttribute("visites")).get(i).getCodeVisite()%></option>
					<%}%>
				</select>
			</fieldset>
			<a href="Paiement.jsp"><input type="submit" value="envoyer"/></a>
		</form>
	</body>
</html>