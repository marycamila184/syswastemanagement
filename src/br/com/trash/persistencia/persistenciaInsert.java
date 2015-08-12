package br.com.trash.persistencia;

import br.com.trash.entidades.Fornecedores;
import br.com.trash.entidades.Funcionarios;
import br.com.trash.entidades.Servicos;
import br.com.trash.entidades.Setores;
import br.com.trash.entidades.Subservicos;

/**
 *
 * @author MARY
 */
public class persistenciaInsert extends persistenciaSelect{
 
    public void insertFornecedores(String razao, String morada, String municipio, String bairro, 
    String telemovel, String telemovel2, String dataContrato, String nif, String email, String dataInclusao) {
    manager.getTransaction().begin();
   
    Fornecedores f = new Fornecedores();
    
    f.setRazaoSocial(razao);
    f.setMorada(morada);
    f.setMunicipio(municipio);
    f.setBairro(bairro);
    f.setTelemovel1(telemovel);
    f.setTelemovel2(telemovel2);
    f.setValidadecontrato(dataContrato);
    f.setNif(nif);
    f.setEmail(email);
    f.setUserinclusao(userUtilizando);
    f.setDatainclusao(dataInclusao);
    f.setUseraltera("");
    f.setDataaltera("");
    manager.persist(f);
    manager.getTransaction().commit();
    manager.close();
    factory.close(); 
    }

    public void insertFuncionarios(String nome, String morada, String telemovel, String contribuinte, 
    String turno, String funcao, String data, String user, String senha) {
    manager.getTransaction().begin();
   
    Funcionarios f = new Funcionarios();
    
    f.setNome(nome);
    f.setMorada(morada);
    f.setTelemovel(telemovel);
    f.setContribuinte(contribuinte);
    f.setTurno(turno);
    f.setFuncao(funcao);
    f.setStatusfunc(1);
    f.setUserinclusao(userUtilizando);
    f.setDatainclusao(data);
    f.setUseraltera("");
    f.setDataaltera("");
    f.setUsuario(user);
    f.setSenha(senha);
    f.setNivel("comum");
    f.setAlterasenha("s");
    
    manager.persist(f);
    manager.close();
    factory.close();
       
    }

    public void insertServicos(String undMensal, int qtde, String descricao, String dataInclusao) {
    manager.getTransaction().begin();
   
    Servicos s = new Servicos();
       
    s.setUnd(undMensal);
    s.setQtde(qtde);
    s.setDescricao(descricao);
    s.setUserinclusao(userUtilizando);
    s.setDatainclusao(dataInclusao);
    s.setUseraltera("");
    s.setDataaltera("");
    
    manager.persist(s);
    manager.getTransaction().commit();
    manager.close();
    factory.close();
    }

    public void insertSetores(String municipio, String sigla, String descricao, String dataInclusao) {
        manager.getTransaction().begin();
   
        Setores se = new Setores();
        
        se.setMunicipio(municipio);
        se.setSigla(sigla);
        se.setDescricao(descricao);
        se.setUserinclusao(userUtilizando);
        se.setDatainclusao(dataInclusao);
        se.setUseraltera("");
        se.setDataaltera("");
        
        manager.persist(se);
        manager.getTransaction().commit();
        manager.close();
        factory.close(); 
    }

    public void insertSubServico(int codServico, String descricaoSubservico, String dataInclusao) {
        manager.getTransaction().begin();
   
        Subservicos s = new Subservicos();
        
        s.setServicosCodservicos(codServico);
        s.setDescricao(descricaoSubservico);
        s.setUserinclusao(userUtilizando);
        s.setDatainclusao(dataInclusao);
        s.setUseraltera("");
        s.setDataaltera("");
        
        manager.persist(s);
        manager.getTransaction().commit();
        factory.close(); 
    }
    
    
}
    

