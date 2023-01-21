<%--
  Created by IntelliJ IDEA.
  User: istiy
  Date: 18-01-2023
  Time: 11:14 pm
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Registeration Page</title>
</head>
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/registeration.css">
<body>
<h2 style=text-align:center;margin-top:30px;font-family:TrebuchetMS,sans-serif;color:#163010>Registeration Page</h2>
<div class="reg-page">
    <div class="form-reg">
        <form action="register" method="post">
            <div class="login">
                <input type="text" name = "fname" placeholder="FirstName"><br>
                <input type="text" name = "lname" placeholder = "LastName"><br>
                <input type="email" name="email" placeholder="Email"><br>
                <input type="text" name="uname" placeholder="Username">
                <input type="password" name="pass" placeholder="Password"><br>
                <input type="submit" value="Register">
                <input type="button" value="Back To Login Page" onclick="window.location.href = 'Reg2Log'">
            </div>
        </form>
    </div>
</div>
</body>
</html>
