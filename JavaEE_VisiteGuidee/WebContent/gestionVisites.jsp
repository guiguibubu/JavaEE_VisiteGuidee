<%@page import="fr.eseo.gestionparking.Parking"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.List"%>
<%@ page import="java.util.Date"%>
<%@ page import="fr.eseo.javaee.projet.visiteguidee.Visite"%>
<%@ page import="fr.eseo.javaee.projet.visiteguidee.Reservation"%>
<%@ page import="fr.eseo.javaee.projet.tool.Convertisseur"%>
<%@ page import="fr.eseo.javaee.projet.servlet.ChampSession"%>
<%@ page import="fr.eseo.javaee.projet.tool.ServletTools"%>
<html>
<head>
<meta charset="UTF-8">
<title>Reservation Visites</title>
<jsp:include page="importStyle.jsp" />
</head>
<body>
	<jsp:include page="utilisateur.jsp" />
	<div class="form">
		<div class="container">
			<form method="post" id="choixVisite" action="">
				<h2>Visites</h2>
				<!-- Message -->
				<%
					String messageSucces = (String) session.getAttribute(ChampSession.ATT_SUCCES);
					String messageEchec = (String) session.getAttribute(ChampSession.ATT_ERREUR);
				%>
				<%
					if (null != messageSucces) {
				%>
				<%
					session.removeAttribute(ChampSession.ATT_SUCCES);
				%>
				<div
					style="background-color: green; padding-top: 5px; padding-bottom: 5px;">
					<%=messageSucces%>
					Votre code de réservation : ${idReservation}
				</div>
				<%
					} else if (null != messageEchec) {
				%>
				<%
					session.removeAttribute(ChampSession.ATT_ERREUR);
				%>
				<div
					style="background-color: red; padding-top: 5px; padding-bottom: 5px;">
					<%=messageEchec%>
				</div>
				<%
					}
				%>
			
		</div>
		<br> <input type="hidden" name=<%=ChampSession.ATT_ID_VISITE%>
			id=<%=ChampSession.ATT_ID_VISITE%> value="0">
		<%
			List<Reservation> listeReservation = (List<Reservation>) session
					.getAttribute(ChampSession.ATT_LISTE_RESERVATIONS);
			List<Visite> listVisite = (List<Visite>) session.getAttribute(ChampSession.ATT_LISTE_VISITES);
			int nbVisite = listVisite.size();
		%>
		<%
			List<Parking> listeParking = (List<Parking>) session.getAttribute(ChampSession.ATT_LISTE_PARKING);
		%>
		<%
			for (int i = 0; i < nbVisite; i++) {
				Visite visite = listVisite.get(i);
				if (!ServletTools.estDejaReserve(listeReservation, visite)) {
		%>
		<%
			List<Parking> listeParkingVille = ServletTools.trouverParkingDeLaVille(listeParking,
							visite.getVille());
		%>
		<div class="row">
			<div class="col-7">
				<%=visite.getTypeDeVisite()%>
				-
				<%=visite.getVille()%>
				<br>
				<%=Convertisseur.asStringForView(visite.getDateVisite())%>
				<br>
				<%=visite.getPrix()%>
				€
				<%
					for (int j = 0; j < listeParkingVille.size(); j++) {
				%>
				<%
				if(j == 0) {
				%>
				<br> Parking
				<%
				}
				%>
				<br>
				<%=listeParkingVille.get(j).getNom()%>
				-
				<%=listeParkingVille.get(j).getType()%>
				<br>
				<%=listeParkingVille.get(j).getPrixBase()%>
				€
				<%
					}
				%>
			</div>
			<div class="col-5">
				<%
					if (Convertisseur.asUtilDate(visite.getDateVisite()).after(new Date())) {
				%>
				<button type="submit"
					onclick="changeIdVisite(<%=visite.getCodeVisite()%>)">
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
		<%
			}
		%>
		</form>
		<form method="post" id="formulaireNouvelleRecherche"
			action="ServletReservation">
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
			document.getElementById("<%=ChampSession.ATT_ID_VISITE%>").value = idVisite;
			document.getElementById('choixVisite').action = "ServletReservation";
			document.getElementById('choixVisite').submit();
		}
	</script>
</body>
</html>