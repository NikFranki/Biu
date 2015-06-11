package com.dao;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.domain.Shop;

public class ShopDaoImp extends HibernateDaoSupport implements ShopDao{

	public List<Shop> findAll() {
		return (List<Shop>) getHibernateTemplate().find("from Shop");
	}
	
	public List findByName(String username) {
		return getHibernateTemplate().find("from Shop where username='"+username+"'");
	}

	public Shop findById(int id) {
		return (Shop) getHibernateTemplate().get("com.domain.Shop", id);
	}

	public int addShop(Shop shop) {
		int RETURN=0;
		try {
			getHibernateTemplate().save(shop);
			getHibernateTemplate().flush();
			HttpSession httpSession = ServletActionContext.getRequest()
			.getSession();
			httpSession.setAttribute("shop", shop);
			RETURN = 1;
		} catch (Exception e) {
			System.out.println("µêÆÌ×¢²áÊ§°Ü!");
		}
		return RETURN;
	}

	public void updateUser(Shop Shop) {
		// TODO Auto-generated method stub
		
	}


}
