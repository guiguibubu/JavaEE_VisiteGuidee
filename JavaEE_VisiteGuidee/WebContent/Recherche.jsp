<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Gestion Visites - Recherche</title>
		<link rel="icon" href="/images/favicon.ico"/>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/styles/main.css" />
	</head>
	<body>
		<div class="recherche">
				<div class="form	">
					<div class="col-lg-12">					
						<form method="post" action="ServletRecherche">
								<input type="text" name="typeDeVisite" placeholder="Type de visite"/> <br>
								<input type="text" name="ville" placeholder="Ville"/> <br>
								<input type="date" name="dateVisiteMin" placeholder="Date minimum"/><br>
								<input type="text" name="prix" placeholder="Prix"/> <br><br>
									
								<form action="Recherche.jsp">
									<button type="submit" value="Envoyer">Recherche</button>
								</form>
								<br>
						</form>

					</div>
					<div class="btn-reservation">
						<form action="MesReservations.jsp">
							<button type="submit" value="Reservations">Reservations</button>
						</form>
					</div>
				</div>
			</div>
		</div>
	</body>
</html>