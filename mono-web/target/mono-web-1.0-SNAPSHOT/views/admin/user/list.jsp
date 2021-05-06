<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/common/taglib.jsp"%>
<%--<c:url var="formUrl" value="/admin-user-list.html"/>--%>
<c:url var="requestUrl" value="/admin-user-list.html"/>
<c:url var="editUserUrl" value="/ajax-admin-user-edit.html">
    <c:param name="urlType" value="url_edit"/>
</c:url>
<c:url var="listUserUrl" value="/admin-user-list.html">
    <c:param name="urlType" value="url_list"/>
</c:url>


<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>User List</title>
</head>
<body>
<br/>
<br/>
<c:if test="${not empty messageResponse}">
    <div class="alert alert-block alert-${alert}">
        <button type="button" class="close" data-dismiss="alert">
            <i class="ace-icon fa fa-times"></i>
        </button>
            ${messageResponse}
    </div>
    <br/>
    <br/>
</c:if>

<div class="row">
    <div class="col-xs-12" style="margin-left: 4em">
        <div class="table-btn-controls">
            <div class="pull-right tableTools-container">
                <div class="dt-buttons btn-overlap btn-group">
                    <a flag="info" class="dt-button buttons-colvis btn btn-white btn-primary btn-bold" data-toggle="modal" onclick="update(this)" >
                                                <span>
                                                    <i class="fa fa-plus-circle bigger-110 purple"></i>
                                                </span>
                    </a>
                    <button type="button" class="dt-button buttons-html5 btn btn-white btn-primary btn-bold" id="deleteAll" disabled
                            data-toggle="tooltip" title="Xóa tất cả">
                                                 <span>
                                                    <i class="fa fa-trash bigger-110 pink"></i>
                                                </span>
                    </button>

                </div>
            </div>
        </div>
    </div>
</div>
<div class="row">
    <div class="col-sm-8" style="margin-left: 3em">
        <display:table id="tableList" name="items.listResult" partialList="true" size="${items.totalItems}"
                       pagesize="${items.maxPageItems}" sort="external" requestURI="${requestUrl}"
                       class="table table-fcv-ace table-striped table-bordered table-hover dataTable no-footer"
                       style="margin: 3em 0 1.5em;">
            <display:column title="<fieldset class='form-group text-center '>
												        <input type='checkbox' id='checkAll' class='check-box-element'>
												        </fieldset>" class="center select-cell align-middle" headerClass="center select-cell">
            <fieldset class="text-center align-middle">
                <input type="checkbox" name="checkList" id="checkbox_${tableList.userId}" value="${tableList.userId}" class="check-box-element"/>
            </fieldset>
            </display:column>
            <display:column property="name" titleKey="name" sortable="true" sortName="name"/>
            <display:column property="phone" titleKey="phone" sortable="true" sortName="phone"/>
            <display:column headerClass="col-actions" titleKey="label.action">
                <c:url var="editUrl" value="/ajax-admin-user-edit.html">
                    <c:param name="urlType" value="url_edit"/>
                    <c:param name="pojo.userId" value="${tableList.userId}"/>
                </c:url>
                <a class="btn btn-sm btn-primary btn-edit" sc-url="${editUrl}" onclick="update(this)" data-toggle="tooltip"  title="Update"><i class="fa fa-pen-square" aria-hidden="true"></i></a>
                <a class="btn btn-sm btn-danger btn-cancel" data-toggle="tooltip" title="Delete"><i class="fa fa-trash" aria-hidden="true"></i></a>
            </display:column>
        </display:table>
    </div>
    <div class="container">


        <!-- Modal -->
        <div class="modal fade" id="myModal" role="dialog">
            <div class="modal-dialog">

                <!-- Modal content-->
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal">&times;</button>
                        <h4 class="modal-title">Modal Header</h4>
                    </div>
                    <div class="modal-body">
                        <p>Some text in the modal.</p>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                    </div>
                </div>

            </div>
        </div>

    </div>
</div>
<script>
    $(document).ready(function () {
        // Handler for .ready() called.
        $
        managerCheckbox();
        // changeSelectAll();


    });
    function update (btn) {

        <%--var editUrl = '${editUserUrl}';--%>
        var editUrl = $(btn).attr('sc-url');
        if(typeof editUrl == 'undefined') {
            editUrl ='${editUserUrl}';
        }
        $('#myModal').load(editUrl,'', function () {
            $('#myModal').modal('toggle');
        });

    }
    function managerCheckbox() {
        $('#checkAll').on('change', function () {
            if ($('#checkAll').prop("checked")) {
                $(this).closest('table').find('input[type=checkbox]').prop('checked', true);
                $('#deleteAll').prop('disabled', false);
            } else {
                $(this).closest('table').find('input[type=checkbox]').prop('checked', false);
                $('#deleteAll').prop('disabled', true);
            }
        });
        $('input[name=checkList]').on('change', function () {
            if (($(this).prop('checked'))) {
                $('#deleteAll').prop('disabled', false);
                if ($('input[name=checkList]:checked').length === $('input[name=checkList]').length) {
                    $('#checkAll').prop("checked", true);
                }
            } else {

                $('#checkAll').prop("checked", false);
                if ($('input[name=checkList]:checked').length === 0) {
                    $('#deleteAll').prop('disabled', true);
                }
            }
        });
    }
</script>
</body>
</html>