/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misiontic.ciclo2.semana6.bdclases;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author emanuel
 */
@Entity
@Table(name = "customer_list")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CustomerList.findAll", query = "SELECT c FROM CustomerList c")
    , @NamedQuery(name = "CustomerList.findById", query = "SELECT c FROM CustomerList c WHERE c.id = :id")
    , @NamedQuery(name = "CustomerList.findByName", query = "SELECT c FROM CustomerList c WHERE c.name = :name")
    , @NamedQuery(name = "CustomerList.findByAddress", query = "SELECT c FROM CustomerList c WHERE c.address = :address")
    , @NamedQuery(name = "CustomerList.findByZipCode", query = "SELECT c FROM CustomerList c WHERE c.zipCode = :zipCode")
    , @NamedQuery(name = "CustomerList.findByPhone", query = "SELECT c FROM CustomerList c WHERE c.phone = :phone")
    , @NamedQuery(name = "CustomerList.findByCity", query = "SELECT c FROM CustomerList c WHERE c.city = :city")
    , @NamedQuery(name = "CustomerList.findByCountry", query = "SELECT c FROM CustomerList c WHERE c.country = :country")
    , @NamedQuery(name = "CustomerList.findByNotes", query = "SELECT c FROM CustomerList c WHERE c.notes = :notes")
    , @NamedQuery(name = "CustomerList.findBySid", query = "SELECT c FROM CustomerList c WHERE c.sid = :sid")})
public class CustomerList implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "ID")
    private short id;
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @Column(name = "address")
    private String address;
    @Column(name = "zip code")
    private String zipCode;
    @Basic(optional = false)
    @Column(name = "phone")
    private String phone;
    @Basic(optional = false)
    @Column(name = "city")
    private String city;
    @Basic(optional = false)
    @Column(name = "country")
    private String country;
    @Basic(optional = false)
    @Column(name = "notes")
    private String notes;
    @Basic(optional = false)
    @Column(name = "SID")
    private short sid;

    public CustomerList() {
    }

    public short getId() {
        return id;
    }

    public void setId(short id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public short getSid() {
        return sid;
    }

    public void setSid(short sid) {
        this.sid = sid;
    }
    
}
