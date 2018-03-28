<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="fr.eseo.javaee.projet.visiteguidee.Visite" %>
<!-- Création d'un menu déroulant pour des filtres de sélection -->
<html>
	<head>
		<meta charset="UTF-8">
		<title>Reservation Visites</title>
		<jsp:include page="importStyle.jsp"/>
	</head>
	<body>
		<form method="post" action="Servlet">
			Reservation
			<input type="hidden" name="idVisite" id="idVisite" value="" />
			<%List<Visite> listVisite = (List<Visite>)session.getAttribute("visites");
			int nbVisite = listVisite.size();%>
			<%for(int i = 0; i<nbVisite; i++) { %>
				<%
				Visite visite = listVisite.get(i);
				String affichage =	visite.getTypeDeVisite()+" "+visite.getVille()+" "+visite.getDateVisite()+" "+visite.getPrix();
				%>
				voyage <%=i%> - <%=affichage%>
				<button onclick="changeIdVisite(<%=visite.getCodeVisite()%>);">
				Réserver
				</button>
				<br> 
			<%}%>
		</form>
<%-- 		<%=session.getAttribute("type")%> --%>
		<a href="Paiement.jsp"><input type="submit" value="envoyer"/></a>
		<a href="Recherche.jsp"><input type="submit" value="Faire une autre recherche"/></a><br>
		
		
		<script charset="UTF-8">
		function changeIdVisite(idVisite) {
			document.getElementById('idVisite').value = idVisite;
		}
		</script>
	</body>
</html>