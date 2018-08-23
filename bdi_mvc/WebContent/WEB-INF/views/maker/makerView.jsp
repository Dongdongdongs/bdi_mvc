<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/common/common.jsp" %>
<body>
${list}
<div class="container">
	<table class="table table-bordered">
		<tr>
			<th>메이커명</th>
			<td>${list.mname}</td>
		</tr>
		<tr>
			<th>가격</th>
			<td>${list.mprice}</td>
		</tr>
		<tr>
			<th>수량</th>
			<td>${list.mcnt}</td>
		</tr>
		<tr>
			<th>총가격</th>
			<td>${list.mprice * list.mcnt}</td>
		</tr>
		<tr>
			<th>제품설명</th>
			<td>${list.mdesc}</td>
		</tr>
		</table>
	<div>
		<button onclick="goBack()">돌아가기</button>
		<button onclick="goUpdate()">돌아가기</button>
	</div>
</div>
</body>
<script>
	function goBack(){
		location.href="/maker/makerList";
	}
	function goUpdate(){
		
	}
</script>
</html>