<%@ taglib prefix="c" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="cc" uri="http://java.sun.com/jsp/jstl/core" %>
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
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
<body style="background-color:aliceblue">
<section class="vh-100">
    <div class="container py-5 h-100">
        <div class="row d-flex align-items-center justify-content-center h-100">
            <div class="col-md-8 col-lg-7 col-xl-6">
                <img src="https://mdbcdn.b-cdn.net/img/Photos/new-templates/bootstrap-login-form/draw2.webp"
                     class="img-fluid" alt="Phone image">
            </div>
            <div class="col-md-7 col-lg-5 col-xl-5 offset-xl-1">
                <form action="validate" method="post">
                    <cc:if test="${isPresent == false}">
                        <h4 style="text-align: center; color: red;font-weight: bold" class="pb-5">Invalid Credentials</h4>
                    </cc:if>
                    <!-- Email input -->
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
                        <input type="submit" class="btn btn-primary btn-lg btn-block" value="Login">
                    </div>

                    <div class="divider d-flex align-items-center my-4">
                        <p class="text-center fw-bold mx-3 mb-0 text-muted">OR</p>
                    </div>

                    <a class="btn btn-primary btn-lg btn-block" style="background-color: #3b5998" href="${pageContext.request.contextPath}/redirectReg"
                       role="button">
                        <i class="fab fa-facebook-f me-2"></i>Register
                    </a>




                </form>
            </div>
        </div>
    </div>
</section>
</body>
</html>
