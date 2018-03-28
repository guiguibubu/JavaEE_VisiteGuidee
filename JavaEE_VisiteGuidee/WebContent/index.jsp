<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Gestion Visites - Accueil</title>
		<jsp:include page="importStyle.jsp"/>
	</head>
	<body>
		<div class="login-page">
				<div class="form">
					<div class="form-login">
						<div class="panel panel-primary ">
							<div class="panel-body">
								
								<input type="text" name="login" placeholder="username"/> <br>
								<input type="password" name="password" placeholder="password"/> <br>
								<form action="Recherche.jsp">
									<button type="submit" value="Connexion">connexion</button>
								</form>
							</div>
						</div>
					</div>
				</div>
		</div>
	</body>
</html>