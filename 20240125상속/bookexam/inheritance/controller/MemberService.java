package bookexam.inheritance.controller;

public class MemberService extends Service {

	// #1. 필드

	// #2. 생성자

	// #3. 메소드
	public void login() {
		System.out.println("멤버 로그인");
	}// end of login()

}// end of class

class Aservice extends MemberService {
	public void login() {
		System.out.println("A멤버 로그인");
	}// end of login()
}// end of class