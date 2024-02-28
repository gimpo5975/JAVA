<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="dbconnection.MyDBConnection"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
//db연결 객체
Connection con = null;
//쿼리문 전달 객체
PreparedStatement pstmt = null;
//쿼리문 실행 후 값을 받아오는 객체
ResultSet rs = null;
String sql = "select (max(custno) + 1) as custno from member_tbl_02"; //sql문을 작성 마지막번호 +1

try {
	con = MyDBConnection.getConnection(); //db연결

	pstmt = con.prepareStatement(sql); //쿼리 전달

	rs = pstmt.executeQuery(); //쿼리 실행한 후 결과 받기

	rs.next();//ResultSet에 있는 값을 가져오는 메소드

	int maxCustno = rs.getInt("custno");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원등록 페이지</title>
<link
	href="https://fonts.googleapis.com/css2?family=Gugi&family=Song+Myung&display=swap"
	rel="stylesheet">
<link href="./css/basic.css" rel="stylesheet" />
<link href="./css/header.css" rel="stylesheet" />
<link href="./css/footer.css" rel="stylesheet" />
<link href="./css/memberInsert.css" rel="stylesheet" />
<script src="./js/memberInsert.js"></script>
</head>
<body>
	<%@ include file="header.jsp"%>
	<section class="container">
		<h2>홈쇼핑 회원 등록</h2>
		<!--  dbInsert로 이동하기전에 onsubmit 이벤트로 함수를 호출해서 입력 값의 유효성 검사를 진행함 -->
		<form action="dbInsert.jsp" method="post" name="member"
			onsubmit="return membInsert()">
			<table border="1">
				<tr>
					<th>회원번호 자동받기</th>
					<td><input type="text" name="custno" readonly="readonly"
						value="<%=maxCustno%>"></td>
				</tr>
				<tr>
					<th>회원성명</th>
					<td><input type="text" name="custname"></td>
				</tr>
				<tr>
					<th>회원전화</th>
					<td><input type="text" name="phone"></td>
				</tr>
				<tr>
					<th>회원주소</th>
					<td><input type="text" name="address"></td>
				</tr>
				<tr>
					<th>가입일자</th>
					<td><input type="text" name="joindate"></td>
				</tr>
				<tr>
					<th>고객등급[A:VIP,B:일반,C:직원]</th>
					<td><input type="text" name="grade"></td>
				</tr>
				<tr>
					<th>도시코드</th>
					<td><input type="text" name="city"></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" value="등 록"> <input
						type="button" value="조회" onclick="return search()"></td>
				</tr>
			</table>
		</form>
	</section>
	<%@ include file="footer.jsp"%>
	<%
	} catch (SQLException e) {
	out.print("SQLException 예외발생");
	} finally {
	MyDBConnection.close(rs, pstmt, con);
	}
	%>
</body>
</html>