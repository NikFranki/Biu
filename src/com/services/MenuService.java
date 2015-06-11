package com.services;

import java.util.List;

import com.domain.Menu;
import com.domain.Shop;

public interface MenuService {
	public List<Menu> findAll(int id);		//������������
	public Menu findById(int id);		//����id����1������
	public int addMenu(Menu menu);	 	//���Ӳ�ʽ
	public void updateMenu(Menu menu);	//���Ĳ�ʽ
	public void deleteMenu(int id);		//ɾ����ʽ
	public List findByName(String name);
}
