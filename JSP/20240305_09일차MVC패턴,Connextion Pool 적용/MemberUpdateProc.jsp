<%@page import="model.MemberDAO"%>
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
	request.setCharacterEncoding("UTF-8");
	%>
	<jsp:useBean id="mbean" class="model.MemberBean">
		<jsp:setProperty name="mbean" property="*" />
	</jsp:useBean>
	<%
	String id = request.getParameter("id");
	MemberDAO mdao = new MemberDAO();

	//String 타입으로 저장되어있는 패스워드(데이터베이스에서 가져온 pass값이 저장)를 가져옴
	String pass = mdao.getPass(id);
	//수정하기 위해서 작성한 패스워드값과 기존 데이터베이스에서 가져온 패스워드 값을 비교
	if (mbean.getPass1().equals(pass)) {//기존 패스워드와 데이터베이스 패스워드와 같다면 member테이블을 수정

		//MemeberDAO클래스의 회원수정 메소드를 호출
		mdao.updateMember(mbean);
		response.sendRedirect("MemberList.jsp");
		
	} else {
	%>
	<script type="text/javascript">
		alert('비밀번호가 일치하지 않습니다. 다시 확인해주세요');//비밀번호가 일치하지 않을경우 경고창 띄움
		history.go(-1);//다시 수정페이지(MemberUpdateForm.jsp)로 돌아감
	</script>
	<%
	}
	%>
</body>
</html>