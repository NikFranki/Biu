package com.actions;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.domain.Firstaddress;
import com.domain.Secondaddress;
import com.domain.Shop;
import com.domain.User;
import com.opensymphony.xwork2.ActionSupport;
import com.services.FirstaddressService;
import com.services.SecondaddressService;
import com.services.ShopService;
import com.services.UserService;

public class UserAction extends ActionSupport {

	private UserService userservice;
	private ShopService shopservice;
	private FirstaddressService firstaddressservice;
	private SecondaddressService secondaddressservice;
	User user;
	Shop shop;
	Firstaddress firstaddress;
	Secondaddress secondaddress;
	String repassword;
	private int usertype;

	public void setUserservice(UserService userservice) {
		this.userservice = userservice;
	}

	public void setShopservice(ShopService shopservice) {
		this.shopservice = shopservice;
	}

	public void setFirstaddressservice(FirstaddressService firstaddressservice) {
		this.firstaddressservice = firstaddressservice;
	}

	public void setSecondaddressservice(
			SecondaddressService secondaddressservice) {
		this.secondaddressservice = secondaddressservice;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public User getUser() {
		return this.user;
	}

	public Shop getShop() {
		return shop;
	}

	public void setShop(Shop shop) {
		this.shop = shop;
	}

	public Firstaddress getFirstaddress() {
		return firstaddress;
	}

	public void setFirstaddress(Firstaddress firstaddress) {
		this.firstaddress = firstaddress;
	}

	public void setRepassword(String repassword) {
		this.repassword = repassword;
	}

	public String getRepassword() {
		return this.repassword;
	}

	public int getUsertype() {
		return usertype;
	}

	public void setUsertype(int usertype) {
		this.usertype = usertype;
	}

	public String login() throws Exception {
		String result = "loginfail";
		List<User> list = new ArrayList<User>();
		List<Shop> shoplist = new ArrayList<Shop>();
		if (user.getUsername().equals("")) {
			this.addFieldError("errormessage", "请输入用户名和密码.若无账号,请注册!");
			return "loginfail";
		}
		this.usertype = Integer.parseInt(ServletActionContext.getRequest()
				.getParameter("usertype"));
		if (this.usertype == 1) {
			list = userservice.get(user.getUsername());
			if (!list.iterator().hasNext()) {
				this.addFieldError("errormessage", "用户名不存在！");
				return "loginfail";
			}
			User usertrue = list.get(0);
			if (usertrue != null) {
				if (user.getUsername().equals(usertrue.getUsername())
						&& user.getPassword().equals(usertrue.getPassword())) {
					HttpSession httpSession = ServletActionContext.getRequest()
							.getSession();
					httpSession.setAttribute("user", usertrue);
					result = "customerlogin";

				} else {
					this.addFieldError("errormessage", "用户名密码错误，请重新输入！");
					result = "loginfail";
				}
			} else {
				this.addFieldError("errormessage", "用户名密码错误，请重新输入！");
				result = "loginfail";
			}
		} else if (this.usertype == 2) {
			shoplist = shopservice.get(user.getUsername());
			if (!shoplist.iterator().hasNext()) {
				this.addFieldError("errormessage", "用户名不存在！");
				System.out.println("error");
				return "loginfail";
			}
			Shop shoptrue = shoplist.get(0);
			if (shoptrue != null) {

				if (user.getUsername().equals(shoptrue.getUsername())
						&& user.getPassword().equals(shoptrue.getPassword())) {
					HttpSession httpSession = ServletActionContext.getRequest()
							.getSession();
					httpSession.setAttribute("shop", shoptrue);
					result = "shoperlogin";

				} else {
					this.addFieldError("errormessage", "用户名密码错误，请重新输入！");
					result = "loginfail";
				}
			} else {
				this.addFieldError("errormessage", "用户名密码错误，请重新输入！");
				result = "loginfail";
			}
		}
		return result;
	}

	public String customerregister() throws Exception {
		String result = "registsuccess";
		Firstaddress f1;
		Secondaddress s1;

		List<User> list = new ArrayList<User>();
		list = userservice.get(user.getUsername());
		if (list.iterator().hasNext()) {
			this.addFieldError("errormessage", "用户名已存在！");
			return "registfail";
		}
		this.repassword = ServletActionContext.getRequest().getParameter(
				"repassword");
		if (user.getUsername().equals("")) {
			this.addFieldError("errormessage", "请输入用户名！");
			return "registfail";
		} else if (!user.getPassword().equals(this.repassword)) {
			this.addFieldError("errormessage", "两次输入的密码不一样，请再次输入！");
			return "registfail";
		} else if (user.getName().equals("") || user.getPhone().equals("")
				|| user.getThirdaddress().equals("")) {
			this.addFieldError("errormessage", "请输入完整信息！");
			return "registfail";
		}
		f1 = firstaddressservice.getid(1);
		s1 = secondaddressservice.getid(1);
		user.setFirstaddress(f1);
		user.setSecondaddress(s1);
		if (userservice.adduser(user) != 1) {
			this.addFieldError("errormessage", "注册失败，未知原因！");
			result = "registfail";
		}
		return result;
	}

	public String shopregister() throws Exception {
		String result = "shopregistsuccess";
		Firstaddress f1;
		Secondaddress s1;

		List<Shop> list = new ArrayList<Shop>();
		list = shopservice.get(shop.getUsername());
		if (list.iterator().hasNext()) {
			this.addFieldError("errormessage", "用户名已存在！");
			return "shopregistfail";
		}
		this.repassword = ServletActionContext.getRequest().getParameter(
				"repassword");
		if (shop.getUsername().equals("")) {
			this.addFieldError("errormessage", "请输入用户名！");
			return "shopregistfail";
		} else if (!shop.getPassword().equals(this.repassword)) {
			this.addFieldError("errormessage", "两次输入的密码不一样，请再次输入！");
			return "shopregistfail";
		} else if (shop.getName().equals("") || shop.getPhone().equals("")
				|| shop.getThirdaddress().equals("")) {
			this.addFieldError("errormessage", "请输入完整信息！");
			return "shopregistfail";
		}
		f1 = firstaddressservice.getid(1);
		s1 = secondaddressservice.getid(1);
		shop.setFirstaddress(f1);
		shop.setSecondaddress(s1);
		if (shopservice.addshop(shop) != 1) {
			this.addFieldError("errormessage", "注册失败，未知原因！");
			result = "shopregistfail";
		}
		return result;
	}
}
