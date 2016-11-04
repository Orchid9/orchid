<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'fenye.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

    <style type="text/css">
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
      #faye {
      margin-top:20px;
      margin-left:650px;	
      }
      a{
       text-decoration:none;
      }
      #faye form{
      margin-top:-48px;
      margin-left:-900px;
      }
      #faye font{
      color: blue;
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
      #table:hover {
       border: 1px solid red;
     }
    </style>
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
 <hr width="100%" style="color: red;margin-top: -1%"><br>
  <div class="img" >
     <table align="center" cellspacing="20px" border="1" cellpadding="20"  style="border:none;" >
		 <tr>
		 
		 <s:bean name="com.dao.impl.Books" >
         <s:iterator value="#application.listss" begin="0" end="3"> 
         <td class="hidden-480" id="table" align="center" ><a href="item?id=<s:property value="id"/>">
              <img src="<s:property value="picture"/>" while="170px" height="200px"><br><br>
                                          ￥<s:property value="price"/><br><s:property value="name"/></a></td>
        </s:iterator>
        </s:bean>
         </tr>
         <tr>
		 
		 <s:bean name="com.dao.impl.Books" >
         <s:iterator value="#application.listss" begin="4" end="7"> 
         <td class="hidden-480" id="table" align="center" ><a href="item?id=<s:property value="id"/>">
              <img src="<s:property value="picture"/>" while="170px" height="200px"><br><br>
                                          ￥<s:property value="price"/><br><s:property value="name"/></a></td>
        </s:iterator>
        </s:bean>
         </tr>
         <tr>
		 
		 <s:bean name="com.dao.impl.Books" >
         <s:iterator value="#application.listss" begin="8" end="11"> 
         <td class="hidden-480" id="table" align="center" ><a href="item?id=<s:property value="id"/>">
              <img src="<s:property value="picture"/>" while="170px" height="200px"><br><br>
                                          ￥<s:property value="price"/><br><s:property value="name"/></a></td>
        </s:iterator>
        </s:bean>
         </tr>
        <!--  
        <tr>
		 <c:forEach items="${listss}" var="person" begin="4" end="7">	 
         <td class="hidden-480" id="table" align="center"><a href="item?id=${person.id }">
              <img src="${person.pictire }" while="170px" height="200px"><br><br>
                                        ￥${person.price }<br>${person.name}</a></td>
        </c:forEach>
         </tr>
         <tr>
		 <c:forEach items="${listss}" var="person" begin="8" end="11">	 
         <td class="hidden-480" id="table" align="center"><a href="item?id=${person.id }">
              <img src="${person.pictire }" while="170px" height="200px"><br><br>
                                        ￥${person.price }<br>${person.name}</a></td>
        </c:forEach>
         </tr>
          -->
	</table> 
	<div class="border"></div>
	</div>
	<div id="faye" >
     <br>
     <c:if test="<s:property value="#application.pageNos > 1"/>">
     	<a href="books?pageNos=1"  ><font>首页</font></a>
     	<a href="books?pageNos=<s:property value="#application.pageNos- 1"/>"><font>上一页</font></a>
     </c:if>
     
      <c:if test="<s:property value="pageNos"/> < <s:property value="recordCount"/>">
     	<a href="books?pageNos=<s:property value="#application.pageNos+1"/> "><font>下一页</font></a>
     	<a href="books?pageNos=<s:property value="#application.recordCount-1"/>"><font>末页</font></a>
     </c:if>
    <form action="books">
    <h4 align="center"><font>共<s:property value="#application.recordCount-1"/>页 &nbsp</font>
    <input type="text" value="<s:property value="#application.pageNos"/>" name="pageNos" size="1"><font>页</font>
    <input type="submit" value="到达">
    </h4>
     </form>
     
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
