package firstReport;

import java.util.Scanner;

public class Quiz09 {

	public static void main(String[] args) {
		/*
		 * 문9) 숫자가 홀수 이면 "A팀", 짝수이면 "B팀"이 되도록 팀을 정하시오.Scanner로 입력받아서
		 * 
		 * 짝수 : 숫자 % 2 == 0 홀수 : 숫자 % 2 == 1
		 * 
		 * 조건 : 숫자가 홀수 인지 짝수인지 구분 구하려는 값 : A팀, B팀
		 */

		Scanner sc = new Scanner(System.in);

		String team = "";
		System.out.print("숫자를 입력하세요 >> ");
		int num = sc.nextInt();

		if (num % 2 == 0) {
			team = "B팀";
		} else {
			team = "A팀";
		} // end of if

		System.out.println("당신은 " + team + "입니다.");
	}// end of main

}// end of class
