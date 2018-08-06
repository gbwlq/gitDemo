<%@page import="org.lanqiao.entity.Student"%>
<%@page import="java.util.List"%>
<%@page import="com.github.pagehelper.Page"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
$(document).ready(function(){
	$(function(){
		$(".nav.page").initPage('${result.pages}','${result.pageNum}','${result.pageSize}',");
	});
});
</head>
<body>
<div class="nav page text align-right margin-top-25 margin-bottom-30">
	<table border="1">
		<tr>
			<th>学号</th>
			<th>姓名</th>
			<th>年龄</th>
		</tr>
		<c:forEach var="stus" items="list">
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
	</table>
	[${page.pageCode}/${page.totalPage}]<br>
</div>
<div id="browerCourseDiv">
	<table border="1">
		<tr>
			<th>学号</th>
			<th>姓名</th>
			<th>年龄</th>
		</tr>
		<c:forEach var="stus" items="list">
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
	</table>
	[${page.pageCode}/${page.totalPage}]<br>
</div>
	
	
</body>
</html>