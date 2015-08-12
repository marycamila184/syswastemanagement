/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.trash.persistencia;

import br.com.trash.controle.fornecedoresBean;
import br.com.trash.controle.loginBean;
import br.com.trash.entidades.Funcionarios;
import br.com.trash.entidades.Servicos;
import br.com.trash.telas.sistemas.TelaAlteraSenha;
import br.com.trash.telas.sistemas.TelaInicial;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.JOptionPane;


/**
 *
 * @author MARY
 */
public class persistenciaSelect{
    public EntityManagerFactory factory = Persistence.createEntityManagerFactory("sgbdtrash?zeroDateTimeBehavior=convertToNullPU");
    public EntityManager manager = factory.createEntityManager();
    
    /**
     *
     */
    public List<fornecedoresBean> listfornecedor=new ArrayList<>();
    /**
     *
     */
    protected static String userUtilizando;
    /**
     *
     */
    protected static String nivelUtilizando;
    /**
     *
     */
    protected static int codUserUtilizando;
    /**
     *
     */
    protected static String alteraSenha;
    
    /**
     * Método para ater acesso ao sistema.
     * @param lb - parâmetro do tipo loginBean, onde passa todos os atributos do login 
     * do funcionário.
     */
    public void selectUserESenha(loginBean lb) {
       int status=0;
       try{
        Query query = manager.createNamedQuery("Funcionarios.findByAcesso");
        query.setParameter("usuario", lb.getUsuarioUtilizando()); //Seto o primeiro parametro da query
        query.setParameter("senha", lb.getSenhaUtilizando()); //Seto o segundo parametro da query
       
        
            List<Funcionarios> loginESenha=query.getResultList();
            //Retorno uma lista
            if(loginESenha.isEmpty()==false){
                for (Funcionarios login : loginESenha) {
                        codUserUtilizando=login.getIdfunc();
                        userUtilizando=login.getUsuario(); //Dou um set o usuario para poder registrar as uatualizações
                        nivelUtilizando=login.getNivel(); //Dou um set no nivel para poder utilizar depois
                        alteraSenha=login.getAlterasenha();
                        status=login.getStatusfunc();
                    }if(status==1){
                        if("s".equals(alteraSenha)) {
                                //comparação para ver se o usuario ja alterou a senha
                                TelaAlteraSenha tas=new TelaAlteraSenha();
                                tas.setVisible(true);
                        }else
                            if("n".equals(alteraSenha)){
                                TelaInicial ti=new TelaInicial();
                                ti.setVisible(true);
                        }
                    }else{
                        JOptionPane.showMessageDialog(null, "Usuário inativo!");
                    }
            }else{
               JOptionPane.showMessageDialog(null, "Usuario e/ou senha incorretos! ");
            }
        }finally{
            manager.close();
            factory.close();
        }
    }

    /**
     *
     * @param combo
     * @return
     */
    public String selectComboSubServico(int combo) {
        String descricao = null;
        Query query = manager.createNamedQuery("Servicos.findByCodservicos");
        query.setParameter("codservicos", combo); //Seto o primeiro parametro da query
        List<Servicos> servicosCod=query.getResultList();
          if(servicosCod!=null){
            for (Servicos servicos : servicosCod) {
                descricao=servicos.getDescricao();
            }
          }
          return descricao;
    }

    public void preencheNomeFiscal(int cod) {
        
    }

    public void preencheNomeSupervisor(int cod) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public void preencheNomeSetor(int cod) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public void preencheNomeOperadora(int cod) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public void preencheDadosOs(int os) {
        throw new UnsupportedOperationException("Not yet implemented");
    }
    
}

