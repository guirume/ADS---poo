<%-- 
    Document   : juros-compostos
    Created on : 2 de abr. de 2024, 14:46:01
    Author     : Fatec
--%>
<%@page import="java.lang.Math"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Juros compostos</title>
        <link rel="stylesheet" type="text/css" href="style.css">
    </head>
    <body>
        <%@include file="WEB-INF/jspf/menu.jspf" %>
        <h1>Saudações</h1>
        <h3>Juros composto</h3>
        
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
                    
                    out.println("<table>");
                        out.println("<tr>");
                            out.println("<th>Mês</th>");
                            out.println("<th>juros</th>");
                            out.println("<th>Montante</th>");
                        out.println("</tr>");
        
                        for(int i =0; i<=temp; i++){                    
                            result = inic * Math.pow((1 + (juro / 100)) , i);

                            montant = inic + result;
                            out.println("<tr>");
                            out.println("<th>" + i + "</th>");
                            out.println(String.format("<th>R$ %.2f </th>", result));
                            out.println(String.format("<th>R$ %.2f </th>", montant));
                            out.println("</tr>");
                        }
                    out.println("</table>");
                    
                }catch(NullPointerException e){
                    out.println("");
                }catch(NumberFormatException e){
                    out.println("erro, insira um numero valido");
                }
            %>
        </p>
    </body>
</html>