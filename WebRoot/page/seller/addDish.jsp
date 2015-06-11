<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@page import="com.domain.*" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
        <link rel="stylesheet" href="css/bootstrap.min.css" />
	    <link rel="stylesheet" href="css/navbar-fixed-top.css" />
        <link rel="stylesheet" href="css/user-operate.css" />
        <link rel="stylesheet" href="css/main-image.css" />
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	</head>
	<body>
		<%
			Shop shop = (Shop) session.getAttribute("shop");
		%>
        <!--商家修改信息-->
        <div class="seller-image-chose" id="main-image-box">
            <div class="close"><img onclick="chose()" src="images/close.png"/></div>
            <div class="seller-chose-cols">
                <div id="localImag" class="seller-chose-box">
                    <img src="images/close.png" id="image-box"/>
                </div>
                
                <div class="seller-input-box">
                    <form>
                        <table class="table-box">
                            <tr>
                                <td>Shop Name:</td>
                                <td><input type="text"></td>
                            </tr>
                            <tr>
                                <td>Shop Phone:</td>
                                <td><input type="text"></td>
                            </tr>
                            <tr>
                                <td>Shop Address:</td>
                                <td><input type="text"></td>
                            </tr>
                            <tr>
                                <td>Shop Detail:</td>
                                <td><input type="text"></td>
                            </tr>
                            <tr>
                                <td colspan="2"><input type="submit" value="Update"></td>
                            </tr>
                        </table>
                    </form>
                </div>
            </div>
            <div class="seller-chose-cols" style="margin-top:0">
                <input type="file" onchange="javascript:mainbox(this)"/>
            </div>
        </div>

        <!--导航条-->
    	<div class="nav-box">
            <div class="logo-box">
                <a href="#"><image src="images/add.png"/>Biu Biu Biu</a>
            </div>
            <div class="banner-box">
                <ul>
                    <li><a href="#">Home</a></li>
                    <li><a href="#">Detail</a></li>
                    <li><a href="#">Evo</a></li>
                <ul>
            </div>
            <div class="login-box">
                    <span>Welcome <a href="#"><%out.print(shop.getName()); %></a> !</span>
	 	    <s>[</s><a href="" class="color">珠海</a><s>]</s>
                    <a href="index.jsp">Quit</a>

            </div>
    	</div>

        <div class="notice-broder-box">
            <div class="header-tittle"><p>Notice Broder</p></div>
        </div>


        <!--/*商家信息*/-->
        <div class="message-box">
            <div class="image-box"><image src="upload/shopImages/1.jpg"/></div>
            <div class="message-detail">
                <p>This is the Name</p>
                <detail>this is the detail</detail>
            </div>
            <div class="message-footer">
                <div class="float-left"> 
                    <a href="#" style="background:#eee;border:0.1em solid #bbb;">添加菜式</a>
                    <a href="menu!checkMenu?id=<%out.print(shop.getId()); %>">查询菜单</a>
                </div>
                <div class="float-right">
                    <a href="./checkOrder.html">查询订单</a>
                    <a href="./checkVolume.html">营业状况</a>
                </div>
            </div>
        </div>

        <div class="menu-box-seller">
        <s:fielderror name="errormessage" />
            <s:form  action="/menu!addMenu" method="post">
                <table class="table-box">
                    <tr>
                        <td>Dish Name:</td>
                        <td><s:textfield name="menu.name" label="name" /></td>
                    <tr>
                    <tr>
                        <td>Dish Price:</td>
                        <td><s:textfield name="menu.price" label="price" /></td>
                    </tr>
                    <tr>
                        <td>Dish Detil:</td>
                        <td><s:textfield name="menu.detail" label="detail" /></td>
                    </tr>
                    <tr>
                        <td>Dish Picsrc:</td>
                        <td><s:textfield name="menu.picsrc" label="picsrc" /></td>
                        <td><img src=""/></td>
                    </tr>
                    <tr>
                    	<input type="hidden" name="menu.shopid" value="<%=shop.getId() %>" />
                        <td colspan="2"><s:submit value="添加"/></td>
                    </tr>
                </table>
            </s:form>
        </div>

        <iframe class="frame-box" src="page/commFooter.html"></iframe>
    </body>
</html>