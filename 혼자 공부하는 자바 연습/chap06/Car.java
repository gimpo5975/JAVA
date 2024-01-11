package honggongja.sec06;

public class Car {

	// 필드
	int gas;// 정수형 변수 선언

	// 생성자

	// 메소드
	void setGas(int gas) {
		this.gas = gas;// 왼쪽 gas에 매개변수 gas 저장
	}// end of setGas

	boolean isLeftGas() {
		if (gas == 0) {
			System.out.println("gas가 없습니다");
			return false;
		} // end of if
		System.out.println("gas가 있습니다");
		return true;
	}// end of isLeftGas

	void run() {
		while (true) {
			if (gas > 0) {
				System.out.println("달립니다.(가스잔량 : " + gas + ")");
				gas -= 1;
			} else {
				System.out.println("멈춥니다.(가스잔량 : " + gas + ")");
				return;// 메소드 실행 종료
			} // end of if
		} // end of while
	}// end of run

}// end of class
