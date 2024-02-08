package fourthReport;

import java.util.Scanner;

//1. 자료를 입력 받아 음수, 0, 양수를 판단하는 메소드를 작성하시오.
//메소드명 : signCheck(int num);
public class JudgeNumbers {

	private static Scanner sc = new Scanner(System.in);

	// entry point
	public static void main(String[] args) {
		showPrint();
	}// end of main

	// 숫자 입력안내와 결과 출력 메소드
	public static void showPrint() {
		System.out.println("판단하고 싶은 숫자를 입력해주세요!! 다~ 맞춰 드립니다");
		System.out.print("숫자 입력 >> ");
		int num = sc.nextInt();

		signCheck(num);
	}// end of showPrint

	// 매개변수로 숫자를 입력받아 양수,음수,0을 판단하는 메소드
	public static void signCheck(int num) {

		if (num > 0) {
			System.out.println(num + "은 양수지요~!");
		} else if (num == 0) {
			System.out.println(num + "이 군요~");
		} else {
			System.out.println(num + "은 음수에요!");
		} // end of if

	}// end of signCheck

}// end of class
