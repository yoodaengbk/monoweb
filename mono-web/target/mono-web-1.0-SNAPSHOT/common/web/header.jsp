<%--
  Created by IntelliJ IDEA.
  User: TAM TRUONG
  Date: 3/27/2021
  Time: 9:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/common/taglib.jsp"%>
<html>
<head>
    <title>Home Page</title>
</head>
<body>
<header class="header">
    <nav class="navbar navbar-expand-lg navbar-light bg-light fixed-top  " id="navbar">
        <a class="navbar-brand text-center col-3  ml-auto" href="">
            <img width="120" class="header-logo" src="<c:url value='/template/images/mona-logo2.png'/>" alt="...">
        </a>
        <button class="navbar-toggler d-lg-none ml-auto" type="button" data-toggle="collapse"
                data-target="#collapsibleNavId" aria-controls="collapsibleNavId" aria-expanded="false"
                aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse ml-auto " id="collapsibleNavId">
            <ul class="navbar-nav mr-auto mt-2 mt-lg-0 ml-auto ">
                <li class="nav-item active">
                    <a class="nav-link text-dark" href="">TRANG CHỦ <span class="sr-only">(current)</span></a>
                </li>
                <li class="nav-item">
                    <a class="nav-link text-dark" href="">GIỚI THIỆU</a>
                </li>
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle text-dark" href="#" id="dropdownId" data-toggle="dropdown"
                       aria-haspopup="true" aria-expanded="false">TOUR NỘI ĐỊA</a>
                    <div class="dropdown-menu " aria-labelledby="dropdownId">
                        <a class="dropdown-item " href="">DU LỊCH MIỀN BẮC</a>
                        <a class="dropdown-item " href="">DU LỊCH MIỀN TRUNG</a>
                        <a class="dropdown-item " href="">DU LỊCH MIỀN NAM</a>

                    </div>
                </li>
                <li class="nav-item">
                    <a class="nav-link text-dark" href="">LIÊN HỆ</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link text-dark" href="">ĐĂNG NHẬP</a>
                </li>
            </ul>
            <form class="form-inline my-2 my-lg-0 mr-auto">
                <input class="form-control mr-sm-2" type="text" placeholder="Search">
                <button class="btn btn-outline-success my-2 my-sm-0 text-dark" type="submit">Search</button>
            </form>
        </div>
    </nav>
</header>

</body>
</html>
