<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP</title>
<style>
h1 {
	color: green;
}
</style>
</head>
<body>
	<h1>JSP 연습</h1>
	<%-- 주석, 1~5까지의 합 --%>
	<%-- 선언문, 자바의 변수(필드)나 메소드를 정의 --%>
	<%!int sum = 0;

	int add() {
		for (int i = 1; i <= 5; i++) {
			sum += i;
		} //end of for
		return sum;
	}//end of add%>

	<%-- 스크립틀릿 태그, 자바 코드 작성 --%>
	<%
	int result = add();
	int hap = 0;

	for (int i = 1; i <= 100; i++) {
		hap += i;
	%>
	<h1>
		i =
		<%=i%>, hap =
		<%=hap%></h1>

	<%
	} //end of for
	%>

	<%-- 표현문, 변수, 계산식, 메소드 호출 결과를 문자열 형태로 출력하는데 사용 --%>
	<h1>
		1 ~ 5까지의 합 :
		<%=result%></h1>
	<h1>
		1 ~ 100까지의 합 :
		<%=hap%></h1>




</body>
</html>