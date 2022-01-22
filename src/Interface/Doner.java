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
@Table(name = "doner", catalog = "bloodbank", schema = "")
@NamedQueries({
    @NamedQuery(name = "Doner.findAll", query = "SELECT d FROM Doner d"),
    @NamedQuery(name = "Doner.findById", query = "SELECT d FROM Doner d WHERE d.id = :id"),
    @NamedQuery(name = "Doner.findByName", query = "SELECT d FROM Doner d WHERE d.name = :name"),
    @NamedQuery(name = "Doner.findByGender", query = "SELECT d FROM Doner d WHERE d.gender = :gender"),
    @NamedQuery(name = "Doner.findByAge", query = "SELECT d FROM Doner d WHERE d.age = :age"),
    @NamedQuery(name = "Doner.findByPhone", query = "SELECT d FROM Doner d WHERE d.phone = :phone"),
    @NamedQuery(name = "Doner.findByBloodGroup", query = "SELECT d FROM Doner d WHERE d.bloodGroup = :bloodGroup"),
    @NamedQuery(name = "Doner.findByDefect", query = "SELECT d FROM Doner d WHERE d.defect = :defect")})
public class Doner implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "Name")
    private String name;
    @Column(name = "Gender")
    private String gender;
    @Column(name = "Age")
    private Integer age;
    @Column(name = "Phone")
    private Integer phone;
    @Column(name = "Blood_Group")
    private String bloodGroup;
    @Column(name = "Defect")
    private String defect;

    public Doner() {
    }

    public Doner(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String oldName = this.name;
        this.name = name;
        changeSupport.firePropertyChange("name", oldName, name);
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        String oldGender = this.gender;
        this.gender = gender;
        changeSupport.firePropertyChange("gender", oldGender, gender);
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        Integer oldAge = this.age;
        this.age = age;
        changeSupport.firePropertyChange("age", oldAge, age);
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        Integer oldPhone = this.phone;
        this.phone = phone;
        changeSupport.firePropertyChange("phone", oldPhone, phone);
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        String oldBloodGroup = this.bloodGroup;
        this.bloodGroup = bloodGroup;
        changeSupport.firePropertyChange("bloodGroup", oldBloodGroup, bloodGroup);
    }

    public String getDefect() {
        return defect;
    }

    public void setDefect(String defect) {
        String oldDefect = this.defect;
        this.defect = defect;
        changeSupport.firePropertyChange("defect", oldDefect, defect);
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
        if (!(object instanceof Doner)) {
            return false;
        }
        Doner other = (Doner) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Interface.Doner[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
