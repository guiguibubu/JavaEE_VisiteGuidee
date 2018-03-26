<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="fr.eseo.javaee.projet.visiteguidee.Visite" %>
<!-- Création d'un menu déroulant pour des filtres de sélection -->
<html>
	<head>
		<meta charset="UTF-8">
		<title>Reservation Visites</title>
	</head>
	<body>
		<form method="post" action="Servlet">
			Reservation
			<fieldset>
				<select name="voyage" size=8>
				<!--  faire une boucle qui va générer les balises "option"  -->
					<%for(int i = 1; i<=(int)session.getAttribute("taille")
										/*((List<Visite>)session.getAttribute("visites")).size()*/
										; i++) { %>
						<option value="num">voyage <%=i%> - <%=((List<Visite>)session.getAttribute("visites")).get(i-1).getTypeDeVisite()%></option>
					<%}%>
					
					
					
					
<%-- 					<%int nbVisite =  (int)session.getAttribute("taille");%> --%>
<%-- 					<%for(int i = 0; i<nbVisite; i++) { %> --%>
<%-- 						<option value="num"><%=((List<Visite>)session.getAttribute("visites")).get(i).getTypeDeVisite()%></option> --%>
<%-- 					<%}%> --%>
				
				
				
				</select>
				<br><br>
			</fieldset>
		</form>
		<a href="Paiement.jsp"><input type="submit" value="envoyer"/></a>
	</body>
</html>