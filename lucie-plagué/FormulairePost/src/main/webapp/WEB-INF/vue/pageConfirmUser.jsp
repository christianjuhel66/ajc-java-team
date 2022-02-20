<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Confirm creating User</title>
	</head>
	<body>
		<h1>Confirmation de la création du nouvel utilisateur</h1>
		<p>L'utilisateur <c:out value="${user.nom}"/> dont l'âge est <c:out value="${user.age}"/>
		a bien été récupéré.</p>
             
	</body>
</html>