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

<title>没有权限</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link rel="shortcut icon" href="favicon.ico" />

<script type="text/javascript"
	src="<%=path%>/v3/js/easyui/jquery.min.js" charset="utf-8"></script>
<script type="text/javascript" src="<%=path%>/v3/js/noPermission.js"
	charset="utf-8"></script>
</head>

<body>
	<div id="addBox">对不起你无权查看该界面</div>
</body>
</html>
