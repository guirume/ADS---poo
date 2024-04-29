<%-- 
    Document   : index
    Created on : 28 de abr. de 2024, 16:01:12
    Author     : guiru
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
        
    </head>
    <body>
        <%@include file="WEB-INF/jspf/header.jspf"%>
        
        <script> async function logMovies() {
            const response = await fetch("http://localhost:8080/EX5_POO/Luana.json");
            const movies[] = await response.json();
            console.log(movies);
        }</script>
        
        <h1>Saudações</h1>
    </body>
</html>
