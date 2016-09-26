<!DOCTYPE html>
<html>

	<head>
		<meta charset="UTF-8">
		<title></title>
		<link rel="stylesheet" type="text/css" href="easyUI/themes/default/easyui.css">
		<link rel="stylesheet" type="text/css" href="easyUI/themes/icon.css">
		<link rel="stylesheet" type="text/css" href="css/web.css">
		<script type="text/javascript" src="easyUI/js/jquery.min.js"></script>
		<script type="text/javascript" src="easyUI/js/jquery.easyui.min.js"></script>
	</head>

	<body>
		<div>
			<div style="margin-bottom: 20px; display: inline;">
				<span class="paraName">项目名称:</span> <input class="easyui-textbox" id="name" name="name" style="width: 150px; height: 32px">
			</div>
			<a href="javascript:void(0)" id="search_btn" class="easyui-linkbutton" data-options="iconCls:'icon-search'" style="width: 70px;height: 30px;">查找</a>
		</div>
		<div class="hr"></div>
		<table id="dg" style="width:auto;height:auto;" data-options="rownumbers:true,singleSelect:true,pagination:true,url:'getProjectByName.do',method:'get'" toolbar="#tb">
			<thead>
				<tr>
					<th data-options="field:'id',width:200,align:'center'">项目ID</th>
					<th data-options="field:'name',width:200,align:'center'">项目名称</th>
					<th data-options="field:'watershedId',width:100,align:'center'">流域ID</th>
					<th data-options="field:'describe',width:200,align:'center'">项目描述</th>
					<th data-options="field:'createTime',width:200,align:'center'">创建时间</th>
					<th data-options="field:'baseYear',width:100,align:'center'">基准年</th>
					<th data-options="field:'goalYear',width:100,align:'center'">目标年</th>
					<th data-options="field:'step',width:100,align:'center'">计算步长</th>
				</tr>
			</thead>
		</table>
		<div id="tb">
		<a href="#" class="easyui-linkbutton" iconCls="icon-add" plain="true" onclick="javascript:location.href = 'projectedit.html';">新增</a>
		<a href="javascript:void(0)" id="deleteBtn" class="easyui-linkbutton" iconCls="icon-cut" plain="true">删除</a>
	</div>

	</body>

	<script type="text/javascript">
		$(function() {
			var pager = $('#dg').datagrid().datagrid('getPager'); // get the pager of datagrid
		})
		
		$("#search_btn").click(function(){
			var name = $("#name").val();
			$('#dg').datagrid('load',{
				name: name
			});
		})
		
		$("#deleteBtn").click(function(){
			var row = $('#dg').datagrid('getSelected');
			if (row) {
				$.messager.confirm("操作提示", "您确定要删除这条记录吗？", function(data) {
					if (data) {
						$.post('deleteProjectById.do', {
							id : row.id
						}, function(data) {
							$.messager.alert('提示', data.content, 'info');
							$(".pagination-load").trigger("click");
						})
					} else {
						
					}
				});
			} else {
				$.messager.alert('提示', "请选中要删除的行", 'info');
			}
		})
	</script>

</html>