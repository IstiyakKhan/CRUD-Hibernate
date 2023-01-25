<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
<%--<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/registeration.css">--%>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
<body  style="background-color:aliceblue">
<section class="vh-100">
    <div class="container py-5 h-100">
        <div class="row d-flex align-items-center justify-content-center h-100">
            <div class="col-md-8 col-lg-7 col-xl-6">
                <img src="https://mdbcdn.b-cdn.net/img/Photos/new-templates/bootstrap-login-form/draw2.webp"
                     class="img-fluid" alt="Phone image">
            </div>
            <div class="col-md-7 col-lg-5 col-xl-5 offset-xl-1">
                <c:if test="${duplicateUsername}">
                    <h4 style="text-align: center; color: red;font-weight: bold" class="pb-5">Duplicate Username</h4>
                </c:if>
                <c:if test="${emptyField}">
                    <h4 style="text-align: center; color: red;font-weight: bold" class="pb-5">Empty Fields</h4>
                </c:if>
                <form action="register" method="post">
                    <div class="row">
                        <div class="col-md-6 mb-4">
                            <div class="form-outline">
                                <label class="form-label" for="form3Example1">First name</label>
                                <input type="text" id="form3Example1" class="form-control" name = "fname"/>
                            </div>
                        </div>
                        <div class="col-md-6 mb-4">
                            <div class="form-outline">
                                <label class="form-label" for="form3Example2">Last name</label>
                                <input type="text" id="form3Example2" class="form-control" name = "lname"/>
                            </div>
                        </div>
                    </div>

                    <!-- Email input -->
                    <div class="form-outline mb-4">
                        <label class="form-label" for="form1Example133">Email</label>
                        <input type="text" id="form1Example133" class="form-control form-control-lg" name = "email"/>
                    </div>

                    <!-- Username input -->
                    <div class="form-outline mb-4">
                        <label class="form-label" for="form1Example13">Username</label>
                        <input type="text" id="form1Example13" class="form-control form-control-lg" name = "uname"/>
                    </div>

                    <!-- Password input -->

                    <div class="form-outline mb-4">
                        <label class="form-label" for="form1Example23">Password</label>
                        <input type="password" id="form1Example23" class="form-control form-control-lg" name = "pass"/>
                    </div>

                    <div class="d-flex justify-content-around align-items-center mb-4">
                        <input type="submit" class="btn btn-primary btn-lg btn-block" style="background-color: #3b5998" value="Register">
                    </div>

                    <a class="btn btn-primary btn-lg btn-block" style="background-color:#007bff" href="${pageContext.request.contextPath}/Reg2Log"
                       role="button">
                        <i class="fab fa-facebook-f me-2"></i>Login Page
                    </a>

                </form>
            </div>
        </div>
    </div>
</section>
</body>
</html>
