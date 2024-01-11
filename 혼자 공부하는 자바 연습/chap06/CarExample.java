package honggongja.sec06;

public class CarExample {

	public static void main(String[] args) {

		Car myCar = new Car();// Car클래스 객체 생성

		myCar.setGas(10);// Car의 setGas()메소드 호출

		boolean gasState = myCar.isLeftGas();// Car의 isLeftGas()메소드 호출
		if (gasState) {
			System.out.println("출발합니다");
			myCar.run();
		} // end of if

		if (myCar.isLeftGas()) {
			System.out.println("gas를 주입할 필요가 없습니다");
		} else {
			System.out.println("gas를 주입하세요");
		} // end of if

	}// end of main

}// end of class
