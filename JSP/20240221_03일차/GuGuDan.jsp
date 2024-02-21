<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h2>구구단 출력</h2>

	<!-- 자바 코드 -->
	<%
	for (int i = 2; i <= 9; i++) {
	%>
	<%=i%>단
	<br>
	<%
	for (int j = 1; j <= 9; j++) {
	%>

	<!-- 웹에 출력 -->
	<%=i%>X<%=j%>
	=
	<%=i * j%>&nbsp;&nbsp;

	<!--  자바 코드 -->
	<%
	} //end of for-in
	%>
	<br>
	<%
	} //end of for
	%>

</body>
</html>