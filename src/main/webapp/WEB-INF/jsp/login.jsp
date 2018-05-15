<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>宾馆管理系统</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/login.css" />
</head>

<body>
	<dl class="admin_login">
		<dt>
			<strong>宾馆管理系统</strong> <em>Management System</em>
		</dt>
		<form method="post" action="${pageContext.request.contextPath}/login">
			<dd class="user_icon">
				<input type="text" lay-verify="required" name="username" placeholder="请输入账号"
					class="login_txtbx" />
			</dd>
			<dd class="pwd_icon">
				<input type="password" lay-verify="required" name="password" placeholder="请输入密码"
					class="login_txtbx" />
			</dd>
			<span></span>
			<dd>
			<button class="submit_btn">登录</button>
			</dd>
		</form>
	</dl>
	<script src="js/common/jquery/jquery-3.2.0.min.js"></script>
	<script src="${pageContext.request.contextPath}/js/common/layer/layer.js"></script>
	<script
		src="${pageContext.request.contextPath}/js/common/particleground/js/jquery.particleground.min.js"></script>
	<script src="${pageContext.request.contextPath}/js/js/login.js"></script>
	
</body>
</html>