<%-- 
    Document   : fibonacci
    Created on : 16 de abr. de 2024, 13:45:53
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
            Verifique a sequencia finabocci aqui:
        </h2>
        
        <form action="" method="get"> 
            <h3>
                <label for="text">insira um numero:</label><br>
                <input type="text" name="num" />
                <input type="submit" name="ok"/>
            </h3>
        </form>
        
        <%try{
            int num = Integer.valueOf(request.getParameter("num"));
            int x0 = 0, x1 = 1, x2;
            if(num==1){
                out.print("sequencia finabocci: 1");
            }
            for(int i=1; i<num; i++){
                if(x0==0){
                    out.print("sequencia finabocci: 1, ");
                }
                x2 = x0 + x1;
                x0 = x1;
                x1 = x2;
                out.print(x2);
                if(i < num-1){
                    out.print(", ");
                }
            }
            if(num!=0){
                out.print(".");
            }

        }catch(NumberFormatException e){
            out.println("");
        }%>
        
    </body>
</html>
