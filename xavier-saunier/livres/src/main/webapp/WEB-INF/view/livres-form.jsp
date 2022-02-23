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
<form:form action="processForm" modelAttribute="livre">
Titre : <form:input type= "text" titre="titre" path="titre"/>
<br/>
Auteur : <form:input type="text" auteur="auteur" path="auteur"/>

<br/>
Prix : <form:input type="text" prix="prix" path="prix"/>
<br/>

Editeur : <form:select type="text" editeur="editeur" path="editeur">
<form:option value="Hachette"/>
<form:option value="Editis"/>
<form:option value="Gallimard"/>
<form:option value="Albin Michel"/>
<form:option value="Actes Sud"/>
</form:select><br/>

Format : <br/> <form:radiobutton format="format" path="format" value="standard"/><span>standard</span><br/>
<form:radiobutton format="format" path="format" value="poche"/><span>poche</span></br>

Genres : <br/>
<form:checkbox path="genres" value="Classique"/><span>Classique</span><br/>
<form:checkbox path="genres" value="SF"/><span>SF</span><br/>
<form:checkbox path="genres" value="Aventure"/><span>Aventure</span><br/>
<form:checkbox path="genres" value="Polar"/><span>Polar</span><br/>


<input type="submit" value="valider">
</form:form>

</body></html>