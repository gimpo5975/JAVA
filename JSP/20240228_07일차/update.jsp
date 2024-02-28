<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="dbconnection.MyDBConnection"%>
<%@page import="java.sql.SQLException"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
Connection con = null;
PreparedStatement pstmt = null;
ResultSet rs = null;

String sql = "select * from member_tbl_02 where custno = ?";
int custno = Integer.parseInt(request.getParameter("custno"));

try {
	con = MyDBConnection.getConnection();
	pstmt = con.prepareStatement(sql);
	pstmt.setInt(1, custno);

	rs = pstmt.executeQuery();

	rs.next();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>홈쇼핑 회원정보 수정</title>
<link
	href="https://fonts.googleapis.com/css2?family=Gugi&family=Song+Myung&display=swap"
	rel="stylesheet">
<link href="./css/basic.css" rel="stylesheet" />
<link href="./css/header.css" rel="stylesheet" />
<link href="./css/footer.css" rel="stylesheet" />
<link href="./css/update.css" rel="stylesheet" />
<script type="text/javascript" src="./js/update.js"></script>
</head>
<body>
	<%@ include file="header.jsp"%>
	<%--<jsp:include page="header.jsp"></jsp:include>--%>
	<section class="container">
		<h2>홈쇼핑 회원 정보 수정</h2>
		<form action="dbupdate.jsp" method="post" name="member"
			onsubmit="return infoUpdate()">
			<table border="1">
				<tr>
					<th>회원번호</th>
					<td><input type="text" name="custno" readonly
						value="<%=rs.getInt("custno")%>"></td>
				</tr>
				<tr>
					<th>회원성명</th>
					<td><input type="text" name="custname"
						value="<%=rs.getString("custname")%>"></td>
				</tr>
				<tr>
					<th>회원전화</th>
					<td><input type="text" name="phone"
						value="<%=rs.getString("phone")%>"></td>
				</tr>
				<tr>
					<th>회원주소</th>
					<td><input type="text" name="address"
						value="<%=rs.getString("address")%>"></td>
				</tr>
				<tr>
					<th>가입일자</th>
					<td><input type="text" name="joindate"
						value="<%=rs.getString("joindate")%>"></td>
				</tr>
				<tr>
					<th>고객등급[A:VIP,B:일반,C:직원]</th>
					<td><input type="text" name="grade"
						value="<%=rs.getString("grade")%>"></td>
				</tr>
				<tr>
					<th>도시코드</th>
					<td><input type="text" name="city"
						value="<%=rs.getString("city")%>"></td>
				</tr>
				<tr>
					<td colspan="2" class="btn"><input type="submit" value="수정">
						<input type="button" value="조회" onclick="return serach()">
						<%-- <input type="button" value="조회" onclick="location.href='listSelectUpdate.jsp'">  --%>
					</td>
				</tr>
			</table>
		</form>
	</section>
	<%@ include file="footer.jsp"%>
	<%
	} catch (SQLException e) {
	out.print("SQLException 예외 발생");
	} finally {
	MyDBConnection.close(rs, pstmt, con);
	}
	%>
</body>
</html>