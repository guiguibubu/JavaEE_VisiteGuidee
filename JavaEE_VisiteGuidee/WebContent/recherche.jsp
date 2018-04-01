<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="fr.eseo.javaee.projet.servlet.ChampSession" %>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Gestion Visites - Recherche</title>
		<jsp:include page="importStyle.jsp"/>
	</head>
	<body>
		<jsp:include page="utilisateur.jsp" />
		<div class="recherche">
				<div class="form">
							<form method="post" action="ServletRecherche">
								<input type="text" name=<%=ChampSession.ATT_TYPE_VISITE %> placeholder="Type de visite"> <br>
								<input type="text" name=<%=ChampSession.ATT_VILLE %> placeholder="Ville"> <br>
								<input type="date" name=<%=ChampSession.ATT_DATE_VISITE %> placeholder="Jour dela visite"><br>
								<input type="number" name=<%=ChampSession.ATT_PRIX %> min="0" pattern="[0-9]*[.]?[0-9]{1,2}" placeholder="Prix"> <br><br>
									
								<button type="submit" value="Envoyer">Recherche</button>
						</form>
						<br>	
						<form method="post" action="ServletMesReservations">
							<button type="submit" value="Reservations">Mes réservations</button>
						</form>
					</div>
				</div>
			</div>
		</div>
	</body>
</html>