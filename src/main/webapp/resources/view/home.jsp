<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: istiy
  Date: 16-01-2023
  Time: 05:40 pm
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Table Data</title>
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/home.css">
</head>
<body style="background-color:aliceblue">

        <h1 style="text-align: center; margin-top: 50px;position:relative;right:6px;font-family:'Trebuchet MS', sans-serif";>Data Table</h1>

</div>

        <input type="button" value="Add New Entry" style=position:relative;left:300px;top:0px onclick="window.location.href='redirectJsp'; return false ;" class="button" >
        <table>
            <tr>
                <th>FirstName</th>
                <th>LastName</th>
                <th>Email</th>
                <th>Actions</th>
            </tr>
            <c:forEach var="temp" items="${customerList}">

                <c:url var="updateLink" value="/formUpdate">
                    <c:param name="customerId" value="${temp.id}"></c:param>
                </c:url>

                <c:url var="deleteLink" value="/deleting">
                    <c:param name="customerId" value="${temp.id}"></c:param>
                </c:url>

                <tr>
                    <td>${temp.firstName}</td>
                    <td>${temp.lastName}</td>
                    <td>${temp.email}</td>
                    <td>
                        <a href="${updateLink}">Update</a>
                        <a href="${deleteLink}">Delete</a>
                    </td>
                </tr>


            </c:forEach>
        </table>
</body>
</html>
