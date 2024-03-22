package servlet;

import java.util.*;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "GreetingServlet", urlPatterns = {"/greeting.html"})
public class GreetingServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            Date dt = new Date();
            int hora = dt.getHours();
            String text = "eeror?"; 
            if(hora <= 3){
                text = "Boa noite, esta tarde, vc deveria dormir"; 
            }else if(hora <= 5){
                text = "Boa noite, é madrugada, vc deveria dormir";
            }else if(hora <= 12){
                text = "Bom dia";
            }else if(hora <= 17){
                text = "Boa tarde";
            }else if(hora <= 22){
                text = "Boa noite";
            }else{
                text = "Boa noite, esta tarde, vc deveria dormir"; 
            }
            out.println("<!DOCTYPE html>");
                out.println("<html>");
                    out.println("<head>");
                        out.println("<title>GreetingServlet.java</title>");
                        out.println("<link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\">");
                    out.println("</head>");
                    
                    
                    
                    out.println("<body>");
                        out.println("<p><a href=\"index.html\">Voltar</a></p>");
                        out.println("<h1>Saudações</h1>");
                        out.println("<p>Ola, " + text + ".</p>");
                    out.println("</body>");
                out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}