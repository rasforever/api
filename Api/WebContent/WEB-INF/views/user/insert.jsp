<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<script src="${pageContext.request.contextPath}/resources/js/jquery-3.3.1.min.js"></script>    
<script src="${pageContext.request.contextPath}/resources/js/jquery-1.10.2.js"></script>    



<%@ include file="../include/user_header.jsp"%>

<div class="apl_main">
	<div>
		<table border=1>
			<tr>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
			</tr>
			<tr>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
			</tr>
			<tr>
				<td></td>
				<td colspan="5"></td>
			</tr>
		</table>
	</div>
	<div>
		<table border="1">
			<thead>
				<tr>
					<th>체크</th>
					<th>NAME</th>
					<th>필수</th>
					<th>Maxlength</th>
					<th>설명</th>
					<th>비고</th>
				</tr>
				<tr>
					<th colspan="6">REQUEST
						<button align="right">+</button>
					</th>
				</tr>
			</thead>
			<tbody>
			</tbody>
		</table>
		<table>
			<thead>
				<tr>
					<th>체크</th>
					<th>NAME</th>
					<th>필수</th>
					<th>Maxlength</th>
					<th>설명</th>
					<th>비고</th>
				</tr>
				<tr>
					<th colspan="6">RESPONSE
						<button align="right">+</button>
					</th>
				</tr>
			</thead>
			<tbody>
			</tbody>
		</table>
	</div>
	<div>
		<div class="bs-example bs-example-tabs" role="tabpanel" data-example-id="togglable-tabs">
			<ul id="myTab" class="nav nav-tabs" role="tablist">
				<li role="presentation" class="active">
					<a href="#home" id="request-tab" role="tab" data-toggle="tab" aria-controls="home" aria-expanded="true">REQUEST</a>
				</li>
			</ul>
			<div id="myTabContent">
				<pre id="requestContents">
					<c:out value="${logItem.REQ_DATA}"/>	
				</pre>
			</div>
		</div>
		<div class="bs-example bs-example-tabs" role="tabpanel" data-example-id="togglable-tabs">
			<ul id="myTab" class="nav nav-tabs" role="tablist">
				<li role="presentation" class="active">
					<a href="#home" id="request-tab" role="tab" data-toggle="tab" aria-controls="home" aria-expanded="true">RESPONSE</a>
				</li>
			</ul>
			<div id="myTabContent">
				<pre id="requestContents">
					<c:out value="${logItem.REQ_DATA}"/>	
				</pre>
			</div>
		</div>
	</div>
</div>
<div class="apl_main_footer">
	<%-- <c:if test="${memberVO.h_rank < ='3'}"> --%>
	<button type="submit" id="api_modify" maxlength="12" class="btn btn-warning" style="text-align: center;">신규저장</button>
	<button type="submit" id="api_cancel" maxlength="12" class="btn btn-danger" style="">취소</button>
	<%-- </c:if> --%>
</div>
<script type="text/javascript">
	$(document).ready(function () {
		var formObj = $("form[role='form']");
		console.log(formObj);
		$("api_modify").click(function () {
			formObj.attr("action","/");
			formObj.attr("method","post")
			formObj.submit();
			
		});
		$("api_cancel").click(function () {
			location.href = "/user";
			
		});
	});

</script>

<%@ include file="../include/footer.jsp"%>