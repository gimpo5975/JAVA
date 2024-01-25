package honggongja.sec07.exam03;

public class Computer extends Calculator {//부모 클래스 상속
	@Override//메소드 제정의
	double areaCircle(double r) {
		System.out.println("Calculator 객체의 areaCircle() 실행");
		return Math.PI * r * r;//정밀한 계산을 위해 3.14159 => Math.PI 상수로 바꿈
	}// end of areaCircle()

}// end of class
