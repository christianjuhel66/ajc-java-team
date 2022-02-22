<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!Doctype html>
<html>
<head>
<meta charset="UTF-8">
<title>livres form</title>
</head>

<body>
<form:form action="processForm">
Titre : <form:input type= "text" titre="titre" path="titre"/>
<br/>
Auteur : <form:input type="text" auteur="auteur" path="auteur"/>

<br/>
Prix : <form:input type="text" prix="prix" path="prix"/>
<br/>


<input type="submit" value="valider">
</form:form>

</body></html>