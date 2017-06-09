/**
 * user page js
 */

function userConfig(){
	
	var self=this;

	this.init=function(){
		
		$('#loginBtn').bind('click',function(){
			self.login();
		});
		
	}
	
	this.login=function(){

		var name = $.trim($("#name").val());
		var pwd = $.trim($("#pwd").val());
		
		if(name==null || name==""){
			layer.msg('名称不能为空！', {icon: 7});
			return;
		}
		
		if(pwd==null || pwd==""){
			layer.msg('密码不能为空！', {icon: 7});
			return;
		}
		
		$.post("login",{"name":name,"pwd":pwd},function(data){
			if(data.success){
				window.location.href = "index";
			} else {
				layer.msg("登陆失败，请检查用户名与密码!", {icon: 7});
			}
		}).fail(function(data){
				layer.msg("系统异常，请联系系统管理员!", {icon: 7});
		});
		
	}
	
	self.init();
	
}
