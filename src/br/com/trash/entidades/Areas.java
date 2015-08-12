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
@Table(name = "areas", catalog = "sgbdtrash", schema = "")
@NamedQueries({
    @NamedQuery(name = "Areas.findAll", query = "SELECT a FROM Areas a"),
    @NamedQuery(name = "Areas.findByCodarea", query = "SELECT a FROM Areas a WHERE a.codarea = :codarea"),
    @NamedQuery(name = "Areas.findByCodareasetor", query = "SELECT a FROM Areas a WHERE a.codareasetor = :codareasetor"),
    @NamedQuery(name = "Areas.findByDescricao", query = "SELECT a FROM Areas a WHERE a.descricao = :descricao"),
    @NamedQuery(name = "Areas.findBySigla", query = "SELECT a FROM Areas a WHERE a.sigla = :sigla"),
    @NamedQuery(name = "Areas.findByUserAltera", query = "SELECT a FROM Areas a WHERE a.userAltera = :userAltera"),
    @NamedQuery(name = "Areas.findByUserInclusao", query = "SELECT a FROM Areas a WHERE a.userInclusao = :userInclusao"),
    @NamedQuery(name = "Areas.findByDataInclusao", query = "SELECT a FROM Areas a WHERE a.dataInclusao = :dataInclusao"),
    @NamedQuery(name = "Areas.findByDataAltera", query = "SELECT a FROM Areas a WHERE a.dataAltera = :dataAltera"),
    @NamedQuery(name = "Areas.findByRuas", query = "SELECT a FROM Areas a WHERE a.ruas = :ruas"),
    @NamedQuery(name = "Areas.findByExtensao", query = "SELECT a FROM Areas a WHERE a.extensao = :extensao"),
    @NamedQuery(name = "Areas.findByMunicipio", query = "SELECT a FROM Areas a WHERE a.municipio = :municipio"),
    @NamedQuery(name = "Areas.findByFiscaisrecolha", query = "SELECT a FROM Areas a WHERE a.fiscaisrecolha = :fiscaisrecolha"),
    @NamedQuery(name = "Areas.findByFiscaislimpeza", query = "SELECT a FROM Areas a WHERE a.fiscaislimpeza = :fiscaislimpeza"),
    @NamedQuery(name = "Areas.findByCodsupervisor", query = "SELECT a FROM Areas a WHERE a.codsupervisor = :codsupervisor")})
public class Areas implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Basic(optional = false)
    @Column(name = "codarea")
    private Integer codarea;
    @Column(name = "codareasetor")
    private Integer codareasetor;
    @Column(name = "descricao")
    private String descricao;
    @Column(name = "sigla")
    private String sigla;
    @Column(name = "userAltera")
    private String userAltera;
    @Column(name = "userInclusao")
    private String userInclusao;
    @Column(name = "dataInclusao")
    private String dataInclusao;
    @Column(name = "dataAltera")
    private String dataAltera;
    @Basic(optional = false)
    @Column(name = "ruas")
    private String ruas;
    @Basic(optional = false)
    @Column(name = "extensao")
    private String extensao;
    @Basic(optional = false)
    @Column(name = "municipio")
    private String municipio;
    @Basic(optional = false)
    @Column(name = "fiscaisrecolha")
    private String fiscaisrecolha;
    @Basic(optional = false)
    @Column(name = "fiscaislimpeza")
    private String fiscaislimpeza;
    @Basic(optional = false)
    @Column(name = "codsupervisor")
    private int codsupervisor;

    public Areas() {
    }

    public Areas(Integer codarea) {
        this.codarea = codarea;
    }

    public Areas(Integer codarea, String ruas, String extensao, String municipio, String fiscaisrecolha, String fiscaislimpeza, int codsupervisor) {
        this.codarea = codarea;
        this.ruas = ruas;
        this.extensao = extensao;
        this.municipio = municipio;
        this.fiscaisrecolha = fiscaisrecolha;
        this.fiscaislimpeza = fiscaislimpeza;
        this.codsupervisor = codsupervisor;
    }

    public Integer getCodarea() {
        return codarea;
    }

    public void setCodarea(Integer codarea) {
        Integer oldCodarea = this.codarea;
        this.codarea = codarea;
        changeSupport.firePropertyChange("codarea", oldCodarea, codarea);
    }

    public Integer getCodareasetor() {
        return codareasetor;
    }

    public void setCodareasetor(Integer codareasetor) {
        Integer oldCodareasetor = this.codareasetor;
        this.codareasetor = codareasetor;
        changeSupport.firePropertyChange("codareasetor", oldCodareasetor, codareasetor);
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        String oldDescricao = this.descricao;
        this.descricao = descricao;
        changeSupport.firePropertyChange("descricao", oldDescricao, descricao);
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        String oldSigla = this.sigla;
        this.sigla = sigla;
        changeSupport.firePropertyChange("sigla", oldSigla, sigla);
    }

    public String getUserAltera() {
        return userAltera;
    }

    public void setUserAltera(String userAltera) {
        String oldUserAltera = this.userAltera;
        this.userAltera = userAltera;
        changeSupport.firePropertyChange("userAltera", oldUserAltera, userAltera);
    }

    public String getUserInclusao() {
        return userInclusao;
    }

    public void setUserInclusao(String userInclusao) {
        String oldUserInclusao = this.userInclusao;
        this.userInclusao = userInclusao;
        changeSupport.firePropertyChange("userInclusao", oldUserInclusao, userInclusao);
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

    public String getRuas() {
        return ruas;
    }

    public void setRuas(String ruas) {
        String oldRuas = this.ruas;
        this.ruas = ruas;
        changeSupport.firePropertyChange("ruas", oldRuas, ruas);
    }

    public String getExtensao() {
        return extensao;
    }

    public void setExtensao(String extensao) {
        String oldExtensao = this.extensao;
        this.extensao = extensao;
        changeSupport.firePropertyChange("extensao", oldExtensao, extensao);
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        String oldMunicipio = this.municipio;
        this.municipio = municipio;
        changeSupport.firePropertyChange("municipio", oldMunicipio, municipio);
    }

    public String getFiscaisrecolha() {
        return fiscaisrecolha;
    }

    public void setFiscaisrecolha(String fiscaisrecolha) {
        String oldFiscaisrecolha = this.fiscaisrecolha;
        this.fiscaisrecolha = fiscaisrecolha;
        changeSupport.firePropertyChange("fiscaisrecolha", oldFiscaisrecolha, fiscaisrecolha);
    }

    public String getFiscaislimpeza() {
        return fiscaislimpeza;
    }

    public void setFiscaislimpeza(String fiscaislimpeza) {
        String oldFiscaislimpeza = this.fiscaislimpeza;
        this.fiscaislimpeza = fiscaislimpeza;
        changeSupport.firePropertyChange("fiscaislimpeza", oldFiscaislimpeza, fiscaislimpeza);
    }

    public int getCodsupervisor() {
        return codsupervisor;
    }

    public void setCodsupervisor(int codsupervisor) {
        int oldCodsupervisor = this.codsupervisor;
        this.codsupervisor = codsupervisor;
        changeSupport.firePropertyChange("codsupervisor", oldCodsupervisor, codsupervisor);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codarea != null ? codarea.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Areas)) {
            return false;
        }
        Areas other = (Areas) object;
        if ((this.codarea == null && other.codarea != null) || (this.codarea != null && !this.codarea.equals(other.codarea))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.trash.telas.sistemas.Areas[ codarea=" + codarea + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
