$(function() {
	//粒子背景特效
	$('body').particleground({
		dotColor : '#5cbdaa',
		lineColor : '#5cbdaa'
	});
})
/**
   * 用户登录
   */
//$(function() {
//	$('.submit_btn').click(function() {
//		var username = $("input[name='username']").val();
//		if (username.length <= 0) {
//			$("input[name='username']").attr("placeholder", "请输入帐号");
//			return false;
//		}
//		var password = $("input[name='password']").val();
//		if (password.length <= 0) {
//			$("input[name='password']").attr("placeholder", "请输入密码");
//			return false;
//		};
//		$.ajax({
//			url : "${ctx}/login",
//			type : "post",
//			dataType: "json",
//            contentType: "application/json",
//			data : {
//				"username" : username,
//				"password" : password
//			},
//			success : function(result) {
//				window.location.href = 'index.action'
//			}
//		});
//	})
//});
/**
 * 回车登录实现
 */
$(document).keyup(function(event) {
	if (event.keyCode == 13) {
		$(".submit_btn").trigger("click");
	}
});