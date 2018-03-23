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
			<c:import url="/inc/header.jsp" />
			<c:import url="/inc/navbar.jsp" />
				<div class="row">
					<div class="col-lg-12">
						<div class="panel panel-primary ">
							<div class="panel-body">
								
								<form method="post" action="ServletRecherche">
									typeDeVisite : <input type="texte" name="typeDeVisite"/> <br>
									ville : <input type="texte" name="ville"/> <br>
									dateVisite : <input type="date" name="dateVisite"/> <br>
									prix : <input type="texte" name="prix"/> <br>
									<input type="submit" value="envoyer"/>	
								</form>

							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</body>
</html>