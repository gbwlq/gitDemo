<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<form action="StudentController/queryStudentByNo" method="post">
		<input type="text" name="stuNo"><br>
		<input type="submit" value="查询">
	</form>
	
	<form action="StudentController/addStudent" method="post">
		NO:<input type="text" name="stuNo"><br>
		name:<input type="text" name="stuName"><br>
		age:<input type="text" name="stuAge"><br>
		graName:<input type="text" name="graName"><br>
		sex:<input type="text" name="stuSex"><br>
		cardID:<input type="text" name="cardID"><br>
		<input type="submit" value="增加">
	</form><br>
	
	<form action="StudentController/deleteStudentByNo" method="post">
		No:<input type="text" name="stuNo"><br>
		<input type="submit" value="删除">
	</form>
	
	<form action="StudentController/updateStudentByNo" method="post">
		NO:<input type="text" name="stuNo"><br>
		name:<input type="text" name="stuName"><br>
		age:<input type="text" name="stuAge"><br>
		graName:<input type="text" name="graName"><br>
		sex:<input type="text" name="stuSex"><br>
		cardID:<input type="text" name="cardID"><br>
		<input type="submit" value="修改">
	</form><br>
	
	<a href="StudentController/queryStudentAll">queryStudentAll</a><br>
	
	<a href="StudentController/queryStudentAllWithPage">queryStudentAllWithPage</a>
</body>
</html>