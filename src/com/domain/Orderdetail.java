package com.domain;
// default package



/**
 * Orderdetail entity. @author MyEclipse Persistence Tools
 */

public class Orderdetail  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private Menu menu;
     private Order order;
     private String menuname;
     private Integer menuprice;
     private Integer menunum;


    // Constructors

    /** default constructor */
    public Orderdetail() {
    }

    
    /** full constructor */
    public Orderdetail(Menu menu, Order order, String menuname, Integer menuprice, Integer menunum) {
        this.menu = menu;
        this.order = order;
        this.menuname = menuname;
        this.menuprice = menuprice;
        this.menunum = menunum;
    }

   
    // Property accessors

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public Menu getMenu() {
        return this.menu;
    }
    
    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public Order getOrder() {
        return this.order;
    }
    
    public void setOrder(Order order) {
        this.order = order;
    }

    public String getMenuname() {
        return this.menuname;
    }
    
    public void setMenuname(String menuname) {
        this.menuname = menuname;
    }

    public Integer getMenuprice() {
        return this.menuprice;
    }
    
    public void setMenuprice(Integer menuprice) {
        this.menuprice = menuprice;
    }

    public Integer getMenunum() {
        return this.menunum;
    }
    
    public void setMenunum(Integer menunum) {
        this.menunum = menunum;
    }
   








}