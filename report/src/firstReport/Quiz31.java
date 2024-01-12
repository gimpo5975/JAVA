package firstReport;

import java.util.Scanner;

public class Quiz31 {

public static void main(String[] args) {
	/*
	 * 문3) 번호를 입력 받아 '홀수'이면 'A class' 짝수이면 'B Class'를 배정하시오.
	 */	
	
		Scanner sc = new Scanner(System.in);

		String value = "";
		System.out.print("숫자를 입력하세요 >> ");
		int num = sc.nextInt();

		if (num % 2 == 0) {
			value = "B Class";
		} else {
			value  = "A Class";
		} // end of if

		System.out.println("당신은 " + value + "입니다.");
	}// end of main

}
