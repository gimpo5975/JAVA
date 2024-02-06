package practice2024_02_06;

import java.util.Scanner;

//1. 자료를 입력 받아 음수, 0, 양수를 판단하는 메소드를 작성하시오.
//메소드명 : signCheck(int num);
public class NumberCheck {
	private static Scanner sc = new Scanner(System.in);

	// entry point
	public static void main(String[] args) {

		// 입력을 받기위한 안내문구
		System.out.println("숫자를 입력하세요~ 양수~0~음수 아무거나 다~판단해드립니다!");
		System.out.print("숫자 입력 >> ");
		// 변수 선언해서 입력한 값 받기
		int num = sc.nextInt();

		// 숫자판별 메소드 호출, 입력받은 값 메소드의 매개변수로 넘겨줌
		signCheck(num);

	}// end of main

	// 입력받은 숫자가 양수,음수,0인지 판단하는 메소드, 넘겨받은 매개변수로 판단
	public static void signCheck(int num) {
		if (num > 0) {
			System.out.println(num + "은 양수입니다!");
		} else if (num < 0) {
			System.out.println(num + "은 음수입니다!");
		} else {
			System.out.println(num + "은 0입니다!");
		} // end of if
	}// end of signCheck

}// end of class
