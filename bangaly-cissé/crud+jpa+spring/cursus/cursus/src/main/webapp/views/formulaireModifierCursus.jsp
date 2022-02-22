<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Projet spring boot</title>
</head>
<body>
<h1> Modifier cursus</h1>

<form:form method="post" action ="/cursus/modifier" modelAttribute="cursus">
    <form:input type="text" value = "${cursur.nom}" path="nom"/>
</form:form>

</body>
</html>