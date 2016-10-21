<!DOCTYPE html>
<html>

	<head>
		<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<title>æµåå¯æç»­åå±å³ç­æ¯æç³»ç»</title>
		<!-- Tell the browser to be responsive to screen width -->
		<meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
		<!-- Bootstrap 3.3.6 -->
		<link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
		<!-- Font Awesome -->
		<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.5.0/css/font-awesome.min.css">
		<!-- Ionicons -->
		<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/ionicons/2.0.1/css/ionicons.min.css">
		<!-- Theme style -->
		<link rel="stylesheet" href="dist/css/AdminLTE.min.css">
		<!-- AdminLTE Skins. We have chosen the skin-blue for this starter
        page. However, you can choose any other skin. Make sure you
        apply the skin class to the body tag so the changes take effect.
  -->
		<link rel="stylesheet" href="dist/css/skins/skin-blue.min.css">

		<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
		<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
		<!--[if lt IE 9]>
  <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
  <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
  <![endif]-->
	</head>

	<body class="hold-transition skin-blue sidebar-mini" style="overflow-y: hidden">
		<div class="wrapper">

			<!-- Main Header -->
			<header class="main-header">

				<!-- Header Navbar -->
				<nav class="navbar navbar-static-top" role="navigation">
					<img src="image/brand_cas_1.png" />
					<!-- Navbar Right Menu -->
					<div class="navbar-custom-menu">
						<ul class="nav navbar-nav">
							<li>
								<img src="image/brand_cas_2_2th.png" />
							</li>
						</ul>
					</div>
				</nav>
			</header>
			<!-- Left side column. contains the logo and sidebar -->
			<aside class="main-sidebar">

				<!-- sidebar: style can be found in sidebar.less -->
				<section class="sidebar">

					<!-- Sidebar user panel (optional) -->
					<div class="user-panel">
						<div class="pull-left image">
							<img src="${user.image}" class="img-circle" alt="User Image">
						</div>
						<div class="pull-left info">
							<p>${user.nickName}</p>
							<!-- Status -->
							<a href="#"><i class="fa fa-circle text-success"></i> Online</a>
						</div>
					</div>

					<!-- Sidebar Menu -->
					<ul class="sidebar-menu">
						<#list menulist as item>
							<li class="treeview">
								<a href="#"><i class="fa fa-link"></i> <span>${item.menuName}</span>
									<span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
								</a>

								<ul class="treeview-menu">
									<#list item.submenus as record>
										<li>
											<a href="javascript:void(0)" class="menuUrl" menuUrl="${record.menuUrl}">${record.menuName}</a>
										</li>
									</#list>
								</ul>
							</li>
						</#list>
					</ul>
					<!-- /.sidebar-menu -->
				</section>
				<!-- /.sidebar -->
			</aside>
			<div class="content-wrapper">
				<iframe id="webcontent" name="webcontent" src="GIS.html"></iframe>
			</div>
			<!-- Main Footer -->
			<footer class="main-footer">
				<!-- To the right -->
				<!--<div class="pull-right hidden-xs">
      Anything you want
    </div>-->
				<!-- Default to the left -->
				<strong>Copyright &copy; 2016 <a href="#">中国科学院寒区旱区环境与工程研究所.</a>.</strong> All rights reserved.
			</footer>

			<!-- REQUIRED JS SCRIPTS -->

			<!-- jQuery 2.2.3 -->
			<script src="plugins/jQuery/jquery-2.2.3.min.js"></script>
			<!-- Bootstrap 3.3.6 -->
			<script src="bootstrap/js/bootstrap.min.js"></script>
			<!-- AdminLTE App -->
			<script src="dist/js/app.min.js"></script>
			<script>
			  $("#webcontent").attr("height", $(window).height() - 150);
				window.onresize = function() {
					$("#webcontent").attr("height", $(window).height() - 150);
				}
				$(".menuUrl").click(function() {
					var url = this.getAttribute("menuUrl");
					$("#webcontent").attr("src", url);
				})
			</script>
	</body>

</html>