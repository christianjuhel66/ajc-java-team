<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix ="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL</title>
</head>
<body>

<h1>JSTL</h1>

<h2> Etape 1</h2>

<p> Prénom : <c:out value ="${abonne.prenom}" /> </p> 
<p> Nom : <c:out value ="${abonne.nom}" /> </p>
<p> Type Abonnment : <c:out value ="${abonne.typeAbonnement}" /> </p>
<p> Adresse : <c:out value ="${abonne.adresse}" /> </p>

<h2> Etape 2</h2>

<p> Prénom : <c:out value ="${abonne.prenom}" /> </p> 
<p> Nom : <c:out value ="${abonne.nom}" /> </p>
<p> 
	<c:choose>
		<c:when test="${abonne.typeAbonnement == 1}">Abonnement Classique</c:when>
		<c:when test="${abonne.typeAbonnement == 2}">Abonnement Duo</c:when>
		<c:when test="${abonne.typeAbonnement == 3}">Abonnement Premium</c:when>
		<c:otherwise>Aucun Abonnement</c:otherwise>
	</c:choose>
</p>
<p> Adresse : <c:out value ="${abonne.adresse}" /> </p>

<h2> Etape 3</h2>

<p> Film : <c:out value ="${film.titre}" /> </p> 
<p> Réalisateur : <c:out value ="${film.realisateur}" /> </p>
<p> Duree : <c:out value ="${film.duree}" /> </p>
<p> Est vu: <c:out value ="${film.estVu}" /> </p>

<h2> Etape 4</h2>

<table>
	<c:forEach var="film" items="${abonne.films}">
		<tr> 
			<td><c:out value="${film.titre}"/> </td>
		</tr>
	</c:forEach>
</table>

<h2> Etape 5</h2>

<table>
	<c:forEach var="film" items="${abonne.films}">
		<tr> 
			<c:if test="${not film.estVu }">
				<td><c:out value="${film.titre}"/> </td>
			</c:if>
		</tr>
	</c:forEach>
</table>

<h2> Etape 6</h2>

<table>
	<c:forEach var="film" items="${abonne.films}">
		<tr> 
			<c:if test="${film.duree > 120 }">
				<td><c:out value="${film.titre}"/> </td>
			</c:if>
		</tr>
	</c:forEach>
</table>

<h2> Etape 7</h2>

<c:if test="${abonne.typeAbonnement == 2}"> 
	<c:out value="${abonne.abonneDuo.nom}"/>
	<c:out value="${abonne.abonneDuo.prenom}"/>
	<c:out value="${abonne.abonneDuo.adresse}"/>
</c:if>

</body>
</html>