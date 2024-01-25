package method;

public class CharExam {

	public static void main(String[] args) {
		// 문자를 이용해서 비밀번호를 암호화 시키고 다시 복호화 시키는 문제

		String name = "김원중";
		String password = "rladnjswnd";
		String encryptedPassword = "";
		String decryptedPassword = "";
		final int KEY_VALUE = 7;// 상수 선언한 곳에서만 값을 변경가능. 다른 부분의 코드에서는 변경 불가

		// #1. 암호화
		// 문자열 길이: 문자열.length()
		// 문자 하나를 읽어서 *5를 한 코드로 변환 : (char)(password.charAt(i)*7)
		// 즉 charAt으로 char형 문자 하나로 뽑아서 산술연산을 하게되면 int형으로 바뀌므로
		// (char)형으로 강제타입변환을 해주어 다시 char형 문자로 변환시킨후
		// 문자열과 합쳐서 문자하나를 만들게 되는것이다.
		for (int i = 0; i < password.length(); i++) {
			encryptedPassword += (char) (password.charAt(i) * KEY_VALUE);
		} // end of for
		System.out.println(password);
		System.out.println(encryptedPassword);
		
		for (int i = 0; i < encryptedPassword.length(); i++) {
			decryptedPassword += (char) (encryptedPassword.charAt(i) / KEY_VALUE);
		} // end of for
		System.out.println(decryptedPassword);
	}// end of main

}// end of class
