<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Livre : vue</title>
</head>
<body>
<p>Le livre ${livre.titre}, écrit par ${livre.auteur}, coute ${livre.prix} euros
aux éditions ${livre.editeur}, au format ${livre.format}. </p>

<p>Il figure aux genres :
<ul>
<c:forEach var="genres" items="${livre.genres }">
<li>${genres}</li>
</c:forEach>
</ul></p>
</body>
</html>