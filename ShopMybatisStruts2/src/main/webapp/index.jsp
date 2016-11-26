<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<link rel="stylesheet" href="./css/style.css" />
</head>
<body>
	<div class="n-support">请使用Chrome、Safari等webkit内核的浏览器！</div>
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
		<div class="m-tab m-tab-fw m-tab-simple f-cb">
			<div class="tab">
				<ul>
					<li class="z-sel"><a href="index">所有内容</a></li>
					<li><a href="index">未购买的内容</a></li>
				</ul>
			</div>
		</div>
		<div class="n-plist">
        <ul class="f-cb" id="plist">
		       
        <s:iterator var="content" value="#application.contents" >
             <li id="p-7"><a href="show?id=<s:property value="#content.id"/>" class="link">
						<div class="img">
							<img src="<s:property value="#content.image"/>" alt="">
						</div>
						<h3><s:property value="#content.text"/></h3>
						<div class="price">
							<span class="v-unit">¥</span><span class="v-value"><s:property value="#content.price"/></span>
						</div>
				</a> <span class="u-btn u-btn-normal u-btn-xs del" data-del="7"><a href="delete?id=<s:property value="#content.id" />" onclick="javaScript:alert('删除成功!')">删除</a></span>
				</li>
         </s:iterator>  
 </ul>
    </div>
		</div>
		<s:debug></s:debug>
		<div class="n-foot">
			<p>
				版权所有：网易云课堂<a
					href="http://mooc.study.163.com/smartSpec/detail/85002.htm">Java开发工程师(Web方向)</a>微专业团队
			</p>
		</div>
		<script type="text/javascript" src="./js/global.js"></script>
		<script type="text/javascript" src="./js/pageIndex.js"></script>
</body>
</html>