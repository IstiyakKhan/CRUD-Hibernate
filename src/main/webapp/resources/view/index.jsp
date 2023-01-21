<%@ taglib prefix="c" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: istiy
  Date: 18-01-2023
  Time: 03:39 pm
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Login Page</title>
</head>
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/indexstyle.css">
<body>
<h2 style=text-align:center;margin-top:30px;font-family:TrebuchetMS,sans-serif;color:#163010>Login Page</h2>
<div class="login-page">
    <div class="form" style="margin-top: -55px">
        <form action="validate" method="post">
            <div class="login">
                <input type="text" name = "uname" placeholder="Username"><br>
                <input type="password" name = "pass" placeholder = "Password"><br>
            </div>
            <input type="submit" value="Login">
        </form>
        <form action="list" class="form2">
            <input type="submit" value="Guest Login">
        </form>
<%--        <a href="${pageContext.request.contextPath}/resources/view/registeration.jsp">Registeration</a>--%>
        <input type="button" value="Registeration" onclick="window.location.href = 'redirectReg'">
    </div>
</div>
</body>
</html>
