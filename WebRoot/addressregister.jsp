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
		<base href="<%=basePath%>">
		<title>BiuBiuBiuRegister</title>
		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
		<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
		<link rel="stylesheet" href="css/style.css" />
		<link rel="stylesheet" href="css/queryarea.css" />
		<script type="text/javascript">
	    function setS(o){
			var text =document.getElementById("secondaddress");
			var textid =document.getElementById("secondaddressid");
			text.value = o.innerHTML;
			textid.value = o.id;
	    }
        </script>
	</head>

	<body>

		<div class="first">
            		<a href="">香洲区</a>
            		<a href="">金湾区</a>
        	</div>
        
        	<div class="second">
           		<a onclick="setS(this);" id="1">唐家湾</a>
          		<a onclick="setS(this);" id="2">前山</a>
        	</div>


		<div class="lg-container">
			<s:form action="shopregister.jsp" id="lg-form">
				<s:submit value="ShopRegister"></s:submit>
			</s:form>
			<h1>
				BiuBiuBiu
				<br>
				<h3 align="center">
					This is Customer
					<br>
					register
				</h3>
			</h1>
			<s:fielderror name="errormessage" />
			<s:form action="register!customerregister" id="lg-form" name="lg-form"
				method="post" namespace="/">
				<div>
					<s:textfield name="user.firstaddress" label="First Address" value="123" disabled="true"/>

					<s:textfield id="secondaddress" name="user.secondaddress" label="Second Address" disabled="true"/>
					
					<s:hidden id="secondaddressid" value=""/>
					<s:textfield name="user.thirdaddress" label="Third Address" />

					

					<s:submit value="RegisterBiu" id="login" />
				</div>
			</s:form>
		</div>
	</body>
</html>
