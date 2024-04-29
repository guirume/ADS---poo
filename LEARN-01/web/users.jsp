<%-- 
    Document   : users
    Created on : 28 de abr. de 2024, 21:48:20
    Author     : guiru
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <%@include file="WEB-INF/jspf/html-head-libs.jspf" %>
        <script defer src="https://cdn.jsdelivr.net/npm/alpinejs@3.x.x/dist/cdn.min.js"></script>
        <script defer src="https://cdn.jsdelivr.net/npm/@alpinejs/mask@3.x.x/dist/cdn.min.js"></script>
    </head>
    <body>
        <%@include file="WEB-INF/jspf/navbar.jspf" %>
        <%if(userName != null){%>
            <div class="m-2">
                <h2>Página de usuários</h2>

                <%for(String user: users){%>
                    <div><%= user%></div>
                <%}%>
            </div>
        <%}%> 
        <%@include file="WEB-INF/jspf/html-body-libs.jspf" %>
    </body>
</html>
