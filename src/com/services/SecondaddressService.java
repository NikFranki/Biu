package com.services;

import java.util.List;

import com.domain.Secondaddress;

public interface SecondaddressService {
	public List<Secondaddress> get();
	public Secondaddress getid(int id);
}
