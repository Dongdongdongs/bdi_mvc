<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/common/common.jsp" %>
<body>
<div class="container">
	<table class="table table-bordered table-hover">
			<tr>
				<th>번호</th>
				<th>메이커명</th>
				<th>가격</th>
				<th>수량</th>
				<th>총액</th>
				<th>메이커설명</th>
			</tr>
		<c:forEach items="${list}" var="m1">
		<tr>
			<td>${m1.mnum}</td>
			<td>${m1.mname}</td>
			<td>${m1.mprice}</td>
			<td>${m1.mcnt}</td>
			<td>${m1.mprice*m1.mcnt}</td>
			<td>${m1.mdesc}</td>
		</tr>
		 
	</c:forEach>
	</table>
</div>
		

</body>
</html>