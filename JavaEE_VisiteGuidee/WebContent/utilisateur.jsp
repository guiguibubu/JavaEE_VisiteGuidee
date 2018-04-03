<%@ page import="fr.eseo.javaee.projet.servlet.ChampSession"%>
<div style="position: absolute; right: 5%; top: 0px; background-color: white; padding: 5px 5px 5px 5px;">
	<div style="color: black; font-size: 20px;">
		Utilisateur :
		<%=session.getAttribute(ChampSession.ATT_NOM)%>
		<%=session.getAttribute(ChampSession.ATT_PRENOM)%>
	</div>
	<br>
	<div class="row">
		<div class="col-5">
			<form method="post" action="ServletRetourAccueil">
				<button type="submit" class="btn btn-lg btn-block btn-primary">Retour</button>
			</form>
		</div>
		<div class="col-7">
			<form method="post" action="ServletDeconnexion">
				<button type="submit" class="btn btn-lg btn-block btn-primary">Déconnexion</button>
			</form>
		</div>
	</div>
</div>