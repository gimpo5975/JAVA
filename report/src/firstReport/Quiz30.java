package firstReport;

import java.util.Scanner;

public class Quiz30 {

	public static void main(String[] args) {
		/*
		 * 문30) 숫자를 입력 받아 2의 배수 또는 3의 배수이면 숫자에 1000을 더하고 그렇지 않으면 5000을 더하는 프로그램
		 */

		Scanner sc = new Scanner(System.in);// Scanner 객체 생성
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();
		
		if(num%2==0 || num%3==0) {
			num+=1000;
		}else {
			num+=5000;
		}
		
		System.out.println(num);
	}//end of main

}
