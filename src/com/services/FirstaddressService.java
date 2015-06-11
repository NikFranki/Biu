package com.services;

import java.util.List;

import com.domain.Firstaddress;

public interface FirstaddressService {
	public List<Firstaddress> get();
	public Firstaddress getid(int id);
}
