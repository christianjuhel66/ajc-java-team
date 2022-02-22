<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>utilisateur form </title>
</head>
<body>

    <form:form action="/traitementForm" modelAttribute="livre">
    	<%-- a)  --%>
        Titre : <form:input path="titre" type="text" required="required"/>
        <br/>
        
        Auteur : <form:input path="auteur" type="text"  required="required"/>
        <br/>
        
 
        Prix : <form:input path="prix" type="number" min="0" steps="0.01" 
        required="required"/>
		<br/>
		
		<%-- b)  --%>
		<p>Editeur:</p>
		<form:select path="editeur">
            <form:option value="Hachette" label="Hachette"/>
            <form:option value="Editis" label="Editis"/>
            <form:option value="Gallimard" label="Gallimard"/>
            <form:option value="Albin Michel" label="Albin Michel"/>
            <form:option value="Actes Sud" label="Actes Sud"/>
        </form:select>
		<br/>
		
		<%-- c)  --%>
		<p>Edition:</p>
        Normal <form:radiobutton path="edition" value="normal" />
        Poche      <form:radiobutton path="edition" value="poche" />
		<br/>
		
		<%-- d)  --%>
		<p>genre:</p>
        Classique  		 <form:checkbox path="genre" value="Classique" />
        Science-fiction  <form:checkbox path="genre" value="Science-fiction" />
        Aventure         <form:checkbox path="genre" value="Aventure"/>
        Policier         <form:checkbox path="genre" value="Policier"/>
		
		<br>
        <input type="submit" value="Valider"/>
    </form:form>

</body>
</html>