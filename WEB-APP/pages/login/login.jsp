<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登陆</title>
<meta content="IE=edge,chrome=1" http-equiv="X-UA-Compatible">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">
<link rel="stylesheet" type="text/css"
	href="<%=path%>/css/bootstrap.css">
<link rel="stylesheet" type="text/css" href="<%=path%>/css/theme.css">
<link rel="stylesheet" href="<%=path%>/css/font-awesome.css">
<script type="text/javascript" src="<%=path%>/js/jquery.js"></script>
<!-- Demo page code -->
<style type="text/css">
#line-chart {
	height: 300px;
	width: 800px;
	margin: 0px auto;
	margin-top: 1em;
}

.brand {
	font-family: georgia, serif;
}

.brand .first {
	color: #ccc;
	font-style: italic;
}

.brand .second {
	color: #fff;
	font-weight: bold;
}
</style>
</head>
<!--[if lt IE 7 ]> <body class="ie ie6"> <![endif]-->
<!--[if IE 7 ]> <body class="ie ie7 "> <![endif]-->
<!--[if IE 8 ]> <body class="ie ie8 "> <![endif]-->
<!--[if IE 9 ]> <body class="ie ie9 "> <![endif]-->
<!--[if (gt IE 9)|!(IE)]><!-->
<body class="">
	<!--<![endif]-->
	<div class="navbar">
		<div class="navbar-inner">
			<ul class="nav pull-right">

			</ul>
			<a class="brand" href="#"><span class="first">Your</span>
				<span class="second">Company</span></a>
		</div>
	</div>
	
	<div class="row-fluid">
		<div class="dialog">
			<div class="block">
				<p class="block-heading">登陆</p>
				<div class="block-body">
					<form method="post" name="loginform" id="loginform" action="login!loginUser.jspa">
						<input type="hidden" name="token" value="${token}" />
						<label for="userName">用户名</label>
						<input type="text" class="span12" id="userName" name="userInfo.loginName"> 
						<label for="password">密码</label>
						<input type="password" class="span12" id="password" name="userInfo.userPassword">
						<label for="validecode">验证码 </label>
						<div class="row-fluid">
							<input name="validecode" class="span8" type="text" id="validecode">
							<img id="imgUrl" onclick="showValidateCode()" title="点击刷新"></img>
						</div>
						<button type="submit" class="btn btn-primary pull-right">登陆</button>
						<!-- 
						<a href="index.html" class="btn btn-primary pull-right">登陆</a>
						 --> 
						<label class="remember-me"><input type="checkbox">记住密码</label>
						<div class="clearfix"></div>
					</form>
				</div>
			</div>
			<p>
				<a href="<%=path %>/login/resetPasswordAction!resetPassword.jspa">忘记密码？</a>
			</p>
		</div>
	</div>
	<script type="text/javascript" src="<%=path %>/js/bootstrap.js"></script>
	<script type="text/javascript">
		$("[rel=tooltip]").tooltip();
		$(function() {
			$('.demo-cancel-click').click(function() {
				return false;
			});
			showValidateCode();
		});
		
		function showValidateCode() {
			var url = "../validatecode/validate!showValidateCode.jspa";
			$.ajax({
				type : "POST",
				url : url,
				success : function(data) {
					//var myObject = JSON2.parse(data);
					//var myObject = eval('(' + data + ')');
					document.getElementById('imgUrl').src = data.imgUrl;
				}
			});
		}
	</script>
</body>
</html>