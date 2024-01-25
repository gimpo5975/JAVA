package honggongja.sec07.exam04;

public class Car {

	// 4개의 타이어
	// frontLeftTire : 최대 회전수가 6이라면, 6이 되면 펑크
	// run() : 4개의 타이어를 한 번씩 회전시킴
	// roll() : 각각의 Tire객체에서 호출 해서 리턴 값이 false이면 펑크 stop()메소드 호출 해당위치의 타이어번호 리턴

	// #1. 필드
	Tire frontLeftTire = new Tire("앞왼쪽", 6);// 위치와 최대회전수
	Tire frontRightTire = new Tire("앞오른쪽", 2);// 위치와 최대회전수
	Tire backLeftTire = new Tire("뒤왼쪽", 3);// 위치와 최대회전수
	Tire backRightTire = new Tire("뒤오른쪽", 4);// 위치와 최대회전수

	// #2. 생성자 => 따로 작성하지 않으므로 컴파일시 기본생성자 생성 됨

	// #3. 메소드
	// 앞왼쪽(1), 앞오른쪽(2), 뒤왼쪽(3), 뒤오른쪽(4)
	// default 리턴타입 메소드명
	int run() {// 4개의 타이어를 한 번씩 회전시킴
		System.out.println("★자동차가 달립니다★");
		if (frontLeftTire.roll() == false) {
			stop();// stop 메소드 호출, 펑크여서
			return 1;// 해당위치의 타이어 번호
		}
		if (frontRightTire.roll() == false) {
			stop();// stop 메소드 호출, 펑크여서
			return 2;// 해당위치의 타이어 번호
		}
		if (backLeftTire.roll() == false) {
			stop();// stop 메소드 호출, 펑크여서
			return 3;// 해당위치의 타이어 번호
		}
		if (backRightTire.roll() == false) {
			stop();// stop 메소드 호출, 펑크여서
			return 4;// 해당위치의 타이어 번호
		}
		return 0;// 위의 조건이 모두 만족하지 않을 때 리턴값.
	}// end of run()

	void stop() {// 접근제한자 => default. 생략하면 default - 같은 패키지내에서만 사용 가능
		// 펑크나면 멈추는 동작을 실행
		System.err.println("★자동차가 멈춥니다★");

	}// end of stop()

}// end of class
