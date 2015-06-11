package com.services;

import java.util.List;
import com.dao.UserDao;
import com.domain.User;

public class UserServiceImp implements UserService {

	private UserDao userdao;

	public void setUserdao(UserDao userdao) {
		this.userdao = userdao;
	}

	public List<User> get() {
		return userdao.findAll();
	}

	public List get(String username) {
		return userdao.findByName(username);
	}

	public User getid(int id) {
		return userdao.findById(id);
	}

	public int adduser(User user) {
		return userdao.addUser(user);
	}

	public void updateuser(User user) {
		// TODO Auto-generated method stub

	}

}
