<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>학생 정보 추가</title>
</head>
<style>
input{
	height: 25px;
	text-align: center;
}
hr{
 margin-bottom: 20px;
}
</style>
<body>
	<h1>학생 정보 추가 화면</h1>
	<hr>
	
	<%-- 컨트롤러로 이동 --%>
	<form method="post" action="/studentApp/scontrol?action=insert" >
	
		<h3>학 번 : <input type="text" name="id" required></h3>
		<h3>이 름 : <input type="text" name="name" required></h3>
		<h3>이메일 : <input type="email" name="email" required></h3>	
		<h3><input type="submit" value="학생 등록">&nbsp;&nbsp;&nbsp;
		
		<%-- 학생 정보 이동할 곳 설정 --%>
			<a href="/studentApp/scontrol?action=list" >학생정보리스트</a>
			
		</h3>
	</form>
</body>
</html>