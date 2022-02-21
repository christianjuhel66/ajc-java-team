<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<body>
	<h3>Article</h3>
	<br><br>
    titre : ${livre.titre}
    
    <br><br>
    auteur : ${livre.auteur}
    
    <br><br>
    prix : ${livre.prix}
    
    <br><br>
    editeur : ${livre.editeur}
    
    <br><br>
    type d'edition : ${livre.typeEdition}
    
    <p>genres : </p>
        <ul>
            <c:forEach var="genre" items="${livre.genres}">
                <li>${genre}</li>
            </c:forEach>
        </ul>
    

</body>
</html>