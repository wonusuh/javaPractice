<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<jsp:useBean id="calcSecond" class="ch07.CalculatorSecond"></jsp:useBean>
<jsp:setProperty property="*" name="calcSecond"></jsp:setProperty>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>계산기 - useBeanSecond</title>
</head>
<body>
	<h2>계산 결과 - useBeanSecond</h2>
	<hr>
	결과 :
	<%=calcSecond.calc2()%>
</body>
</html>
