function checkPost() {
	if ($("#apartName").val() == "") {
		$("#apartName").css({
			color : "#FF0000"
		});
		$("#apartName").focus();
		return false;
	}
	if ($("#apartRoomNum").val() == "") {
		$("#apartRoomNum").css({
			color : "#FF0000"
		});
		$("#apartRoomNum").focus();
		return false;
	}
	if ($("#apartPlace").val() == "") {
		$("#apartPlace").css({
			color : "#FF0000"
		});
		$("#apartPlace").focus();
		return false;
	} else {
		$.ajax({
			url : "./../addApartment.action",
			type : "post",
			data : $("#addapartment").serialize(),
			async : false,
			error : function(request) {
				alert("请求失败");
			},
			success : function(data) {
				if (data.isSave == "false") {
					alert("保存失败");
				} else if (data.isSave == "true") {
					alert("保存成功");
				} else {
					alert("服务器发送错误");
				}
			}
		});
	}
	return false;
};
