package stataicmember.bookexam;

public class Calculator {
	// final - 여기 외에는 다른 곳에서 수정할 수 없음
	// static - 공통
	final static double PI = 3.141592;// 상수
	static int jumsu1 = 7;
	int instanceValue = 3;

	static int plus(int x, int y) {
		return x + y;
	}// end of plus()

	static int minus(int x, int y) {
		return x - y;
	}// end of minus()

	void showInfo(int num1, int num2) {
		int result = plus(num1, num2) + jumsu1;
		System.out.println("결과 : " + result);
		System.out.println();
	}// end of showInfo()


}// end of class
