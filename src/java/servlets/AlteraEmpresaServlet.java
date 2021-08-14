/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import modelos.BancoModelo;
import modelos.EmpresaModelo;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author walex
 */
@WebServlet(name = "AlteraEmpresaServlet", urlPatterns = {"/alteraEmpresaServlet"})
public class AlteraEmpresaServlet extends HttpServlet {


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
        
        String paramId = request.getParameter("id");
        Integer idEmpresa = Integer.valueOf(paramId);
        String nomeEmpresa = request.getParameter("nome");
        String dataEmpresa = request.getParameter("data");
        Date dataAbertura = null;
        
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            dataAbertura = sdf.parse(dataEmpresa);
        } catch (ParseException ex) {
            throw new ServletException(ex);
        }
        
        BancoModelo bancoBean = new BancoModelo();
        
        EmpresaModelo empresaBean = bancoBean.buscaEmpresaPorId(idEmpresa);
        empresaBean.setNome(nomeEmpresa);
        empresaBean.setDataAbertura(dataAbertura);
        
        response.sendRedirect("listaEmpresasServlet");
        
    }

    

}
