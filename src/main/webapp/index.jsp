<%--
  Created by IntelliJ IDEA.
  User: 程然
  Date: 2017/8/23
  Time: 11:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<html>
<head>
    <title>页面初始化</title>
</head>
<body>
    <table>
        <c:forEach items="${pb}" var="pb">
        <tr>
            <td>${pb.userid}</td>
            <td>${pb.username}</td>
        </tr>
        </c:forEach>
    </table>
</body>
</html>
