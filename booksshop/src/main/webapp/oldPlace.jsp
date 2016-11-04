<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'dingdan.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

 <style type="text/css">
	 *{ margin: 0; padding: 0; text-decoration: none;}   
      #container { width: 600px; height: 400px; border: 3px solid #333; overflow: hidden; position: relative;margin-left: 27%;margin-top: 3%}
      #list { width: 4200px; height: 400px; position: absolute; z-index: 1;}
      #list img { float: left;}
      buttons { position: absolute; height: 10px; width: 100px; z-index: 2; bottom: 20px; left: 250px;}
      #buttons span { cursor: pointer; float: left; border: 1px solid #fff; width: 10px; height: 10px; border-radius: 50%; background: #333; margin-right: 5px;}
      #buttons .on {  background: orangered;}
      .arrow { cursor: pointer; display: none; line-height: 39px; text-align: center; font-size: 36px; font-weight: bold; width: 40px; height: 40px;  position: absolute; z-index: 2; top: 180px; background-color: RGBA(0,0,0,.3); color: #fff;}
      .arrow:hover { background-color: RGBA(0,0,0,.7);}
      #container:hover .arrow { display: block;}
      #prev { left: 20px;}
      #next { right: 20px;}
	  #from{margin-left: 30%;}	   
	  #logo {position: relative; width: 300px; margin: 10px 180px; height: 60px; }
      a{ text-decoration: none; color: black; font-size: 18px; }
      a:HOVER { color: red; }
      #table:hover {border: 1px solid red;}
       #foot{margin-left:180px;margin-top:2%; 1150px;}
		#foot a{font-size:14;border-top: 1px solid #E5E5E5;text-align: center;margin:0 18px;color: #666;text-decoration: none;}
		#foot hr{margin: 0px 4px;}
	</style>
  </head>
  
  <body>
  <div id="logo">
  <img alt="青苑" src="images/logo.jpg" width="150" height="100">
  </div>
  	<table align="center" cellspacing="20px" border="1" cellpadding="20"
		style="border: none;">
		<tr>
			<s:bean name="com.dao.impl.Address">
				<s:iterator value="#application.address">
					<tr>
					<td><s:property value="username"/></td>
					<td><s:property value="telephone"/></td>
					<td><s:property value="postcode"/></td>
					<td><s:property value="liveplace"/></td>
					<td><s:property value="addressid"/></td>
					<td><a href="oldAddress?addressid=<s:property value="addressid"/>">选此地址</a> </td>
				</s:iterator>
			</s:bean>
			<br><br>
			
			<!--  跳转到newAddress.jsp页面。通过action跳到newAddress.action中-->
    	<td><a href="dizhi.jsp">选用新地址</a></td>
		</tr>
	</table>
     <img src="images/di.jpg" style="margin-top: 4%">
   <div id="foot">
		<a rel="nofollow" target="_blank" href="//www.jd.com/intro/about.aspx">关于我们</a>
		|<a rel="nofollow" target="_blank" href="//www.jd.com/contact/">联系我们</a>
		|<a rel="nofollow" target="_blank" href="//www.jd.com/contact/joinin.aspx">商家入驻</a>
		|<a rel="nofollow" target="_blank" href="//jzt.jd.com">营销中心</a>
		|<a rel="nofollow" target="_blank" href="//app.jd.com/">手机京东</a>
		|<a target="_blank" href="//club.jd.com/links.aspx">友情链接</a>
		|<a target="_blank" href="//media.jd.com/">销售联盟</a>
		|<a href="//club.jd.com/" target="_blank">青苑社区</a>
		|<a href="//gongyi.jd.com" target="_blank">青苑公益</a>
		<hr width="950" align="center"><br>
		<a>网络文化经营许可证：0266-989 | 互联网违法和不良信息举报电话：0897-29920</a>
	</div>
  </body>
</html>
