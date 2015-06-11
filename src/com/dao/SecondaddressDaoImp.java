package com.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.domain.Secondaddress;

public class SecondaddressDaoImp extends HibernateDaoSupport implements SecondaddressDao{

	public List<Secondaddress> findAll() {
		return (List<Secondaddress>) getHibernateTemplate().find("from Secondaddress");
	}

	public Secondaddress findById(int id) {
		return (Secondaddress) getHibernateTemplate().get("com.domain.Secondaddress", id);
	}
	
}
