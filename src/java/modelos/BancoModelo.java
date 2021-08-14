/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


/**
 *
 * @author Desenvolvimento
 */
public class BancoModelo {

    private static List<EmpresaModelo> empresasList = new ArrayList<>();
    private static Integer chaveSequencial = 1;

    static {
        EmpresaModelo empresa = new EmpresaModelo();
        empresa.setId(chaveSequencial++);
        empresa.setNome("Alura");
        empresasList.add(empresa);
        EmpresaModelo empresa1 = new EmpresaModelo();
        empresa1.setId(chaveSequencial++);
        empresa1.setNome("Google");
        empresasList.add(empresa1);

    }

    public void adiciona(EmpresaModelo empresa) {
        empresa.setId(chaveSequencial++);
        empresasList.add(empresa);
    }

    public void removeEmpresa(Integer empresaID) {

        Iterator<EmpresaModelo> it = empresasList.iterator();

        while (it.hasNext()) {
            EmpresaModelo emp = it.next();
            if (emp.getId() == empresaID) {
                it.remove();
            }
        }
    }

    public List<EmpresaModelo> getEmpresa() {
        return empresasList;
    }

    public EmpresaModelo buscaEmpresaPorId(Integer empresaId) {
        for (EmpresaModelo empresaBean : empresasList) {
            if (empresaBean.getId() == empresaId) {
                return empresaBean;
            }
        }
        return null;
    }

}
