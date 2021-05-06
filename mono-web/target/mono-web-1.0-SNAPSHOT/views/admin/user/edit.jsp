<%--
  Created by IntelliJ IDEA.
  User: TAM TRUONG
  Date: 4/23/2021
  Time: 8:28 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/common/taglib.jsp"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="modal-dialog">
    <!-- Modal content-->
    <div class="modal-content">
        <div class="modal-header">

            <c:if test = "${not empty item.pojo.userId}">
                <h4 class="modal-title">Chỉnh sửa thông tin</h4>
            </c:if>
            <c:if test = "${empty item.pojo.userId}">
                <h4 class="modal-title">Thêm tài khoản</h4>
            </c:if>
            <button type="button" class="close" data-dismiss="modal">&times;</button>

        </div>
        <div class="modal-body">
            <div class="row">
                <div class="col-md-12 p-3">
                    <div class="md-form">
                        <input type="text" placeholder="Tên tài khoản" class="form-control" value="${item.pojo.name}" id="username" name="pojo.name" required/>
                    </div>
                </div>
                <div class="col-md-12 p-3">
                    <div class="md-form">
                        <input type="text" placeholder="Số điện thoại" class="form-control" value="${item.pojo.phone}" id="phone" name="pojo.phone" required/>
                    </div>
                </div>
                <div class="col-md-12 p-3">
                    <div class="md-form">
                        <input type="password" placeholder="Mật khẩu" class="form-control" value="${item.pojo.password}" id="password" name="pojo.password" required/>
                    </div>
                </div>
                <div class="col-md-12 p-3">
                    <div class="md-form">
                        <select name="roleId" id="role">
                            <option selected>Chọn vai trò</option>
                            <option value="1">Admin</option>
                            <option value="2">User</option>
                        </select>
<%--                        <c:choose>--%>
<%--                            <c:when test="${not empty item.pojo.userId}">--%>
<%--                                <select id="role" name="roleId">--%>
<%--                                    <option value="${item.pojo.roleDTO.roleId}">${item.pojo.roleDTO.name}</option>--%>
<%--                                    <c:forEach items="${item.roles}" var="itemRole">--%>
<%--                                        <c:if test="${itemRole.roleId ne item.pojo.roleDTO.roleId}">--%>
<%--                                            <option value="${itemRole.roleId}">${itemRole.name}</option>--%>
<%--                                        </c:if>--%>
<%--                                    </c:forEach>--%>
<%--                                </select>--%>
<%--                            </c:when>--%>
<%--                            <c:otherwise>--%>
<%--                                <select id="role" name="roleId">--%>
<%--                                    <option value="-1"><fmt:message key="label.option.role" bundle="${lang}"/></option>--%>
<%--                                    <c:forEach items="${item.roles}" var="itemRole">--%>
<%--                                        <option value="${itemRole.roleId}">${itemRole.name}</option>--%>
<%--                                    </c:forEach>--%>
<%--                                </select>--%>
<%--                            </c:otherwise>--%>
<%--                        </c:choose>--%>
                    </div>
                </div>

            </div>
        </div>
        <div class="modal-footer">
            <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        </div>
    </div>

</div>
</body>
</html>
