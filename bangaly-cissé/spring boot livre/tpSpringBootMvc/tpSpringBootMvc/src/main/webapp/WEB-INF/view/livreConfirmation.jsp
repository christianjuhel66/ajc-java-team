<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Confirmation</title>
</head>
<body>

<p> Rappel de la commande : </p>
<p>Livre : ${livre.titre}</p>

<p>Auteur : ${livre.auteur}</p>

<p>Prix : ${livre.prix}</p>

<p>Editeur : ${livre.editeur}</p>

<p>Edition: ${livre.edition}</p>

<p>Genre: </p> 
<c:forEach var="g" items="${livre.genre}">
	<c:out value="${g}"/>|
</c:forEach>

</body>
</html>