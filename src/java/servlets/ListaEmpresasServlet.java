/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import modelos.BancoModelo;
import modelos.EmpresaModelo;
import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Desenvolvimento
 */
//@WebServlet(name = "ListaEmpresasServlet", urlPatterns = {"/listaEmpresasServlet"})
public class ListaEmpresasServlet extends HttpServlet {


    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws java.io.IOException
     * @throws javax.servlet.ServletException
     */
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        BancoModelo banco = new BancoModelo();
        List<EmpresaModelo> empresas = banco.getEmpresa();
        
        RequestDispatcher rd = request.getRequestDispatcher("/listaEmpresas.jsp");
        request.setAttribute("listaEmpresas", empresas);
        rd.forward(request, response);
    }


}
