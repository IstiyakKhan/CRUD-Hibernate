<%@ page import="java.util.List" %>
<%@ page import="com.Entities.User" %><%--
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
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
<%--<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/adding.css">--%>
<body  style="background-color:aliceblue">
<section class="vh-100">
    <div class="container py-5 h-100">
        <div class="row d-flex align-items-center justify-content-center h-100">
            <div class="col-md-8 col-lg-7 col-xl-6">
                <img src="https://mdbcdn.b-cdn.net/img/Photos/new-templates/bootstrap-login-form/draw2.webp"
                     class="img-fluid" alt="Phone image">
            </div>
            <div class="col-md-7 col-lg-5 col-xl-5 offset-xl-1">
               <form:form action="adding" modelAttribute="customer" method="post">
                   <form:hidden path="id"></form:hidden>
                    <div class="row">
                        <div class="col-md-6 mb-4">
                            <div class="form-outline">
                                <tr>
                                    <td><label>FirstName</label></td>
                                    <td><form:input path="firstName"></form:input></td>
                                </tr>
                            </div>
                        </div>
                        <div class="col-md-6 mb-4">
                            <div class="form-outline">
                                <tr>
                                    <td><label>LastName</label></td>
                                    <td><form:input path="lastName"></form:input></td>
                                </tr>
                            </div>
                        </div>
                    </div>

                    <!-- Email input -->
                    <div class="form-outline mb-4">
                        <tr>
                            <p>Email</p>
                            <td><form:input path="email"></form:input></td>
                        </tr>
                    </div>

                    <div class="d-flex justify-content-around align-items-center mb-4">
                        <input type="submit" class="btn btn-primary btn-lg btn-block" style="background-color: #3b5998" value="Submit">
                    </div>
               </form:form>
            </div>
        </div>
    </div>
</section>
</body>

</html>
