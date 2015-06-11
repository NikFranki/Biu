package com.domain;
// default package

import java.util.HashSet;
import java.util.Set;


/**
 * User entity. @author MyEclipse Persistence Tools
 */

public class User  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private Secondaddress secondaddress;
     private Firstaddress firstaddress;
     private String username;
     private String password;
     private String name;
     private Integer imgsrc;
     private String thirdaddress;
     private String phone;
     private Set orders = new HashSet(0);


    // Constructors

    /** default constructor */
    public User() {
    }

	/** minimal constructor */
    public User(Secondaddress secondaddress, Firstaddress firstaddress, String username, String password, String name, String thirdaddress, String phone) {
        this.secondaddress = secondaddress;
        this.firstaddress = firstaddress;
        this.username = username;
        this.password = password;
        this.name = name;
        this.thirdaddress = thirdaddress;
        this.phone = phone;
    }
    
    /** full constructor */
    public User(Secondaddress secondaddress, Firstaddress firstaddress, String username, String password, String name, Integer imgsrc, String thirdaddress, String phone, Set orders) {
        this.secondaddress = secondaddress;
        this.firstaddress = firstaddress;
        this.username = username;
        this.password = password;
        this.name = name;
        this.imgsrc = imgsrc;
        this.thirdaddress = thirdaddress;
        this.phone = phone;
        this.orders = orders;
    }

   
    // Property accessors

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public Secondaddress getSecondaddress() {
        return this.secondaddress;
    }
    
    public void setSecondaddress(Secondaddress secondaddress) {
        this.secondaddress = secondaddress;
    }

    public Firstaddress getFirstaddress() {
        return this.firstaddress;
    }
    
    public void setFirstaddress(Firstaddress firstaddress) {
        this.firstaddress = firstaddress;
    }

    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public Integer getImgsrc() {
        return this.imgsrc;
    }
    
    public void setImgsrc(Integer imgsrc) {
        this.imgsrc = imgsrc;
    }

    public String getThirdaddress() {
        return this.thirdaddress;
    }
    
    public void setThirdaddress(String thirdaddress) {
        this.thirdaddress = thirdaddress;
    }

    public String getPhone() {
        return this.phone;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Set getOrders() {
        return this.orders;
    }
    
    public void setOrders(Set orders) {
        this.orders = orders;
    }
   








}