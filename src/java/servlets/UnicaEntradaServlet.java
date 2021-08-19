/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import acoes.AlteraEmpresa;
import acoes.ListaEmpresas;
import acoes.MostraEmpresa;
import acoes.NovaEmpresa;
import acoes.RemoveEmpresa;
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
            ListaEmpresas acao = new ListaEmpresas();
            acao.executa(request, response);
        }else if (paramAcao.equals("RemoveEmpresa")) {
            RemoveEmpresa acao = new RemoveEmpresa();
            acao.executa(request, response);
        }else if (paramAcao.equals("MostraEmpresa")) {
            MostraEmpresa acao = new MostraEmpresa();
            acao.executa(request, response);
        }else if (paramAcao.equals("AlteraEmpresa")) {
            AlteraEmpresa acao = new AlteraEmpresa();
            acao.executa(request, response);
        }else if (paramAcao.equals("NovaEmpresa")) {
            NovaEmpresa acao = new NovaEmpresa();
            acao.executa(request, response);
        }
    }
}
