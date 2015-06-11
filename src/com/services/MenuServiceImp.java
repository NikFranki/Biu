package com.services;

import java.util.List;

import com.dao.MenuDao;
import com.domain.Menu;

public class MenuServiceImp implements MenuService {
	private MenuDao menudao;
	public List<Menu> findAll(int id) {
		// TODO Auto-generated method stub
		return menudao.findAll(id);
	}

	public void setMenudao(MenuDao menudao) {
		this.menudao = menudao;
	}

	public Menu findById(int id) {
		// TODO Auto-generated method stub
		return menudao.findById(id);
	}

	public int addMenu(Menu menu) {
		// TODO Auto-generated method stub
		return menudao.addMenu(menu);
	}

	public void updateMenu(Menu menu) {
		// TODO Auto-generated method stub
		menudao.updateMenu(menu);
	}

	public void deleteMenu(int id) {
		// TODO Auto-generated method stub
		menudao.deleteMenu(id);
	}

	public List findByName(String name) {
		return menudao.findByName(name);
	}

}
