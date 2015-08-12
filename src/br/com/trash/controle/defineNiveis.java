/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.trash.controle;

import br.com.trash.persistencia.persistenciaSelect;
import br.com.trash.telas.sistemas.ADMIN.TelaAlteraFornecedoresADMIN;
import br.com.trash.telas.sistemas.ADMIN.TelaAlteraFuncionariosADMIN;
import br.com.trash.telas.sistemas.ADMIN.TelaAlteraServicosADMIN;
import br.com.trash.telas.sistemas.ADMIN.TelaAlteraSetoresADMIN;
import br.com.trash.telas.sistemas.ADMIN.TelaAlteraSubServicosADMIN;
import br.com.trash.telas.sistemas.DIR.TelaAlteraFornecedoresDIR;
import br.com.trash.telas.sistemas.DIR.TelaAlteraFuncionariosDIR;
import br.com.trash.telas.sistemas.DIR.TelaAlteraServicosDIR;
import br.com.trash.telas.sistemas.DIR.TelaAlteraSetoresDIR;
import br.com.trash.telas.sistemas.DIR.TelaAlteraSubServicosDIR;
import br.com.trash.telas.sistemas.UC.TelaVisualizaSubServicosUC;
import br.com.trash.telas.sistemas.UC.TelaVisualizaFornecedoresUC;
import br.com.trash.telas.sistemas.UC.TelaVisualizaSetoresUC;
import br.com.trash.telas.sistemas.UC.TelaVisualizaFuncionariosUC;
import br.com.trash.telas.sistemas.UC.TelaVisualizaServicosUC;

/**
 *
 * @author MARY
 */
public class defineNiveis extends persistenciaSelect{

public void abreTelaAlteraFornecedores(int cod) {
        
        if("admin".equals(nivelUtilizando)){
                TelaAlteraFornecedoresADMIN tafadmin=new TelaAlteraFornecedoresADMIN();
                tafadmin.preencheCamposFornecedores(factory,manager,cod);
                tafadmin.setVisible(true);
        }else
            if("diretoria".equals(nivelUtilizando)){
                TelaAlteraFornecedoresDIR tafdir=new TelaAlteraFornecedoresDIR();
                tafdir.preencheCamposFornecedores(factory,manager,cod);
                tafdir.setVisible(true);
            }else
                if("comum".equals(nivelUtilizando)){
                TelaVisualizaFornecedoresUC tafuc=new TelaVisualizaFornecedoresUC();
                tafuc.preencheCamposFornecedores(factory,manager,cod);
                tafuc.setVisible(true);
                }
    }
    
    /**
     *
     * @param cod
     */
    public void abreTelaAlteraSetores(int cod) {
        if("admin".equals(nivelUtilizando)){
                TelaAlteraSetoresADMIN tafadmin=new TelaAlteraSetoresADMIN();
                tafadmin.preencheCamposSetores(factory,manager,cod);
                tafadmin.setVisible(true);
        }else
            if("diretoria".equals(nivelUtilizando)){
                TelaAlteraSetoresDIR tafdir=new TelaAlteraSetoresDIR();
                tafdir.preencheCamposSetores(factory,manager,cod);
                tafdir.setVisible(true);
            }else
                if("comum".equals(nivelUtilizando)){
                TelaVisualizaSetoresUC tafuc=new TelaVisualizaSetoresUC();
                tafuc.preencheCamposSetores(factory,manager,cod);
                tafuc.setVisible(true);
                }
    }

    /**
     *
     * @param cod
     */
    public void abreTelaAlteraFuncionarios(int cod) {
         if("admin".equals(nivelUtilizando)){
                TelaAlteraFuncionariosADMIN tafadmin=new TelaAlteraFuncionariosADMIN();
                tafadmin.preencheCamposFuncionarios(factory,manager,cod);
                tafadmin.setVisible(true);
        }else
            if("diretoria".equals(nivelUtilizando)){
                TelaAlteraFuncionariosDIR tafdir=new TelaAlteraFuncionariosDIR();
                tafdir.preencheCamposFuncionarios(factory,manager,cod);
                tafdir.setVisible(true);
            }else
                if("comum".equals(nivelUtilizando)){
                TelaVisualizaFuncionariosUC tafuc=new TelaVisualizaFuncionariosUC();
                tafuc.preencheCamposFuncionarios(factory,manager,cod);
                tafuc.setVisible(true);
                }
    }
    
     public void abreTelaAlteraServicos(int cod) {
         if("admin".equals(nivelUtilizando)){
                TelaAlteraServicosADMIN tafadmin=new TelaAlteraServicosADMIN();
                tafadmin.preencheCamposServicos(factory,manager,cod);
                tafadmin.setVisible(true);
        }else
            if("diretoria".equals(nivelUtilizando)){
                TelaAlteraServicosDIR tafdir=new TelaAlteraServicosDIR();
                tafdir.preencheCamposServicos(factory,manager,cod);
                tafdir.setVisible(true);
            }else
                if("comum".equals(nivelUtilizando)){
                TelaVisualizaServicosUC tafuc=new TelaVisualizaServicosUC();
                tafuc.preencheCamposServicos(factory,manager,cod);
                tafuc.setVisible(true);
                }
    }
     
      public void abreTelaAlteraSubServicos(int cod) {
         if("admin".equals(nivelUtilizando)){
                TelaAlteraSubServicosADMIN tafadmin=new TelaAlteraSubServicosADMIN();
                tafadmin.preencheCamposSubservicos(factory,manager,cod);
                tafadmin.setVisible(true);
        }else
            if("diretoria".equals(nivelUtilizando)){
                TelaAlteraSubServicosDIR tafdir=new TelaAlteraSubServicosDIR();
                tafdir.preencheCamposSubservicos(factory,manager,cod);
                tafdir.setVisible(true);
            }else
                if("comum".equals(nivelUtilizando)){
                TelaVisualizaSubServicosUC tafuc=new TelaVisualizaSubServicosUC();
                tafuc.preencheCamposSubservicos(factory,manager,cod);
                tafuc.setVisible(true);
                }
    }

    
}
