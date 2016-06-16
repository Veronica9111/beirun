global = {};
var d = new Date();
var month = d.getMonth();
month = month+1;

if(month  < 10){
	month = "0"+month;
}
var date = d.getDate();
if(date < 10){
	date = "0"+date;
}
var timeStamp = d.getFullYear() + "-" + month + "-" + date;
global.timeStamp = timeStamp;

$.post('/user/getRoles',{},function(data){
	if(data.data.length == 0){
		alert("访问已超时，请重新登录！");
		window.location.href="/views/frontviews/index.html";

	}else{
		var roles = data.data;
		global.roles = roles;
		$.post('/user/getUserName',{},function(data){
			if(data.data == ""||data.data == null){
				alert("访问已超时，请重新登录！");
				window.location.href="/views/frontviews/index.html";		
			}else{
				var userName = data.data;
				global.userName = userName;
				try{
					startPageJS();
				}catch(err){
					//Don't need to do anything
				}
				
			}
		});
	}
	
});
