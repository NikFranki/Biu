<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%@page import="com.domain.*"%>
<html>
	<head>
		<link rel="stylesheet" href="css/bootstrap.min.css" />
		<link rel="stylesheet" href="css/navbar-fixed-top.css" />
		<link rel="stylesheet" href="css/user-operate.css" />
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	</head>
	<body>
		<%
			Shop shop = (Shop) session.getAttribute("shop");
		%>
		<div class="nav-box">
			<div class="logo-box">
				<a href="#"><image src="images/add.png" />Biu Biu Biu</a>
			</div>
			<div class="banner-box">
				<ul>
					<li>
						<a href="#">Home</a>
					</li>
					<li>
						<a href="#">Detail</a>
					</li>
					<li>
						<a href="#">Evo</a>
					</li>
					<ul>
			</div>
			<div class="login-box">
                    <span>Welcome <a href="#"><%out.print(shop.getName()); %></a> !</span>
	 	    <s>[</s><a href="" class="color">珠海</a><s>]</s>
                    <a href="index.jsp">Quit</a>
            </div>
		</div>

		<div class="notice-broder-box">
			<div class="header-tittle">
				<p>
					Notice Broder
				</p>
			</div>
			<div class="notice-message-box">
				
			</div>
		</div>

		<div class="message-box">
			<div class="image-box">
				<image src="upload/shopImages/1.jpg" />
			</div>
			<div class="message-detail">
				<p>
					This is the Name
				</p>
				<detail>
				this is the detail
				</detail>
			</div>
			<div class="message-footer">
				<div class="float-left">
					<a href="menu!addMenu">添加菜式</a>
					<a href="#"
						style="background: #eee; border: 0.1em solid #bbb;">查询菜式</a>
				</div>
				<div class="float-right">
					<a href="./checkOrder.html">查询订单</a>
					<a href="./checkVolume.html">营业状况</a>
				</div>
			</div>
		</div>

		<div class="menu-box-seller">
			<%
				List<Menu> ls = (List<Menu>)request.getAttribute("menulist");
				if(ls != null)
					for(Iterator it = ls.iterator();it.hasNext();){
						Menu menu = (Menu)it.next();
						out.print("<div class=\"menu-check-box\">"
										+"<div class=\"check-name\">"
											+"<p>"
												+menu.getName()
											+"</p>"
										+"</div>"
										+"<div class=\"check-price\">"
											+"<p margin-left=\"46%\">￥"
												+menu.getPrice()
											+"</p>"
										+"</div>"
										+"<div class=\"check-operate\">"
											+"<a href=\"/menu!updateMenu\">修改</a>"
											+"<a href=\"/menu!deleteMenu\">删除</a>"
										+"</div>"
									+"</div>");
					}
			 %>
		
		</div>
		<iframe class="frame-box" src="page/commFooter.html"></iframe>
	</body>
</html>