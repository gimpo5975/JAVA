<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>계산기 폼</title>
<style>
* {
	margin: 0;
	padding: 0;
	box-sizing: border-box;
}

form {
	width: 600px;
	height: 500px;
	margin: 30px auto;
}

div.wrap {
	width: 960px;
	height: 500px;
	margin: 30px auto;
	border: 5px dotted red;
	background-color: green;
}

input {
	background-color: black;
	width: 200px;
	height: 40px;
	border: 3px dotted blue;
	border-radius: 5px;
	color: white;
	width: 200px;
}

select {
	width: 40px;
	height: 40px;
	border: 3px dotted blue;
	border-radius: 5px;
	background-color: black;
	color: white;
}
</style>
</head>
<body>
	<div class="wrap">
		<form action="/shopdb/calc" method="get" name="calcForm">
			<input type="text" name="number1"> <select
				name="selectOption">
				<option>+</option>
				<option>-</option>
				<option>*</option>
				<option>/</option>
			</select> <input type="text" name="number2"><br /> <input
				type="submit" name="계산하기"> <input type="reset" name="다시하기">
		</form>
	</div>
</body>
</html>