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

	<%
	String id = request.getParameter("id");
	MemberDAO mdao = new MemberDAO();
	MemberBean mbean = mdao.oneSelectMember(id);//해당하는 id의 회원정보를 리턴
	%>
	<h2>회원정보 보기</h2>
	<table border="1">
		<tr>
			<td>아이디</td>
			<td><%=mbean.getId()%></td>
		</tr>
		<tr>
			<td>비밀번호</td>
			<td><%=mbean.getPass1()%></td>
		</tr>
		<tr>
			<td>비밀번호 확인</td>
			<td><%=mbean.getPass2()%></td>
		</tr>
		<tr>
			<td>이메일</td>
			<td><%=mbean.getEmail()%></td>
		</tr>
		<tr>
			<td>전화번호</td>
			<td><%=mbean.getTel()%></td>
		<tr>
			<td>취 미</td>
			<td><%=mbean.getHobby()%></td>
		</tr>
		<tr>

			<td>직업</td>
			<td><%=mbean.getJob()%></td>
		</tr>
		<tr>

			<td>나이</td>
			<td><%=mbean.getAge()%></td>
		</tr>
		<tr>

			<td>정보</td>
			<td><%=mbean.getInfo()%></td>
		</tr>
		<tr>
			<td colspan="2">
				<button
					onclick="location.href='MemberUpdateForm.jsp?id=<%=mbean.getId()%>'">회원수정</button>
				<button
					onclick="location.href='MemberDeleteForm.jsp?id=<%=mbean.getId()%>'">회원삭제</button>
				<button onclick="location.href='MemberList.jsp'">목록보기</button>
				<button onclick="location.href='MemberJoin.jsp'">회원가입</button>
			</td>
		</tr>

	</table>
</body>
</html>