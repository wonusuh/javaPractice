<%--
  Created by IntelliJ IDEA.
  User: 82103
  Date: 2024-05-09
  Time: 08:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Hello World</title>
    <style>
        body {
            color: blue;
        }

        h1 {
            color: red;
        }

        div h1 {
            background-color: green;
        }
    </style>
</head>
<body>
<div>
    <h1>Hello World</h1>
    <hr>
    현재 날짜와 시간은
    <%=java.time.LocalDateTime.now()%>
    입니다.
</div>
</body>
</html>
