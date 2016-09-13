<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>智慧服饰</title>
    <meta name="author" content="SIRMly">
    <meta name="renderer" content="webkit" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/reset.css">
    <link rel="stylesheet" href="css/login.css">
</head>
<body>
<div class="wrapper">
    <div class="login-container">
        <div class="logo-container">
            <img src="image/brand_cas_1.png" alt="" id="logo">
        </div>
        <form id="login-form" action="login.do" method="POST">
            <div class="input-group">
                <label for="username">账号
                    <i class="iconfont">&#xe601;</i>
                </label>
                <input type="text" id="username" name="accountNumber" placeholder="请输入账号" required>
            </div>
            <div class="input-group">
                <label for="password">密码
                    <i class="iconfont">&#xe602;</i>
                </label>
                <input type="password" id="password" name="userpwd" placeholder="请输入密码" required>
            </div>
            <div class="danger-error">
            	${callback}
            </div>
            <div class="btn-group">
                <button type="submit" id="login-btn">登 录</button>
            </div>
        </form>
        <p id="form-bottom"></p>
    </div>
    <p class="login-bottom">Copyright © 2015 中国科学院寒区旱区环境与工程研究所</p>
</div>
</body>
</html>