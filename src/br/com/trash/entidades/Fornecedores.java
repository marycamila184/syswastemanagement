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
@Table(name = "fornecedores", catalog = "sgbdtrash", schema = "")
@NamedQueries({
    @NamedQuery(name = "Fornecedores.findAll", query = "SELECT f FROM Fornecedores f"),
    @NamedQuery(name = "Fornecedores.findByIdfornecedores", query = "SELECT f FROM Fornecedores f WHERE f.idfornecedores = :idfornecedores"),
    @NamedQuery(name = "Fornecedores.findByRazaoSocial", query = "SELECT f FROM Fornecedores f WHERE f.razaoSocial = :razaoSocial"),
    @NamedQuery(name = "Fornecedores.findByMorada", query = "SELECT f FROM Fornecedores f WHERE f.morada = :morada"),
    @NamedQuery(name = "Fornecedores.findByMunicipio", query = "SELECT f FROM Fornecedores f WHERE f.municipio = :municipio"),
    @NamedQuery(name = "Fornecedores.findByBairro", query = "SELECT f FROM Fornecedores f WHERE f.bairro = :bairro"),
    @NamedQuery(name = "Fornecedores.findByTelemovel1", query = "SELECT f FROM Fornecedores f WHERE f.telemovel1 = :telemovel1"),
    @NamedQuery(name = "Fornecedores.findByTelemovel2", query = "SELECT f FROM Fornecedores f WHERE f.telemovel2 = :telemovel2"),
    @NamedQuery(name = "Fornecedores.findByValidadecontrato", query = "SELECT f FROM Fornecedores f WHERE f.validadecontrato = :validadecontrato"),
    @NamedQuery(name = "Fornecedores.findByNif", query = "SELECT f FROM Fornecedores f WHERE f.nif = :nif"),
    @NamedQuery(name = "Fornecedores.findByEmail", query = "SELECT f FROM Fornecedores f WHERE f.email = :email"),
    @NamedQuery(name = "Fornecedores.findByUserinclusao", query = "SELECT f FROM Fornecedores f WHERE f.userinclusao = :userinclusao"),
    @NamedQuery(name = "Fornecedores.findByDatainclusao", query = "SELECT f FROM Fornecedores f WHERE f.datainclusao = :datainclusao"),
    @NamedQuery(name = "Fornecedores.findByUseraltera", query = "SELECT f FROM Fornecedores f WHERE f.useraltera = :useraltera"),
    @NamedQuery(name = "Fornecedores.findByDataaltera", query = "SELECT f FROM Fornecedores f WHERE f.dataaltera = :dataaltera")})
public class Fornecedores implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Basic(optional = false)
    @Column(name = "idfornecedores")
    private Integer idfornecedores;
    @Basic(optional = false)
    @Column(name = "razao_social")
    private String razaoSocial;
    @Basic(optional = false)
    @Column(name = "morada")
    private String morada;
    @Basic(optional = false)
    @Column(name = "municipio")
    private String municipio;
    @Basic(optional = false)
    @Column(name = "bairro")
    private String bairro;
    @Basic(optional = false)
    @Column(name = "telemovel1")
    private String telemovel1;
    @Column(name = "telemovel2")
    private String telemovel2;
    @Basic(optional = false)
    @Column(name = "validadecontrato")
    private String validadecontrato;
    @Basic(optional = false)
    @Column(name = "NIF")
    private String nif;
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @Column(name = "userinclusao")
    private String userinclusao;
    @Basic(optional = false)
    @Column(name = "datainclusao")
    private String datainclusao;
    @Basic(optional = false)
    @Column(name = "useraltera")
    private String useraltera;
    @Basic(optional = false)
    @Column(name = "dataaltera")
    private String dataaltera;

    public Fornecedores() {
    }

    public Fornecedores(Integer idfornecedores) {
        this.idfornecedores = idfornecedores;
    }

    public Fornecedores(Integer idfornecedores, String razaoSocial, String morada, String municipio, String bairro, String telemovel1, String validadecontrato, String nif, String userinclusao, String datainclusao, String useraltera, String dataaltera) {
        this.idfornecedores = idfornecedores;
        this.razaoSocial = razaoSocial;
        this.morada = morada;
        this.municipio = municipio;
        this.bairro = bairro;
        this.telemovel1 = telemovel1;
        this.validadecontrato = validadecontrato;
        this.nif = nif;
        this.userinclusao = userinclusao;
        this.datainclusao = datainclusao;
        this.useraltera = useraltera;
        this.dataaltera = dataaltera;
    }

    public Integer getIdfornecedores() {
        return idfornecedores;
    }

    public void setIdfornecedores(Integer idfornecedores) {
        Integer oldIdfornecedores = this.idfornecedores;
        this.idfornecedores = idfornecedores;
        changeSupport.firePropertyChange("idfornecedores", oldIdfornecedores, idfornecedores);
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        String oldRazaoSocial = this.razaoSocial;
        this.razaoSocial = razaoSocial;
        changeSupport.firePropertyChange("razaoSocial", oldRazaoSocial, razaoSocial);
    }

    public String getMorada() {
        return morada;
    }

    public void setMorada(String morada) {
        String oldMorada = this.morada;
        this.morada = morada;
        changeSupport.firePropertyChange("morada", oldMorada, morada);
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        String oldMunicipio = this.municipio;
        this.municipio = municipio;
        changeSupport.firePropertyChange("municipio", oldMunicipio, municipio);
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        String oldBairro = this.bairro;
        this.bairro = bairro;
        changeSupport.firePropertyChange("bairro", oldBairro, bairro);
    }

    public String getTelemovel1() {
        return telemovel1;
    }

    public void setTelemovel1(String telemovel1) {
        String oldTelemovel1 = this.telemovel1;
        this.telemovel1 = telemovel1;
        changeSupport.firePropertyChange("telemovel1", oldTelemovel1, telemovel1);
    }

    public String getTelemovel2() {
        return telemovel2;
    }

    public void setTelemovel2(String telemovel2) {
        String oldTelemovel2 = this.telemovel2;
        this.telemovel2 = telemovel2;
        changeSupport.firePropertyChange("telemovel2", oldTelemovel2, telemovel2);
    }

    public String getValidadecontrato() {
        return validadecontrato;
    }

    public void setValidadecontrato(String validadecontrato) {
        String oldValidadecontrato = this.validadecontrato;
        this.validadecontrato = validadecontrato;
        changeSupport.firePropertyChange("validadecontrato", oldValidadecontrato, validadecontrato);
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        String oldNif = this.nif;
        this.nif = nif;
        changeSupport.firePropertyChange("nif", oldNif, nif);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        String oldEmail = this.email;
        this.email = email;
        changeSupport.firePropertyChange("email", oldEmail, email);
    }

    public String getUserinclusao() {
        return userinclusao;
    }

    public void setUserinclusao(String userinclusao) {
        String oldUserinclusao = this.userinclusao;
        this.userinclusao = userinclusao;
        changeSupport.firePropertyChange("userinclusao", oldUserinclusao, userinclusao);
    }

    public String getDatainclusao() {
        return datainclusao;
    }

    public void setDatainclusao(String datainclusao) {
        String oldDatainclusao = this.datainclusao;
        this.datainclusao = datainclusao;
        changeSupport.firePropertyChange("datainclusao", oldDatainclusao, datainclusao);
    }

    public String getUseraltera() {
        return useraltera;
    }

    public void setUseraltera(String useraltera) {
        String oldUseraltera = this.useraltera;
        this.useraltera = useraltera;
        changeSupport.firePropertyChange("useraltera", oldUseraltera, useraltera);
    }

    public String getDataaltera() {
        return dataaltera;
    }

    public void setDataaltera(String dataaltera) {
        String oldDataaltera = this.dataaltera;
        this.dataaltera = dataaltera;
        changeSupport.firePropertyChange("dataaltera", oldDataaltera, dataaltera);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idfornecedores != null ? idfornecedores.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Fornecedores)) {
            return false;
        }
        Fornecedores other = (Fornecedores) object;
        if ((this.idfornecedores == null && other.idfornecedores != null) || (this.idfornecedores != null && !this.idfornecedores.equals(other.idfornecedores))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.trash.telas.sistemas.Fornecedores[ idfornecedores=" + idfornecedores + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
