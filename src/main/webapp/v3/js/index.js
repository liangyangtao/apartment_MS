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
	windowResize(); // 文档载入时加载
	$(window).resize(function() {
		windowResize(); // 窗口改变大小时加载
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

