<%@ page language="java" import="java.util.*" import="com.dao.impl.*" pageEncoding="UTF-8"%>
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
    
    <title>My JSP 'index.jsp' starting page</title>
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
       #foot{margin-left:180px;margin-top:2%;width: 1150px;}
		#foot a{font-size:14;border-top: 1px solid #E5E5E5;text-align: center;margin:0 18px;color: #666;text-decoration: none;}
		#foot hr{margin: 0px 4px;}
	</style>
	<script type="text/javascript">

        window.onload = function () {
            var container = document.getElementById('container');
            var list = document.getElementById('list');
            var buttons = document.getElementById('buttons').getElementsByTagName('span');
            var prev = document.getElementById('prev');
            var next = document.getElementById('next');
            var index = 1;
            var len = 5;
            var animated = false;
            var interval = 3000;
            var timer;


            function animate (offset) {
                if (offset == 0) {
                    return;
                }
                animated = true;
                var time = 300;
                var inteval = 10;
                var speed = offset/(time/inteval);
                var left = parseInt(list.style.left) + offset;

                var go = function (){
                    if ( (speed > 0 && parseInt(list.style.left) < left) || (speed < 0 && parseInt(list.style.left) > left)) {
                        list.style.left = parseInt(list.style.left) + speed + 'px';
                        setTimeout(go, inteval);
                    }
                    else {
                        list.style.left = left + 'px';
                        if(left>-200){
                            list.style.left = -600 * len + 'px';
                        }
                        if(left<(-600 * len)) {
                            list.style.left = '-600px';
                        }
                        animated = false;
                    }
                }
                go();
            }

            function showButton() {
                for (var i = 0; i < buttons.length ; i++) {
                    if( buttons[i].className == 'on'){
                        buttons[i].className = '';
                        break;
                    }
                }
                buttons[index - 1].className = 'on';
            }

            function play() {
                timer = setTimeout(function () {
                    next.onclick();
                    play();
                }, interval);
            }
            function stop() {
                clearTimeout(timer);
            }

            next.onclick = function () {
                if (animated) {
                    return;
                }
                if (index == 5) {
                    index = 1;
                }
                else {
                    index += 1;
                }
                animate(-600);
                showButton();
            }
            prev.onclick = function () {
                if (animated) {
                    return;
                }
                if (index == 1) {
                    index = 5;
                }
                else {
                    index -= 1;
                }
                animate(600);
                showButton();
            }

            for (var i = 0; i < buttons.length; i++) {
                buttons[i].onclick = function () {
                    if (animated) {
                        return;
                    }
                    if(this.className == 'on') {
                        return;
                    }
                    var myIndex = parseInt(this.getAttribute('index'));
                    var offset = -600 * (myIndex - index);

                    animate(offset);
                    index = myIndex;
                    showButton();
                }
            }

            container.onmouseover = stop;
            container.onmouseout = play;

            play();

        }
    </script>
  </head>
  
  <body>
  <div><a href="logins"> <font color="#8080C0" size="4px" style="margin-left: 75%; margin-top:30%;">登录</font></a></div>
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
     <a href="shopcarGo"><img src="images/gou.jpg" style="margin-left: 72%; margin-top: -8%"></a>
     <table cellpadding="20" cellspacing="45px" style="margin-left: -7%;margin-top: 1%"><tr>
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
 <hr width="100%" style="color: red; margin-top: -2.5%">
  <div id="container">
    <div id="list" style="left: -600px;">
        <img src="images/5.jpg" alt="1"/>
        <img src="images/1.jpg" alt="1"/>
        <img src="images/2.jpg" alt="2"/>
        <img src="images/3.jpg" alt="3"/>
        <img src="images/4.jpg" alt="4"/>
        <img src="images/5.jpg" alt="5"/>
        <img src="images/1.jpg" alt="5"/>
    </div>
    <div id="buttons">
        <span index="1" class="on"></span>
        <span index="2"></span>
        <span index="3"></span>
        <span index="4"></span>
        <span index="5"></span>
    </div>
    <a href="javascript:;" id="prev" class="arrow">&lt;</a>
    <a href="javascript:;" id="next" class="arrow">&gt;</a>
  </div><br>

  <font color="#FF2D2D" size="6px" style="margin-left: 10%">新书上架</font>
  <hr style="color: #FF2D2D; width: 80%; margin-left: 10%"><br>
   <table align="center" cellspacing="30px" border="1" cellpadding="30px"  style="border:none;margin-left: 10%" >
		 <tr>
		 <s:bean name="com.dao.impl.Books"  >
        	<s:iterator value="#application.booklist1" begin="1" end="5">	 
         <td class="hidden-480" id="table" align="center" ><a href="item?id=<s:property value="id"/>">
              <img src="<s:property value="picture"/>" width="170px" height="200px"><br><br>
                                          ￥<s:property value="price"/><br><s:property value="name"/></a></td>
        </s:iterator>
        </s:bean>
         </tr>
   </table><br>
   <font color="#8080C0" size="6px" style="margin-left: 10%">主编推荐</font>
    <hr style="color: #8080C0; width: 80%; margin-left: 10%"><br>
   <table align="center" cellspacing="30px" border="1" cellpadding="30px"  style="border:none;margin-left: 10%" >
		 <tr>
		  <s:bean name="com.dao.impl.Books" id="books2" >
          <s:iterator value="#application.booklist2" begin="1" end="5"> 
         <td class="hidden-480" id="table" align="center" ><a href="item?id=<s:property value="id"/>">
              <img src="<s:property value="picture"/>" width="170px" height="200px"><br><br>
                                         ￥<s:property value="price"/><br><s:property value="name"/></a></td>
        </s:iterator>
        </s:bean>
         </tr>
   </table>
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
