package com.services;

import java.util.List;
import com.dao.FirstaddressDao;
import com.domain.Firstaddress;

public class FirstaddressServiceImp implements FirstaddressService{
	
	private FirstaddressDao firstaddressdao;

	public void setFirstaddressdao(FirstaddressDao firstaddressdao) {
		this.firstaddressdao = firstaddressdao;
	}

	public List<Firstaddress> get() {
		return firstaddressdao.findAll();
	}

	public Firstaddress getid(int id) {
		return firstaddressdao.findById(id);
	}
	
}
