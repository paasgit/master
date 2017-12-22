<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>资源更新</title>
<link rel="stylesheet" href="${ctx}/css/base.css">
<link rel="stylesheet" href="${ctx}/layui/css/layui.css" media="all">
</head>
<body>
	<div class="body_top_marger10">
		<div class="layui-main layui-form-pane" style="width: 550px">
			<form class="layui-form" action="">
				<div class="hidder_body">
					<input type="hidden" value="${resource.id }" name="id" id="id">
				</div>
				<div class="layui-form-item">
					<label class="layui-form-label"><font color="red">*</font>资源名称</label>
					<div class="layui-input-block">
						<input type="text" id="resource_name" value="${resource.resourceName }" readonly="readonly"
							name="resource_name" required
							lay-verify="required" placeholder="输入个中文名称吧" autocomplete="off"
							class="layui-input">
					</div>
				</div>
				<div class="layui-form-item">
					<label class="layui-form-label"><font color="red">*</font>资源</label>
					<div class="layui-input-block">
						<input type="text" id="resource" name="resource" value="${resource.resource }"
							required lay-verify="required"
							placeholder="资源路径" autocomplete="off" class="layui-input">
					</div>
				</div>
				<div class="layui-form-item">
					<label class="layui-form-label">上一级资源</label>
					<div class="layui-input-block">
						<input type="text" id="resource_parent" name="resource_parent" value="${resource.resourceParent }"
						placeholder="上一级资源路径" autocomplete="off" class="layui-input">
					</div>
				</div>
				<div class="layui-form-item">
					<label class="layui-form-label"><font color="red">*</font>资源描述</label>
					<div class="layui-input-block">
						<input type="text" id="resource_desc" name="resource_desc" value="${resource.resourceDesc }"
							required lay-verify="required"
							placeholder="随便写点什么吧" autocomplete="off" class="layui-input">
					</div>
				</div>
				<div class="layui-form-item" pane>
					<label class="layui-form-label"><font color="red">*</font>资源类型</label>
					<div class="layui-input-block">
						<c:if test="${resource.resourceType==1 }">
							<input type="radio" name="resource_type" value="1" title="菜单" checked> <input
							type="radio" name="resource_type" value="2" title="按钮">
						</c:if>
						<c:if test="${resource.resourceType==2 }">
							<input type="radio" name="resource_type" value="1" title="菜单" > <input
							type="radio" name="resource_type" value="2" title="按钮" checked>
						</c:if>
					</div>
				</div>
				<div class="layui-form-item" pane>
					<label class="layui-form-label"><font color="red">*</font>资源范围</label>
					<div class="layui-input-block">
						<c:if test="${resource.resourceScope==1 }">
							<input type="radio" name="resource_scope" value="1" title="系统资源" checked> <input
							type="radio" name="resource_scope" value="2" title="普通资源">
						</c:if>
						<c:if test="${resource.resourceScope==2 }">
							<input type="radio" name="resource_scope" value="1" title="系统资源" > <input
							type="radio" name="resource_scope" value="2" title="普通资源" checked>
						</c:if>
					</div>
				</div>
				<div class="layui-form-item" pane>
					<label class="layui-form-label">是否启用</label>
					<div class="layui-input-block">
						<c:if test="${resource.status==1 }">
							<input type="checkbox" id="status" checked="checked"
								name="status" lay-skin="switch" lay-text="启用|禁用">
						</c:if>
						<c:if test="${resource.status==2 }">
							<input type="checkbox" id="status"
								name="status" lay-skin="switch" lay-text="启用|禁用">
						</c:if>
					</div>
				</div>
				<div class="layui-form-item">
					<div class="layui-input-block">
						<button class="layui-btn" lay-submit lay-filter="formSubmit">保存</button>
						<button type="reset" class="layui-btn layui-btn-primary">重置</button>
					</div>
				</div>
			</form>
		</div>
	</div>
	<script src="${ctx}/js/jquery.min.js"></script>
	<script src="${ctx}/layui/layui.js"></script>
	<script type="text/javascript">
		var rootPath = '${ctx}';
	</script>
	<script src="${ctx}/js/jfTable.js"></script>
	<script src="${ctx}/js/system/resource/resource_update.js"></script>
</body>
</html>