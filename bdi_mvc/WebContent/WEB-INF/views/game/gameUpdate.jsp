<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/common/common.jsp" %>
<body>
<div class="container">
	<form action="/game/gameUpdate" method="post">
	<table class="table table-bordered table-hover">
		<tr>
			<th>게임이름</th>
			<td><input type="text" name="gcName" value="${game.gcName}"></td>
		</tr>
		<tr>
			<th>게임가격</th>
			<td><input type="text" name="gcPirce" value="${game.gcPrice}"></td>
		</tr>
		<tr>
			<th>제작사</th>
			<td><input type="text" name="gcVender" value="${game.gcVender}"></td>
		</tr>
		<tr>
			<th>순위</th>
			<td><input type="text" name="gcOrder" value="${game.gcOrder}"></td>
		</tr>
		<tr>
			<th>설명</th>
			<td><input type="text" name="gcDesc" value="${game.gcDesc}"></td>
		</tr>
		<tr>
			<th>이미지</th>
			<td><input type="text" name="gcImg" value="${game.gcImg}"></td>
		</tr>
		<tr>
			<td colspan="2"><button data-page="/game/gameList">리스트로</button>
			<button>수정완료</button>	
			<input type="hidden" name="gcNum" value="${game.gcNum}">		
		</tr>
	</table>
	</form>
</div>
</body>
</html>