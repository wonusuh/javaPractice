<%--
  Created by IntelliJ IDEA.
  User: 82103
  Date: 2024-06-19
  Time: 13:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="calc" class="com.basic.jwbook2.ch07.Calculator"/>
<jsp:setProperty name="calc" property="*"/>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>계산 결과</h2>
결과 : <%=calc.calc()%>
</body>
</html>
