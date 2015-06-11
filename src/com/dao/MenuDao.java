package com.dao;

import java.util.List;

import com.domain.Menu;

public interface MenuDao {
	public List<Menu> findAll(int id);		//查找整个数据
	public Menu findById(int id);		//根据id查找1条数据
	public List findByName(String name); //根据菜名查找
	public int addMenu(Menu menu);	 	//增加菜式
	public void updateMenu(Menu menu);	//更改菜式
	public void deleteMenu(int id);		//删除菜式
}
