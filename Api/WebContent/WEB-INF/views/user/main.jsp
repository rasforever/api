<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>



<%@ include file="../include/user_header.jsp"%>
<div class="user_left"><%@ include file="side.jsp" %></div>

<div class="user_center">
	<div class="col-md-offset-2 main">
		<div class="api_main_header">
			<c:if test="${memberVO.h_rank < = '3'}">
			<button type="submit" name=api_modify id="api_modify" maxlength="12">수정</button>
			</c:if>
		</div>
		<div class="api_main" style="margin-left: 10%;margin-right:10%;">
			<div class="table-responseive">
				${docVO.doc_no} - ${docVO.doc_ver }				
					<table class="table table-bordered table-bordered">
						<tr>
							<th>기능ID</th>
							<td>${docVO.doc_func_id}</td>
							<th>NO</th>
							<td>${docVO.doc_num}</td>
							<th>I/F NAME</th>
							<td>${docVO.doc_title}</td>
						</tr>
						<tr>
							<th>분류</th>
							<td colspan=3>${docVO.doc_class_nm}</td>
							<th>EVENT</th>
							<td>${docVO.doc_event_nm}</td>
							
						</tr>
						<tr>
							<th>작성자</th>
							<td>${docVO.doc_wrt_nm}</td>
							<th>작성일</th>
							<td>${docVO.doc_wrt_date}</td>
							<th>Description</th>
							<td>${docVO.doc_description}</td>
						</tr><tr>
							<th>주요 확인사항</th>							
							<td colspan="5"><pre id="docContents"><c:out value="${docVO.doc_content}"/></pre></td>
						</tr>
					</table>
				</div>
				<div class="table-responsive">
					<table class="table table-bordered table-bordered">
						<thead>
							<tr>
								<th>EVENT</th>
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
						<c:forEach items="${docVO}" var="DocDetailVO">
							<c:choose>
								<c:when test="${DocDetailVO.doc_d_name } == ${DocDetailVo.doc_d_hrank}">
									<%
									
									
									
									
									%>
									<tr>
										<td></td>
										<td>${DocDetailVO.doc_d_name }</td>
										<td>${DocDetailVO.doc_d_essck }</td>
										<td>${DocDetailVO.doc_d_maxl }</td>
										<td>${DocDetailVO.doc_d_name }</td>
										<td>${DocDetailVO.doc_d_content }</td>
										<td>${DocDetailVO.doc_d_note }</td>
									</tr>
								</c:when>
								<c:when test="${DocDetailVO.doc_d_name } != ${DocDetailVo.doc_d_hrank}">
									<tr>
										<td></td>
										<td>${DocDetailVO.doc_d_name }</td>
										<td>${DocDetailVO.doc_d_essck }</td>
										<td>${DocDetailVO.doc_d_maxl }</td>
										<td>${DocDetailVO.doc_d_name }</td>
										<td>${DocDetailVO.doc_d_content }</td>
										<td>${DocDetailVO.doc_d_note }</td>
									</tr>
								
								</c:when>
							</c:choose>						
						</c:forEach>
						</tbody>
					</table>
					<table class="table table-bordered table-bordered">
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
								<c:out value="${docVO.doc_request}"/>	
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
								<c:out value="${docVO.doc_response}"/>	
							</pre>
						</div>
					</div>
				</div>
			</div>
		</div>
		
</div>


<%@ include file="../include/footer.jsp"%>