package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "ApiLuanaServlet", urlPatterns = {"/Luana.json"})
public class ApiLuanaServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("application/json;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            String vet[] = new String[8];
            vet[0] = "Gestão de Projetos;";
            vet[1] = "Estágio Supervisionado em Análise e Desenvolvimento de Sistemas;";
            vet[2] = "Banco de Dados;";
            vet[3] = "Engenharia de Software III;";
            vet[4] = "Programação Orientada a Objetos;";
            vet[5] = "Linguagem de Programação IV - INTERNET;";
            vet[6] = "Sistemas Operacionais II;";
            vet[7] = "Metodologia da Pesquisa Científico-Tecnológica;";
            
            out.println("Saudações\n");
            out.println("RA:    1290482222034");
            out.println("Nome:  Luana Honorato Rodrigues");
            out.println("\nAs materias do semestre são:\n");
            for(int i=0; i<8; i++){
                out.println(vet[i]);
            }
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
