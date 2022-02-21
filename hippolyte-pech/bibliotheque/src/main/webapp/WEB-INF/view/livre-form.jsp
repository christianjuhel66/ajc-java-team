<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
        <!DOCTYPE html>
        <html>

        <head>
            <meta charset="UTF-8">
            <title>Formulaire livre</title>
            <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
        </head>

        <body>
            <h1>Affichage des infos d'un livre</h1>

            <form:form action="traitementForm" modelAttribute="livre">
                <div>
                    Titre:
                    <form:input path="titre" /> Auteur:
                    <form:input path="auteur" /> Prix:
                    <form:input path="prix" />
                </div>
                <div>
                    <h3>Editeur</h3>
                    <form:select path="editeur">
                        <form:option value="Hachette" />
                        <form:option value="Editis" />
                        <form:option value="Gallimard" />
                        <form:option value="Albin Michel" />
                        <form:option value="Actes Sud" />
                    </form:select>
                </div>
                <div>
                    <h3>Type d'édition</h3>
                    Edition Classique
                    <form:radiobutton path="typeEdition" value="Classique" /><br> Edition de poche
                    <form:radiobutton path="typeEdition" value="Poche" />
                </div>
                <div>
                    <h3>Genres</h3>
                    Classique
                    <form:checkbox path="genres" value="Classique" /> Science-friction
                    <form:checkbox path="genres" value="Science-fiction" /> Aventure
                    <form:checkbox path="genres" value="Aventure" /> Policier
                    <form:checkbox path="genres" value="Policier" />
                </div>
                <input type="submit" value="valider">
            </form:form>
        </body>

        </html>