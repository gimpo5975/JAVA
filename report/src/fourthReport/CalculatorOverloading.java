package fourthReport;
//10. 다음을 입력 받아 계산하는 계산기 프로그램을 작성하시오.

//메소드명 add(int a, int b)
//        add(int x, int y, double z)
//        add(double x, double y)
//
// <출력화면>
// 10 + 25 = 35
// 5 + 7 + 3.7 = 15.7
// 4.5 + 8.3 = 12

public class CalculatorOverloading {

	// entry point
	public static void main(String[] args) {

		// 메소드명이 같으나, 서로 다른 매개타입과 매개 변수의 수가 다를 수 있는 이유는
		// 메소드 오버로딩 덕분이다
		// 메소드명이 같아도 매개변수의 개수, 타입이 다르면 허용된다.
		int sum1 = add(10, 25);
		double sum2 = add(5, 7, 15.7);
		double sum3 = add(4.5, 8.3);

		System.out.println(sum1);
		System.out.println(sum2);
		System.out.println(sum3);

	}// end of main

	private static int add(int num1, int num2) {
		return num1 + num2;
	}// end of add

	private static double add(int num1, int num2, double num3) {
		return num1 + num2 + num3;
	}// end of add

	private static double add(double num1, double num2) {
		return num1 + num2;
	}// end of add

}// end of class
