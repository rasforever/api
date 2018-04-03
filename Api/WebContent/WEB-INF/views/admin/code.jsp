<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<script src="${pageContext.request.contextPath}/resources/js/jquery-3.3.1.min.js"></script>    
<script src="${pageContext.request.contextPath}/resources/js/jquery-1.10.2.js"></script>    
<%@ include file="../include/user_header.jsp"%>
<div class="admin_code" style="margin-left:10%;margin-right:10%;">
	<select name="c_cd" id="c_cd">
		<c:forEach items="${code_sellist}" var="CommonCodeVO">
			<option value="${CommonCodeVO.cd1}">-${CommonCodeVO.cd_nm1}
		</c:forEach>
	</select>
	<input type="button" class="btn btn-primary" id="selectCode" value="조회">
	<div>
		<input type="text" class="btn btn-primary" id="c_add" value="추가">
		<input type="text" class="btn btn-primary" id="c_save" value="저장">
		<input type="text" class="btn btn-primary" id="c_del" value="삭제">	
	</div>
	<div class="table-responseive">
		<table class="table table-bordered table-bordered" id="resultTable">
			<thead>
				<tr>
					<th>체크</th>
					<th>코드번호</th>
					<th>코드명</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${code_list}" var="CommonCodeVO">
					<tr>
						<td><input type="checkBox"></td>
						<td><input type="text" style='width:100%;height:100%;' value='${CommonCodeVO.cd1}'></td>
						<td><input type="text" style='width:100%;height:100%;' value='${CommonCodeVO.cd_nm1}'></td>
					</tr>				
				</c:forEach>
				
			</tbody>
		</table>
	</div>
</div>
<script>
$(document).ready(function() {
	var str = "";
	$('#c_add').click(function() {
		str += "<tr><td align='center'><input type='checkBox' checked></td>"
		    + "<tr><input type='text' style='widht:100%;height:100%;'></td>"
		    + "<tr><input type='text' style='widht:100%;height:100%;'></td></tr>";
	
		$('#selectCode').append(str);   
			var c_cd;
			c_cd = $('#c_cd').val();
			self.location = "code" + '?c_cd' + c_cd;
		    
	});
});

</script>


<%@ include file="../include/footer.jsp"%>