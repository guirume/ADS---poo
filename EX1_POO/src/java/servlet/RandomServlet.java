package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.Random;

@WebServlet(name = "RandomServlet", urlPatterns = {"/Random.html"})
public class RandomServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            Random rand = new Random();
            int vet[] = new int[6];
            for(int i=0; i<6; i++){                            
                vet[i] = rand.nextInt(60) + 1;
                for(int o=0; o<i; o++){
                    if(vet[i] == vet[o]){
                        i--;
                    }
                }
            }
            
            out.println("<!DOCTYPE html>");
                out.println("<html>");
                    out.println("<head>");
                        out.println("<title>RandomServlet.java</title>");
                        out.println("<link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\">");
                    out.println("</head>");
                    
                    
                    
                    out.println("<body>");
                        out.println("<p><a href=\"index.html\">Voltar</a></p>");
                        out.println("<h1>Saudações</h1>");
                        out.println("<h3>Seus numeros da sorte são ");
                        for(int i = 0;i<6;i++){
                            out.println(vet[i]);
                            if(i!= 5){
                                out.println(",");
                            }
                        }
                        out.println(".</h3>");
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
