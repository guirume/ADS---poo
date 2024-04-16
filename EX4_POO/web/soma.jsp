<%-- 
    Document   : soma
    Created on : 16 de abr. de 2024, 13:46:10
    Author     : Fatec
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%@include file="WEB-INF/jspf/menu.jspf" %>
        
        <h1 style="margin-bottom:0;">
            Saudações.
        </h1>
        <h2 style="margin : 0; padding-top:0;">
            Verifique a soma dos numeros:
        </h2>
        
        <form action="" method="get"> 
            <h3>
                <label for="text">insira um numero:</label><br>
                <input type="text" name="num" placeholder="digite aqui."/>
                <input type="submit" name="ok"/>
            </h3>
        </form>
        
        <%try{
            int num = Integer.valueOf(request.getParameter("num"));
            int gaus;
            boolean tcc = false;
            
            if(num %2 == 1){
                num--;
                tcc = true;
            }
            
            gaus = 1 + num;
            gaus = gaus * (num/2);
            
            if(tcc == true){
                num++;
                gaus += num;
            }
            out.print("soma de todos os valores entre 1 e " + num + " igual a " + gaus + ".");
        }catch(NumberFormatException e){
            out.println("");
        }%>
    </body>
</html>
