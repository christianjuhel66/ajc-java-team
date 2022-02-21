<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
        <!DOCTYPE html>
        <html>

        <head>
            <meta charset="UTF-8">
            <title>Confirmation livre</title>
            <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
        </head>

        <body>
            <h1>Le <b>Livre</b></h1>
            <div>
                <div>
                    Titre: ${livre.titre}
                </div>
                <div>
                    Auteur: ${livre.auteur}
                </div>
                <div>
                    Prix: ${livre.prix}
                </div>
                <div>
                    Editeur: ${livre.editeur}
                </div>
                <div>
                    Type d'edition: ${livre.typeEdition}
                </div>
                <div>
                    Genres:
                    <ul>
                        <c:forEach var="genre" items="${livre.genres}">
                            <li>${genre}</li>
                        </c:forEach>
                    </ul>
                </div>
            </div>
        </body>

        </html>