/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "Luana", urlPatterns = {"/Luana.json"})
public class Luana extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("application/sjon;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String SocialName = "Luana Honorato Rodrigues", RA = "1290482222034";
            String[] Disciplinas = {"AGO005-Gestão de Projetos",
                "EDS004-Estágio Supervisionado em Análise e Desenvolvimento de Sistemas",
                "IBD002-Banco de Dados",
                "IES300-Engenharia de Software III",
                "ILP007-Programação Orientada a Objetos",
                "ILP512-Linguagem de Programação IV - INTERNET",
                "ISO200-Sistemas Operacionais II",
                "TTG001-Metodologia da Pesquisa Científico-Tecnológica"};
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
/*
out.println("<!DOCTYPE html>");
out.println("<html>");
out.println("<head>");
out.println("<title>Servlet Luana</title>");            
out.println("</head>");
out.println("<body>");
out.println("<h1>Servlet Luana at " + request.getContextPath() + "</h1>");
out.println("</body>");
out.println("</html>");
*/