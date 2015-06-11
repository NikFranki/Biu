package com.domain;
// default package

import java.util.HashSet;
import java.util.Set;


/**
 * Firstaddress entity. @author MyEclipse Persistence Tools
 */

public class Firstaddress  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private String name;
     private Set shops = new HashSet(0);
     private Set secondaddresses = new HashSet(0);
     private Set users = new HashSet(0);


    // Constructors

    /** default constructor */
    public Firstaddress() {
    }

	/** minimal constructor */
    public Firstaddress(String name) {
        this.name = name;
    }
    
    /** full constructor */
    public Firstaddress(String name, Set shops, Set secondaddresses, Set users) {
        this.name = name;
        this.shops = shops;
        this.secondaddresses = secondaddresses;
        this.users = users;
    }

   
    // Property accessors

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public Set getShops() {
        return this.shops;
    }
    
    public void setShops(Set shops) {
        this.shops = shops;
    }

    public Set getSecondaddresses() {
        return this.secondaddresses;
    }
    
    public void setSecondaddresses(Set secondaddresses) {
        this.secondaddresses = secondaddresses;
    }

    public Set getUsers() {
        return this.users;
    }
    
    public void setUsers(Set users) {
        this.users = users;
    }
   








}