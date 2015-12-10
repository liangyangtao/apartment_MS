<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!-- 引入Jquery -->
<script type="text/javascript"
	src="<%=path%>/v3/js/easyui/jquery.min.js" charset="utf-8"></script>
<!-- 引入Jquery_easyui -->
<script type="text/javascript"
	src="<%=path%>/v3/js/easyui/jquery.easyui.min.js" charset="utf-8"></script>
<!-- 引入easyUi国际化--中文 -->
<script type="text/javascript"
	src="<%=path%>/v3/js/easyui/locale/easyui-lang-zh_CN.js"
	charset="utf-8"></script>
<!-- 引入easyUi默认的CSS格式--蓝色 -->
<link rel="stylesheet" type="text/css"
	href="<%=path%>/v3/js/easyui/themes/default/easyui.css" />
<!-- 引入easyUi小图标 -->
<link rel="stylesheet" type="text/css"
	href="<%=path%>/v3/js/easyui/themes/icon.css" />
<style type="text/css">
#apartPlace {
	width: 500px;
}
</style>
<script type="text/javascript" src="<%=path%>/v3/js/addapartment.js"
	charset="utf-8"></script>
</head>
<body class="easyui-layout">
	<div class="easyui-panel" title="增加公寓" style="width:100%;padding:10px;">
		<form id="addapartment" onsubmit="return checkPost();">
			<table>
				<tr>
					<td>公寓名:</td>
					<td><input name="apartName" id="apartName"
						class="easyui-textbox"></input>
					</td>
				</tr>
				<tr>
					<td>房间数目:</td>
					<td><input name="apartRoomNum" id="apartRoomNums"
						class="easyui-numberbox" value="10"></input> <font color="red">请输入数字</font>
					</td>
				</tr>
				<tr>
					<td>地址:</td>
					<td><input name="apartPlace" id="apartPlace"
						class="easyui-textbox" value="山西职业技术学院"></input>
					</td>
				</tr>
				<tr>
					<td></td>
					<td><input type="submit" id="submit" value="保存"></input> <input
						type="reset" id="reset" value="重置"></input>
					</td>
				</tr>
			</table>
		</form>
	</div>




</body>
</html>