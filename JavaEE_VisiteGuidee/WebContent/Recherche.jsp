<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Gestion Visites - Recherche</title>
		<link rel="icon" href="/images/favicon.ico"/>
	</head>
	<body>
		<div class="container">
			<div>
				<form method="post" action="ServletRecherche">
					Recherche
					<fieldset>
						typeDeVisite : <input type="text" name="typeDeVisite"/> <br>
						ville : <input type="text" name="ville"/> <br>
						dateVisite : <input type="text" name="dateVisite"/> <br>
						prix : <input type="text" name="prix"/> <br>
					</fieldset>
					<br><a href="GestionVisites.jsp"><input type="submit" value="Envoyer"/></a>
				</form>
				<a href="MesReservations.jsp"><input type="submit" value="Reservations"/></a>			
			</div>
		</div>
	</body>
</html>