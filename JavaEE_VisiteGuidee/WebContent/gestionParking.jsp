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
<title>Reservation Parking</title>
<jsp:include page="importStyle.jsp" />
</head>
<body>
	<jsp:include page="utilisateur.jsp" />
	<div class="form">
		<div class="container">
			<form method="post" id="choixParking" action="">
				<h2>Parking</h2>
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
			
		</div>
		<br> <input type="hidden" name=<%=ChampSession.ATT_ID_PARKING%>
			id=<%=ChampSession.ATT_ID_PARKING%> value="0">
		<%
			List<Parking> listeParking = (List<Parking>) session.getAttribute(ChampSession.ATT_LISTE_PARKING);
			int nbParking = listeParking.size();
		%>
		<%
			for (int i = 0; i < nbParking; i++) {
				Parking parking = listeParking.get(i);
		%>
		<div class="row">
			<div class="col-7">
				<%=parking.getNom()%>
				-
				<%=parking.getType()%>
				<br>
				<%=parking.getAdresse()%>
				<br>
				<%=parking.getPrixBase()%>
				€
			</div>
			<div class="col-5">
				<button type="submit"
					onclick="changeIdParking(<%=parking.getCode()%>)">
					Réserver</button>
			</div>
		</div>
		<br>
		<%
			}
		%>
		</form>
	</div>
	</div>
	<script charset="UTF-8">
		function changeIdParking(idParking) {
			document.getElementById("<%=ChampSession.ATT_ID_PARKING%>").value = idParking;
			document.getElementById('choixParking').action = "ServletReservationParking";
			document.getElementById('choixParking').submit();
		}
	</script>
</body>
</html>