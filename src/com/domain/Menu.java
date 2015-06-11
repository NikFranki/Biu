package com.domain;
// default package

import java.util.HashSet;
import java.util.Set;


/**
 * Menu entity. @author MyEclipse Persistence Tools
 */

public class Menu  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private Shop shop;
     private Integer shopid;
     private String name;
     private Integer price;
     private String detail;
     private String picsrc;
     public Integer getShopid() {
		return shopid;
	}

	public void setShopid(Integer shopid) {
		this.shopid = shopid;
	}

	private Set orderdetails = new HashSet(0);


    // Constructors

    /** default constructor */
    public Menu() {
    }

	/** minimal constructor */
    public Menu(Shop shop, String name, Integer price) {
        this.shop = shop;
        this.name = name;
        this.price = price;
    }
    
    /** full constructor */
    public Menu(Shop shop, String name, Integer price, String detail, String picsrc, Set orderdetails) {
        this.shop = shop;
        this.name = name;
        this.price = price;
        this.detail = detail;
        this.picsrc = picsrc;
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

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return this.price;
    }
    
    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getDetail() {
        return this.detail;
    }
    
    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getPicsrc() {
        return this.picsrc;
    }
    
    public void setPicsrc(String picsrc) {
        this.picsrc = picsrc;
    }

    public Set getOrderdetails() {
        return this.orderdetails;
    }
    
    public void setOrderdetails(Set orderdetails) {
        this.orderdetails = orderdetails;
    }
   








}