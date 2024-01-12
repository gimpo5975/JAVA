package firstReport;

import java.util.Scanner;

public class Quiz18 {

	public static void main(String[] args) {
		/*
		 * 문18) 밑변과 높이를 입력 받아서 삼각형의 넓이를 구하는 프로그램을 작성하시오. 삼각형의 넓이는 (밑변 * 높이 / 2) 입니다.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.printf("밑변을 입력하세요 : ");
		int bottom = sc.nextInt();
		System.out.printf("높이를 입력하세요 : ");
		int height = sc.nextInt();

		System.out.println("넓이는 " + (bottom * height) / 2 + "입니다");
	}// end of main

}
