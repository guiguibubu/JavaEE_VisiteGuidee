<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="fr.eseo.javaee.projet.servlet.ServletAuthentification" %>
<%@ page import="fr.eseo.javaee.projet.servlet.ServletRecherche" %>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Gestion Visites - Recherche</title>
		<jsp:include page="importStyle.jsp"/>
	</head>
	<body>
		<div style="position: absolute; right: 5%; top: 0px; color: white; font-size: 20px;">
			Utilisateur : <%= session.getAttribute(ServletAuthentification.ATT_NOM) %> <%= session.getAttribute(ServletAuthentification.ATT_PRENOM) %>
		</div>
		<div class="recherche">
				<div class="form">
							<form method="post" action="ServletRecherche">
								<input type="text" name=<%=ServletRecherche.ATT_TYPE %> placeholder="Type de visite"> <br>
								<input type="text" name=<%=ServletRecherche.ATT_VILLE %> placeholder="Ville"> <br>
								<input type="date" name=<%=ServletRecherche.ATT_DATE_VISITE %> placeholder="Jour dela visite"><br>
								<input type="number" name=<%=ServletRecherche.ATT_PRIX %> min="0" pattern="[0-9]*[.]?[0-9]{1,2}" placeholder="Prix"> <br><br>
								
<!-- 								<form action="Recherche.jsp"> -->
									<button type="submit" value="Envoyer">Recherche</button>
<!-- 								</form> -->
								<br>	
								<form action="MesReservations.jsp">
									<button type="submit" value="Reservations">Mes réservations</button>
								</form>
						</form>
					</div>
				</div>
			</div>
		</div>
	</body>
</html>