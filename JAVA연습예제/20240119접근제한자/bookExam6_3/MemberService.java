package bookExam6_3;

public class MemberService {
	// 메소드 - login(String id, String password) => boolean
	// logout(String id) => void
	// id = kwj이고 password가 5975일 경우 true 리턴, 그 외는 false 리턴
	// id ~~이고 password가 ~~이면 => &&연산 => 조건 && 조건 *항상 조건은 true 또는 false 결과가 담겨야한다
	// id ~~이거나 password가 ~~이면 => ||연산 => 조건 || 조건

	// #1. 필드(=인스턴스 변수, 멤버변수) - 객체가 생성될 때 메모리에 올라감, 객체 뱃속에 있음) => 힙에 존재함
	String id;
	String password;
	static boolean result = false;

	// #2. 생성자 - 객체를 초기화, 이름은 클래스 이름과 같다.
	public MemberService(String id, String password) {
		this.id = id;
		this.password = password;
	}// end of MemberService()

	// #3. 메소드 - 동작방식, 기능
	// 접근지정자 리턴타입 메소드명(매개변수=파라미터){실행문}
	
	//객체와 매개변수의 아이디와 비밀번호가 일치하면 true리턴, 일치하지 않으면 false 리턴
	public boolean login(String id, String password) {
		// 결과를 담을 변수 boolean의 기본값은 false

		// id와 password가 기존의 id와 password와 같은지 비교
		if (this.id.equals(id) && this.password.equals(password)) {
			result = true;
		} else {
			result = false;
		} // end of if
		return result;
	}// end of login()
	
	//아이디와 비밀번호가 일치하면 로그인 성공, 일치하지 않으면 로그인 실패
	public void loginOk(boolean result) {
		if (result == true) {
			System.out.println(id + "님 로그인 성공");
		} else {
			System.out.println("로그인 실패");
			System.out.println("아이디 또는 비밀번호를 확인하세요");
		} // end of if
	}// end of loginOk
	
	//로그인이 되어있지 않으면 로그아웃 진행 하지않음
	public void logout(String id) {
		// login()메소드의 리턴값이 true면 로그아웃 진행, false면 id + "님은 로그인 되어있지 않습니다" 출력.
		if (result == false) {
			System.out.println(id + "님 로그인이 되어있지 않습니다. 먼저 로그인을 해주십시오.");
			return;
		}//end of if 

		if(this.id.equals(id)){
			System.out.println(id + "님 로그아웃 되었습니다.");
		}else {
			System.out.println("로그아웃 실패");
			System.out.println("로그아웃 하시려는 아이디를 확인해주세요.");
		}// end of if

	}// end of logout()

}// end of class
