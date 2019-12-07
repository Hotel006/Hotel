<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    	
    	<h1>修改用户数据</h1>
    	<!--
        	作者：offline
        	时间：2019-12-07
        	描述：查找选中的数据并拿到本页面中
        -->
    	<% %>
    	
    	
       	<form action="" method="post">
    		<input type="hidden" name="aid" value="<% %>" />
    		账号：<input type="text" name="aname" value="<% %>" />
    		密码：<input type="text" name="apass" value="<% %>" />
    		姓名：<input type="text" name="anikename" value="<% %>" />
    		<input type="submit" value="提交修改" />
    	</form>
 	</body>
</html>