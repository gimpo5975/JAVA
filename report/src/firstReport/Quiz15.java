package firstReport;

import java.util.Scanner;

public class Quiz15 {

	public static void main(String[] args) {
		/*
		 * 문15) 점수을 입력받아서 평가를 출력하는 프로그램을 작성 점수가 70점이상이면 "통과", 그렇지 않음 "재수강"으로 처리
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하세요");
		int score = sc.nextInt();
		String result = "";
		
		if(score>=70) {
			result="통과";
		}else {
			result="재수강";
		}//end of if
		
		System.out.println(result);
		
	}// end of main

}// end of class
