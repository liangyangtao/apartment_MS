$(document).ready(function() {
	$.ajax({
		url : "checkUser.action",
		type : "post",
		async : false,
		error : function(request) {
			alert("Connection error");
		},
		success : function(data) {
			if (data.isLogin == "true") {

			} else {
				alert("为了信息安全请登录后操作");
				window.location.href = "login.jsp";
			}
		}
	});

});