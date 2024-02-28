<%@page import="java.sql.SQLException"%>
<%@page import="dbconnection.MyDBConnection"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원목록 조회/수정 페이지</title>
<link
	href="https://fonts.googleapis.com/css2?family=Gugi&family=Song+Myung&display=swap"
	rel="stylesheet">
<link href="./css/basic.css" rel="stylesheet" />
<link href="./css/header.css" rel="stylesheet" />
<link href="./css/footer.css" rel="stylesheet" />
<link href="./css/listSelectUpdate.css" rel="stylesheet" />
</head>
<body>
	<%@ include file="header.jsp"%>
	<%--<jsp:include page="header.jsp"></jsp:include>--%>
	<section class="container">
		<h2>회원목록 조회/수정</h2>
		<table border="1">
			<tr>
				<th>회원번호</th>
				<th>회원성명</th>
				<th>전화번호</th>
				<th>주소</th>
				<th>가입일자</th>
				<th>고객등급</th>
				<th>거주지역</th>
			</tr>
			<%
			//한글깨짐 방지
			request.setCharacterEncoding("utf-8");

			Connection con = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;

			//쿼리문 작성
			String sql = "select * from member_tbl_02";

			try {
				//db연결
				con = MyDBConnection.getConnection();
				//쿼리문 전달
				pstmt = con.prepareStatement(sql);
				//쿼리문 실행
				rs = pstmt.executeQuery();

				//db에서 넘어온 값이 있을때까지 반복분 진행
				while (rs.next()) {
					String grade = rs.getString("grade");
					String gradeForm = "";

					switch (grade) {
					case "A":
				gradeForm = "VIP";
				break;
					case "B":
				gradeForm = "일반";
				break;
					case "C":
				gradeForm = "직원";
				break;
					}//end of switch
			%>
			<tr>
				<%-- 회원번호 --%>
				<td><a href="update.jsp?custno=<%=rs.getInt("custno")%>"><%=rs.getInt("custno")%></a></td>
				<%-- 회원성명 <%=rs.getString(2) %> --%>
				<td><%=rs.getString("custname")%></td>
				<%-- 전화번호 <%=rs.getString(3) %> --%>
				<td><%=rs.getString("phone")%></td>
				<%-- 주소 --%>
				<td><%=rs.getString("address")%></td>
				<%-- 가입일자 --%>
				<td><%=rs.getString("joindate")%></td>
				<%-- 고객등급 --%>
				<td><%=gradeForm%></td>
				<%-- 거주지역--%>
				<td><%=rs.getString("city")%></td>
			</tr>
			<%
			} //end of while
			%>

		</table>

	</section>
	<%-- <%@ include file="footer.jsp" %>  --%>
	<jsp:include page="footer.jsp"></jsp:include>
	<%
	} catch (SQLException e) {
	out.print("SQLException 예외 발생");
	} finally {
	MyDBConnection.close(rs, pstmt, con);
	} //end of try-catch-finally
	%>
</body>
</html>