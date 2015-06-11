package com.services;

import java.util.List;

import com.domain.Shop;

public interface ShopService {
	public List<Shop> get();
	public List get(String username);
	public Shop getid(int id);
	public int addshop(Shop shop);
	public void updateshop(Shop shop);
}
