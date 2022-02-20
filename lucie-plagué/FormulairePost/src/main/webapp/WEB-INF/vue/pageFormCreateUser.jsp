<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Create User Form</title>
	</head>
	<body>
		<form method="post" action="recordUser" >
			<h1>Nouvel utilisateur</h1>
				<p>Vous pouvez vous inscrire via ce formulaire?</p>
	             
				Nom 
				<input type="text" id="nom" name="nom" />
				<br />
				
				Age
				<input type="text" id="age" name="age" />
				<br />
				
				<input type="submit" value="Valider" />
				<br />
		
		</form>
	
	</body>
</html>