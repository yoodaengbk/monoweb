<%--
  Created by IntelliJ IDEA.
  User: TAM TRUONG
  Date: 3/27/2021
  Time: 9:07 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/common/taglib.jsp"%>
<c:url value="/admin-tour-list.html" var="tourListUrl">
    <c:param name="urlType" value="url_list"/>
</c:url>
<c:url value="/admin-user-list.html" var="userListUrl">
    <c:param name="urlType" value="url_list"/>
</c:url>
<html>
<head>
    <title>Title</title>

<body>
<%--<div class="left main-sidebar">--%>
    <div class="sidebar-inner leftscroll">

        <div id="sidebar-menu">

            <ul>
                <li class="submenu">
                    <a class="active" href="<c:url value="/admin-home.html"/>">
                        <i class="fas fa-bars"></i>
                        <span> Dashboard </span>
                    </a>
                </li>

                <li class="submenu">
                    <a href="${userListUrl}">
                        <i class="fas fa-user"></i>
                        <span> Users </span>
                    </a>
                </li>

                <li class="submenu">
                    <a href="${tourListUrl}">
                        <i class="fas fa-file-alt"></i>
                        <span> Tours </span>
                    </a>
                </li>

                <li class="submenu">
                    <a href="orders.html">
                        <span class="label radius-circle bg-danger float-right">18</span>
                        <i class="fas fa-envelope"></i>
                        <span> Oders </span>
                    </a>
                </li>

                <li class="submenu">
                    <a href="slider.html">
                        <i class="fas fa-photo-video"></i>
                        <span> Slider </span>
                    </a>
                </li>

                <li class="submenu">
                    <a href="charts.html">
                        <i class="fas fa-chart-line"></i>
                        <span> Charts </span>
                    </a>
                </li>


            </ul>

            <div class="clearfix"></div>

        </div>

        <div class="clearfix"></div>

    </div>

<%--</div>--%>
<!-- End Sidebar -->
</body>
</html>
