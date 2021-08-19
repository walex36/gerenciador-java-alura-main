/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acoes;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelos.BancoModelo;

/**
 *
 * @author walex
 */
public class RemoveEmpresa {
    
    public void executa(HttpServletRequest request, HttpServletResponse response){
        
        String paramiD = request.getParameter("id");
        Integer empresaId = Integer.valueOf(paramiD);
        
        System.out.println(empresaId);
        
        BancoModelo bancoBean = new BancoModelo();
        
        bancoBean.removeEmpresa(empresaId);
        
        try {
            response.sendRedirect("entrada?acao=ListaEmpresas");
        } catch (IOException ex) {
            Logger.getLogger(RemoveEmpresa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
