package firstReport;

public class Quiz05 {

	public static void main(String[] args) {
		// 중앙 쇼핑몰 회원가입 화면을 아래와 같이 작성 하시오.

		// 문자열 참조변수 선언
		String id, password, name, phoneNumber, email;

		// 문자열 참조변수 초기화
		id = "choong01";
		password = "choong01";
		name = "홍길동";
		phoneNumber = "010-1234-1234";
		email = "choong@c.com";

		// 출력
		System.out.println("*회원가입*");
		System.out.println("아 이 디: " + id);
		System.out.println("비밀 번호: " + password);
		System.out.println("회 원 명: " + name);
		System.out.println("전화 번호: " + phoneNumber);
		System.out.println("이 메 일: " + email);
	}// end of main

}// end of class
