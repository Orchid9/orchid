<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<link rel="stylesheet" href="./css/style.css" />
</head>
<body>
	<form class="m-form m-form-ht n-login" id="loginForm"
		onsubmit="return true;" action="login" method="post">
		<div class="fmitem">
			<label class="fmlab">用户名：</label>
			<div class="fmipt">
				<input class="u-ipt" name="username" autofocus />
			</div>
		</div>
		<div class="fmitem">
			<label class="fmlab">密码：</label>
			<div class="fmipt">
				<input class="u-ipt" type="password" name="password" />
			</div>
		</div>
		<div class="fmitem fmitem-nolab fmitem-btn">
			<div class="fmipt">
				<button type="submit"
					class="u-btn u-btn-primary u-btn-lg u-btn-block">登 录</button>
			</div>
		</div>
	</form>
	<div class="n-foot">
		<p>
			版权所有：网易云课堂<a
				href="http://mooc.study.163.com/smartSpec/detail/85002.htm">Java开发工程师(Web方向)</a>微专业团队
		</p>
	</div>
	<script type="text/javascript" src="./js/md5.js"></script>
	<script type="text/javascript" src="./js/global.js"></script>
	<script type="text/javascript" src="./js/pageLogin.js"></script>
</body>
</html>