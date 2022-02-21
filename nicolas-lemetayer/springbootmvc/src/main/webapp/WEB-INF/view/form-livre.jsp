<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
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
    <form action="traitementForm" modelAttribute="livre">
        <h1>Formulaire: Livre</h1>
        <placeholder="Formulaire" />
        Titre du livre: <input type="text" path="titre"/></br>
        Auteur du livre: <input type="text" path="auteur"/></br>
        Prix du livre: <input type="text" path="prix"/></br>
        <input type="submit"/>
    </form>
</div>
</body>
</html>