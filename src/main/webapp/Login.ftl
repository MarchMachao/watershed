<!DOCTYPE html>
<html lang="en">
 
<head>
<title>${title}</title>
<meta charset="UTF-8" />
<meta name="renderer" content="webkit" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
 
<link rel="stylesheet" href="static/login/bootstrap.min.css" />
<link rel="stylesheet" href="static/login/css/camera.css" />
<link rel="stylesheet" href="static/login/bootstrap-responsive.min.css" />
<link rel="stylesheet" href="static/login/matrix-login.css" />
<link href="static/login/font-awesome.css" rel="stylesheet" />
<link rel="icon" href="image/icon.ico" type="image/x-icon"/>
<script type="text/javascript" src="js/jquery.min.js"></script>
 
</head>
<body onkeydown='if(event.keyCode==13){submit();}'>

    <div style="width:100%;text-align: center;margin: 0 auto;position: absolute;">
        <div id="loginbox">
            <form action="" method="POST" name="loginForm" id="loginForm">
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
                                value=""/>
                        </div>
                        	<button id="language" type="button"><#if language=="chinese">汉语<#else>English</#if></button>
							<input type="hidden" id="languageText" value="${language}" name="languageText" />
                        <div class="danger-error" style="display: none;">
                           	 账号或密码错误
                        </div>
                    </div>
                </div>
                <div class="form-actions">
                    <div style="width:86%;padding-left:8%;">
                        <span class="pull-right" style="padding-right:3%;">
                            <a href="javascript:quxiao();" class="btn btn-success">${reset}</a>
                        </span> 
                        <span class="pull-right">
                            <a class="flip-link btn btn-info" id="to-recover" onclick="submit();">${save}</a>
                        </span>
                        <div style="margin-top:7px ;">
                            <a href="javascript:void(0)" id="login-guest" class="pull-left lip-link btn btn-info" style="font-size: 15px;">游客登录</a>
                        </div>
                    </div>
                    
                </div>
 
            </form>
 
 
            <div class="controls">
                <div class="main_input_box">
                    <font color="white"><span id="nameerr">Copyright © 2015 中国科学院寒区旱区环境与工程研究所</span></font>
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
 
 		function submit(){
 			$.ajax({
                type: "post",
                url: "login.do",
                data: {
                    accountNumber: document.getElementById("loginname").value,
                    userpwd: document.getElementById("password").value,
                    language:document.getElementById("languageText").value
                },
                success:function(data){
                    if(data=='0'){
                        $(".danger-error").css("display","block");
                    }else{
                        window.location.href='home.do';
                    }
                }
                
            });
 		}
 		
        function quxiao() {
            $("#loginname").val('');
            $("#password").val('');
        }
        
    $("#login-guest").on("click",function(){
        $.ajax({
            type:"post",
            url:"login.do",
            data:{accountNumber:'guest356246547',userpwd:'123456', language:document.getElementById("languageText").value},
            success:function(){window.location.href='home.do'}
        });
    });
    </script>
 
    <script src="static/js/bootstrap.min.js"></script>
    <script src="static/js/jquery-1.7.2.js"></script>
    <script src="static/login/js/jquery.easing.1.3.js"></script>
    <script src="static/login/js/jquery.mobile.customized.min.js"></script>
    <script src="static/login/js/camera.min.js"></script>
    <script src="static/login/js/templatemo_script.js"></script>
    <script type="text/javascript" src="static/js/jquery.tips.js"></script>
    <script type="text/javascript" src="static/js/jquery.cookie.js"></script>
    <script type="text/javascript">
			$("#language").click(function(){
				var ttt = $(this).html();
				if(ttt=="English"){
					location.href="login.do?language=chinese";
				}else{
					location.href="login.do?language=english";
				}
			})
		</script>
</body>
 
</html>