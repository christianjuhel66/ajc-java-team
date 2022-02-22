<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri ="http://java.sun.com/jsp/jstl/core" prefix ="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cursus</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>

<h1> Projet spring boot</h1>

<a href="/cursus/formulaireAjouter"> Ajouter </a>

<table class="table">
	<thead class="thead-dark"> <del></del>
		<tr>
			<th scope="col"> Cursus </th>
			<th> Action <th>
		</tr>
	</thead>
	
	<c:forEach var="c" items="${cursus}">
		<tr> 
			<td><c:out value="${c.nom}"/> </td>
			<td> 
				<a href="/cursus/supprimer/${c.id}">supprimer </a>
				| 
				<a href="/cursus/modifier/${c.id}">modifier </a>
			</td>		
		</tr>
	</c:forEach>
</table>
</body>
</html>