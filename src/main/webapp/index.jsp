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
<style>
body {
	font-family: helvetica, tahoma, verdana, sans-serif;
	padding: 20px;
	font-size: 13px;
	margin: 0;
}

#nav {
	line-height: 27px;
	list-style-type: none;
	text-align: left;
	left: -999em;
	width: 180px;
	position: absolute;
	margin-top: 5px;
	margin: 0;
	padding: 0;
	border: 0;
}

#nav  li {
	float: left;
	width: 180px;
	margin-top: 5px;
}

#nav  a {
	display: block;
	width: 156px;
	text-align: left;
	padding-left: 24px;
}

#nav  a:link {
	text-decoration: none;
}

#nav  a:visited {
	text-decoration: none;
}

#nav a:hover {
	text-decoration: none;
	font-weight: normal;
}

#nav {
	left: auto;
}

#nav {
	left: auto;
}
</style>
<script type="text/javascript">
	var centerTabs;
	var tabsMenu;
	$(function() {
		tabsMenu = $('#tabsMenu').menu(
				{
					onClick : function(item) {
						var curTabTitle = $(this).data('tabTitle');
						var type = $(item.target).attr('type');

						if (type === 'refresh') {
							refreshTab(curTabTitle);
							return;
						}

						if (type === 'close') {
							var t = centerTabs.tabs('getTab', curTabTitle);
							if (t.panel('options').closable) {
								centerTabs.tabs('close', curTabTitle);
							}
							return;
						}

						var allTabs = centerTabs.tabs('tabs');
						var closeTabsTitle = [];

						$.each(allTabs, function() {
							var opt = $(this).panel('options');
							if (opt.closable && opt.title != curTabTitle
									&& type === 'closeOther') {
								closeTabsTitle.push(opt.title);
							} else if (opt.closable && type === 'closeAll') {
								closeTabsTitle.push(opt.title);
							}
						});

						for ( var i = 0; i < closeTabsTitle.length; i++) {
							centerTabs.tabs('close', closeTabsTitle[i]);
						}
					}
				});

		centerTabs = $('#index_tabs').tabs({
			fit : true,
			border : false,
			onContextMenu : function(e, title) {
				e.preventDefault();
				tabsMenu.menu('show', {
					left : e.pageX,
					top : e.pageY
				}).data('tabTitle', title);
			}
		});
	});

	function refreshTab(title) {
		var tab = centerTabs.tabs('getTab', title);
		centerTabs.tabs('update', {
			tab : tab,
			options : tab.panel('options')
		});
	}
	function windowResize() {
		var width = $(window).width() - 10;
		var height = $(window).height() - 10;
		$('#index_layout').width(width);
		$('#index_layout').height(height);
		$('#index_layout').layout();
	}
	$(function() {
		windowResize(); //文档载入时加载  
		$(window).resize(function() {
			windowResize(); //窗口改变大小时加载  
		});
	});
	function addTab(cname, curl, ciconCls) {
		if (centerTabs.tabs('exists', cname)) {
			centerTabs.tabs('select', cname);
			refreshTab(cname);
		} else {
			if (curl && curl.length > 0) {
				centerTabs
						.tabs(
								'add',
								{
									title : cname,
									closable : true,
									iconCls : ciconCls,
									content : '<iframe  scrolling="auto" src="${pageContext.request.contextPath}'
											+ curl
											+ '" frameborder="0" style="border:0;width:100%;height:99.4%;"></iframe>',
									tools : [ {
										iconCls : 'icon-mini-refresh',
										handler : function() {
											refreshTab(cname);
										}
									} ]
								});
			} else {
				centerTabs
						.tabs(
								'add',
								{
									title : cname,
									closable : true,
									iconCls : ciconCls,
									content : '<iframe src="error/err.jsp" frameborder="0" style="border:0;width:100%;height:99.4%;"></iframe>',
									tools : [ {
										iconCls : 'icon-mini-refresh',
										handler : function() {
											refreshTab(cname);
										}
									} ]
								});
			}
		}
	}
</script>

</head>
<body class="easyui-layout">

	<div data-options="region:'north'" style=" overflow:hidden;">
		<div style="margin:10px 5px 15px 20px;">
			<div
				style="font-family:arial;color:black;font-size:30px;margin:20px 5px 15px 150px;">公寓管理系统</div>
			<div style="margin:20px 5px 15px 300px;">-----------------------</div>


		</div>
	</div>

	<div data-options="region:'west',split:true" title="查询导航"
		style="width:200px;overflow:hidden;overflow-y:auto;">
		<div class="easyui-accordion" data-options="fit:true,border:false">
			<div title="管理一" data-options="iconCls:'icon-save'">
				<ul id="nav">
					<li><a class="easyui-linkbutton"
						data-options="iconCls:'icon-save'" plain="false"
						href="javascript:void(0);"
						onclick="addTab('京东小银票查询','/billquery/jdbillquery.jsp','icon-save')">占位一</a>
					</li>



				</ul>

			</div>
			<div title="管理二" data-options="iconCls:'icon-save'">
				<ul id="nav">
					<li><a class="easyui-linkbutton"
						data-options="iconCls:'icon-save'" plain="false"
						href="javascript:void(0);"
						onclick="addTab('京东小银票查询','/billquery/jdbillquery.jsp','icon-save')">占位一</a>
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