
<%@page import="com.oracle.entity.Login"%>
<%@page import="java.util.List"%>
<%@page import="com.oracle.dao.AccountDao"%>
<%@page import="com.oracle.dao.LoginDao"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>




<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>006组增删改查</title>
    </head>
    <body>
    	
    	<h1>006组增删改查11</h1>
    	
    	
    	<% 
				List<Login> list = (List<Login>)request.getAttribute("data");
			%>
		<table border="1px">
			<tr>
				<td>编号</td>
				<td>账号</td>
				<td>密码</td>
				<td>姓名</td>
				<td>操作</td>
			</tr>
			<!--
            	作者：offline
            	时间：2019-12-07
            	描述：拿到数据库中所有的用户并展示出来
            -->
			<%
			for(Login rs : list){
			%>
			<tr>
			<td><%=rs.getId()%></td>
			<td><%=rs.getName() %></td>
			<td><%=rs.getPassword() %></td>
			<td><%=rs.getNikename() %></td>
			<td><a href="#">修改</a> <a href="#">删除</a></td>
			</tr>
			
			<%
			}
			%>
		</table>
 	</body>
</html>