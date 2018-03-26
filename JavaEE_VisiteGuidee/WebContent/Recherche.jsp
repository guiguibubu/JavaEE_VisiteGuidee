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
<<<<<<< HEAD
		<form methode="post" action="">
			typeDeVisite : <input type="texte" name="typeDeVisite"/> <br>
			ville : <input type="texte" name="ville"/> <br>
			dateVisite : <input type="texte" name="dateVisite"/> <br>
			prix : <input type="texte" name="prix"/> <br>
		</form>
		<a href="GestionVisites.jsp"><input type="submit" value="envoyer"/></a>
=======
		<div class="container">
				<div class="row">
					<div class="col-lg-12">
						<div class="panel panel-primary ">
							<div class="panel-body">
								
								<form method="post" action="ServletRecherche">
									typeDeVisite : <input type="text" name="typeDeVisite" placeholder="Type de visite"/> <br>
									ville : <input type="text" name="ville" placeholder="Ville"/> <br>
									dateVisite : <input type="date" name="dateVisiteMin" placeholder="Date minimum"/> et <input type="date" name="dateVisiteMax" placeholder="Date maximum"/><br>
									prix : <input type="text" name="prix" placeholder="Prix"/> <br><br>
									<input type="submit" value="Envoyer"/>
								</form>
>>>>>>> branch 'dev' of https://github.com/guiguibubu/JavaEE_VisiteGuidee

	</body>
</html>