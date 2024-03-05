<%@page import="model.MemberBean"%>
<%@page import="model.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<style>
* {
	margin: 0;
	padding: 0;
	box-sizing: border-box;
}

h2 {
	text-align: center;
	width: 900px;
	margin: 15px auto;
}

table {
	width: 900px;
	margin: 0 auto;
	border-collapse: collapse;
}

tr {
	height: 50px;
}

td {
	text-align: center;
	width: 300px;
}

td:first-child {
	width: :150px;
}
</style>
<body>
	<!--  0.MemberList에서 넘긴 id를 받아줌 -->
	<!--  1.데이터 베이스에서 모든 회원의 정보를 가져옴 -->
	<!--  2.테이블 태그를 이용하여 화면에 회원의 정보를 출력 -->

	<h2>회원 삭제 하기</h2>

	<table border="1">
		<form action="MemberDeleteProc.jsp" method="post">
			<tr>
				<td>아이디</td>
				<td><%=request.getParameter("id")%></td>
			</tr>
			<tr>
				<td>비밀번호</td>
				<td><input type="password" name="pass1"></td>
			</tr>
		<tr>
			<td colspan="2"><input type="hidden" name="id"
				value="<%=request.getParameter("id")%>"> <input
				type="submit" value="회원 삭제하기">&nbsp;&nbsp;
		</form>
		<button onclick="location.href='MemberList.jsp'">회원 전체보기</button>
		</td>
		</tr>

	</table>

</body>
</html>