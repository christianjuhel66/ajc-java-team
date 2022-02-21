<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <title>Article - Form</title>
</head>
<body>
    <%-- <form action="traitementForm" method="GET">
       
        <input type="text" name="titre" placeholder="title?" />
        <input type="text" name="auteur" placeholder="autor?" />
        <input type="text" name="prix" placeholder="price?" />
        <input type="submit" />
    </form>--%>
    
    <form:form action="traitementForm" modelAttribute="livre">
    
        titre : <form:input path="titre"/>
        <br/>
        auteur : <form:input path="auteur"/>
        <br/>
        prix : <form:input path="prix"/>
        <br/>
		editeur:
        <form:select path="editeur">
           
            <form:options items="${laListeDesEditeurs}" />

        </form:select>
        </br>
        choix possible d'edition:
        </br>
        <form:radiobuttons path="typeEdition" items="${typeEdition}" />
        </br>
        <p>genres:</p>
        classique   		 <form:checkbox path="genres" value="classique" />
        science-fiction      <form:checkbox path="genres" value="science-fiction" />
        aventure             <form:checkbox path="genres" value="aventure"/>
        policier             <form:checkbox path="genres" value="policier"/>
        
        <input type="submit" value="Valider"/>
    </form:form>
</body>
</html>