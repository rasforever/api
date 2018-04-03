<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="${pageContext.request.contextPath}/resources/js/jquery-3.3.1.min.js"></script>    
<script src="${pageContext.request.contextPath}/resources/js/jquery-1.10.2.js"></script>    

<title>Insert title here</title>
</head>
<body>
	Password Change Page
	<div id="pwchg">
		<form name="pwchg" action="/login/pwchg" method="post">
		
			<input type="text" name="emp_id_nm" value="ID" disabled="disabled">
			<input type="text" name="emp_id" maxlength="6" placeholder="ID를 입력하세요" class="idpw" onkeyup="this.value=this.value.toUpperCase();"><BR>
			
			<input type="text" name="emp_pw_nm" value="현재 패스워드" disabled="disabled">
			<input type="password" name="emp_pw" id="emp_pw maxlength="20" placeholder="현재 PASSWORD를 입력하세요" class="idpw"><BR>
			
			<input type="text" name="emp_pw_ch1_nm" value="바꿀 패스워드" disabled="disabled">
			<input type="password" name="emp_pw_ch1" id="emp_pw_ch1"  maxlength="20" placeholder="바꿀 PASSWORD를 입력하세요" class="idpw"><BR>
			
			<input type="text" name="emp_pw_ch2_nm" value="다시한번 패스워드" disabled="disabled">
			<input type="password" name="emp_pw_ch2" id="emp_pw_ch2" maxlength="20" placeholder="다시 한번 PASSWORD를 입력하세요" class="idpw"><BR>
			
			<input type="submit" value="변경" id="pwchg_bt">
			
			<a onclick="window.close()">
				<button>닫기</button>
			</a>
		
		</form>
	
	</div>

</body>
</html>