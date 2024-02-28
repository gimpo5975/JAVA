<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="dbconnection.MyDBConnection"%>
<%@page import="java.sql.SQLException"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
request.setCharacterEncoding("utf-8"); //한글 처리

Connection con = null;
PreparedStatement pstmt = null;
ResultSet rs = null;

String sql = "update member_tbl_02 " + " set custname=?, phone=?, address=?, joindate=?, grade=?, city=? "
		+ " where custno=?";
int custno = Integer.parseInt(request.getParameter("custno"));

try {
	con = MyDBConnection.getConnection();
	pstmt = con.prepareStatement(sql);
	
	pstmt.setString(1, request.getParameter("custname")); //?의 첫번째
	pstmt.setString(2, request.getParameter("phone"));
	pstmt.setString(3, request.getParameter("address"));
	pstmt.setString(4, request.getParameter("joindate"));
	pstmt.setString(5, request.getParameter("grade"));
	pstmt.setString(6, request.getParameter("city"));
	pstmt.setInt(7, custno);

	pstmt.executeUpdate();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<jsp:forward page="listSelectUpdate.jsp"></jsp:forward>
</body>
<%
} catch (SQLException e) {

} finally {
MyDBConnection.close(rs, pstmt, con);
}
%>
</html>