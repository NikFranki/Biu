package com.dao;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.domain.Menu;

public class MenuDaoImp extends HibernateDaoSupport implements MenuDao {

	public List<Menu> findAll(int id) {
		// TODO Auto-generated method stub
		return (List <Menu>) getHibernateTemplate().find("from Menu where shopid = "+ id);
	}
	public List findByName(String name){
		return getHibernateTemplate().find("from Menu where name='"+name+"'");
	}

	public Menu findById(int id) {
		// TODO Auto-generated method stub
		return (Menu) getHibernateTemplate().get("com.domain.Menu",id);
	}

	public int addMenu(Menu menu) {
		// TODO Auto-generated method stub
		int key=0;//设定没增加菜式之前是0
		try{
			getHibernateTemplate().save(menu);
			getHibernateTemplate().flush();
			HttpSession httpSession=ServletActionContext.getRequest().getSession();
			httpSession.setAttribute("menu", menu);
			key=1;
		}catch(Exception e){
			System.out.println("菜式添加失败 !");
		}
		return key;
	}

	public void updateMenu(Menu menu) {
		// TODO Auto-generated method stub
		getHibernateTemplate().update(menu);
	}

	public void deleteMenu(int id) {
		// TODO Auto-generated method stub
		getHibernateTemplate().delete(id);
		
		}

}
