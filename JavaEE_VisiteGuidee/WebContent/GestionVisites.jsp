<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!-- Création d'un menu déroulant pour des filtres de sélection -->
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<form method="get" action="Servlet">
			Reservation
			<fieldset>
			
				<select name="voyage" size="4">
				<!--  faire une boucle qui va générer les balises "option"  -->
					<%int size = 5;%>
					<%for(int i = 1; i<=size; i++) { %>
						<option value="num">voyage <%=i%></option>
					<%}%>
				
				<br><br>
		    	<input type="submit" value="reserver">
	
			</fieldset>
		</form>
	</body>
</html>