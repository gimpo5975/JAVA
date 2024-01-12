package firstReport;

import java.util.Scanner;

public class Quiz33 {

	public static void main(String[] args) {
		/*
		 * 문5) 주민등록번호를 입력 받아, 주민번호의 8번째자리가 1 또는 3 이면 성별은 "남", 2 또는 4이면 성별은 '여'로 처리 입력예시)
		 * 990108-1****** jumin.charAt(인덱스)
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("주민번호를 입력해줘주세요");
		String ssn = sc.nextLine();

		char num = ssn.charAt(7);
		String gender = "";
		if (num == '1' || num == '3') {
			gender = "남";
		} else if (num == '2' || num == '4') {
			gender = "여";
		} else {
			System.out.println("당신은 외계인?!");
		}

		System.out.println("당신은 " + gender + " 입니다");
	}// end of main

}
