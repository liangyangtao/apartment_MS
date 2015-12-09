<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
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

<title>登陆</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link rel="shortcut icon" href="favicon.ico" />
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

<link rel="stylesheet" type="text/css" href="<%=path%>/v3/css/login.css" />
<script type="text/javascript"
	src="<%=path%>/v3/js/easyui/jquery.min.js" charset="utf-8"></script>
<script type="text/javascript" src="<%=path%>/v3/js/login.js"
	charset="utf-8"></script>

</head>

<body>
	<div id="layout">
		<div id="reg">
			<form id="myform" onsubmit="return CheckPost();">
				<ul>
					<li><input name="username" class="input_t" id="username"
						maxlength="16" type="text"></li>
					<li><input name="password" class="input_t" id="password"
						maxlength="16" type="password"></li>
					<li class="middle"><input name="authcode" autocomplete="off"
						class="input_t1" id="authcode" maxlength="4" type="text"><img
						src="getAuthcode.action?" alt="点击刷新" name="AuthCodeImg"
						id="authCodeImg" style="cursor:pointer;"
						onmouseup="this.src+=Math.random()"></li>
					<li><a href="<%=basePath%>/user/get_password.jsp">找回密码</a> <input
						name="submit" class="btn" id="submit" value="　 " type="submit">
					</li>
					<li><a href="<%=path%>/user/reg.jsp">注册会员</a> | <a
						href="<%=path%>/">网站首页</a></li>
				</ul>
			</form>
		</div>
	</div>
</body>
</html>
