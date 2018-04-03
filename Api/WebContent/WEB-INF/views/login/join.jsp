<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	Join Page
	<div id="join">
		<form name="join" action="/login/join" method="post">
			<input type="text" name="emp_id_nm" value="ID(아이디)" disabled="disabled">
			<input type="text" name="emp_id" maxlength="6" placeholder="ID를 입력하세요" class="idpw" onkeyup="this.value=this.value.toUpperCase();"><BR>
			<input type="text" name="emp_pw_nm" value="Password(비밀번호)" disabled="disabled">
			<input type="password" name="emp_pw" maxlength="20" placeholder="PASSWORD를 입력하세요" class="idpw"><BR>
			<input type="text" name="emp_nm_nm" value="Name(이름)" disabled="disabled">
			<input type="text" name="emp_nm" maxlength="20" placeholder="Name을 입력하세요" class="idpw"><BR>
			<input type="submit" value="가입" id="login_bt">
			<a onclick="window.close()">
				<button>닫기</button>
			</a>
		
		</form>
	
	</div>

</body>
</html>