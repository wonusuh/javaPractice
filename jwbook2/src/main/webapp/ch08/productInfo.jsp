<%--
  Created by IntelliJ IDEA.
  User: 82103
  Date: 2024-06-25
  Time: 06:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>상품정보조회</title>
</head>
<body>
<h2>상품정보조회</h2>
<hr>
<ul>
    <li>상품코드 : ${p.id}</li>
    <li>상품명 : ${p.name}</li>
    <li>제조사 : ${p.maker}</li>
    <li>가격 : ${p.price}</li>
    <li>등록일 : ${p.date}</li>
</ul>
</body>
</html>
