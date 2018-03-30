<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<div class="col-sm-3 col-md-2 sidebar">
	<ul class="nav nav-sidebar" id="leftMenu">
		<div class="form-group">
			<input type="text" name="gCode" id="gCode" maxlength="12">
			<input type="button" value="검색">
		</div>
	</ul>
</div>

<div class="api_list">
</div>