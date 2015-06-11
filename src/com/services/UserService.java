package com.services;

import java.util.List;

import com.domain.User;

public interface UserService {
	public List<User> get();
	public List get(String username);
	public User getid(int id);
	public int adduser(User user);
	public void updateuser(User user);
}
