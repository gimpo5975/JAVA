<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="dbconnection.MyDBConnection"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
//db 연결
Connection con = MyDBConnection.getConnection();
//쿼리문 작성
String sql = "select MAX(custno) +1 from member_tbl_02";
//MySQL에 쿼리문 전달
PreparedStatement pstmt = con.prepareStatement(sql);

//쿼리문 실행한 후 결과 받기
ResultSet rs = pstmt.executeQuery();

rs.next();

int maxCustNo = rs.getInt(1);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="./css/basic.css" rel="stylesheet" />
<link href="./css/header.css" rel="stylesheet" />
<link href="./css/footer.css" rel="stylesheet" />
</head>
<body>
	<%@ include file="header.jsp"%>
	<section class="container">
		<h2>홈쇼핑 회원 등록</h2>
		<form action="" method="post" name="member">
			<table>
				<tr>
					<th>회원번호 자동받기</th>
					<td><input type="text" name="custno" readonly="readonly"></td>
				</tr>
				<tr>
					<th></th>
					<td><input type="text" name=""></td>
				</tr>
				<tr>
					<th></th>
					<td><input type="text" name=""></td>
				</tr>
				<tr>
					<th></th>
					<td><input type="text" name=""></td>
				</tr>
				<tr>
					<th></th>
					<td><input type="text" name=""></td>
				</tr>
				<tr>
					<th></th>
					<td><input type="text" name=""></td>
				</tr>
				<tr>
					<th></th>
					<td><input type="text" name=""></td>
				</tr>
				<tr>
					<th></th>
					<td><input type="text" name=""></td>
				</tr>
			</table>
		</form>
	</section>
	<%@ include file="footer.jsp"%>

</body>
</html>