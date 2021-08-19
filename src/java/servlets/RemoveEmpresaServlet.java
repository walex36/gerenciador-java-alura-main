/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import modelos.BancoModelo;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author walex
 */
//@WebServlet(name = "RemoveEmpresaServlet", urlPatterns = {"/removeEmpresaServlet"})
public class RemoveEmpresaServlet extends HttpServlet {

    

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
        
        String paramiD = request.getParameter("id");
        Integer empresaId = Integer.valueOf(paramiD);
        
        System.out.println(empresaId);
        
        BancoModelo bancoBean = new BancoModelo();
        
        bancoBean.removeEmpresa(empresaId);
        
        response.sendRedirect("listaEmpresasServlet");
        
    }


}
