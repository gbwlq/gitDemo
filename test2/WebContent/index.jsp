<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.lanqiao.org" prefix="myTag" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	hello
	<myTag:myIterator num="3">
	3<br>
	</myTag:myIterator>
	
	<myTag:toLowerCase>
	AS<br>
	</myTag:toLowerCase>
	
	<myTag:mySimpleIterator num=""></myTag:mySimpleIterator>
	<myTag:mySimpleIterator num="3">
	asa<br>
	</myTag:mySimpleIterator>
</body>
</html>