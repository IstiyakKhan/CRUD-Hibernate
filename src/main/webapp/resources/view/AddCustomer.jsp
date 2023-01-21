<%@ page import="java.util.List" %>
<%@ page import="com.Entities.Customer" %><%--
  Created by IntelliJ IDEA.
  User: istiy
  Date: 17-01-2023
  Time: 04:06 pm
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Adding Data</title>
</head>
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/adding.css">
<body>
<h2 style="text-align: center; margin-top: 110px;font-family:'Trebuchet MS', sans-serif">Enter Data</h2>
<form:form action="adding" modelAttribute="customer" method="post">
    <form:hidden path="id"></form:hidden>
    <table>
        <tbody>
        <tr>
            <td><label>FirstName :</label></td>
            <td><form:input path="firstName"></form:input></td>
        </tr>
        <tr>
            <td><label>LastName : </label></td>
            <td><form:input path="lastName"></form:input></td>
        </tr>
        <tr>
            <td><label>Email : </label></td>
            <td><form:input path="email"></form:input></td>
        </tr>
        <tr>
            <td><label></label></td>
            <td><input type="submit" value="Submit" class="submit"></td>
        </tr>
        </tbody>
    </table>
</form:form>
<a id = "reg" style=position:relative;left:535px;bottom:96px href = "${pageContext.request.contextPath}/list">Back To Table</a>
</body>
</html>
