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
		<div style="position: absolute; right: 5%; top: 0px; color: white; font-size: 20px;">
			Utilisateur : <%= session.getAttribute("nom") %> <%= session.getAttribute("prenom") %>
		</div>
		<form method="post" action="Servlet">
			Reservation<br>
<!-- 			<input type="hidden" name="idVisite" id="idVisite" value="" /> -->
<%-- 			<%List<Visite> listVisite = (List<Visite>)session.getAttribute("visites"); --%>
<%-- 			int nbVisite = listVisite.size();%> --%>
<%-- 			<%for(int i = 0; i<nbVisite; i++) { %> --%>
<%-- 				<% --%>
// 				Visite visite = listVisite.get(i);
// 				String affichage =	visite.getTypeDeVisite()+" "+visite.getVille()+" "+visite.getDateVisite()+" "+visite.getPrix();
<%-- 				%> --%>
<%-- 				voyage <%=i%> - <%=affichage%> --%>
<%-- 				<button onclick="changeIdVisite(<%=visite.getCodeVisite()%>);"> --%>
<!-- 				Réserver -->
<!-- 				</button> -->
<!-- 				<br>  -->
<%-- 			<%}%> --%>
			<fieldset>
				<select name="voyage" size="8">
					<%for(int i = 1; i<=(int)session.getAttribute("taille")
										/*((List<Visite>)session.getAttribute("visites")).size()*/
										; i++) { %>
					<%String affichage = new String(); %>
					<%affichage = ((List<Visite>)session.getAttribute("visites")).get(i-1).getTypeDeVisite() +" - "+ ((List<Visite>)session.getAttribute("visites")).get(i-1).getVille() +" - "+ ((List<Visite>)session.getAttribute("visites")).get(i-1).getDateVisite() +" - "+ ((List<Visite>)session.getAttribute("visites")).get(i-1).getPrix();%>
					<option value=<%=((List<Visite>)session.getAttribute("visites")).get(i-1).getTypeDeVisite() +" - "+ ((List<Visite>)session.getAttribute("visites")).get(i-1).getVille() +" - "+ ((List<Visite>)session.getAttribute("visites")).get(i-1).getDateVisite() +" - "+ ((List<Visite>)session.getAttribute("visites")).get(i-1).getPrix()%>>voyage <%=i%> - <%=affichage%></option>
					<%}%>
				</select>
			</fieldset>
		</form>
		<a href="Paiement.jsp"><input type="submit" value="envoyer"/></a>
		<a href="Recherche.jsp"><input type="submit" value="Faire une autre recherche"/></a><br>
		
		
		<script charset="UTF-8">
		function changeIdVisite(idVisite) {
			document.getElementById('idVisite').value = idVisite;
		}
		</script>
	</body>
</html>