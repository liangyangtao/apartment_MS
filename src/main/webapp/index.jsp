<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
	String userID = "0";
	HttpSession httpSession = request.getSession();

	Object o_name = httpSession.getAttribute("USER_NAME");
	/* if (o_name == null) {
		response.sendRedirect("login.jsp");
	} else {

		String name = String.valueOf(httpSession
				.getAttribute("USER_NAME"));
		userID = String.valueOf(httpSession.getAttribute("USER_ID"));
		String permission = String.valueOf(httpSession
				.getAttribute("PERMISSION"));
		if ("ADMIN".equals(permission)) {
			response.sendRedirect("admin_index.jsp");
		}

	} */
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>查询界面</title>
<link rel="shortcut icon" href="favicon.ico" />
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

<link rel="stylesheet" type="text/css" href="<%=path%>/v3/css/index.css" />
<script type="text/javascript" src="<%=path%>/v3/js/index.js"
	charset="utf-8"></script>
</head>
<body class="easyui-layout">

	<div data-options="region:'north'" style=" overflow:hidden;">
		<div style="margin:10px 5px 15px 20px;">
			<div
				style="font-family:arial;color:black;font-size:30px;margin:20px 5px 15px 150px;">公寓管理系统</div>
			<div style="margin:20px 5px 15px 300px;">-----------------------</div>


		</div>
	</div>

	<div data-options="region:'west',split:true" title="学生公寓管理系统"
		style="width:200px;overflow:hidden;overflow-y:auto;">
		<div class="easyui-accordion" data-options="fit:true,border:false">
			<div title="公寓信息管理" data-options="iconCls:'icon-search'">
				<ul id="nav">
					<li><a class="easyui-linkbutton"
						data-options="iconCls:'icon-search'" plain="false"
						href="javascript:void(0);"
						onclick="addTab('添加公寓','/apartment/addapartment.jsp','icon-save')">添加公寓</a>
					</li>
					<li><a class="easyui-linkbutton"
						data-options="iconCls:'icon-search'" plain="false"
						href="javascript:void(0);"
						onclick="addTab('公寓管理','/apartment/manageApartment.jsp','icon-save')">公寓管理</a>
					</li>
				</ul>

			</div>
			<div title="学生信息管理" data-options="iconCls:'icon-search'">
				<ul id="nav">
					<li><a class="easyui-linkbutton"
						data-options="iconCls:'icon-search'" plain="false"
						href="javascript:void(0);"
						onclick="addTab('增加学生','/billquery/jdbillquery.jsp','icon-save')">增加学生</a>
					</li>
					<li><a class="easyui-linkbutton"
						data-options="iconCls:'icon-search'" plain="false"
						href="javascript:void(0);"
						onclick="addTab('修改学生信息','/billquery/jdbillquery.jsp','icon-save')">修改学生信息</a>
					</li>
					<li><a class="easyui-linkbutton"
						data-options="iconCls:'icon-search'" plain="false"
						href="javascript:void(0);"
						onclick="addTab('删除学生','/billquery/jdbillquery.jsp','icon-save')">删除学生</a>
					</li>


				</ul>

			</div>
			<div title="宿舍信息管理" data-options="iconCls:'icon-search'">
				<ul id="nav">
					<li><a class="easyui-linkbutton"
						data-options="iconCls:'icon-search'" plain="false"
						href="javascript:void(0);"
						onclick="addTab('增加宿舍','/billquery/jdbillquery.jsp','icon-save')">增加宿舍</a>
					</li>
					<li><a class="easyui-linkbutton"
						data-options="iconCls:'icon-search'" plain="false"
						href="javascript:void(0);"
						onclick="addTab('修改宿舍信息','/billquery/jdbillquery.jsp','icon-save')">修改宿舍信息</a>
					</li>
					<li><a class="easyui-linkbutton"
						data-options="iconCls:'icon-search'" plain="false"
						href="javascript:void(0);"
						onclick="addTab('删除宿舍信息','/billquery/jdbillquery.jsp','icon-save')">删除宿舍信息</a>
					</li>
				</ul>

			</div>
			<div title="宿舍财产管理" data-options="iconCls:'icon-search'">
				<ul id="nav">
					<li><a class="easyui-linkbutton"
						data-options="iconCls:'icon-search'" plain="false"
						href="javascript:void(0);"
						onclick="addTab('增加宿舍财产','/billquery/jdbillquery.jsp','icon-save')">增加宿舍财产</a>
					</li>
					<li><a class="easyui-linkbutton"
						data-options="iconCls:'icon-search'" plain="false"
						href="javascript:void(0);"
						onclick="addTab('修改宿舍财产','/billquery/jdbillquery.jsp','icon-save')">修改宿舍财产</a>
					</li>
					<li><a class="easyui-linkbutton"
						data-options="iconCls:'icon-search'" plain="false"
						href="javascript:void(0);"
						onclick="addTab('删除宿舍财产','/billquery/jdbillquery.jsp','icon-save')">删除宿舍财产</a>
					</li>
				</ul>

			</div>

		</div>
	</div>
	<div data-options="region:'center'" style="overflow: hidden;">
		<div id="index_tabs"></div>
		<div id="tabsMenu" style="width: 120px;display:none;">
			<div type="refresh">刷新</div>
			<div class="menu-sep"></div>
			<div type="close">关闭</div>
			<div type="closeOther">关闭其他</div>
			<div type="closeAll">关闭所有</div>
		</div>

	</div>
</body>
</html>