<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
<div class="container">
    <h1>Retour formulaire</h1>
    <p>L'utilisateur est vérifié : ${livre.titre} ${livre.auteur} </p>
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
    </table>
</div>
</body>
</html>