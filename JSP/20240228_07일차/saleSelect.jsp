<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.text.DecimalFormat"%>
<%@page import="dbconnection.MyDBConnection"%>
<%@page import="java.sql.SQLException"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원매출 조회</title>
<link
	href="https://fonts.googleapis.com/css2?family=Gugi&family=Song+Myung&display=swap"
	rel="stylesheet">
<link href="./css/basic.css" rel="stylesheet" />
<link href="./css/header.css" rel="stylesheet" />
<link href="./css/footer.css" rel="stylesheet" />
<link href="./css/saleSelect.css" rel="stylesheet" />
</head>
<body>
	<%--  <%@ include file="header.jsp" %> --%>
	<jsp:include page="header.jsp"></jsp:include>
	<section class="container">
		<h2>회원 매출 조회</h2>
		<table border="1">
			<tr>
				<th>회원번호</th>
				<th>회원성명</th>
				<th>고객등급</th>
				<th>매출</th>
			</tr>
			<%
			Connection con = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;

			String sql = "select mb.custno, mb.custname, mb.grade, sum(mo.price) as price "
					+ " from member_tbl_02 mb inner join money_tbl_02 mo on mb.custno = mo.cutno "
					+ "  group by mb.custno, mb.custname, mb.grade  order by sum(mo.price) desc";

			try {
				con = MyDBConnection.getConnection();
				pstmt = con.prepareStatement(sql);

				rs = pstmt.executeQuery();

				DecimalFormat f = new DecimalFormat("#,###원");

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
					}

					int price = Integer.parseInt(rs.getString("price"));
					String priceForm = f.format(price);
			%>
			<tr>
				<td><%=rs.getString("custno")%></td>
				<td><%=rs.getString("custname")%></td>
				<td><%=gradeForm%></td>
				<td><%=priceForm%></td>
			</tr>
			<%
			}
			%>
		</table>

	</section>
	<%-- <%@ include file="footer.jsp" %>  --%>
	<jsp:include page="footer.jsp"></jsp:include>
	<%
	} catch (SQLException e) {

	} finally {
	MyDBConnection.close(rs, pstmt, con);
	}
	%>
</body>
</html>