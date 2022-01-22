/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

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
 * @author User
 */
@Entity
@Table(name = "staff", catalog = "bloodbank", schema = "")
@NamedQueries({
    @NamedQuery(name = "Staff.findAll", query = "SELECT s FROM Staff s"),
    @NamedQuery(name = "Staff.findByName", query = "SELECT s FROM Staff s WHERE s.name = :name"),
    @NamedQuery(name = "Staff.findById", query = "SELECT s FROM Staff s WHERE s.id = :id"),
    @NamedQuery(name = "Staff.findByPostion", query = "SELECT s FROM Staff s WHERE s.postion = :postion"),
    @NamedQuery(name = "Staff.findByDuty", query = "SELECT s FROM Staff s WHERE s.duty = :duty"),
    @NamedQuery(name = "Staff.findByPhone", query = "SELECT s FROM Staff s WHERE s.phone = :phone"),
    @NamedQuery(name = "Staff.findByResidence", query = "SELECT s FROM Staff s WHERE s.residence = :residence")})
public class Staff implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Column(name = "Name")
    private String name;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "Postion")
    private String postion;
    @Column(name = "Duty")
    private String duty;
    @Column(name = "Phone")
    private Integer phone;
    @Column(name = "Residence")
    private String residence;

    public Staff() {
    }

    public Staff(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String oldName = this.name;
        this.name = name;
        changeSupport.firePropertyChange("name", oldName, name);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getPostion() {
        return postion;
    }

    public void setPostion(String postion) {
        String oldPostion = this.postion;
        this.postion = postion;
        changeSupport.firePropertyChange("postion", oldPostion, postion);
    }

    public String getDuty() {
        return duty;
    }

    public void setDuty(String duty) {
        String oldDuty = this.duty;
        this.duty = duty;
        changeSupport.firePropertyChange("duty", oldDuty, duty);
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        Integer oldPhone = this.phone;
        this.phone = phone;
        changeSupport.firePropertyChange("phone", oldPhone, phone);
    }

    public String getResidence() {
        return residence;
    }

    public void setResidence(String residence) {
        String oldResidence = this.residence;
        this.residence = residence;
        changeSupport.firePropertyChange("residence", oldResidence, residence);
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
        if (!(object instanceof Staff)) {
            return false;
        }
        Staff other = (Staff) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Interface.Staff[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
