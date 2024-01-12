package firstReport;

import java.util.Scanner;

public class Quiz25 {

public static void main(String[] args) {
		
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

}