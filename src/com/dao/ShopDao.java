package com.dao;

import java.util.List;

import com.domain.Shop;

public interface ShopDao {
	public List<Shop> findAll();
	public List findByName(String username);
	public Shop findById(int id);
	public int addShop(Shop shop);
	public void updateUser(Shop Shop);
}
