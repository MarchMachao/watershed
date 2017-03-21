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
			padding: 30px 10% 30px 0;
			font-family: '微软雅黑';
		}
		.col-md-offset-1 {
		    margin-left: 3.5%;
		}
		.col-md-offset-2 {
		    margin-left: 7%;
		}
		.form-inline{
			margin-top: 3px;
		}
	</style>
	<body>
		<form class="form-group">
			<#list goalslist as item>
			  	<div class="form-inline">
				    <label><#if userLanguage=="english">${item.englishName}<#else>${item.goalName}</#if></label>
				    <input type="text" class="form-control" value="${item.value}">
			  	</div>
			  	<#list item.subGoals as record>
				  	<div class="form-inline col-md-offset-1">
					    <label><#if userLanguage=="english">${record.englishName}<#else>${record.goalName}</#if></label>
					    <input type="text" class="form-control" value="${record.value}">
				  	</div>
				  	<#list record.subGoals as data>
				  		<div class="form-inline col-md-offset-2">
						    <label><#if userLanguage=="english">${data.englishName}<#else>${data.goalName}</#if></label>
						    <input type="text" class="form-control" value="${data.value}">
					  	</div>
				  	</#list>
			  	</#list>
			 </#list>
		  	<button type="submit" class="btn btn-default">Send</button>
		</form>
	</body>
	<script>
	 
	</script>
</html>
