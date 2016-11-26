<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<link rel="stylesheet" href="./css/style.css" />
</head>
<body>
<s:debug></s:debug>
	<div class="n-head">
		<div class="g-doc f-cb">
			<div class="user">
				买家你好，<span class="name">mmmmm</span>！<a href="">[退出]</a> 请<a
					href="login">[登录]</a>
			</div>
			<ul class="nav">
				<li><a href="index">首页</a></li>
				<li><a href="account">账务</a></li>
				<li><a href="public">发布</a></li>
			</ul>
		</div>
	</div>
	<div class="g-doc">
		<div class="n-show f-cb" id="showContent">
			<div class="img">
				<img src="<s:property value="#application.content.image"/>" alt="">
			</div>
			<div class="cnt">
				<h2><s:property value="#application.content.title"/></h2>
				<p class="summary"><s:property value="summary"/></p>
				<div class="price">
					<span class="v-unit">¥</span><span class="v-value"><s:property value="#application.content.price"/></span>
				</div>
				<div class="oprt f-cb">
					<a href="buy"><button class="u-btn u-btn-primary" data-buy="1">购 买</button></a>
					<span class="u-btn u-btn-primary z-dis">已购买</span> <span
						class="buyprice">当时购买价格：<s:property value="#application.content.price"/></span> <a href="edit" onclick="javaScript:alert('编辑成功!')"
						class="u-btn u-btn-primary">编 辑</a>
				</div>
			</div>
		</div>
		<div class="m-tab m-tab-fw m-tab-simple f-cb">
			<h2>详细信息</h2>
		</div>
		<div class="n-detail">
			<s:property value="#application.content.detail"/>
		</div>
	</div>
	<div class="n-foot">
		<p>
			版权所有：网易云课堂<a
				href="http://mooc.study.163.com/smartSpec/detail/85002.htm">Java开发工程师(Web方向)</a>微专业团队
		</p>
	</div>
	<script type="text/javascript" src="./js/global.js"></script>
	<script type="text/javascript" src="./js/pageShow.js"></script>
</body>
</html>