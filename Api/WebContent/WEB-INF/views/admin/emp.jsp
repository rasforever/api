<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<script src="${pageContext.request.contextPath}/resources/js/jquery-3.3.1.min.js"></script>    
<script src="${pageContext.request.contextPath}/resources/js/jquery-1.10.2.js"></script>    
<%@ include file="../include/user_header.jsp"%>

<div class="admin_table" style="margin-left:10%; margin-right:10%">
	<div>
		<input type="button" class="btn btn-primary" id="emp_update" name="emp-update" value="저장">
		<input type="button" class="btn btn-primary" id="emp_delete" name="emp_delete" value="삭제">
	</div>
	<div class="table-responsive">
		<table class="table table-bordered table-bordered" id="empTable">
			<thead>
				<tr>
					<th>체크</th>
					<th>아이디</th>
					<th>성명</th>
					<th>패스워드</th>
					<th>회원등급</th>
				</tr>
			</thead>
			<tbody>
			<c:forEach items="${emp_list}" var="MemberVO">
				<tr>
					<td><input type="text" id="emp_id" name="emp_id" style='width:100%; height:100%;' value='${MemberVO.emp_id}'></td>
					<td><input type="text" id="emp_nm" name="emp_nm" style='width:100%; height:100%;' value='${MemberVO.emp_nm}'></td>
					<td><input type="password" id="emp_pw" name="emp_pw" style='width:100%; height:100%;' value='${MemberVO.emp_pw}'></td>
					<td><select name="emp_rank" id="emp_rank">
							<c:forEach items="${code_list}" var="CommonCodeVO">
								<c:choose>
									<c:when test="${CommonCodeVO.cd1.equlas(MemberVO.emp_rank)}">
										<option value="${CommonCodeVO.cd1}" selected="selected">${CommonCodeVO.cd_nm1}
									</c:when>
									<c:when test="${CommonCodeVO.cd1 != MemberVO.emp_rank}">
										<option value="${CommonCodeVO.cd1}">${CommonCodeVO.cd_nm1}
									</c:when>
								</c:choose>
							</c:forEach>
						</select>
					</td>
					<td>
						<c:choose>
							<c:when test="${MemberVO.admin_aut.equals('Y')}">
								<input type="checkBox" checked="checked" id="admin_out" name="admin_out">
							</c:when>
							<c:when test="${MemberVO.admin_aut. != 'Y'}">
								<input type="checkBox" id="admin_out" name="admin_out">
							</c:when>
						</c:choose>
					</td>	
				</tr>
			</c:forEach>
			</tbody>
		</table>
	</div>
</div>
<script type="text/javascript">
	$(document).ready(function () {
		
		$('#emp_update').click(function() {
			
			var tr=$('#empTable tbody tr');
			var po = [];			
			for (var i = 0; i < tr.length; i++){
				var ch_ck = $('#ch_ck',tr.eq(i)) 
				var id = $('#emp_id',tr.eq(i)) 
				var nm = $('#emp_nm',tr.eq(i)) 
				var pw = $('#emp_pw',tr.eq(i)) 
				var rank = $('#emp_rank',tr.eq(i)) 
				var admin_aut = $('#admin_aut',tr.eq(i)) 
				if(admin_aut.is(":checked" == true)){
					admin_aut.val("Y");
				} else{
					admin_aut.val("N");
				}
				if(ch_ck.is(":checked" == true)){
					var voList = {};
					voList.emp_id = id.val();
					voList.emp_nm = nm.val();
					voList.emp_pw = pw.val();
					voList.emp_rank = rank.val();
					voList.admin_aut = admin_aut.val();
					po.push(voList);					
				}				
				
			}
			var vo = JSON.stringify(po);
			$.ajax({
				url : '/admin/emp_modity',
				method : 'post',
				contentType : 'application/x-www-form-urlencoded;charset=UTF-8',
				data : {memberVO: vo},
				dataType: 'json',
				success : function() {
					alert("성공");
				}	
			});
		});
		$('#emp_delete').click(function() {
		});
		
	})		
</script>

<%@ include file="../include/footer.jsp"%>