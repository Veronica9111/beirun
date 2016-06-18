$(document).ready(function(){
	$.post("/user/getRoles",{},function(data){
		var roles = data.data;
		if(roles.indexOf("开票人") != -1){
			$("#navigator").append('<li><a class="nav_xiaoxiang" style="TEXT-DECORATION:none;" href="/views/recordviews/kaipiaoqingkuangbiao_zonggongsi_list.html?company_id=1">销项票</a></li>');
			//$("#navigator").append('<li><a class="link" href="/views/recordviews/weikaijufapiaomingxi_yiban.html">销项其它信息</a></li>');
			$("#navigator").append('<li><a class="nav_jinxiang" style="TEXT-DECORATION:none;" href="/views/recordviews/jinxiangfapiaomingxi_fapiao_zonggongsi.html?company_id=1">进项票</a></li>');
			//$("#navigator").append('<li><a class="link" href="/views/recordviews/budongchanfeiqidikoubiao.html">进项其它信息</a></li>');
			//$("#navigator").append('<li><a class="link" href="/views/recordviews/xiaoxiangbiao.html">汇总信息</a></li>');
		}
		if(roles.indexOf("业务主任") !=-1){
			$("#navigator").append('<li><a id="approve-nav" class="link" href="/views/recordviews/approval_invoice_list_2.html">审批销项</a></li>');
			//$("#navigator").append('<li><a class="link" href="/views/recordviews/history_xiaoxiang.html">审批记录</a></li>');
			$("#navigator").append('<li><a class="link" href="/views/recordviews/fapiaowenjian.html">审批进项</a></li>');
			$.post("/project/getUnApprovedKaiPiaoQingKuangBiao_XiangMuByUserCount", {}, function(data){
				if(data.count != 0 || data.count != "0"){
					console.log(data.count);
					$("#approve-nav").html("审批消项<span id='message' class='label label-danger label-small label-as-badge'>" + data.count + "</span>");
				}

				
			});
		}
		if(roles.indexOf("分管所长") != -1){
			/*
			$("#navigator").append('<li><a class="link" href="/views/recordviews/approve2.html">二次审批</a></li>');
			$("#navigator").append('<li><a class="link" href="/views/recordviews/history.html">审批记录</a></li>');*/
			$("#navigator").append('<li><a id="approve-nav" class="link" href="/views/recordviews/approval_invoice_list_2.html">审批销项</a></li>');
			$("#navigator").append('<li><a class="link" href="/views/recordviews/fapiaowenjian_zonggongsi.html">审批进项</a></li>');
			$.post("/project/getUnApprovedKaiPiaoQingKuangBiao_XiangMuByUserCount", {}, function(data){
				console.log(data.count);
				if(data.count != 0 || data.count != "0"){
					$("#approve-nav").html("审批消项<span id='message' class='label label-danger label-small label-as-badge'>" + data.count + "</span>");
				}

				
			});
			$("#navigator").append('<li><a class="link" href="/views/recordviews/xiaoxiangbiao.html">汇总信息</a></li>');
		}
		if(roles.indexOf("管理") != -1){
			$("#navigator").append('<li><a class="link" href="/views/webviews/invoice/manage.html">管理</a></li>');
		}
		//$("#navigator").append('<li><a class="link" href="/views/webviews/user/setting.html">个人设置</a></li>');
		$("#navigator").append('<li><a class="link" href="/logout">退出</a></li>');
		
		/*$(".link").each(function(){
			var tmp = window.location.pathname;
			var tmp2 = $(this).attr("href");
			if($(this).attr("href").indexOf(window.location.pathname) != -1){
				$(this).addClass("active");nav_jinxiang
			}
		});*/
		navJinXiao();
	});
	
});