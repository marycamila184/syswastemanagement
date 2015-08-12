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
@Table(name = "subservicos", catalog = "sgbdtrash", schema = "")
@NamedQueries({
    @NamedQuery(name = "Subservicos.findAll", query = "SELECT s FROM Subservicos s"),
    @NamedQuery(name = "Subservicos.findByServicosCodservicos", query = "SELECT s FROM Subservicos s WHERE s.servicosCodservicos = :servicosCodservicos"),
    @NamedQuery(name = "Subservicos.findByCodsubservico", query = "SELECT s FROM Subservicos s WHERE s.codsubservico = :codsubservico"),
    @NamedQuery(name = "Subservicos.findByDescricao", query = "SELECT s FROM Subservicos s WHERE s.descricao = :descricao"),
    @NamedQuery(name = "Subservicos.findByUserinclusao", query = "SELECT s FROM Subservicos s WHERE s.userinclusao = :userinclusao"),
    @NamedQuery(name = "Subservicos.findByDatainclusao", query = "SELECT s FROM Subservicos s WHERE s.datainclusao = :datainclusao"),
    @NamedQuery(name = "Subservicos.findByUseraltera", query = "SELECT s FROM Subservicos s WHERE s.useraltera = :useraltera"),
    @NamedQuery(name = "Subservicos.findByDataaltera", query = "SELECT s FROM Subservicos s WHERE s.dataaltera = :dataaltera")})
public class Subservicos implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "servicos_codservicos")
    private int servicosCodservicos;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Basic(optional = false)
    @Column(name = "codsubservico")
    private Integer codsubservico;
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

    public Subservicos() {
    }

    public Subservicos(Integer codsubservico) {
        this.codsubservico = codsubservico;
    }

    public Subservicos(Integer codsubservico, int servicosCodservicos, String descricao, String userinclusao, String datainclusao) {
        this.codsubservico = codsubservico;
        this.servicosCodservicos = servicosCodservicos;
        this.descricao = descricao;
        this.userinclusao = userinclusao;
        this.datainclusao = datainclusao;
    }

    public int getServicosCodservicos() {
        return servicosCodservicos;
    }

    public void setServicosCodservicos(int servicosCodservicos) {
        int oldServicosCodservicos = this.servicosCodservicos;
        this.servicosCodservicos = servicosCodservicos;
        changeSupport.firePropertyChange("servicosCodservicos", oldServicosCodservicos, servicosCodservicos);
    }

    public Integer getCodsubservico() {
        return codsubservico;
    }

    public void setCodsubservico(Integer codsubservico) {
        Integer oldCodsubservico = this.codsubservico;
        this.codsubservico = codsubservico;
        changeSupport.firePropertyChange("codsubservico", oldCodsubservico, codsubservico);
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
        hash += (codsubservico != null ? codsubservico.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Subservicos)) {
            return false;
        }
        Subservicos other = (Subservicos) object;
        if ((this.codsubservico == null && other.codsubservico != null) || (this.codsubservico != null && !this.codsubservico.equals(other.codsubservico))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.trash.telas.sistemas.Subservicos[ codsubservico=" + codsubservico + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
