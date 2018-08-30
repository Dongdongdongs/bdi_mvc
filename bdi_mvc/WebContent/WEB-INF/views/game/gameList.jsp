<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/common/common.jsp" %>
<body>
<div class="container">
	<table class="table table-bordered table-hover">
	<thead>
		<tr>
			<th>등록 번호</th>
			<th>게임명</th>
			<th>가격</th>
			<th>제작사</th>
			<th>순위</th>
			<th>설명</th>
			<th>이미지</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${gameList}" var="g">
			<tr>
				<td>${g.gcNum}</td>
				<td><a href="/game/gameView?gcNum=${g.gcNum}">${g.gcName}</td>
				<td>${g.gcPrice}</td>
				<td>${g.gcVender}</td>
				<td>${g.gcOrder}</td>
				<td>${g.gcDesc}</td>
				<td>${g.gcImg}</td>
			</tr>
		</c:forEach>
	</tbody>
	</table>
	<div><button data-page="/views/game/gameInsert">등록하기</button></div>
</div>
</body>
</html>