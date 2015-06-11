package com.dao;

import java.util.List;

import com.domain.Firstaddress;

public interface FirstaddressDao {
	public List<Firstaddress> findAll();
	public Firstaddress findById(int id);
}
