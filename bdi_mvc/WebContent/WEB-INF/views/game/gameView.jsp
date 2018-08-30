<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/common/common.jsp" %>
<body>
<div class="container">
	<table class="table table-bordered table-hover">
		<tr>
			<th>게임이름</th>
			<td>${game.gcName}</td>
		</tr>
		<tr>
			<th>게임가격</th>
			<td>${game.gcPrice}</td>
		</tr>
		<tr>
			<th>제작사</th>
			<td>${game.gcVender}</td>
		</tr>
		<tr>
			<th>순위</th>
			<td>${game.gcOrder}</td>
		</tr>
		<tr>
			<th>설명</th>
			<td>${game.gcDesc}</td>
		</tr>
		<tr>
			<th>이미지</th>
			<td>${game.gcImg}</td>
		</tr>
		<tr>
			<td colspan="2">
			<form action="/game/gameDelete" method="post">
			<input type="hidden" name="gcNum" value="${game.gcNum}">
			<button data-page="/game/gameList">리스트로</button>
			<button data-page="/game/gameUpdate?gcNum=${game.gcNum}">수정</button>
			<button>삭제</button>
			</form>
			</td>
		</tr>
	</table>
</div>
</body>
</html>