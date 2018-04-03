<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="${pageContext.request.contextPath}/resources/js/jquery-3.3.1.min.js"></script>    
<script src="${pageContext.request.contextPath}/resources/js/jquery-1.10.2.js"></script>    
</head>

<script type="text/javascript">

	function ad_ck(obj) {
			if(obj.checed == true){
				$('#admin_ck').val("Y");
			}else{
				$('#admin_ck').val("N");
			}
		
	}
</script>
<body>
	<div id="login">
		<form name="login" action="/login/login_ck" method="post">
			<input type="checkbox" name="admin_check" id="admin_check" onclick="ad_ck(this)">관리자로그인
			<input type="hidden" name="admin_ck" id="admin_ck" value="N">
			<a href="${pageContext.request.contextPath}/login/join" onclick="window.open(this.href, '_blank', 'width=420, height=200, top=100, left=100'); return false">신규가입</a>
			
			<input type="text" name="" value="ID" disabled="disabled">
			<input type="text" name="emp_id" id="emp_id" maxlength="6" placeholder="ID를 입력하세요" class="idpw" onkeyup="this.value=this.value.toUpperCase();">
			
			<input type="text" name="emp_pw_nm" value="PW" disabled="disabled">
			<input type="password" name="emp_pw" maxlength="20" placeholder="PASSWORD를 입력하세요" class="idpw"><BR>
			
			<input type="submit" value="LOGIN" onclick="" id="login_bt">
			
			<a href="${pageContext.request.contextPath}/login/pwchg" onclick="window.open(this.href, '_blank', 'width=420, height=200, top=100, left=100'); return false">
				<button>패스워드 변경</button>
			</a>
		</form>
	</div>
	
</body>
</html>