<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hello World</title>
</head>
<body>
	<h2>Hello World</h2>
	<hr>
	현재 날짜와 시간은
	<%=LocalDateTime.now()%>입니다.
	<hr>
	메세지 : ${msg}
</body>
</html>
