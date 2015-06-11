package com.domain;
// default package

import java.util.HashSet;
import java.util.Set;


/**
 * Order entity. @author MyEclipse Persistence Tools
 */

public class Order  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private Shop shop;
     private User user;
     private String phone;
     private String address;
     private Integer sumprice;
     private Set orderdetails = new HashSet(0);


    // Constructors

    /** default constructor */
    public Order() {
    }

	/** minimal constructor */
    public Order(Shop shop, User user, String phone, String address, Integer sumprice) {
        this.shop = shop;
        this.user = user;
        this.phone = phone;
        this.address = address;
        this.sumprice = sumprice;
    }
    
    /** full constructor */
    public Order(Shop shop, User user, String phone, String address, Integer sumprice, Set orderdetails) {
        this.shop = shop;
        this.user = user;
        this.phone = phone;
        this.address = address;
        this.sumprice = sumprice;
        this.orderdetails = orderdetails;
    }

   
    // Property accessors

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public Shop getShop() {
        return this.shop;
    }
    
    public void setShop(Shop shop) {
        this.shop = shop;
    }

    public User getUser() {
        return this.user;
    }
    
    public void setUser(User user) {
        this.user = user;
    }

    public String getPhone() {
        return this.phone;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getSumprice() {
        return this.sumprice;
    }
    
    public void setSumprice(Integer sumprice) {
        this.sumprice = sumprice;
    }

    public Set getOrderdetails() {
        return this.orderdetails;
    }
    
    public void setOrderdetails(Set orderdetails) {
        this.orderdetails = orderdetails;
    }
   








}