package com.services;

import java.util.List;

import com.dao.ShopDao;
import com.domain.Shop;

public class ShopServiceImp implements ShopService {

	private ShopDao shopdao;

	public void setShopdao(ShopDao shopdao) {
		this.shopdao = shopdao;
	}

	public List<Shop> get() {
		return shopdao.findAll();
	}

	public List get(String username) {
		return shopdao.findByName(username);
	}

	public Shop getid(int id) {
		return shopdao.findById(id);
	}

	public int addshop(Shop shop) {
		return shopdao.addShop(shop);
	}

	public void updateshop(Shop shop) {
		// TODO Auto-generated method stub

	}

}
