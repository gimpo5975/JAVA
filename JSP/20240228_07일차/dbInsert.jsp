<%@page import="java.sql.SQLException"%>
<%@page import="dbconnection.MyDBConnection"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
//한글깨짐 방지
request.setCharacterEncoding("utf-8");

//db연결 객체
Connection con = null;
//쿼리문 전달 객체
PreparedStatement pstmt = null;
//쿼리문 실행 후 값을 받아오는 객체
ResultSet rs = null;
//회원정보 받아오기
int custno = Integer.parseInt(request.getParameter("custno"));
String custname = request.getParameter("custname");
String phone = request.getParameter("phone");
String address = request.getParameter("address");
String joindate = request.getParameter("joindate");
String grade = request.getParameter("grade");
String city = request.getParameter("city");
//쿼리문 작성 db에 회원정보 저장
String sql = "insert into member_tbl_02 values(?, ?, ?, ?, ?, ?, ?)";

try {
	//db연결
	con = MyDBConnection.getConnection();

	//쿼리문 전달
	pstmt = con.prepareStatement(sql);
	pstmt.setInt(1, custno);
	pstmt.setString(2, custname);
	pstmt.setString(3, phone);
	pstmt.setString(4, address);
	pstmt.setString(5, joindate);
	pstmt.setString(6, grade);
	pstmt.setString(7, city);
	//쿼리문 실행
	pstmt.executeUpdate();

} catch (SQLException e) {
	out.print("SQLException 예외 발생");
} finally {
	MyDBConnection.close(rs, pstmt, con);
} //end of finally
%>
<!-- 회원정보 db에 저장 후 기본페이지로 이동 -->
<jsp:forward page="index.jsp" />

