/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acoes;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelos.BancoModelo;
import modelos.EmpresaModelo;

/**
 *
 * @author walex
 */
public class AlteraEmpresa {
    
    public void executa(HttpServletRequest request, HttpServletResponse response) throws ServletException{
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
        
        try {
            response.sendRedirect("entrada?acao=ListaEmpresas");
        } catch (IOException ex) {
            Logger.getLogger(AlteraEmpresa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
