<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="fr.eseo.javaee.projet.servlet.ChampSession" %>

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
							<form action="ServletAuthentification">
								<input type="text" name=<%=ChampSession.ATT_PRENOM%> placeholder="Prénom" pattern="[a-zA-Z]+" title="Que des lettres minuscules/majuscules" required="true" autocomplete="off"/> <br>
								<input type="text" name=<%=ChampSession.ATT_NOM%> placeholder="Nom" pattern="[a-zA-Z]+" title="Que des lettres minuscules/majuscules" required="true" autocomplete="off"/> <br>
								<button type="submit" value="Connexion">connexion</button>
							</form>
							<%if (session.getAttribute(ChampSession.ATT_ERREUR) != null) { %>
							<br>
							<div class=<%=ChampSession.ATT_ERREUR%>>
								<%=session.getAttribute(ChampSession.ATT_ERREUR)%>
								<%session.removeAttribute(ChampSession.ATT_ERREUR);%>
							</div>
							<%} %>
						</div>
					</div>
				</div>
			</div>
		</div>
	</body>
</html>