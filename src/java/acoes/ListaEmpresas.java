/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acoes;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelos.BancoModelo;
import modelos.EmpresaModelo;

/**
 *
 * @author walex
 */
public class ListaEmpresas {
    
   

    public void executa(HttpServletRequest request, HttpServletResponse response) {
        BancoModelo banco = new BancoModelo();
        List<EmpresaModelo> empresas = banco.getEmpresa();
        
        RequestDispatcher rd = request.getRequestDispatcher("/listaEmpresas.jsp");
        request.setAttribute("listaEmpresas", empresas);
        try {
            rd.forward(request, response);
        } catch (ServletException | IOException ex) {
            Logger.getLogger(ListaEmpresas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}