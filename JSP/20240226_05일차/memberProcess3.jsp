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
<title>Insert title here</title>
</head>
<body>
	<%
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	//sql문 생성
	String sql = "select uid,uname,pwd,uage from memberTBL";

	//db연결
	con = MyDBConnection.getConnection();

	try {
		//sql문 전달
		pstmt = con.prepareStatement(sql);
		//sql문 실행 시키고 결과 받아오기
		rs = pstmt.executeQuery();

		int count = 0;
		while (rs.next()) {//db로 부터 받아온 값이 있을때 까지 반복문 실행
			count++;
	%>
	<h1 style="color: blue"><%=count%>번 회원 정보
	</h1>
	<h2>
		아이디 :
		<!--  db의 첫번째 인덱스에서 가져온 값 출력 -->
		<%=rs.getString(1)%></h2>
	<h2>
		이름 :
		<!--  db의 두번째 인덱스에서 가져온 값 출력 -->
		<%=rs.getString(2)%></h2>
	<h2>
		비밀번호 :
		<!--  db의 세번째 인덱스에서 가져온 값 출력 -->
		<%=rs.getString(3)%></h2>
	<h2>
		나이 :
		<!--  db의 네번째 인덱스에서 가져온 값 출력 
			db의 column 값이 int형이므로 Int로 받아옴
		-->
		<%=rs.getInt(4)%></h2>
	<hr style="border: 3px solid red">

	<%
	} //end of while
	} catch (SQLException e) {
	e.printStackTrace();
	} finally {
	MyDBConnection.close(rs, pstmt, con);
	}
	%>
</body>
</html>