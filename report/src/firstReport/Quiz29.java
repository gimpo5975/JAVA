package firstReport;

import java.util.Scanner;

public class Quiz29 {

	public static void main(String[] args) {
		/*
		 * 문29)회원 등급은 회원의 포인트가 20이상이면 "VIP", 20미만 10이상이면 "GOLD" 10미만이면 "일반회원"으로 처리
		 */

		Scanner sc = new Scanner(System.in);// Scanner 객체 생성
		
		System.out.println("포인트를 입력하세요");
		int point = sc.nextInt();
		String grade = "";
		
		if(point>=20) {
			grade="VIP";
		}else if(point>=10) {
			grade="GOLD";
		}else {
			grade="일반회원";
		}//end of if
		
		System.out.println("당신은 " + grade + "입니다");
	}//end of main

}//end of class
