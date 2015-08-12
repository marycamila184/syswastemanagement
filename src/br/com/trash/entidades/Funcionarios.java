/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.trash.entidades;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author MARY
 */
@Entity
@Table(name = "funcionarios", catalog = "sgbdtrash", schema = "")
@NamedQueries({
    @NamedQuery(name = "Funcionarios.findAll", query = "SELECT f FROM Funcionarios f"),
    @NamedQuery(name = "Funcionarios.findByIdfunc", query = "SELECT f FROM Funcionarios f WHERE f.idfunc = :idfunc"),
    @NamedQuery(name = "Funcionarios.findByContribuinte", query = "SELECT f FROM Funcionarios f WHERE f.contribuinte = :contribuinte"),
    @NamedQuery(name = "Funcionarios.findByDataaltera", query = "SELECT f FROM Funcionarios f WHERE f.dataaltera = :dataaltera"),
    @NamedQuery(name = "Funcionarios.findByDatainclusao", query = "SELECT f FROM Funcionarios f WHERE f.datainclusao = :datainclusao"),
    @NamedQuery(name = "Funcionarios.findByFuncao", query = "SELECT f FROM Funcionarios f WHERE f.funcao = :funcao"),
    @NamedQuery(name = "Funcionarios.findByMorada", query = "SELECT f FROM Funcionarios f WHERE f.morada = :morada"),
    @NamedQuery(name = "Funcionarios.findByNome", query = "SELECT f FROM Funcionarios f WHERE f.nome = :nome"),
    @NamedQuery(name = "Funcionarios.findByStatusfunc", query = "SELECT f FROM Funcionarios f WHERE f.statusfunc = :statusfunc"),
    @NamedQuery(name = "Funcionarios.findByTelemovel", query = "SELECT f FROM Funcionarios f WHERE f.telemovel = :telemovel"),
    @NamedQuery(name = "Funcionarios.findByTurno", query = "SELECT f FROM Funcionarios f WHERE f.turno = :turno"),
    @NamedQuery(name = "Funcionarios.findByUseraltera", query = "SELECT f FROM Funcionarios f WHERE f.useraltera = :useraltera"),
    @NamedQuery(name = "Funcionarios.findByUserinclusao", query = "SELECT f FROM Funcionarios f WHERE f.userinclusao = :userinclusao"),
    @NamedQuery(name = "Funcionarios.findByUsuario", query = "SELECT f FROM Funcionarios f WHERE f.usuario = :usuario"),
    @NamedQuery(name = "Funcionarios.findBySenha", query = "SELECT f FROM Funcionarios f WHERE f.senha = :senha"),
    @NamedQuery(name = "Funcionarios.findByAcesso", query = "SELECT f FROM Funcionarios f WHERE f.usuario = :usuario AND f.senha = :senha"),//
    @NamedQuery(name = "Funcionarios.findByAlterasenha", query = "SELECT f FROM Funcionarios f WHERE f.alterasenha = :alterasenha"),
    @NamedQuery(name = "Funcionarios.findByNivel", query = "SELECT f FROM Funcionarios f WHERE f.nivel = :nivel")})

public class Funcionarios implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Basic(optional = false)
    @Column(name = "idfunc")
    private Integer idfunc;
    @Column(name = "contribuinte")
    private String contribuinte;
    @Column(name = "dataaltera")
    private String dataaltera;
    @Column(name = "datainclusao")
    private String datainclusao;
    @Column(name = "funcao")
    private String funcao;
    @Column(name = "morada")
    private String morada;
    @Column(name = "nome")
    private String nome;
    @Column(name = "statusfunc")
    private int statusfunc;
    @Column(name = "telemovel")
    private String telemovel;
    @Column(name = "turno")
    private String turno;
    @Column(name = "useraltera")
    private String useraltera;
    @Column(name = "userinclusao")
    private String userinclusao;
    @Basic(optional = false)
    @Column(name = "usuario")
    private String usuario;
    @Basic(optional = false)
    @Column(name = "senha")
    private String senha;
    @Basic(optional = false)
    @Column(name = "alterasenha")
    private String alterasenha;
    @Basic(optional = false)
    @Column(name = "nivel")
    private String nivel;

    public Funcionarios() {
    }

    public Funcionarios(Integer idfunc) {
        this.idfunc = idfunc;
    }

    public Funcionarios(Integer idfunc, String usuario, String senha, String alterasenha, String nivel) {
        this.idfunc = idfunc;
        this.usuario = usuario;
        this.senha = senha;
        this.alterasenha = alterasenha;
        this.nivel = nivel;
    }

    public Integer getIdfunc() {
        return idfunc;
    }

    public void setIdfunc(Integer idfunc) {
        Integer oldIdfunc = this.idfunc;
        this.idfunc = idfunc;
        changeSupport.firePropertyChange("idfunc", oldIdfunc, idfunc);
    }

    public String getContribuinte() {
        return contribuinte;
    }

    public void setContribuinte(String contribuinte) {
        String oldContribuinte = this.contribuinte;
        this.contribuinte = contribuinte;
        changeSupport.firePropertyChange("contribuinte", oldContribuinte, contribuinte);
    }

    public String getDataaltera() {
        return dataaltera;
    }

    public void setDataaltera(String dataaltera) {
        String oldDataaltera = this.dataaltera;
        this.dataaltera = dataaltera;
        changeSupport.firePropertyChange("dataaltera", oldDataaltera, dataaltera);
    }

    public String getDatainclusao() {
        return datainclusao;
    }

    public void setDatainclusao(String datainclusao) {
        String oldDatainclusao = this.datainclusao;
        this.datainclusao = datainclusao;
        changeSupport.firePropertyChange("datainclusao", oldDatainclusao, datainclusao);
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        String oldFuncao = this.funcao;
        this.funcao = funcao;
        changeSupport.firePropertyChange("funcao", oldFuncao, funcao);
    }

    public String getMorada() {
        return morada;
    }

    public void setMorada(String morada) {
        String oldMorada = this.morada;
        this.morada = morada;
        changeSupport.firePropertyChange("morada", oldMorada, morada);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        String oldNome = this.nome;
        this.nome = nome;
        changeSupport.firePropertyChange("nome", oldNome, nome);
    }

    public int getStatusfunc() {
        return statusfunc;
    }

    public void setStatusfunc(int statusfunc) {
        int oldStatusfunc = this.statusfunc;
        this.statusfunc = statusfunc;
        changeSupport.firePropertyChange("statusfunc", oldStatusfunc, statusfunc);
    }

    public String getTelemovel() {
        return telemovel;
    }

    public void setTelemovel(String telemovel) {
        String oldTelemovel = this.telemovel;
        this.telemovel = telemovel;
        changeSupport.firePropertyChange("telemovel", oldTelemovel, telemovel);
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        String oldTurno = this.turno;
        this.turno = turno;
        changeSupport.firePropertyChange("turno", oldTurno, turno);
    }

    public String getUseraltera() {
        return useraltera;
    }

    public void setUseraltera(String useraltera) {
        String oldUseraltera = this.useraltera;
        this.useraltera = useraltera;
        changeSupport.firePropertyChange("useraltera", oldUseraltera, useraltera);
    }

    public String getUserinclusao() {
        return userinclusao;
    }

    public void setUserinclusao(String userinclusao) {
        String oldUserinclusao = this.userinclusao;
        this.userinclusao = userinclusao;
        changeSupport.firePropertyChange("userinclusao", oldUserinclusao, userinclusao);
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        String oldUsuario = this.usuario;
        this.usuario = usuario;
        changeSupport.firePropertyChange("usuario", oldUsuario, usuario);
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        String oldSenha = this.senha;
        this.senha = senha;
        changeSupport.firePropertyChange("senha", oldSenha, senha);
    }

    public String getAlterasenha() {
        return alterasenha;
    }

    public void setAlterasenha(String alterasenha) {
        String oldAlterasenha = this.alterasenha;
        this.alterasenha = alterasenha;
        changeSupport.firePropertyChange("alterasenha", oldAlterasenha, alterasenha);
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        String oldNivel = this.nivel;
        this.nivel = nivel;
        changeSupport.firePropertyChange("nivel", oldNivel, nivel);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idfunc != null ? idfunc.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Funcionarios)) {
            return false;
        }
        Funcionarios other = (Funcionarios) object;
        if ((this.idfunc == null && other.idfunc != null) || (this.idfunc != null && !this.idfunc.equals(other.idfunc))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.trash.telas.sistemas.Funcionarios[ idfunc=" + idfunc + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
