package com.dao;

import java.util.List;

import com.domain.User;

public interface UserDao {
	public List<User> findAll();
	public List findByName(String username);
	public User findById(int id);
	public int addUser(User user);
	public void updateUser(User user);
}
