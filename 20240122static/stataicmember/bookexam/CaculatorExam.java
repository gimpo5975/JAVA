package stataicmember.bookexam;

public class CaculatorExam {

	public static void main(String[] args) {
		int result1 = Calculator.plus(999, 999);
		int result2 = Calculator.minus(1001, 1);
		double result3 = 10 * 10 * Calculator.PI;

		System.out.println("두 수의 합 : " + result1);
		System.out.println("두 수의 차 : " + result2);
		System.out.println("원의 넓이 : " + result3);

	}// end of main

}// end of class
