<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table width=80% height=20px align="center"
		style="border-collapse: collapse;">
		<tr>
			<td>订单号:<s:property value="#application.order[0].orderid" /></td>
			<td>用户名:<s:property value="#application.order[0].username" /></td>
			<td>电话:<s:property value="#application.order[0].telephone" /></td>
			<td>地址:<s:property value="#application.order[0].address" /></td>
			<td>邮编:<s:property value="#application.order[0].postcode" /></td>
		</tr>
		<s:bean name="com.dao.impl.Order">
			<s:iterator value="#application.order">
				<tr style="background-color: #ffecf5; border: 7px solid #FFFFFF;">
					<td>书本数量:<s:property value="booknumber" /></td>
					<td>书本id:<s:property value="bookname" /></td>
				</tr>
				<br>
			</s:iterator>
		</s:bean>
	</table>
		<br><br>
		<div>
		<a href="pay" onclick="javaScript:alert('付款成功!')" style="text-decoration:none;margin-left: 80%; background-color: rgba(158, 158, 158, 0.48)"><font color="#ff2d3d" size="5">付款</font></a>
		</div>
	</body>
</html>