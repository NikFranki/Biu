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
		<title>BiuBiuBiuLogin</title>
		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
		<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
		<link rel="stylesheet" href="css/style.css" />
	</head>

	<body>
		<div class="lg-container">
			<h1>
				BiuBiuBiu
			</h1>
			<s:fielderror name="errormessage" />
			<s:form action="login!login" id="lg-form" name="lg-form"
				method="post" namespace="/">
				<div>
					<s:textfield name="user.username" label="username" />

					<s:password name="user.password" label="password" />

					<s:radio name="usertype" value="1"
						list="#{1:'Customer',2:'Shoper'}" />

					<s:submit value="LoginBiu" id="login" />
				</div>
			</s:form>
			<s:form action="register.jsp" id="lg-form">
				<s:submit value="Register"></s:submit>
			</s:form>
		</div>
	</body>
</html>
