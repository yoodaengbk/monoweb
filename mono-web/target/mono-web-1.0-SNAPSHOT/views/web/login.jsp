<%--
  Created by IntelliJ IDEA.
  User: TAM TRUONG
  Date: 4/2/2021
  Time: 10:45 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/common/taglib.jsp" %>

<c:url var="formUrl" value="/login.html"/>

<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>


</head>

<body>
<div class="container">
    <div class="row">
        <div class="col-md-6">
            <div class="card">
                <form class="box" method="post" action="${formUrl}">
                    <h1>Login</h1>
                    <p class="text-muted"> Please enter your login and password!</p>
                    <input type="text" name="pojo.name" placeholder="Username">
                    <input type="password" name="pojo.password" placeholder="Password">
                    <a class="forgot text-muted" href="#">Forgot password?</a>
                    <input type="submit" name="submit" value="Login" href="#">
                    <c:if test="${not empty messageResponse}">
                        <div class ="alert alert-${alert}">
                            <span class="loginMsg ">${messageResponse}</span>
                        </div>
                    </c:if>

                </form>
            </div>
        </div>
    </div>
</div>

</body>

</html>
