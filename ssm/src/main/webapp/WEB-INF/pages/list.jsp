<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/2/10 0010
  Time: 21:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h1>查询所有的账户信息</h1>
    <c:forEach items="${list}" var="account">
        ${account.name}
    </c:forEach>




</body>
</html>
