/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.trash.controle;

/**
 *
 * @author MARY
 */
public class loginBean {
    
    private String usuario;
    private String senha;
    private String alteraSenha;
    private String nivel;
    private String novaSenha;
    private int idfunc;
    private String usuarioUtilizando;
    private String senhaUtilizando;   
   
    public int getIdfunc() {
        return idfunc;
    }

    public void setIdfunc(int idfunc) {
        this.idfunc = idfunc;
    }
    
    
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getAlteraSenha() {
        return alteraSenha;
    }

    public void setAlteraSenha(String alteraSenha) {
        this.alteraSenha = alteraSenha;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getUsuarioUtilizando() {
        return usuarioUtilizando;
    }

    public void setUsuarioUtilizando(String usuarioUtilizando) {
        this.usuarioUtilizando = usuarioUtilizando;
    }

    public String getSenhaUtilizando() {
        return senhaUtilizando;
    }

    public void setSenhaUtilizando(String senhaUtilizando) {
        this.senhaUtilizando = senhaUtilizando;
    }

    public String getNovaSenha() {
        return novaSenha;
    }

    public void setNovaSenha(String novaSenha) {
        this.novaSenha = novaSenha;
    }
    
    
}
