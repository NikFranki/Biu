<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<html>
    <head>
        <link rel="stylesheet" href="../../css/bootstrap.min.css" />
        <link rel="stylesheet" href="../../css/navbar-fixed-top.css" />
        <link rel="stylesheet" href="../../css/user-operate.css" />
        <link rel="stylesheet" href="../../css/main-image.css" />
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    </head>
    <body>
        <div class="main-image-chose" id="main-image-box">
            <div class="close"><img src="../../images/close.png" onclick="chose()"/></div>
            <div class="chose-cols">
                <div class="chose-rows"><a href=""><img src="../../upload/userImages/1.jpg"></a></div>
                <div class="chose-rows"><a href=""><img src="../../upload/userImages/2.jpg"></a></div>
                <div class="chose-rows"><a href=""><img src="../../upload/userImages/3.jpg"></a></div>
                <div class="chose-rows"><a href=""><img src="../../upload/userImages/4.jpg"></a></div>
                <div class="chose-rows"><a href=""><img src="../../upload/userImages/5.jpg"></a></div>
            </div>
            <div class="chose-cols">
                <div class="chose-rows"><a href=""><img src="../../upload/userImages/6.jpg"></a></div>
                <div class="chose-rows"><a href=""><img src="../../upload/userImages/7.jpg"></a></div>
                <div class="chose-rows"><a href=""><img src="../../upload/userImages/8.jpg"></a></div>
                <div class="chose-rows"><a href=""><img src="../../upload/userImages/9.jpg"></a></div>
                <div class="chose-rows"><a href=""><img src="../../upload/userImages/10.jpg"></a></div>
            </div>
        </div>
        <div class="nav-box">
            <div class="logo-box">
                <a href="#"><image src="../../images/add.png"/>Biu Biu Biu</a>
            </div>
            <div class="banner-box">
                <ul>
                    <li><a href="#">Home</a></li>
                    <li><a href="#">Detail</a></li>
                    <li><a href="#">Evo</a></li>
                <ul>
            </div>
            <div class="login-box">
                    <span>Welcome <a href="./index.html">amdin</a> !</span>
            <s>[</s><a href="" class="color">珠海</a><s>]</s>
                    <a href="#2">Quit</a>

            </div>
        </div>

        <div class="shop-car-box">
            <div class="header-tittle"><p>Shopping Cart</p><a href="#3">Clear</a></div>
            <div class="car-menu-box">
                <div class="car-menu">
                    <menu>The Menu</menu>
                    <menu>$10</menu>
                    <menu>3</menu>
                </div>
                <div class="car-menu">
                    <menu>这里是中文名字</menu>
                    <menu>$10</menu>
                    <menu>3</menu>
                </div>
            </div>
            <div class="icon-pay">
                <a href="#">Go pay</a><price>$120</price>
            </div>
        </div>


        <!--/*用户信息*/-->
        <div class="message-box">
            <div class="image-box" style="border:0.1em solid #ccc;">
                <image title="点击修改头像" onclick="chose()" src="../../upload/userImages/4.jpg"/>
            </div>
            <div class="message-detail">
                <p>This is the Name</p>
                <detail>this is the detail</detail>
            </div>
            <div class="message-footer">
                <div class="float-left"> 
                    <a href="./changePWD.html">修改密码</a>
                    <a href="./changemessage.html" style="background:#eee;border:0.1em solid #bbb;">修改信息</a>
                </div>
                <div class="float-right">
                    <a href="./checkOrder.html">查询订单</a>
                    <a href="./checkVolume.html">支出状况</a>
                </div>
            </div>
        </div>

        <div class="menu-box-seller">
            <form>
                <table class="table-box">
                    <tr>
                        <td>User Name:</td>
                        <td><input type="text" name=""/></td>
                    <tr>
                    <tr>
                        <td>User First&nbsp;  Address:</td>
                        <td><input type="text" name=""/></td>
                    </tr>
                    <tr>
                        <td>User Second Address:</td>
                        <td><input type="text" name=""/></td>
                    </tr>
                    <tr>
                        <td>User Third &nbsp;Address:</td>
                        <td><input type="text" name=""/></td>
                    </tr>
                    <tr>
                        <td colspan="2"><input type="submit" value="添加"></td>
                    </tr>
                </table>
            </form>
        </div>

        <iframe class="frame-box" src="../commFooter.html"></iframe>
        <script type="text/javascript">
            var obj = document.getElementById("main-image-box");
            function chose(){
                if(obj.style.display=="none")
                    obj.style.display="block";
                else
                    obj.style.display="none"
            }
        </script>
    </body>
</html>