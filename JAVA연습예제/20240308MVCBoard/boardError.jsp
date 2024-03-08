<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
* {
	margin: 0;
	padding: 0;
	box-sizing: border-box;
}

body {
	width: 960px;
	height: 100vh;
	margin: 35px auto;
}

div.wrap {
	width: 100%;
	height: 600px;
	background-color: black;
}
h1{
	color: white;
	font-size: 3rem;
}
</style>
</head>
<body>
	<%
	Date date = new Date();
	%>
	<div class="wrap">
		<h1>🚫🚫에러 발생🚫🚫</h1>
		<h1><%=date.toString()%></h1>
	</div>
</body>
</html>