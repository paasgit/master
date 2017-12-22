layui.use([ 'element', 'form', 'laydate' ], function() {
	var element = layui.element(), form = layui.form(),laydate = layui.laydate;

	form.verify({
		role : function(value) {
			var msg = "";
			$.ajax({
				type : "post",
				url : rootPath + "/system/roleIsExist.shtml?role="+value,
				cache : false,
				async : false,
				dataType : "json",
				success : function(obj) {
					if (!obj.status) {
						msg = obj.message;
						return obj.message;
					}
				}
			});
			if (msg!="") {
				return msg;
			}
		}
	});

	form.on('submit(formSubmit)', function(data) {
		
		var parames = {};
		
		var roleUser = new Array()
		$("#binding option").each(function(){ 
	        var selectValue = $(this).val(); 
	        roleUser[roleUser.length] = selectValue;
	    });
		
		var permission = new Array()
		$("#permission option").each(function(){ 
	        var selectValue = $(this).val(); 
	        permission[permission.length] = selectValue;
	    });
		
		parames.roleUser = roleUser.toString();
		parames.permission = permission.toString();
		
		var parames = $.extend(parames, data.field);
		
		$.post(rootPath + "/system/roleAdd.shtml", parames, function(result) {
			if (!result.status) {
				layer.msg(result.message, {
					icon : 5,
					shift : 6
				});
			} else {
				layer.msg('添加成功', {
					icon : 1
				});
				parent.refreshRoleList();
			}
		}, "json");
		return false;
	});
	
	$("#role_bind_user").empty().load(rootPath + "/system/goRoleBindUser.shtml", function() {
		form.render();
	});
	
	$("#role_bind_resource").empty().load(rootPath + "/system/goRoleBindPermission.shtml", function() {
		form.render();
	});
})