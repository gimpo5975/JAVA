package practice2024_02_06;

import java.util.Scanner;

//2. 계산기 프로그램을 작성하시오.
//합을 구하는 메소드명 : add(int a, int b)
//곱셈을 구하는 메소드명 : multiple(int a, int b)
public class Calculator {

	private static Scanner sc = new Scanner(System.in);

	// entry point
	public static void main(String[] args) {
		System.out.println("두 수의 덧셈과 곱셈을 한번에 계산해 드립니다!! 입력해 보세용");
		System.out.print("첫 번째 숫자입력 >> ");
		int a = sc.nextInt();// 첫 번째 숫자 입력 받아서 정수형 변수 a에 저장
		System.out.print("첫 번째 숫자입력 >> ");
		int b = sc.nextInt();// 두 번째 숫자 입력 받아서 정수형 변수 b에 저장

		int sum = add(a, b);// 덧셈 메소드의 값을 리턴 받아서 변수 sum에 저장
		int multiple = multiple(a, b);// 곱셈 메소드의 값을 리턴 받아서 변수 multiple에 저장

		// 값 출력
		System.out.println("두 수의 합 : " + sum);
		System.out.println("두 수의 곱 : " + multiple);

	}// end of main

	// 매개변수 a, b를 넘겨받아서 덧셈 연산 후에 그 값을 변수에 담아서 리턴
	public static int add(int a, int b) {
		int sum = a + b;
		return sum;
	}// end of add

	// 매개변수 a, b를 넘겨받아서 곱셈 연산 후에 그 값을 변수에 담아서 리턴
	public static int multiple(int a, int b) {
		int multiple = a * b;
		return multiple;
	}// end of multiple

}// end of class
