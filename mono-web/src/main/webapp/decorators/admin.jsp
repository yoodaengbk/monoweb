
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
    <title><dec:title default="Admin Page"/></title>

    <meta name="description" content="Blog posts | Nura Admin">
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="author" content="Your website">

    <!-- Favicon -->
    <link rel="shortcut icon" href="<c:url value='/template/admin/images/favicon.ico' /> ">
    <!-- Font Awesome CSS -->
    <link href="<c:url value='/template/admin/font-awesome/css/all.css' /> " rel="stylesheet" type="text/css" />

    <link rel="stylesheet" href="<c:url value='/template/bootstrap/css/bootstrap.min.css'/>">

    <!-- Custom CSS -->
    <link href="<c:url value='/template/admin/css/style.css' />" rel="stylesheet" type="text/css" />
<%--    Font Awesome CSS--%>
<%--    <link href="<c:url value='/template/bootstrap/css/font-awesome.min.css' />" rel="stylesheet" type="text/css" />--%>
    <script src="<c:url value='/template/admin/js/jquery.min.js' /> "></script>


</head>
<body class="adminbody">
<div class="main">
    <div class="headerbar">
        <%@include file="/common/admin/header.jsp"%>
    </div>
    <div class="left main-sidebar">
        <%@include file="/common/admin/menu.jsp"%>
    </div>
    <div class="content-page">

        <!-- Start content -->
        <div class="content">

            <div class="container-fluid">

                <dec:body/>

                <!-- end row -->

            </div>
            <!-- END container-fluid -->

        </div>
        <!-- END content -->

    </div>
    <!-- END content-page -->



</div>
<script src="<c:url value='/template/admin/js/modernizr.min.js' /> "></script>
<script src="<c:url value='/template/admin/js/jquery.min.js' /> "></script>
<script src="<c:url value='/template/admin/js/moment.min.js' /> "></script>

<script src="<c:url value='/template/admin/js/popper.min.js' /> "></script>
<script src="<c:url value='/template/admin/js/bootstrap.min.js' /> "></script>

<script src="<c:url value='/template/admin/js/detect.js' /> "></script>
<script src="<c:url value='/template/admin/js/fastclick.js' /> "></script>
<script src="<c:url value='/template/admin/js/jquery.blockUI.js' /> "></script>
<script src="<c:url value='/template/admin/js/jquery.nicescroll.js' /> "></script>

<!-- App js -->
<script src="<c:url value='/template/admin/js/admin.js' /> "></script>

</body>
</html>
