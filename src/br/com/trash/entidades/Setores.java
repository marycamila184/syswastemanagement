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
@Table(name = "setores", catalog = "sgbdtrash", schema = "")
@NamedQueries({
    @NamedQuery(name = "Setores.findAll", query = "SELECT s FROM Setores s"),
    @NamedQuery(name = "Setores.findByCodsetores", query = "SELECT s FROM Setores s WHERE s.codsetores = :codsetores"),
    @NamedQuery(name = "Setores.findByMunicipio", query = "SELECT s FROM Setores s WHERE s.municipio = :municipio"),
    @NamedQuery(name = "Setores.findBySigla", query = "SELECT s FROM Setores s WHERE s.sigla = :sigla"),
    @NamedQuery(name = "Setores.findByDescricao", query = "SELECT s FROM Setores s WHERE s.descricao = :descricao"),
    @NamedQuery(name = "Setores.findByUserinclusao", query = "SELECT s FROM Setores s WHERE s.userinclusao = :userinclusao"),
    @NamedQuery(name = "Setores.findByDatainclusao", query = "SELECT s FROM Setores s WHERE s.datainclusao = :datainclusao"),
    @NamedQuery(name = "Setores.findByUseraltera", query = "SELECT s FROM Setores s WHERE s.useraltera = :useraltera"),
    @NamedQuery(name = "Setores.findByDataaltera", query = "SELECT s FROM Setores s WHERE s.dataaltera = :dataaltera")})
public class Setores implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Basic(optional = false)
    @Column(name = "codsetores")
    private Integer codsetores;
    @Basic(optional = false)
    @Column(name = "municipio")
    private String municipio;
    @Basic(optional = false)
    @Column(name = "sigla")
    private String sigla;
    @Basic(optional = false)
    @Column(name = "descricao")
    private String descricao;
    @Basic(optional = false)
    @Column(name = "userinclusao")
    private String userinclusao;
    @Basic(optional = false)
    @Column(name = "datainclusao")
    private String datainclusao;
    @Column(name = "useraltera")
    private String useraltera;
    @Column(name = "dataaltera")
    private String dataaltera;

    public Setores() {
    }

    public Setores(Integer codsetores) {
        this.codsetores = codsetores;
    }

    public Setores(Integer codsetores, String municipio, String sigla, String descricao, String userinclusao, String datainclusao) {
        this.codsetores = codsetores;
        this.municipio = municipio;
        this.sigla = sigla;
        this.descricao = descricao;
        this.userinclusao = userinclusao;
        this.datainclusao = datainclusao;
    }

    public Integer getCodsetores() {
        return codsetores;
    }

    public void setCodsetores(Integer codsetores) {
        Integer oldCodsetores = this.codsetores;
        this.codsetores = codsetores;
        changeSupport.firePropertyChange("codsetores", oldCodsetores, codsetores);
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        String oldMunicipio = this.municipio;
        this.municipio = municipio;
        changeSupport.firePropertyChange("municipio", oldMunicipio, municipio);
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        String oldSigla = this.sigla;
        this.sigla = sigla;
        changeSupport.firePropertyChange("sigla", oldSigla, sigla);
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        String oldDescricao = this.descricao;
        this.descricao = descricao;
        changeSupport.firePropertyChange("descricao", oldDescricao, descricao);
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
        hash += (codsetores != null ? codsetores.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Setores)) {
            return false;
        }
        Setores other = (Setores) object;
        if ((this.codsetores == null && other.codsetores != null) || (this.codsetores != null && !this.codsetores.equals(other.codsetores))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.trash.telas.sistemas.Setores[ codsetores=" + codsetores + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
