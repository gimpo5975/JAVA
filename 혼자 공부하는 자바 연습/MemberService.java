package honggongja.sec06;

public class MemberService {

	// 필드
	String id;
	String password;

	boolean login(String id, String password) {
		if (id.equals("hong")&& password.equals("12345")) {
			return true;
		} // end of if
		return false;
	}// end of login

	void logout(String id) {
		if (id.equals("hong")) {
			System.out.println("로그아웃 되었습니다.");
		} // end of if
	}// end of logout

}// end of class
