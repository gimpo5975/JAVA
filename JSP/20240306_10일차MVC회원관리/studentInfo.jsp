<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	th,td{
		width: 200px;
		height: 40px;
		line-height: 40px;
		text-align: center;
	}
	th{
		background-color: pink;
	}
	hr{
			margin-bottom: 20px;
	}
</style>
</head>
<body>
	<h1>학생 리스트</h1>
	<hr>
	<table border="1">
		<tr>
			<th>일련번호</th>
			<th>학번</th>
			<th>이름</th>
			<th>이메일</th>		
		</tr>
		<%-- 자료 넣기 --%>
		<c:forEach items="${studentAll}"  var="s"  varStatus="i">  
		<tr>
		    <td>${i.count}</td> <%-- 횟수,  ${i.index} : 인덱스 --%>
			<td>${s.id}</td>
			<td>${s.name}</td>
			<td>${s.email}</td>	
		</tr>
		</c:forEach>
		
		<tr>
		   <%-- 링크 부분 수정 --%>
			<td colspan="4">
				<a href="/studentApp/scontrol?action=send">학생등록화면</a>
			</td>
		</tr>	
	
	</table>
</body>
</html>