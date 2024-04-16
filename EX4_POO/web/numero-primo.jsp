<%-- 
    Document   : numero-primo
    Created on : 16 de abr. de 2024, 13:45:40
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
            Verifique se um numero é primo aqui:
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
            int cont = 0;

            for(int i=2; i<num; i++){
                if(num % i == 0){
                    if(cont == 0){
                        out.print("o numero " + num + " é divisivel por: ");
                    }else{
                        out.print(",");
                    }
                    out.print(" " + i);
                    cont =+ 1;
                }                       
            }
            if(cont == 0){
                out.print("o numero " + num + " é primo.");
            }

        }catch(NumberFormatException e){
            out.println("");
        }%>
    </body>
</html>
