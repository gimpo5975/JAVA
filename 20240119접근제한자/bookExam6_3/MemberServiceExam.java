package bookExam6_3;

public class MemberServiceExam {

	public static void main(String[] args) {
		// #1. 객체생성
		MemberService ms = new MemberService("kwj", "5975");

		// #2. 로그인 결과를 ture, false로 리턴해서 result에 저장 => 로그인 성공은 true, 로그인 실패는 false
		boolean result = ms.login("kwj", "5975");

		// #3. id와 password가 일치하면 로그인 성공, 불일치시 로그인 실패
		ms.loginOk(result);

		// #4. 입력하는 id객체 로그아웃
		ms.logout("kwj");

	}// end of main

}// end of class
