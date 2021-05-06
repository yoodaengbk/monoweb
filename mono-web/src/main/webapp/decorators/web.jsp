
<%--
  Created by IntelliJ IDEA.
  User: TAM TRUONG
  Date: 3/28/2021
  Time: 5:19 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ include file="/common/taglib.jsp" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title><dec:title default="Home page"/> </title>
    <link rel="stylesheet" href="<c:url value='/template/bootstrap/css/bootstrap.min.css'/>">
    <script src="<c:url value='/template/bootstrap/js/jquery.min.js'/>"></script>
    <script src="<c:url value='/template/bootstrap/js/popper.min.js'/>"></script>
    <script src="<c:url value='/template/bootstrap/js/bootstrap.min.js'/>"></script>
    <link rel="stylesheet" href="<c:url value='/template/css/style.css'/>">


</head>
<body>
<%@ include file="/common/web/header.jsp" %>
    <dec:body/>
<%@ include file="/common/web/footer.jsp"%>
</body>
</html>
