<%--
  Created by IntelliJ IDEA.
  User: TAM TRUONG
  Date: 4/12/2021
  Time: 11:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/common/taglib.jsp" %>
<c:url var="requestUrl" value="/admin-tour-list.html"/>
<c:url value="/admin-tour-edit.html" var="tourEditUrl">
    <c:param name="urlType" value="url_edit"/>
</c:url>
<c:url var="formUrl" value="/admin-tour-list.html"/>
<html>
<head>
    <title>List Tours</title>
</head>
<body>
<h1>HELLO</h1>

<c:if test="${not empty messageResponse}">
    <div class="alert alert-block alert-${alert}">
        <button type="button" class="close" data-dismiss="alert">
            <i class="ace-icon fa fa-times"></i>
        </button>
            ${messageResponse}
    </div>
</c:if>

    <a href="${tourEditUrl}" type="button">Thêm bài hd</a>
<display:table id="tableList" name="items.listResult" partialList="true" size="${items.totalItems}"
               pagesize="${items.maxPageItems}" sort="external" requestURI="${requestUrl}"
               class="table table-fcv-ace table-striped table-bordered table-hover dataTable no-footer"
               style="margin: 3em 0 1.5em;">

    <display:column property="title" titleKey="title" sortable="true" sortName="title"/>
    <display:column property="content" titleKey="content" sortable="true" sortName="content"/>
</display:table>

</body>
</html>
