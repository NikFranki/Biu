package com.dao;

import java.util.List;

import com.domain.Menu;

public interface MenuDao {
	public List<Menu> findAll(int id);		//������������
	public Menu findById(int id);		//����id����1������
	public List findByName(String name); //���ݲ�������
	public int addMenu(Menu menu);	 	//���Ӳ�ʽ
	public void updateMenu(Menu menu);	//���Ĳ�ʽ
	public void deleteMenu(int id);		//ɾ����ʽ
}
