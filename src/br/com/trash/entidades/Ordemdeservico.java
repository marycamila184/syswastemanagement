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
@Table(name = "ordemdeservico", catalog = "sgbdtrash", schema = "")
@NamedQueries({
    @NamedQuery(name = "Ordemdeservico.findAll", query = "SELECT o FROM Ordemdeservico o"),
    @NamedQuery(name = "Ordemdeservico.findByCodos", query = "SELECT o FROM Ordemdeservico o WHERE o.codos = :codos"),
    @NamedQuery(name = "Ordemdeservico.findByCodfornecedor", query = "SELECT o FROM Ordemdeservico o WHERE o.codfornecedor = :codfornecedor"),
    @NamedQuery(name = "Ordemdeservico.findByUserInclusao", query = "SELECT o FROM Ordemdeservico o WHERE o.userInclusao = :userInclusao"),
    @NamedQuery(name = "Ordemdeservico.findByUserAltera", query = "SELECT o FROM Ordemdeservico o WHERE o.userAltera = :userAltera"),
    @NamedQuery(name = "Ordemdeservico.findByDataInclusao", query = "SELECT o FROM Ordemdeservico o WHERE o.dataInclusao = :dataInclusao"),
    @NamedQuery(name = "Ordemdeservico.findByDataAltera", query = "SELECT o FROM Ordemdeservico o WHERE o.dataAltera = :dataAltera"),
    @NamedQuery(name = "Ordemdeservico.findByCodsetor", query = "SELECT o FROM Ordemdeservico o WHERE o.codsetor = :codsetor"),
    @NamedQuery(name = "Ordemdeservico.findByDataOS", query = "SELECT o FROM Ordemdeservico o WHERE o.dataOS = :dataOS"),
    @NamedQuery(name = "Ordemdeservico.findByCodfuncionarioOS", query = "SELECT o FROM Ordemdeservico o WHERE o.codfuncionarioOS = :codfuncionarioOS"),
    @NamedQuery(name = "Ordemdeservico.findByCodservico", query = "SELECT o FROM Ordemdeservico o WHERE o.codservico = :codservico")})
public class Ordemdeservico implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "codos")
    private Integer codos;
    @Basic(optional = false)
    @Column(name = "codfornecedor")
    private int codfornecedor;
    @Column(name = "userInclusao")
    private String userInclusao;
    @Column(name = "userAltera")
    private String userAltera;
    @Column(name = "dataInclusao")
    private String dataInclusao;
    @Column(name = "dataAltera")
    private String dataAltera;
    @Column(name = "codsetor")
    private Integer codsetor;
    @Column(name = "dataOS")
    private String dataOS;
    @Column(name = "codfuncionarioOS")
    private Integer codfuncionarioOS;
    @Basic(optional = false)
    @Column(name = "codservico")
    private int codservico;

    public Ordemdeservico() {
    }

    public Ordemdeservico(Integer codos) {
        this.codos = codos;
    }

    public Ordemdeservico(Integer codos, int codfornecedor, int codservico) {
        this.codos = codos;
        this.codfornecedor = codfornecedor;
        this.codservico = codservico;
    }

    public Integer getCodos() {
        return codos;
    }

    public void setCodos(Integer codos) {
        Integer oldCodos = this.codos;
        this.codos = codos;
        changeSupport.firePropertyChange("codos", oldCodos, codos);
    }

    public int getCodfornecedor() {
        return codfornecedor;
    }

    public void setCodfornecedor(int codfornecedor) {
        int oldCodfornecedor = this.codfornecedor;
        this.codfornecedor = codfornecedor;
        changeSupport.firePropertyChange("codfornecedor", oldCodfornecedor, codfornecedor);
    }

    public String getUserInclusao() {
        return userInclusao;
    }

    public void setUserInclusao(String userInclusao) {
        String oldUserInclusao = this.userInclusao;
        this.userInclusao = userInclusao;
        changeSupport.firePropertyChange("userInclusao", oldUserInclusao, userInclusao);
    }

    public String getUserAltera() {
        return userAltera;
    }

    public void setUserAltera(String userAltera) {
        String oldUserAltera = this.userAltera;
        this.userAltera = userAltera;
        changeSupport.firePropertyChange("userAltera", oldUserAltera, userAltera);
    }

    public String getDataInclusao() {
        return dataInclusao;
    }

    public void setDataInclusao(String dataInclusao) {
        String oldDataInclusao = this.dataInclusao;
        this.dataInclusao = dataInclusao;
        changeSupport.firePropertyChange("dataInclusao", oldDataInclusao, dataInclusao);
    }

    public String getDataAltera() {
        return dataAltera;
    }

    public void setDataAltera(String dataAltera) {
        String oldDataAltera = this.dataAltera;
        this.dataAltera = dataAltera;
        changeSupport.firePropertyChange("dataAltera", oldDataAltera, dataAltera);
    }

    public Integer getCodsetor() {
        return codsetor;
    }

    public void setCodsetor(Integer codsetor) {
        Integer oldCodsetor = this.codsetor;
        this.codsetor = codsetor;
        changeSupport.firePropertyChange("codsetor", oldCodsetor, codsetor);
    }

    public String getDataOS() {
        return dataOS;
    }

    public void setDataOS(String dataOS) {
        String oldDataOS = this.dataOS;
        this.dataOS = dataOS;
        changeSupport.firePropertyChange("dataOS", oldDataOS, dataOS);
    }

    public Integer getCodfuncionarioOS() {
        return codfuncionarioOS;
    }

    public void setCodfuncionarioOS(Integer codfuncionarioOS) {
        Integer oldCodfuncionarioOS = this.codfuncionarioOS;
        this.codfuncionarioOS = codfuncionarioOS;
        changeSupport.firePropertyChange("codfuncionarioOS", oldCodfuncionarioOS, codfuncionarioOS);
    }

    public int getCodservico() {
        return codservico;
    }

    public void setCodservico(int codservico) {
        int oldCodservico = this.codservico;
        this.codservico = codservico;
        changeSupport.firePropertyChange("codservico", oldCodservico, codservico);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codos != null ? codos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ordemdeservico)) {
            return false;
        }
        Ordemdeservico other = (Ordemdeservico) object;
        if ((this.codos == null && other.codos != null) || (this.codos != null && !this.codos.equals(other.codos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "" + codos;
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
