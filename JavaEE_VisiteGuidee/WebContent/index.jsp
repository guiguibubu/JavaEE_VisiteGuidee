<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Gestion Visites - Accueil</title>
		<link rel="icon" href="/images/favicon.ico"/>
	</head>
	<body>
		<div class="container">
			<div class="row">
				<div class="col-lg-12">
					<div class="panel panel-primary ">
						<div class="panel-body">
							<form method="post" action="ServletIndex">
							login : <input type="texte" name="login" placeholder="Login"/> <br>
							password : <input type="password" name="password" placeholder="Password"/> <br>
							
							<input type="submit" value="Connexion"/>
							</form>
						</div>
					</div>
				</div>
			</div>
		</div>
	</body>
</html>