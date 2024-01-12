package firstReport;

import java.util.Scanner;

public class Quiz14 {

	public static void main(String[] args) {
		// 문14) 숫자를 입력받아서 짝수와 홀수를 판별하는 프로그램을 작성하세요.

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();
		String number = "";
		if (num % 2 == 0) {
			number = "짝수";
		} else {
			number = "홀수";
		}
		System.out.println("당신이 입력한 숫자는 " + num + "이고, " + number + "입니다");
	}// end of main

}// end of class
