<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/common/common.jsp" %>
<c:if test="${!empty rMap}">
	<script>
		alert('${rMap.msg}');
		if('${rMap.cnt}'==1){
			location.href="/game/gameList";
		}
	</script>
</c:if>
<body>
<div class="container">
	<form action="/game/gameInsert" method="post">
	<table class="table table-bordered table-hover">
		<tr>
			<th>게임이름</th>
			<td><input type="text" name="gcName"></td>
		</tr>
		<tr>
			<th>가격</th>
			<td><input type="text" name="gcPrice"></td>
		</tr>
		<tr>
			<th>제작사</th>
			<td><input type="text" name="gcVender"></td>
		</tr>
		<tr>
			<th>순위</th>
			<td><input type="text" name="gcOrder"></td>
		</tr>
		<tr>
			<th>설명</th>
			<td><input type="text" name="gcDesc"></td>
		</tr>
		<tr>
			<th>이미지</th>
			<td><input type="text" name="gcImg"></td>
		</tr>
		<tr>
			<td colspan="2"><button>게임등록</button>
			<button data-page="/game/gameList">리스트로 돌아가기</button></td>	
		</tr>
	</table>
	</form>
</div>
</body>
</html>