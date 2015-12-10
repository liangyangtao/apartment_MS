function datagridLoader() {
	$('#tt').datagrid({
		url : "./../readApartment.action",
		width : '100%',
		nowrap : true,
		iconCls : 'icon-save',
		striped : true,
		rownumbers : true,
		singleSelect : true,
		fitColumns : true,
		remoteSort : false,
		rownumbers : true,
		pagination : true,
		loadMsg : '数据加载中......',
		columns : [ [ {
			field : 'id',
			title : '公寓编号',
			width : 60,
			align : 'left'
		},

		{
			field : 'apartName',
			title : '公寓名称',
			align : 'left',
			width : 300
		}, {
			field : 'apartRoomNum',
			title : '公寓房间数量',
			width : 300,
			align : 'left'

		}, {
			field : 'surplusRoomNum',
			title : '空闲房间数量',
			width : 300,
			align : 'left'

		}, {
			field : 'apartPlace',
			title : '公寓地址',
			width : 300,
			align : 'left'

		} ] ]

	});
}

$(document).ready(
		function() {
			datagridLoader();
			var p = $('#tt').datagrid('getPager');

			$(p).pagination({
				pageSize : 20,// 每页显示的记录条数，默认为10
				pageList : [ 20 ],// 可以设置每页记录条数的列表
				beforePageText : '第',// 页数文本框前显示的汉字
				afterPageText : '页    共 {pages} 页',
				displayMsg : '当前显示 {from} - {to} 条记录   共 {total} 条记录'
			});

			var row = $('#tt').datagrid('getSelected');
			if (row) {
				$.messager.alert('Info', row.itemid + ":" + row.productid + ":"
						+ row.attr1);
			}
			/*
			 * $("#cc").combobox({
			 * 
			 * onChange : function(n, o) {
			 * 
			 * var peo = $('#cc').combobox('getValue'); datagridLoader(peo); }
			 * });
			 */
		});