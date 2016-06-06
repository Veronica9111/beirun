/* 
	Create left menu tree
*/


$.post('/getMenu',{},function(dataSet){
	var tree = $.parseJSON(dataSet.data);
	$('#left-menu').treeview({data: tree});
	$("#left-menu").click(function(){
		var node = $('#left-menu').treeview('getSelected');

		try{
			nodeClick(node[0]);
		}catch(err){
			//Don't need to react when the menu is clicked
		}
		
		/*if(level == "2"){
			//获取项目所有的的开票申请单
			$.post("/project/getKaiPiaoShenQingDanByProjectId", {'project_id': node[0].company_id}, function(data){
				console.log(data);
				 dataSet  = $.parseJSON(data.data);
				$("#container").html("<input id='create-kpsqd' value='新建开票申请单' type='button'/><table id='kpsqd-table'></table>");

				$('#kpsqd-table').DataTable( {"sDom": '<"top" f>rt<"bottom" p><"clear">',
			    	data: dataSet,	
			    	"order": [[ 0, "desc" ]],
			    	"oLanguage": {
			    	    "sSearch": "查找 ",
			    	    oPaginate: {
			    	    	'sPrevious': "上一页",
			    	    	'sNext': "下一页",
			    	    }
			    	  },
			    	  pageLength:10,
				    columns: [
				        { title: "记录编号" },
				        { title: "项目名" },

				        //{ title: "" }
				    ]
				} );
				$("#create-kpsqd").on("click", function(){
					$.post("/project/getKaiPiaoShenQingDanHTML", {'type':'create'}, function(data){
						$("#container").html(data.data);
						var parentNode = $('#left-menu').treeview('getParent', node);
						console.log(parentNode);
						var companyName = parentNode.text;
						$("#fengongsimingcheng").html(companyName);
					});
					
				});
				
			});
			
		}else if(level == "1"){
			//获取所有子公司的项目
			
			console.log(node[0].company_id);
			$.post("/project/getProjectsByCompanyId", {'company_id': node[0].company_id}, function(data){
				 dataSet  = $.parseJSON(data.data);
				 $("#container").html("<input id='create-project' value='新建项目' type='button'/><table id='project-table'></table>");
				$('#project-table').DataTable( {"sDom": '<"top" f>rt<"bottom" p><"clear">',
			    	data: dataSet,	
			    	"order": [[ 0, "desc" ]],
			    	"oLanguage": {
			    	    "sSearch": "查找 ",
			    	    oPaginate: {
			    	    	'sPrevious': "上一页",
			    	    	'sNext': "下一页",
			    	    }
			    	  },
			    	  pageLength:10,
				    columns: [
				        { title: "记录编号" },
				        { title: "项目名" },

				        { title: "" }
				    ]
				} );
				$("#create-project").on('click', function(){
					$("#container").html("新建项目" + node[0].text);
					$.post("/project/getXiangMuTaiZhangHTML", {"type":"create"}, function(data){
						$("#container").html(data.data);
						$.post("/project/getProjectById", {id:1}, function(data){
							console.log(data);
							for(key in data){
								$("#" + key).val(data[key]);
								if(key == "hetongleixing" || key == "hetongfukuanfangshi"){
									$("input[name=hetongleixing_select][value='"+data[key]+"']").prop("checked",true);
									
								}
							}
							//console.log(node[0].text);
							
							$("#fengongsimingcheng").html(node[0].text);
							
						});
						$("#create-xiangmutaizhang").on('click', function(){
							var hetongleixing = $('input:checked', '#hetongleixing').val();
							var hetongfukuanfangshi = $('input:checked', '#hetongfukuanfangshi').val();
							console.log(hetongleixing);
							console.log(hetongfukuanfangshi);
							var dataSet = {};
							$(".text").each(function(){
								console.log($(this).attr('id'));
								dataSet[$(this).attr('id')] = $(this).val();
							});
							dataSet['hetongleixing'] = hetongleixing;
							dataSet['hetongfukuanfangshi'] = hetongfukuanfangshi;
							
							$.post('/project/addProject', dataSet, function(data){
								console.log(data);
								
							});

						});
					});
				});
			});
				
		}//level endif*/
		
	});
});





