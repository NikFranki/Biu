package com.dao;

import java.util.List;

import com.domain.Secondaddress;

public interface SecondaddressDao {
	public List<Secondaddress> findAll();
	public Secondaddress findById(int id);
}
