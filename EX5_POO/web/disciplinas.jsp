<%-- 
    Document   : index
    Created on : 29 de abr. de 2024, 21:47:10
    Author     : guiru
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Disciplinas</title>
        <script defer src="https://cdn.jsdelivr.net/npm/alpinejs@3.13.10/dist/cdn.min.js"></script>
    </head>
    <body>
        <%@include file="WEB-INF/jspf/header.jspf"%>
        <h1>Saudações</h1>

        <p id="demo"></p>

        <script type="module">
            getText("Luana.json");
            async function getText(file) {
                let x = await fetch(file);
                let y = await x.text();
                document.getElementById("demo").innerHTML = y;
            }
        </script>   
    </body>
</html>


