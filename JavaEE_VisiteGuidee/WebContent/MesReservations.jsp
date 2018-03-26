<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Visualisation de mes Reservations</title>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/styles/main.css" />	
	</head>
	<body>
		<form method="post" action="ServletAnnulation">
			Reservation
			<fieldset>
				<select name="code" size="4">
				<!--  faire une boucle qui va générer les balises "option"  -->
					<%int size = 5;%>
					<%for(int i = 1; i<=size; i++) { %>
						<option value="num">Ma reservation <%=i%></option>
					<%}%>
				</select>
				<br><br>
			</fieldset>
		</form>
		<form action="MesReservations.jsp">
			<button type="submit" value="Annuler">Annuler</button>
		</form>
		<form action="Recherche.jsp">
			<button type="submit" value="Retour">Retour</button>
		</form>
		
		<% if(request.getParameter("annulation") == "Succes") { %>	
			Annulation confirmée.<br>
			Récapitulatif<br>
			Annulation : voyage <%= request.getParameter("code") %><br>
		<% } %>
	</body>
</html>