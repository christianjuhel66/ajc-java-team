<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
<div class="container">
    <h1>Formulaire: Livre</h1>
    <form:form action="traitementForm" modelAttribute="livre">
    <table class="table">
    <tr>
    <td>Titre du livre:</td>
    <td><form:input path="titre"/></td>
    </tr>
    <tr>
        <td>Auteur du livre:</td>
        <td><form:input path="auteur"/></td>
    </tr>
    <tr>
         <td>Prix du livre:</td>
         <td><form:input path="prix"/></td>
    </tr>
     <tr>
        <td>Editeur du livre:</td>
        <td><form:select path="editeur">
              <form:options items="${livre.editeursListe}" />
           </form:select>
        </td>
     </tr>
    </table>
    <input type="submit" value="Envoyer">
    </form:form>
</div>
</body>
</html>