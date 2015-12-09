function CheckPost() {
	if ($("#username").val() == "") {
		$("#username").css({
			color : "#FF0000"
		});
		$("#username").focus();
		return false;
	}
	if ($("#password").val() == "") {
		$("#password").css({
			color : "#FF0000"
		});
		$("#password").focus();
		return false;
	}
	if ($("#authcode").val() == "") {
		$("#authcode").css({
			color : "#FF0000"
		});
		$("#authcode").focus();
		return false;
	} else {
		$.ajax({
			url : "loginUser.action",
			type : "post",
			data : $("#myform").serialize(),
			async : false,
			error : function(request) {
				alert("Connection error");
			},
			success : function(data) {
				alert(data);
				if (data == null) {
					alert("请输入正确的用户名和密码")
				} else {
					window.location.href = "index.jsp";
				}
			}
		});
	}
	return false;
};
