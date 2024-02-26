<%@page import="dbconnection.MyDBConnection"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
Connection con = null;//db연결 객체
PreparedStatement pstmt = null;//sql 쿼리문 넘겨주는 객체
ResultSet rs = null;//결과를 받아오는 객체

//한글깨짐 방지 코드
request.setCharacterEncoding("utf-8");

String userId = request.getParameter("uid");//회원가입 페이지에서 아이디 받아오기
String userName = request.getParameter("uname");//회원가입 페이지에서 이름 받아오기
String userPassword = request.getParameter("pwd");//회원가입 페이지에서 비밀번호 받아오기
int userAge = Integer.parseInt(request.getParameter("uage"));//회원가입 페이지에서 나이 받아오기

//쿼리문 작성
String sql = "insert into memberTBL(uid, uname, pwd, uage) values(?, ?, ?, ?)";

try {
	//db 접속한 후 객체 전달 받기
	con = MyDBConnection.getConnection();
	//sql문을 전달
	pstmt = con.prepareStatement(sql);
	pstmt.setString(1, userId);//member.html에서 받아온 userId를 db에 저장
	pstmt.setString(2, userName);//member.html에서 받아온 userName를 db에 저장
	pstmt.setString(3, userPassword);//member.html에서 받아온 userPassword를 db에 저장
	pstmt.setInt(4, userAge);//member.html에서 받아온 userAge를 db에 저장

	//sql문 실행
	//executeUpdate() : insert, update, delete
	//executeQyery() : select
	pstmt.executeUpdate();

} catch (SQLException e) {
	e.printStackTrace();//프로그램 완성 후 주석 또는 제거
} finally {
	MyDBConnection.close(rs, pstmt, con);//자원 닫기
}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입 성공</title>
</head>
<body>
	<h1>
		아이디 :
		<%=userId%></h1>
	<!--  회원가입 성공페이지에 아이디 다시 넘겨주기 -->
	<h1>
		이름 :
		<%=userName%></h1>
	<!--  회원가입 성공페이지에 이름 다시 넘겨주기 -->
	<h1>
		비밀번호 :
		<%=userPassword%></h1>
	<!--  회원가입 성공페이지에 비밀번호 다시 넘겨주기 -->
	<h1>
		나이 :
		<%=userAge%></h1>
	<!--  회원가입 성공페이지에 나이 다시 넘겨주기 -->
</body>
</html>