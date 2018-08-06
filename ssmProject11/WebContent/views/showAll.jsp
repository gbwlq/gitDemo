<%@page import="org.lanqiao.entity.Student"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	
	<table border="1">
		<tr>
			<th>学号</th>
			<th>姓名</th>
			<th>年龄</th>
		</tr>
		
		<c:forEach var="stus" items="${student}" >
		<tr>
			<td>
				${stus.stuNo }
			</td>
			<td>
				${stus.stuName }
			</td>
			<td>
				${stus.stuAge }
			</td>
		</tr>
		</c:forEach>
		
		<%
		//List<Student> stus=(List<Student>)request.getAttribute("student");
			%>
			<% 
		//for(int i=0;i<stus.size();i++){
		//	out.print("<tr>");
		//out.print("<td>"+stus.get(i).getStuNo()+"</td>");
		//out.print("<td>"+stus.get(i).getStuName()+"</td>");
		//out.print("<td>"+stus.get(i).getStuAge()+"</td>");
		//out.print("</tr>");
		//} %>
	</table>
</body>
</html>