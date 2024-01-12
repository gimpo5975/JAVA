package firstReport;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Quiz13 {

	public static void main(String[] args) {
		/*
		 * 문1) 키보드로부터 이름, 국어, 영어, 수학점수를 입력받아 아래와 같이 출력하는 프로그램을 작성하시오
		 */
		
		DecimalFormat df = new DecimalFormat("##.##");
		Scanner sc = new Scanner(System.in);// Scanner 객체생성

		System.out.println("이름을 입력하세요");
		String name = sc.next(); // 이름 입력값 받기

		System.out.println("국어점수를 입력하세요");
		int kor = sc.nextInt(); // 국어점수 받기
		System.out.println("영어점수를 입력하세요");
		int eng = sc.nextInt();// 영어점수 받기
		System.out.println("수학점수를 입력하세요");
		int math = sc.nextInt();// 수학점수 받기

		int sum = kor + eng + math;// 총점
		double avg = (double)sum / 3;// 평균
		
		//출력
		System.out.printf("**%s의 성적**\n",name);
		System.out.println("이름 : " + name);
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + math);
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + df.format(avg));

	}// end of main

}// end of class
