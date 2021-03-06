<%@page import="fr.eseo.javaee.projet.visiteguidee.Visite"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="fr.eseo.javaee.projet.servlet.ChampSession"%>
<%@ page import="fr.eseo.javaee.projet.tool.Convertisseur"%>
<%@ page import="fr.eseo.javaee.projet.visiteguidee.Reservation"%>
<%@ page import="fr.eseo.javaee.projet.visiteguidee.Visite"%>
<%@ page import="java.util.List"%>
<%@ page import="java.util.Date"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Visualisation de mes Reservations</title>
<jsp:include page="importStyle.jsp" />
</head>
<body>
	<jsp:include page="utilisateur.jsp" />
	<div class="form">
		<div class="container">
			<h2>Mes réservations</h2>
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
				Votre code de réservation : ${idReservationParking}
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
			<br> <input type="hidden"
				name=<%=ChampSession.ATT_ID_RESERVATION%>
				id=<%=ChampSession.ATT_ID_RESERVATION%> value="0">
			<%
				List<Reservation> listReservation = (List<Reservation>) session
						.getAttribute(ChampSession.ATT_LISTE_RESERVATIONS);
				int nbReservation = listReservation.size();
			%>
			<%
				for (int i = 0; i < nbReservation; i++) {
			%>
			<div class="row">
				<%
					Reservation reservation = listReservation.get(i);
						Visite visite = reservation.getVisite();
						String affichage = visite.getTypeDeVisite() + " - " + visite.getVille() + " - "
								+ Convertisseur.asStringForView(visite.getDateVisite()) + " - " + visite.getPrix() + "€";
				%>
				<div class="col-lg-6">
					<%=visite.getTypeDeVisite()%>
					-
					<%=visite.getVille()%>
					<br>
					<%=Convertisseur.asStringForView(visite.getDateVisite())%>
					<br>
					<%=visite.getPrix()%>
					€
				</div>
				<div class="col-lg-2">
					<%
						if (Convertisseur.asUtilDate(visite.getDateVisite()).after(new Date())) {
					%>
					<form method="post" id="choixReservationAnnulation" action="">
						<button type="submit"
							onclick="changeIdReservation(<%=reservation.getCodeReservation()%>)">
							Annuler</button>
					</form>
					<%
						} else {
					%>
					VISITE PASSEE
					<%
						}
					%>
				</div>
				<div class="col-lg-2">
					<%
						if (!reservation.isPaiementEffectue()) {
					%>
					<form method="post" id="choixReservationPaiement" action="">
						<button type="submit"
							onclick="payerReservation(<%=reservation.getCodeReservation()%>)">
							Payer</button>
					</form>
					<%
						} else {
					%>
					VISITE PAYEE
					<%
						}
					%>
				</div>
				<div class="col-lg-2">
					<form method="post" action="ServletRechercheParking">
						<input type="hidden" name=<%=ChampSession.ATT_VILLE%>
							value="<%=visite.getVille()%>"> <input type="hidden"
							name=<%=ChampSession.ATT_ID_VISITE%>
							value="<%=visite.getCodeVisite()%>">
						<button type="submit">Parking</button>
					</form>
				</div>
			</div>
			<br>
			<%
				}
			%>
			<form method="post" id="formulaireNouvelleRecherche"
				action="ServletReservation">
				<input type="hidden" id="<%=ChampSession.ATT_NOUVELLE_RECHERCHE%>"
					name="<%=ChampSession.ATT_NOUVELLE_RECHERCHE%>"
					value="<%=ChampSession.ATT_NOUVELLE_RECHERCHE%>" />
				<button type="submit" class="btn btn-primary">
					<span class="glyphicon glyphicon-search" aria-hidden="true"></span>
					Faire une autre recherche
				</button>
				<br>
			</form>
		</div>
	</div>
</body>
<script charset="UTF-8">
		function changeIdReservation(idReservation) {
			document.getElementById("<%=ChampSession.ATT_ID_RESERVATION%>").value = idReservation;
			document.getElementById('choixReservationAnnulation').action = "ServletAnnulation";
		}
		function payerReservation(idReservation) {
			document.getElementById("<%=ChampSession.ATT_ID_RESERVATION%>").value = idReservation;
			document.getElementById('choixReservationPaiement').action = "ServletPaiement";
		}
	</script>
</html>