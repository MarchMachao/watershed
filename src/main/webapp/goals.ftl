<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<meta name="author" content="March" />
		<title>目标</title>
		<link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
		<!--导入iCheck插件蓝色主题-->
		<script src="js/jquery-1.11.1.min.js"></script>
	</head>
	<style>
		body {
			font-family: '微软雅黑';
		}
		.col-md-offset-1 {
		    margin-left: 3.5%;
		}
		.col-md-offset-2 {
		    margin-left: 7%;
		}
		.form-inline {
			margin-top: 3px;
		}
		label {
		    font-weight: 500;
		}
		span {
			font-weight: 700;
			margin-right: 5px;
		}
		.form-inline .form-control {
		    width: 40px;
		    height: 25px;
		}
		button{
			width:100px;
			margin-right:30px;
		}
		.panel-body {
		    padding: 15px 30px;
		}
	</style>
	<body>
	<div class="panel panel-default" style="margin: 10px 10px;">
		<div class="panel-heading">
			<h2 class="panel-title">目标体系设定</h2>
		</div>
		<div class="panel-body">
		<form class="form-group">
			<#list goalslist as item>
			  	<div class="form-inline">
			  		<span>目标${item_index + 1}:</span>
				    <label><#if userLanguage=="english">${item.englishName}<#else>${item.goalName}</#if></label>
				    <input type="text" class="form-control" value="${item.value}">
			  	</div>
			  	<#list item.subGoals as record>
				  	<div class="form-inline col-md-offset-1">
				  		<span>子目标${item_index + 1}.${record_index + 1}</span>
					    <label><#if userLanguage=="english">${record.englishName}<#else>${record.goalName}</#if></label>
				  	</div>
				  	<#list record.subGoals as data>
				  		<div class="form-inline col-md-offset-2">
				  			<span>指标${item_index + 1}.${record_index + 1}.${data_index + 1}</span>
						    <label><#if userLanguage=="english">${data.englishName}<#else>${data.goalName}</#if></label>
						    <input type="text" class="form-control" value="${data.value}">
					  	</div>
				  	</#list>
			  	</#list>
			 </#list>
			 </hr>
			 <div class="col-md-offset-2 col-sm-10" style="margin-top: 5px">
			  	<button type="submit" class="btn btn-info">提交</button>
			  	<button type="reset" class="btn btn-info">重置</button>
			  	<button type="button" class="btn btn-info" onclick="location.href = 'goalsEdit.html'">目标定制</button>
			  	<button type="button" class="btn btn-info" id="nextStep" onclick="javascript:location.href = 'toStuation.do?id=${projectId}'">下一步</button>
			 </div>
		</form>
		</div>
		</div>
	</body>
	<script>
	 
	</script>
</html>
