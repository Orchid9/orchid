<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>青苑书城</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="shortcut icon" type="image/x-icon" href="<%=request.getContextPath()%>/images/logo.ico" /> <!--title處的圖標  -->
	<style type="text/css">
	#logo {/* logo屬性 */
    position: relative;
    margin: 10px 180px; 
    }
	#logo b {/* logo里<b>的屬性 */
	font-size: 30px;
    position: absolute;
    margin-left:30px;
    top: 40px;
    }
	#zjbf{
		background-image: url(images/shu.jpg);
		background-size:100%;
		width: 100%;
		position: relative;
		height: 80%;
		margin-left: 10px;
	}
	#dlbf{
  		float:right;
    	width: 306px;
        padding-top: 8%;
        padding-right: 20%;
	}
	#zjbf p{
    	width: 306px;
    	padding: 20px;
    	margin: 0px;
	}
		#form{
    	width: 306px;
    	padding: 20px;
	}
		 #foot{
			margin-left:180px;
			margin-top:2%;
			width: 1150px;
		}
		#foot a{
				font-size:14;
			    border-top: 1px solid #E5E5E5;
    			text-align: center;
				margin:0 18px;
				color: #666;
  				text-decoration: none;
				}
		#foot hr{
		 margin: 0px 4px;
		}
	</style>
  </head>
  <body>
  <div id="logo">
  <img alt="青苑" src="images/logo.jpg" width="150" height="100">
  <b>欢迎登陆青苑书城</b>
  </div>
	<div id="zjbf">
	<div id="dlbf">
	<table border="1" width="230" height="230">
	<tr><td align="center">
	<div id="form">
	<form action="login2" method="post">
	账&nbsp;户&nbsp;&nbsp;<input type="text" name="username" style="width:154px;height:35px;background:transparent; border:2;border-color:black;"><br><br>
	密&nbsp;码&nbsp;&nbsp;<input type="password" name="password"  style="width:154px;height:35px;background:transparent; border:2;border-color:black;"><br><br>
	&nbsp;&nbsp;<input type="submit" value="登录"style="width:57px;height:30px;
        background:transparent; border:2;border-color:black;" >&nbsp;&nbsp;<br><br>
        &nbsp;&nbsp; 
       <div id="defa">
       <%
         if(request.getAttribute("info")!=null)
               out.print(request.getAttribute("info"));   
        %>
       </div>
    </form></td></tr></table>
	</div>
	</div>
	</div>
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
