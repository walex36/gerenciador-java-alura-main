/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import acoes.ListaEmpresas;
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
@WebServlet(name = "UnicaEntradaServlet", urlPatterns = {"/entrada"})
public class UnicaEntradaServlet extends HttpServlet {
    
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException{
        
        String paramAcao = request.getParameter("acao");
        
        if (paramAcao.equals("ListaEmpresas")) {
            System.out.println("Listando empresas");
            
            ListaEmpresas acao = new ListaEmpresas();
            acao.executa(request, response);
            
        }else if (paramAcao.equals("RemoveEmpresa")) {
            System.out.println("Remove empresas");
        }else if (paramAcao.equals("AdicionaEmpresa")) {
            System.out.println("Adicionado empresas");
        }
    }
}
