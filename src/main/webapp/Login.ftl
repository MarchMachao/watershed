<!DOCTYPE html>
<html lang="en">

<head>
<title>流域可持续发展决策支持系统</title>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />

<link rel="stylesheet" href="static/login/bootstrap.min.css" />
<link rel="stylesheet" href="static/login/css/camera.css" />
<link rel="stylesheet" href="static/login/bootstrap-responsive.min.css" />
<link rel="stylesheet" href="static/login/matrix-login.css" />
<link href="static/login/font-awesome.css" rel="stylesheet" />
<script type="text/javascript" src="js/jquery.min.js"></script>

</head>
<body>
	<div style="width:100%;text-align: center;margin: 0 auto;position: absolute;">
		<div id="loginbox">
			<form action="login.do" method="POST" name="loginForm" id="loginForm">
				<div class="control-group normal_text">
					<h3>
						<img src="static/login/logo_cas.png" alt="Logo" />
					</h3>
				</div>
				<div class="control-group">
					<div class="controls">
						<div class="main_input_box">
							<span class="add-on bg_lg"><i><img height="37"
									src="static/login/user.png" /></i></span><input type="text"
								name="accountNumber" id="loginname" value=""
								placeholder="请输入用户名" />
						</div>
					</div>
				</div>
				<div class="control-group">
					<div class="controls">
						<div class="main_input_box">
							<span class="add-on bg_ly"><i><img height="37"
									src="static/login/suo.png" /></i></span><input type="password"
								name="userpwd" id="password" placeholder="请输入密码"
								value="" />
						</div>
						<div class="danger-error" style="display: none;">
            				账号或密码错误
            			</div>
					</div>
				</div>
				<div class="form-actions">
					<div style="width:86%;padding-left:8%;">
						<span class="pull-right" style="padding-right:3%;">
							<a href="javascript:quxiao();" class="btn btn-success">取消</a>
						</span> 
						<span class="pull-right">
							<a class="flip-link btn btn-info" id="to-recover">登录</a>
						</span>
						<div style="margin-top:7px ;">
            				<a href="#" id="login-guest" class="pull-left lip-link btn btn-info" style="font-size: 15px;">游客登录</a>
            			</div>
					</div>
					
				</div>

			</form>


			<div class="controls">
				<div class="main_input_box">
					<font color="white"><span id="nameerr">Copyright © 2015
							中国科学院寒区旱区环境与工程研究所</span></font>
				</div>
			</div>
		</div>
	</div>
	<div id="templatemo_banner_slide" class="container_wapper">
		<div class="camera_wrap camera_emboss" id="camera_slide">
			<div data-src="static/login/images/banner_slide_01.jpg"></div>
			<div data-src="static/login/images/banner_slide_02.jpg"></div>
			<div data-src="static/login/images/banner_slide_03.jpg"></div>
		</div>
		<!-- #camera_wrap_3 -->
	</div>

	<script type="text/javascript">
		//客户端校验
//    		function check() {
//    			if ($("#loginname").val() == "") {
//    				$("#loginname").tips({
//    					side : 2,
//    					msg : '用户名不得为空',
//    					bg : '#AE81FF',
//    					time : 3
//    				});
//    				$("#loginname").focus();
//    				return false;
//    			} else {
//    				$("#loginname").val(jQuery.trim($('#loginname').val()));
//    			}
//    			if ($("#password").val() == "") {
//    				$("#password").tips({
//    					side : 2,
//    					msg : '密码不得为空',
//    					bg : '#AE81FF',
//    					time : 3
//    				});
//    				$("#password").focus();
//    				return false;
//    			}
//    			$("#loginbox").tips({
//    				side : 1,
//    				msg : '正在登录 , 请稍后 ...',
//    				bg : '#68B500',
//    				time : 10
//    			});
//    			return true;
//    		}
   		
		$("#to-recover").on("click", function() {
			$.ajax({
				type: "post",
				url: "login.do",
				data: {
					accountNumber: document.getElementById("loginname").value,
					userpwd: document.getElementById("password").value
				},
				success:function(data){
					if(data=='404'){
						$(".danger-error").css("display","block");
					}else{
						window.location.href='home.do';
					}
				}
				
			});

		})

		function quxiao() {
			$("#loginname").val('');
			$("#password").val('');
		}
		
//		jQuery(function() {
//			var loginname = $.cookie('loginname');
//			var password = $.cookie('password');
//			if (typeof(loginname) != "undefined"
//					&& typeof(password) != "undefined") {
//				$("#loginname").val(loginname);
//				$("#password").val(password);
//				$("#saveid").attr("checked", true);
//				$("#code").focus();
//			}
//		});
	$("#login-guest").on("click",function(){
		$.ajax({
			type:"post",
			url:"login.do",
			data:{accountNumber:'guest356246547',userpwd:'123456'},
			success:function(){window.location.href='home.do'}
		});
	});
	</script>
	<!--<script>
		//TOCMAT重启之后 点击左侧列表跳转登录首页 
		if (window != top) {
			top.location.href = location.href;
		}
	</script>-->

	<script src="static/js/bootstrap.min.js"></script>
	<script src="static/js/jquery-1.7.2.js"></script>
	<script src="static/login/js/jquery.easing.1.3.js"></script>
	<script src="static/login/js/jquery.mobile.customized.min.js"></script>
	<script src="static/login/js/camera.min.js"></script>
	<script src="static/login/js/templatemo_script.js"></script>
	<script type="text/javascript" src="static/js/jquery.tips.js"></script>
	<script type="text/javascript" src="static/js/jquery.cookie.js"></script>
</body>

</html>