package com.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.domain.Firstaddress;

public class FirstaddressDaoImp extends HibernateDaoSupport implements FirstaddressDao{

	public List<Firstaddress> findAll() {
		return (List<Firstaddress>) getHibernateTemplate().find("from Firstaddress");
	}

	public Firstaddress findById(int id) {
		return (Firstaddress)getHibernateTemplate().get("com.domain.Firstaddress", id);
	}

}
