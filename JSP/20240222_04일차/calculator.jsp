<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
double number1 = Integer.parseInt(request.getParameter("number1"));
double number2 = Integer.parseInt(request.getParameter("number2"));
String operator = request.getParameter("operator");

double result = 0.0;

switch (operator) {
case "+":
	result = number1 + number2;
	break;
case "-":
	result = number1 - number2;
	break;
case "x":
	result = number1 * number2;
	break;
case "/":
	result = number1 / number2;
	break;
}//end of switch
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>
		첫 번째 수 :
		<%=number1%></h2>
	<h2>
		두 번째 수 :
		<%=number2%></h2>
	<h2>
		연 산 자 :
		<%=operator%></h2>

	<h1>
		연산 결과 :
		<%=result%></h1>
</body>
</html>