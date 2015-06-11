package com.services;

import java.util.List;

import com.dao.SecondaddressDao;
import com.domain.Secondaddress;

public class SecondaddressServiceImp implements SecondaddressService{
	
	private SecondaddressDao secondaddressdao;
	
	public void setSecondaddressdao(SecondaddressDao secondaddressdao) {
		this.secondaddressdao = secondaddressdao;
	}

	public List<Secondaddress> get() {
		return secondaddressdao.findAll();
	}

	public Secondaddress getid(int id) {
		return secondaddressdao.findById(id);
	}
	
}
