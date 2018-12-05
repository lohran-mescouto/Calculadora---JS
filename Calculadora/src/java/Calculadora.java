/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author aluno
 */
@WebServlet(urlPatterns = {"/Calculadora"})
public class Calculadora extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            
        request.getRequestDispatcher("/WEB-INF/Calculadora.jsp")
                .forward(request, response);
    
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
        
        String valor1 = request.getParameter("valor1");
        String valor2 = request.getParameter("valor2");
        String operacao = request.getParameter("operacao");
        
        switch(operacao){
            
            case "soma":
                break;
            case "subtrair":
                break;
            case "dividir":
                break;
            case "multiplicar":
                break;
            
        
        }
        System.out.println("O valor do primeiro campo é: " + valor1);
        System.out.println("O valor do segundo campo é: " + valor2);
       
        request.getRequestDispatcher("/WEB-INF/Calculadora.jsp")
                .forward(request, response);
    }
 

}
