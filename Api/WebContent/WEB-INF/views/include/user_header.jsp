<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>API MANAGER - USER</title>



<script src="${pageContext.request.contextPath}/resources/js/jquery-3.3.1.min.js"></script>    
<script src="${pageContext.request.contextPath}/resources/js/jquery-1.10.2.js"></script>  
<script src="${pageContext.request.contextPath}/resources/js/bootstrap.js"></script>   
<script src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"></script>     


<link href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css" rel="stylesheet"  />
<link href="${pageContext.request.contextPath}/resources/css/dashboard.css" rel="stylesheet"  />
<link href="${pageContext.request.contextPath}/resources/css/sort/style.css" rel="stylesheet"  />
<link href="${pageContext.request.contextPath}/resources/css/jquery-ui.css" rel="stylesheet"  />
<link href="${pageContext.request.contextPath}/resources/css/admin.css" rel="stylesheet"  />


</head>
<body>
	<nav class="navbar navbar-inverse navbar-fixed-top">
	<div class="container-fluid">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controlls="navbar">
				<span class="sr-only">Toggle navigation</span>
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="${pageContext.request.contextPath}/admin/main">GFlightAPIManger - USER</a>
		</div>
		<div id="navbar" class="navbar-collapse collapse">
			<ul class="nav navbar-nav navbar-right">
				<li class="navbar-brand">${emp_nm }</li>
				<%-- <c:if test="${memberVO.h_rank <= '3' }"> --%>
				<li>
					<a href="${pageContext.request.contextPath}/user/insert">신규작성</a>
				</li>
				<%-- </c:if> --%>
				<li>
					<a href="${pageContext.request.contextPath}/login">로그아웃</a>
				</li>
			</ul>
		</div>
	</div>
	</nav>