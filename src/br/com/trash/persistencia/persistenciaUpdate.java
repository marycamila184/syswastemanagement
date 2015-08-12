/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.trash.persistencia;

import br.com.trash.entidades.Fornecedores;
import br.com.trash.entidades.Funcionarios;
import br.com.trash.entidades.Servicos;
import br.com.trash.entidades.Setores;
import br.com.trash.entidades.Subservicos;
import javax.swing.JOptionPane;

/**
 *
 * @author MARY
 */
public class persistenciaUpdate extends persistenciaSelect{
    
    public void updateNovaSenha(String senha) {
    manager.getTransaction().begin();
    Funcionarios f = manager.getReference(Funcionarios.class, codUserUtilizando);
    f.setSenha(senha);
    f.setAlterasenha("n");
    manager.merge(f);
    manager.getTransaction().commit();
    manager.close();
    factory.close(); 
    } 

    
    public void updateTelaFornecedoresADMIN(int codUpdate, String razao, 
        String morada, String municipio, String bairro, String telemovel, 
        String telemovel2, String dataContrato, String nif, String email, String dataAltera) {
        manager.getTransaction().begin();
        Fornecedores f = manager.getReference(Fornecedores.class, codUpdate);
        f.setRazaoSocial(razao);
        f.setBairro(bairro);
        f.setDataaltera(dataAltera);
        f.setEmail(email);
        f.setMorada(morada);
        f.setMunicipio(municipio);
        f.setNif(nif);
        f.setTelemovel1(telemovel);
        f.setTelemovel2(telemovel2);
        f.setUseraltera(userUtilizando);
        f.setValidadecontrato(dataContrato);
        manager.merge(f);
        manager.getTransaction().commit();
        manager.close();
        factory.close(); 
    }

    public void updateTelaAlteraServicosADMIN(int cod, String undMensal, int qtde, String descricao, 
            String dataAltera) {
        manager.getTransaction().begin();
        Servicos s = manager.getReference(Servicos.class, cod);
        s.setUnd(undMensal);
        s.setQtde(qtde);
        s.setDescricao(descricao);
        s.setDataaltera(dataAltera);
        s.setUseraltera(userUtilizando);
        manager.merge(s);
        manager.getTransaction().commit();
        manager.close();
        factory.close(); 
     }

    public void updateTelaFornecedoresDIR(int codUpdate, String razao, String morada, String municipio, 
            String bairro, String telemovel, String telemovel2, String email, String dataAltera) {
        manager.getTransaction().begin();
        Fornecedores f = manager.getReference(Fornecedores.class, codUpdate);
        f.setRazaoSocial(razao);
        f.setBairro(bairro);
        f.setDataaltera(dataAltera);
        f.setEmail(email);
        f.setMorada(morada);
        f.setMunicipio(municipio);
        f.setTelemovel1(telemovel);
        f.setTelemovel2(telemovel2);
        f.setUseraltera(userUtilizando);
        manager.merge(f);
        manager.getTransaction().commit();
        manager.close();
        factory.close(); 
    }

    public void updateTelaAlteraSetoresADMIN(int codUpdate, String municipio, String sigla, String descricao, String dataAltera) {
        manager.getTransaction().begin();
        Setores s = manager.getReference(Setores.class, codUpdate);
        s.setMunicipio(municipio);
        s.setSigla(sigla);
        s.setDescricao(descricao);
        s.setDataaltera(dataAltera);
        s.setUseraltera(userUtilizando);
        manager.merge(s);
        manager.getTransaction().commit();
        manager.close();
        factory.close(); 
    }

    public void updateTelaAlteraSetoresDIR(int codUpdate, String municipio, String sigla, String descricao, String dataAltera) {
        manager.getTransaction().begin();
        Setores s = manager.getReference(Setores.class, codUpdate);
        s.setMunicipio(municipio);
        s.setSigla(sigla);
        s.setDescricao(descricao);
        s.setDataaltera(dataAltera);
        s.setUseraltera(userUtilizando);
        manager.merge(s);
        manager.getTransaction().commit();
        manager.close();
        factory.close(); 
    }

    public void updateServicosDIR(int codUpdate, String undMensal, int qtde, String descricao, String dataAltera) {
        manager.getTransaction().begin();
        Servicos s = manager.getReference(Servicos.class, codUpdate);
        s.setUnd(undMensal);
        s.setQtde(qtde);
        s.setDescricao(descricao);
        s.setDataaltera(dataAltera);
        s.setUseraltera(userUtilizando);
        manager.merge(s);
        manager.getTransaction().commit();
        manager.close();
        factory.close(); 
    }

    public void updateTelaAlteraSubServicosADMIN(int codUpdate, String descricaoSubs, String dataAltera) {
        manager.getTransaction().begin();
        Subservicos s = manager.getReference(Subservicos.class, codUpdate);
        s.setDataaltera(dataAltera);
        s.setDescricao(descricaoSubs);
        s.setUseraltera(userUtilizando);
        manager.merge(s);
        manager.getTransaction().commit();
        manager.close();
        factory.close(); 
    }

    public void updateTelaAlteraSubServicosDIR(int codUpdate, String descricaoSubs, String dataAltera) {
        manager.getTransaction().begin();
        Subservicos s = manager.getReference(Subservicos.class, codUpdate);
        s.setDataaltera(dataAltera);
        s.setDescricao(descricaoSubs);
        s.setUseraltera(userUtilizando);
        manager.merge(s);
        manager.getTransaction().commit();
        manager.close();
        factory.close(); 
    }

    public void updateTelaAlteraFuncionariosADMIN(int codUpdate, String dataAltera, String nome, 
            String morada, String telemovel, String contribuinte, String t, String n, String altera, 
            String funcao, String usuario, String senha, int status) {
        manager.getTransaction().begin();
        Funcionarios f = manager.getReference(Funcionarios.class, codUpdate);
        f.setAlterasenha(alteraSenha);
        f.setContribuinte(contribuinte);
        f.setDataaltera(dataAltera);
        f.setFuncao(funcao);
        f.setMorada(morada);
        f.setNivel(n);
        f.setNome(nome);
        f.setSenha(senha);
        f.setStatusfunc(status);
        f.setTelemovel(telemovel);
        f.setTurno(usuario);
        f.setUseraltera(userUtilizando);
        f.setUsuario(usuario);
        manager.merge(f);
        manager.getTransaction().commit();
        manager.close();
        factory.close(); 
    }

    public void updateTelaAlteraFuncionariosDIR(int codUpdate, String dataAltera, String nome, String morada, String telemovel, String contribuinte, String t, String n, String funcao, int status) {
        manager.getTransaction().begin();
        Funcionarios f = manager.getReference(Funcionarios.class, codUpdate);
        f.setAlterasenha(alteraSenha);
        f.setContribuinte(contribuinte);
        f.setDataaltera(dataAltera);
        f.setFuncao(funcao);
        f.setMorada(morada);
        f.setNivel(n);
        f.setNome(nome);
        f.setStatusfunc(status);
        f.setTelemovel(telemovel);
        f.setUseraltera(userUtilizando);
        manager.merge(f);
        manager.getTransaction().commit();
        manager.close();
        factory.close(); 
    }

   
}

