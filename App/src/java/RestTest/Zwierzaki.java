/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RestTest;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author KN
 */
@Entity
@Table(name = "ZWIERZAKI")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Zwierzaki.findAll", query = "SELECT z FROM Zwierzaki z"),
    @NamedQuery(name = "Zwierzaki.findById", query = "SELECT z FROM Zwierzaki z WHERE z.id = :id"),
    @NamedQuery(name = "Zwierzaki.findByNazwa", query = "SELECT z FROM Zwierzaki z WHERE z.nazwa = :nazwa")})
public class Zwierzaki implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Integer id;
    @Size(max = 25)
    @Column(name = "NAZWA")
    private String nazwa;

    public Zwierzaki() {
    }

    public Zwierzaki(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
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
        if (!(object instanceof Zwierzaki)) {
            return false;
        }
        Zwierzaki other = (Zwierzaki) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "RestTest.Zwierzaki[ id=" + id + " ]";
    }
    
}
