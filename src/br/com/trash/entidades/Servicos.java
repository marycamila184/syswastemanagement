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
@Table(name = "servicos", catalog = "sgbdtrash", schema = "")
@NamedQueries({
    @NamedQuery(name = "Servicos.findAll", query = "SELECT s FROM Servicos s"),
    @NamedQuery(name = "Servicos.findByCodservicos", query = "SELECT s FROM Servicos s WHERE s.codservicos = :codservicos"),
    @NamedQuery(name = "Servicos.findByUnd", query = "SELECT s FROM Servicos s WHERE s.und = :und"),
    @NamedQuery(name = "Servicos.findByQtde", query = "SELECT s FROM Servicos s WHERE s.qtde = :qtde"),
    @NamedQuery(name = "Servicos.findByDescricao", query = "SELECT s FROM Servicos s WHERE s.descricao = :descricao"),
    @NamedQuery(name = "Servicos.findByUserinclusao", query = "SELECT s FROM Servicos s WHERE s.userinclusao = :userinclusao"),
    @NamedQuery(name = "Servicos.findByDatainclusao", query = "SELECT s FROM Servicos s WHERE s.datainclusao = :datainclusao"),
    @NamedQuery(name = "Servicos.findByUseraltera", query = "SELECT s FROM Servicos s WHERE s.useraltera = :useraltera"),
    @NamedQuery(name = "Servicos.findByDataaltera", query = "SELECT s FROM Servicos s WHERE s.dataaltera = :dataaltera")})
public class Servicos implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Basic(optional = false)
    @Column(name = "codservicos")
    private Integer codservicos;
    @Basic(optional = false)
    @Column(name = "und")
    private String und;
    @Basic(optional = false)
    @Column(name = "qtde")
    private int qtde;
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

    public Servicos() {
    }

    public Servicos(Integer codservicos) {
        this.codservicos = codservicos;
    }

    public Servicos(Integer codservicos, String und, int qtde, String descricao, String userinclusao, String datainclusao) {
        this.codservicos = codservicos;
        this.und = und;
        this.qtde = qtde;
        this.descricao = descricao;
        this.userinclusao = userinclusao;
        this.datainclusao = datainclusao;
    }

    public Integer getCodservicos() {
        return codservicos;
    }

    public void setCodservicos(Integer codservicos) {
        Integer oldCodservicos = this.codservicos;
        this.codservicos = codservicos;
        changeSupport.firePropertyChange("codservicos", oldCodservicos, codservicos);
    }

    public String getUnd() {
        return und;
    }

    public void setUnd(String und) {
        String oldUnd = this.und;
        this.und = und;
        changeSupport.firePropertyChange("und", oldUnd, und);
    }

    public int getQtde() {
        return qtde;
    }

    public void setQtde(int qtde) {
        int oldQtde = this.qtde;
        this.qtde = qtde;
        changeSupport.firePropertyChange("qtde", oldQtde, qtde);
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
        hash += (codservicos != null ? codservicos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Servicos)) {
            return false;
        }
        Servicos other = (Servicos) object;
        if ((this.codservicos == null && other.codservicos != null) || (this.codservicos != null && !this.codservicos.equals(other.codservicos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "" + codservicos ;
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
