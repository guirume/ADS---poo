<%-- 
    Document   : juros-slimples
    Created on : 2 de abr. de 2024, 14:45:43
    Author     : Fatec
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Juros simples</title>
        <link rel="stylesheet" type="text/css" href="style.css">
    </head>
    <body>
        <%@include file="WEB-INF/jspf/menu.jspf" %>
        <h1>Saudações</h1>
        <h3>Juros simples</h3>
        <form action="" method="get">    
            <input type="number" name="inic" placeholder="valor inicial:"/><br>
            <input type="number" name="juro" placeholder="porcentagem juros:"/><br>
            <input type="number" name="temp" placeholder="preiodo da transação:"/><br>
            <br>
            <input type="submit" name="ok"/>
        </form>
        
        <p>
            <%
                String x1, x2, x3;
                x1 = request.getParameter("inic");
                x2 = request.getParameter("juro");
                x3 = request.getParameter("temp");

                Double inic, temp, juro, result, montant;
                
                try{
                    inic = Double.valueOf(x1);
                    juro = Double.valueOf(x2);
                    temp = Double.valueOf(x3);
                    
                    result = inic * (juro / 100) * temp;
                    montant = inic + result;
                    
                    out.println(String.format("<p>Valor dos juros:&nbsp &nbsp &nbsp &nbspR$ %.2f </p>", result));
                    out.println(String.format("<p>Total do montante:&nbsp &nbspR$ %.2f </p>", montant));
                }catch(NullPointerException e){
                    out.println("");
                }catch(NumberFormatException e){
                    out.println("erro, insira um numero valido");
                }
            %>
        </p>
    </body>
</html>