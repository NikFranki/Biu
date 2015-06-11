package com.actions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.domain.Menu;
import com.domain.Shop;
import com.domain.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.services.MenuService;
import com.services.ShopService;

public class MenuAction extends ActionSupport{
	private MenuService menuservice;
	private ShopService shopservice;
	private int id;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setShopservice(ShopService shopservice) {
		this.shopservice = shopservice;
	}
	private Menu menu;
	public Menu getMenu() {
		return menu;
	}
	public void setMenu(Menu menu) {
		this.menu = menu;
	}
	public void setMenuservice(MenuService menuservice) {
		this.menuservice = menuservice;
	}
	public String addMenu()throws Exception{
		String result="menusuccess";
		if(menu != null){
			//����SHOP
			Shop shop = shopservice.getid(this.menu.getShopid());
			menu.setShop(shop);

			List<Menu> list = new ArrayList<Menu>();
			list = menuservice.findByName(menu.getName());
			if (list.iterator().hasNext()) {
				this.addFieldError("errormessage", "���иò�ʽ��");
				return "menufail";
			}
			if(menu.getName().equals("")){
				this.addFieldError("errormessage", "��ʽ���Ʋ���Ϊ�գ�");
				return "menufail";
			}else if(menu.getPrice()==null){
				this.addFieldError("errormessage", "�۸���Ϊ�գ�");
				return "menufail";
			}else if(menu.getDetail().equals("")){ 
				this.addFieldError("errormessage", "����д�ϲ�ʽ������");
				return "menufail";
			}
			if(menuservice.addMenu(menu)!=1){
				this.addFieldError("errormessage", "��ʽ���ʧ�ܣ�");
				return "menufail";
			}
		}else{
			result = "menufail";
		}
		return result;
	}
	public String checkMenu() throws Exception{
		String result="checksuccess";
		
		List<Menu> list = menuservice.findAll(id);
		
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("menulist", list);
		
		return result;
	}
}
