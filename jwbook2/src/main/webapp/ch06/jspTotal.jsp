<%--
  Created by IntelliJ IDEA.
  User: 82103
  Date: 2024-06-18
  Time: 12:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <title>JSP 종합 예제</title>
</head>
<body>
<h2>JSP 종합 예제</h2>
<hr>
<%!
    String[] members = {"김길동", "홍길동", "김사랑", "박사랑",};
    int num1 = 10;

    private int calc(int num2) {
        return num1 + num2;
    }
%>
<h3>
    1. JSP 주석
    <!-- HTML 주석 : 화면에는 안보이고 소스에서는 보임 -->
    <%-- JSP 주석 : 화면에도 소스에서도 둘 다 안보임 --%>
</h3>
<h3>
    2. calc(10) 메서드 실행경과 :
    <%=calc(10)%>
</h3>
<h3>
    3. include : hello.jsp
    <%@include file="../hello.jsp" %>
</h3>
<h3>4. 스크립트(배열 데이터 출력) </h3>
<ul>
    <%
        for (String name : members) {
    %>
    <li><%=name%>
    </li>
    <%
        }
    %>
</ul>
</body>
</html>
