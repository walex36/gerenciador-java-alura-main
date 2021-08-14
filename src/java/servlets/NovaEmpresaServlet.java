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
import java.util.logging.Level;
import java.util.logging.Logger;
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
@WebServlet(name = "NovaEmpresaServlet", urlPatterns = {"/novaEmpresa"})
public class NovaEmpresaServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        System.out.println("Cadastrando Nova Empresa");
        
        String nomeEmpresa = request.getParameter("nome");
        String dataEmpresa = request.getParameter("data");
        Date dataAbertura = null;
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            dataAbertura = sdf.parse(dataEmpresa);
        } catch (ParseException ex) {
            throw new ServletException(ex);
        }
        
        EmpresaModelo empresa = new EmpresaModelo();
        empresa.setNome(nomeEmpresa);
        empresa.setDataAbertura(dataAbertura);
        
        BancoModelo banco = new BancoModelo();
        banco.adiciona(empresa);
        
        request.setAttribute("empresa", empresa);
        response.sendRedirect("listaEmpresasServlet");
        
//        RequestDispatcher rd = request.getRequestDispatcher("/listaEmpresasServlet");
//        
//        rd.forward(request, response);
    }

    

}
