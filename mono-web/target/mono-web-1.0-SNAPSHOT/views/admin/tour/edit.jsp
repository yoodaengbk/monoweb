<%--
  Created by IntelliJ IDEA.
  User: TAM TRUONG
  Date: 4/20/2021
  Time: 1:08 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/common/taglib.jsp" %>
<c:url var="formUrl" value="/admin-tour-list.html"/>
<html>
<head>
    <title>Tour Edit</title>
</head>
<body>
    <br/>
    <br/>
    <div class="row">
        <div class="col-sm-9 m-auto" >
            <c:if test="${not empty messageResponse}">
                <div class="alert alert-block alert-${alert}">
                    <button type="button" class="close" data-dismiss="alert">
                        <i class="ace-icon fa fa-times"></i>
                    </button>
                        ${messageResponse}
                </div>
            </c:if>
            <form action="${formUrl}" method="post" enctype="multipart/form-data" id="formEdit">
                <div class="form-group row">
                    <label class="col-sm-3 control-label no-padding-right">Title</label>
                    <div class="col-sm-9">
                        <input type="text" name="pojo.title" id="title" />
                    </div>
                </div>

                <br/>
                <br/>
                <div class="form-group row ">
                    <label class="col-sm-3 control-label no-padding-right">File Upload</label>
                    <div class="col-sm-9">
                        <input type="file" name="file" id="uploadImage"/>
                    </div>
                </div>
                <br/>
                <br/>
                <div class="form-group row">
                    <label class="col-sm-3 control-label no-padding-right">Title</label>
                    <div class="col-sm-9">
                        <input type="text" name="pojo.content" id="content" />
                    </div>
                </div>

                <br/>
                <br/>
                <div class="form-group row">
                <div class="col-sm-12 m-auto">
                    <input type="submit" class="btn btn-white btn-warning btn-bold" value="Submit"/>
                </div>
        </div>



            </form>
        </div>
    </div>

</body>
</html>
