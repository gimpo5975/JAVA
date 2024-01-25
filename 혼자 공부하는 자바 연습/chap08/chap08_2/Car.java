package chap08_2;

public class Car {

	// 인터페이스 타입 필드 선언과 초기 구현 객체 대입
	Tire frontLeftTire = new HankookTire();
	Tire frontRightTire = new HankookTire();
	Tire backLeftTire = new HankookTire();
	Tire backRightTire = new HankookTire();

	// 인터페이스에 설명된 run() 메소드 호출
	void run() {
		frontLeftTire.run();
		frontRightTire.run();
		backLeftTire.run();
		backRightTire.run();
	}// end of run()
}// end of class
