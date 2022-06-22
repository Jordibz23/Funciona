/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author HP
 */
@Entity
@Table(name = "datos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Datos_1.findAll", query = "SELECT d FROM Datos_1 d"),
    @NamedQuery(name = "Datos_1.findById", query = "SELECT d FROM Datos_1 d WHERE d.id = :id"),
    @NamedQuery(name = "Datos_1.findByUsuario", query = "SELECT d FROM Datos_1 d WHERE d.usuario = :usuario"),
    @NamedQuery(name = "Datos_1.findByContrase\u00f1a", query = "SELECT d FROM Datos_1 d WHERE d.contrase\u00f1a = :contrase\u00f1a")})
public class Datos_1 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "usuario")
    private String usuario;
    @Column(name = "contrase\u00f1a")
    private String contraseña;

    public Datos_1() {
    }

    public Datos_1(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Datos_1)) {
            return false;
        }
        Datos_1 other = (Datos_1) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "dto.Datos_1[ id=" + id + " ]";
    }
    
}
