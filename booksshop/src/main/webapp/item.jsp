<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'item.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  <style type="text/css">
  	.gwc{
  		font-size:16px;
  		width:100PX;
  		height:34px;
  		background-color: #FF5151;
  	}
  	.gm{
  		font-size:16px;
  		width:100PX;
  		height:34px;
  		background-color: #FFD9EC;
  		
  	}
  
  
   #from{
	     margin-left: 30%;
	   }
	   
	  #logo {/* logo屬性 */
      position: relative;
      width: 300px;
      margin: 10px 180px;
      height: 60px; 
      }
      a{
      text-decoration: none; 
      color: black;
      font-size: 18px;
      }
      a:HOVER {
	  color: red;
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
  #tupian{
    margin-left: 230px;
    
  }
  #wenzi{
    margin-top:-380px;
    margin-left: 620px;
  }
  #table:hover {
       border: 1px solid red;
     }
  </style>

  <script type="text/javascript">
     function add() {
		document.getElementById('number').value++;
	}
	function minus() {
		if(document.getElementById('number').value>1){
		    document.getElementById('number').value--;
		}
	}
  </script>
  </head>
  
  <body>
   <div id="logo">
  <img alt="青苑" src="images/logo.jpg" width="150" height="100">
  </div>

  <div id="from">
    <form action="chaxun" >
        <input type="text" name="bookname" style="height: 40px; width: 500px; border:2px #FF2D2D solid; margin-top: -50px">
        <input type="image" src="images/sousuo.jpg" height="40px"" style="margin-top:-3.7%; margin-left: 500px">
     <br><font color="#8E8E8E" size="2px" style="margin-top: 10px">热搜:</font>&nbsp;&nbsp;
     <a href="chaxun?bookname=单词" style="font-size: 15px;color: #8E8E8E">单词</a>&nbsp;&nbsp;&nbsp;
     <a href="chaxun?bookname=青春" style="font-size: 15px;color: #8E8E8E"> 青春 </a>&nbsp;&nbsp;&nbsp;
     <a href="chaxun?bookname=信心" style="font-size: 15px;color: #8E8E8E"> 信心 </a>&nbsp;&nbsp;&nbsp;
     <a href="chaxun?bookname=英语" style="font-size: 15px;color: #8E8E8E">英语</a>&nbsp;&nbsp;&nbsp;
     <a href="chaxun?bookname=java" style="font-size: 15px;color: #8E8E8E">java</a>&nbsp;&nbsp;&nbsp;
     <a href="chaxun?bookname=Hadoop" style="font-size: 15px;color: #8E8E8E">Hadoop</a>       
    </form>
      <a href="shopcarGo"><img src="images/gou.jpg" style="margin-left: 72%; margin-top: -10%"></a>
     <table cellpadding="20" style="margin-left: -5%;margin-top: 1.5%"><tr>
        <td><a href="index.jsp">首页</a></td>
        <td><a href="books" >全部商品</a></td>
        <td><a href="fenlei?style=1">教育</a></td>
        <td><a href="fenlei?style=2">企业</a></td>
        <td><a href="fenlei?style=3">科技</a></td>
        <td><a href="fenlei?style=4">青春</a></td>
        <td><a href="fenlei?style=5">建筑</a></td>
        <td><a href="fenlei?style=6">育儿</a></td>
     </tr></table>
 </div>
 <hr width="100%" style="color: red;margin-top: -1%"><br><br>
  <div id="tupian">
    <img src="<s:property value="picture"/>" while="330px" height="380px">
  </div> 
  <div id="wenzi">
     &nbsp;&nbsp;<font size="4px"><b>热销书籍  <s:property value="bookname"/> 正版包邮</b></font><br><br>
     <table bgcolor="#E0E0E0" width="500px" height="80px" >
       <tr><td>
       <font size="2px" color="#8E8E8E">
                          原&nbsp;&nbsp;&nbsp;价:&nbsp;&nbsp;<del>￥<s:property value="price*1.5"/> &nbsp;</del><br>
                          青苑价:&nbsp;&nbsp;</font><font size="5px" color="#FF2D2D"><s:property value="price"/></font>
         <font size="2px" color="#FF2D2D">&nbsp;钻石VIP价:&nbsp;<s:property value="price-9.9"/></font>
       </td></tr>
     </table><br>
      <font size="2px" color="8E8E8E">促&nbsp;&nbsp;&nbsp;销</font>&nbsp;&nbsp;<img src="images/jian.jpg">
      <font size="2px" color="4F4F4F">满¥100减¥30，满¥200减¥60，满¥300减¥100</font><br>
      <hr width="500px" color="#E0E0E0" align="left" size="1"><br>
      <font size="2px" color="8E8E8E">配送至&nbsp;&nbsp;&nbsp;</font><font size="2px" color="4F4F4F">有货&nbsp;&nbsp;满59元免运费</font><br><br>
      <font size="2px" color="8E8E8E">服&nbsp;&nbsp;&nbsp;务&nbsp;&nbsp;&nbsp;</font><font size="2px" color="4F4F4F">由“青苑”发货，并提供售后服务。</font><br><br>
      <font size="2px" color="8E8E8E">我要买&nbsp;</font>
      
      <s:form name="book">
         <s:hidden name="bookid" value="%{id}"></s:hidden>

         <s:hidden name="bookpicture" value="%{picture}"></s:hidden>
         <s:hidden name="bookprice" value="%{price}"></s:hidden>
         <s:hidden name="bookname" value="%{bookname}"></s:hidden>
         <input type="button" name="jian" value="-" onclick="document.getElementById('number').value--">
         <input name="booknumber" id="number" value="1" size="1">
         <input type="button" name="jia" value="+" onclick="document.getElementById('number').value++"><br><br>
         <table cellspacing="20px" border="1" cellpadding="8" style="border:none;">
         <tr align="center">
	     <input type="submit" value="加入购物车" onclick="document.book.action='jia'"  onmouseover="this.style.background='#FF2D2D'" onmouseout="this.style.background='#FF5151'" class="gwc"/>&nbsp;&nbsp;
         <input type="submit" value="立即购买"  onclick="document.book.action='mai'" onmouseover="this.style.background='#FFB5B5'" onmouseout="this.style.background='#FFD9EC'"  class="gm"/> 
      </s:form>
      
      </tr>
      </table>
      </div>
      <img src="images/di.jpg">
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
