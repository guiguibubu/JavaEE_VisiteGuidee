<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Gestion des reservations</title>
</head>
<body>
	typeDeVisite = <% session.getAttribute("typeDeVisite"); %>
	ville = <% session.getAttribute("ville"); %>
	dateVisite = <% session.getAttribute("dateVisite"); %>
	prix = <% session.getAttribute("prix"); %>
	<form method="get" action="Servlet">
	Reservation
		<fieldset>
			<select name="voyage" size="4">
				<option value="1">voyage 1</option>
				<option value="2">voyage 2</option>
				<option value="3">voyage 3</option>
				<option value="4">voyage 4</option>
			</select>
			<br><br>
	    	<input type="submit" value="Reserver">
		</fieldset>
	</form>
</html>