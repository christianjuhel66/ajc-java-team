<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
<div class="container">
    <h1>Retour formulaire</h1>
    <table class="table">
        <tr>
            <td>Titre du livre</td><td>${livre.titre}</td>
        </tr>
        <tr>
           <td>Auteur du livre</td><td>${livre.auteur}</td>
        </tr>
        <tr>
           <td>Prix du livre</td><td>${livre.prix}</td>
        </tr>
        <tr>
           <td>Editeur du livre</td><td>${livre.editeur}</td>
        </tr>
        <tr>
             <td>Edition du livre</td><td>${livre.edition}</td>
        </tr>
        <tr>
              <td>Genres du livre</td>
              <td>
                 <c:forEach var="temp" items="${livre.genres}">
                     ${temp}</br>
                 </c:forEach>
              </td>
        </tr>
    </table>
</div>
</body>
</html>