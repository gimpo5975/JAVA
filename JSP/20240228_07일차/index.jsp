<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메인페이지</title>
<link
	href="https://fonts.googleapis.com/css2?family=Gugi&family=Song+Myung&display=swap"
	rel="stylesheet">
<link href="./css/basic.css" rel="stylesheet" />
<link href="./css/header.css" rel="stylesheet" />
<link href="./css/footer.css" rel="stylesheet" />
</head>
<body>
	<%@ include file="header.jsp"%>
	<section class="container">
		<h2>쇼핑몰 회원관리</h2>
		<div class="contents">
			쇼핑몰 회원정보와 회원매출정보 데이터베이스를 구축하고 회원관리 프로그램을 작성하는 프로그램이다. <br> 프로그램
			작성 순서<br> 1.회원정보 테이블을 생성한다.<br> 2.매출정보 테이블을 생성한다.<br>
			3.회원정보, 매출정보테이블에 제시된 문제지와 참조데이터를 추가 생성한다.<br> 4.회원정보 입력 화면프로그램을
			작성한다.<br> 5.회원정보 조회 프로그램을 작성한다.<br> 6.회원매출정보 조회 프로그램을 작성한다.<br>
		</div>
	</section>
	<%@ include file="footer.jsp"%>

</body>
</html>