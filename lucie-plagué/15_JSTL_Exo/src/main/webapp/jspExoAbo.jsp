<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Gestion des abonnés</title>
</head>
<body>
	<h1>Affichage des abonnés</h1>

	<p> 
	Prénom : <c:out value="${abo1.prenom}" /> <br />
	Nom : <c:out value="${abo1.nom}" /> <br />
	<c:choose>
		<c:when test="${abo1.typeAbonnement == 1}">
			Type abonnement : Abonnement classique <br />
		</c:when>
		<c:when test="${abo1.typeAbonnement == 2}">
			Type abonnement : Abonnement duo <br />
		</c:when>
		<c:when test="${abo1.typeAbonnement == 3}">
			Type abonnement : Abonnement premium <br />
		</c:when>
		<c:otherwise>
			Aucun abonnement <br />
		</c:otherwise>
	</c:choose>
	Adresse : <c:out value="${abo1.adresse}" /> <br />
	</p>
	
</body>
</html>