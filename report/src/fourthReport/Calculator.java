package fourthReport;

import java.util.Scanner;

//2. 계산기 프로그램을 작성하시오.
//합을 구하는 메소드명 : add(int a, int b)
//곱셈을 구하는 메소드명 : multiple(int a, int b)
public class Calculator {

	private static Scanner sc = new Scanner(System.in);

	// entry point
	public static void main(String[] args) {
		// 계산기 메소드 호출
		calc();
	}// end of main

	// 계산 할 수를 입력받아서 계산 값을 출력해주는 메소드
	public static void calc() {
		// 계산 하기를 원하는 두 숫자 입력
		System.out.println("덧셈, 곱셈을 해주는 계산기 입니다. 숫자를 연속으로 입력해 보세용");
		System.out.print("첫 번째 숫자 입력 >> ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 숫자 입력 >> ");
		int num2 = sc.nextInt();

		int numSum = add(num1, num2);// 덧셈 값을 반환 받아서 numSum에 저장
		int numMultiple = multiple(num1, num2);// 곱셈 값을 반환 받아서 numMultiple에 저장

		// 결과 출력
		System.out.println(num1 + "+" + num2 + " = " + numSum);
		System.out.println(num1 + "X" + num2 + " = " + numMultiple);
	}// end of calc

	// 두 매개 변수의 합을 반환하는 메소드
	public static int add(int num1, int num2) {
		return num1 + num2;
	}// end of add

	// 두 매개 변수의 곱을 반환하는 메소드
	public static int multiple(int num1, int num2) {
		return num1 * num2;
	}// end of add

}// end of class
