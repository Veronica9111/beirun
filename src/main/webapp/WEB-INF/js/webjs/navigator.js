$(document).ready(function(){
	$.post("/user/getRoles",{},function(data){
		console.log(data)
		var roles = data.data;
		console.log(roles.indexOf(""));
		if(roles.indexOf("开票人") != -1){
			$("#navigator").append('<li><a class="link" href="/views/recordviews/create.html">开票</a></li>');
			$("#navigator").append('<li><a class="link" href="/views/recordviews/history.html">历史记录</a></li>');
		}
		if(roles.indexOf("业务主任") !=-1){
			$("#navigator").append('<li><a id="approve-nav" class="link" href="/views/recordviews/approval_invoice_1.html">审批</a></li>');
			$("#navigator").append('<li><a class="link" href="/views/recordviews/history.html">审批记录</a></li>');
			$.post("/project/getKaiPiaoQingKuangBiao_ZongGongSiByStatus", {status:0}, function(data){
				
				console.log(data);
				var list = $.parseJSON(data.data);
				console.log(list.length);
				var message = $("span");
				console.log(message)
				message.html(list.length);
				console.log($("#approve-nav"));
				$("#approve-nav").html("审批<span id='message' class='label label-danger label-small label-as-badge'>" + list.length + "</span>");
				
			});
		}
		if(roles.indexOf("分管所长") != -1){
			$("#navigator").append('<li><a class="link" href="/views/recordviews/approve2.html">二次审批</a></li>');
			$("#navigator").append('<li><a class="link" href="/views/recordviews/history.html">审批记录</a></li>');

		}
		if(roles.indexOf("管理") != -1){
			$("#navigator").append('<li><a class="link" href="/views/webviews/invoice/manage.html">管理</a></li>');
		}
		$("#navigator").append('<li><a class="link" href="/views/webviews/user/setting.html">个人设置</a></li>');
		$("#navigator").append('<li><a class="link" href="/logout">退出登录</a></li>');
		
		$(".link").each(function(){
			if($(this).attr("href") == window.location.pathname){
				$(this).addClass("active");
			}
			
		});
	});
	
});