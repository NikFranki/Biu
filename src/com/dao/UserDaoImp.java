package com.dao;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.domain.User;

public class UserDaoImp extends HibernateDaoSupport implements UserDao {

	public List<User> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public List findByName(String username) {
		return getHibernateTemplate().find("from User where username='"+username+"'");
	}

	public User findById(int id) {
		return (User)getHibernateTemplate().get("com.domain.User", id);
	}

	public int addUser(User user) {
		int RETURN = 0;
		try {
			getHibernateTemplate().save(user);
			getHibernateTemplate().flush();
			HttpSession httpSession = ServletActionContext.getRequest()
					.getSession();
			httpSession.setAttribute("user", user);
			RETURN = 1;
		} catch (Exception e) {
			System.out.println("ÓÃ»§×¢²áÊ§°Ü!");
		}
		return RETURN;
	}

	public void updateUser(User user) {
		// TODO Auto-generated method stub
		
	}



}
