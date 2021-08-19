/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acoes;

import java.io.IOException;
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
public class MostraEmpresa {
    
    public void executa(HttpServletRequest request, HttpServletResponse response){
        
        String paramiD = request.getParameter("id");
        Integer empresaId = Integer.valueOf(paramiD);
        
        BancoModelo bancoBean = new BancoModelo();
        
        EmpresaModelo empresaBean = bancoBean.buscaEmpresaPorId(empresaId);
        
        System.out.println(empresaBean.getNome());
        
        request.setAttribute("empresa", empresaBean);
        RequestDispatcher rd = request.getRequestDispatcher("/formEditaEmpresa.jsp");
        
        try {
            rd.forward(request, response);
        } catch (ServletException | IOException ex) {
            Logger.getLogger(MostraEmpresa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
