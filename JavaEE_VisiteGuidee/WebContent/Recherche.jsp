<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Gestion Visites - Recherche</title>
		<jsp:include page="importStyle.jsp"/>
	</head>
	<body>
		<div class="recherche">
				<div class="form">				
						<form method="post" action="ServletRecherche">
								<input type="text" name="typeDeVisite" placeholder="Type de visite"/> <br>
								<input type="text" name="ville" placeholder="Ville"/> <br>
								<input type="date" name="dateVisite" placeholder="Date minimum"/><br>
								<input type="number" name="prix" min="0" pattern="[0-9]*[.]?[0-9]{1,2}" placeholder="Prix"/> <br><br>
									
								<form action="Recherche.jsp">
									<button type="submit" value="Envoyer">Recherche</button>
								</form>
								<br>	
								<form action="MesReservations.jsp">
									<button type="submit" value="Reservations">Reservations</button>
								</form>
						</form>
					</div>
				</div>
			</div>
		</div>
	</body>
</html>