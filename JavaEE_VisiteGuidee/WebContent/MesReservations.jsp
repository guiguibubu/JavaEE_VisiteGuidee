<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Visualisation de mes Reservations</title>
	</head>
	<body>
		<form method="post" action="Servlet">
			Reservation
			<fieldset>
				<select name="voyage" size="4">
				<!--  faire une boucle qui va générer les balises "option"  -->
					<%int size = 5;%>
					<%for(int i = 1; i<=size; i++) { %>
						<option value="num">Ma reservation <%=i%></option>
					<%}%>
				</select>
				<br><br>
			</fieldset>
		</form>
		<br><a href="Recherche.jsp"><input type="submit" value="Retour"/></a>
	</body>
</html>