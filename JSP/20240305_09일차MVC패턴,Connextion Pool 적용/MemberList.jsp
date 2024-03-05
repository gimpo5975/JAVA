<%@page import="model.MemberBean"%>
<%@page import="java.util.Vector"%>
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

	<!--  1.데이터 베이스에서 모든 회원의 정보를 가져옴 -->
	<!--  2.테이블 태그를 이용하여 화면에 회원들의 정보를 출력 -->

	<%
	MemberDAO mdao = new MemberDAO();
	//회원들의 정보가 얼마나 저장되어있는지 모르기에 가변길이인 Vector를 이용하여 데이터를 저장 해준다.
	Vector<MemberBean> vec = mdao.allSelectMember();
	%>
	<h2>모든 회원보기</h2>
	<table border="1">
		<tr>
			<td>아이디</td>
			<td>비밀번호</td>
			<td>비밀번호 확인</td>
			<td>이메일</td>
			<td>전화번호</td>
			<td>취미</td>
			<td>직업</td>
			<td>나이</td>
			<td>정보</td>
		</tr>
		<%
		for (int i = 0; i < vec.size(); i++) {
			MemberBean mbean = vec.get(i);//벡터에 담긴 mbean클래스를 하나씩 추출
		%>
		<tr>
			<td><a href="MemberInfo.jsp?id=<%=mbean.getId()%>"><%=mbean.getId()%></a></td>
			<td><%=mbean.getPass1()%></td>
			<td><%=mbean.getPass2()%></td>
			<td><%=mbean.getEmail()%></td>
			<td><%=mbean.getTel()%></td>
			<td><%=mbean.getHobby()%></td>
			<td><%=mbean.getJob()%></td>
			<td><%=mbean.getAge()%></td>
			<td><%=mbean.getInfo()%></td>
		</tr>

		<%
		} // end of for
		%>
	</table>
</body>
</html>