<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.List"%>
<%@ page import="java.util.Date"%>
<%@ page import="fr.eseo.javaee.projet.visiteguidee.Visite"%>
<%@ page import="fr.eseo.javaee.projet.tool.Convertisseur"%>
<%@ page import="fr.eseo.javaee.projet.servlet.ChampSession"%>

<html>
<head>
<meta charset="UTF-8">
<title>Reservation Visites</title>
<jsp:include page="importStyle.jsp" />
</head>
<body>
	<div class="form">
		<div class="container">
		<div style="position: absolute; right: 5%; top: 0px; color: white; font-size: 20px;">
			Utilisateur : <%= session.getAttribute(ChampSession.ATT_NOM) %> <%= session.getAttribute(ChampSession.ATT_PRENOM) %>
		</div>
			<form method="post" id="choixVisite" action="">
				<h2>Visites</h2>
				<br> 
				<input type="hidden" name=<%=ChampSession.ATT_ID_VISITE%> id=<%=ChampSession.ATT_ID_VISITE%> value="0">
				<%
					List<Visite> listVisite = (List<Visite>) session.getAttribute(ChampSession.ATT_LISTE_VISITES);
					int nbVisite = listVisite.size();
				%>
				<%
					for (int i = 0; i < nbVisite; i++) {
				%>
				<div class="row">
					<%
						Visite visite = listVisite.get(i);
							String affichage = visite.getTypeDeVisite() + " - " + visite.getVille() + " - "
									+ Convertisseur.asStringForView(visite.getDateVisite()) + " - " + visite.getPrix() + "€";
					%>
					<div class="col-7">
						<%=visite.getTypeDeVisite()%>
						-
						<%=visite.getVille()%>
						<br>
						<%=Convertisseur.asStringForView(visite.getDateVisite())%>
						<br>
						<%=visite.getPrix()%>
						€
					</div>
					<div class="col-5">
						<%
							if (Convertisseur.asUtilDate(visite.getDateVisite()).after(new Date())) {
						%>
						<button type="submit" onclick="changeIdVisite(<%=visite.getCodeVisite()%>)">
							Réserver</button>
						<%
							} else {
						%>
						VISITE PASSEE
						<%
							}
						%>
					</div>
				</div>
				<br>
				<%
					}
				%>
			</form>
			<!-- 						<a href="Paiement.jsp"><input type="submit" value="envoyer"/></a> -->
			<form method="post" id="formulaireNouvelleRecherche" action="Servlet">
				<input type="hidden" id=<%=ChampSession.ATT_NOUVELLE_RECHERCHE%>
					name=<%=ChampSession.ATT_NOUVELLE_RECHERCHE%>
					value=<%=ChampSession.ATT_NOUVELLE_RECHERCHE%> />
				<button type="submit" class="btn btn-primary">
					<span class="glyphicon glyphicon-search" aria-hidden="true"></span>
					Faire une autre recherche
				</button>
				<br>
			</form>
		</div>
	</div>
	<script charset="UTF-8">
		function changeIdVisite(idVisite) {
			document.getElementById('idVisite').value = idVisite;
			console.log(document.getElementById('idVisite'));
			document.getElementById('choixVisite').action = "ChampSession";
		}
	</script>
</body>
</html>