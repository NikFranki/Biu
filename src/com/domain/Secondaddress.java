package com.domain;
// default package

import java.util.HashSet;
import java.util.Set;


/**
 * Secondaddress entity. @author MyEclipse Persistence Tools
 */

public class Secondaddress  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private Firstaddress firstaddress;
     private String name;
     private Set shops = new HashSet(0);
     private Set users = new HashSet(0);


    // Constructors

    /** default constructor */
    public Secondaddress() {
    }

	/** minimal constructor */
    public Secondaddress(Firstaddress firstaddress, String name) {
        this.firstaddress = firstaddress;
        this.name = name;
    }
    
    /** full constructor */
    public Secondaddress(Firstaddress firstaddress, String name, Set shops, Set users) {
        this.firstaddress = firstaddress;
        this.name = name;
        this.shops = shops;
        this.users = users;
    }

   
    // Property accessors

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public Firstaddress getFirstaddress() {
        return this.firstaddress;
    }
    
    public void setFirstaddress(Firstaddress firstaddress) {
        this.firstaddress = firstaddress;
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

    public Set getUsers() {
        return this.users;
    }
    
    public void setUsers(Set users) {
        this.users = users;
    }
   








}