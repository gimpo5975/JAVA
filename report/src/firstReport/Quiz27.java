package firstReport;

import java.util.Scanner;

public class Quiz27 {

	public static void main(String[] args) {
		/*
		 * 문27) 이름, 국어, 영어, 수학 점수를 입력받아서 합계와 평균을 구하고, 평균이 80점 이상이면 "합격" 그렇지 않으면 "불합격"으로
		 * 처리하시오.
		 */

		Scanner sc = new Scanner(System.in);// Scanner 객체 생성

		String name = ""; // 문자열 참조변수 초기화
		int kor = 0, eng = 0, math = 0, sum = 0; // 정수형 변수 초기화
		double avg = 0.0; // 실수형 변수 초기화

		System.out.print("이름을 입력하세요 : ");// 안내 문구
		name = sc.next();// 이름 입력받기

		System.out.print("국어 점수를 입력하세요 : ");// 안내 문구
		kor = sc.nextInt();// 국어점수 입력받기

		System.out.print("영어 점수를 입력하세요 : ");// 안내 문구
		eng = sc.nextInt();// 영어점수 입력받기

		System.out.print("수학 점수를 입력하세요 : ");// 안내 문구
		math = sc.nextInt();// 수학점수 입력받기

		sum = kor + eng + math; // 총점 저장
		avg = sum / 3.0;// 평균 저장

		String result = "";
		if (avg >= 80) {
			result = "합격";
		} else {
			result = "불합격";
		}//end of if

		System.out.println("===================================================");
		System.out.printf("이름\t엑셀\t자바\t파이썬\t합계\t평균\t판정\n");
		System.out.println("===================================================");
		System.out.printf("%s\t%1d\t%2d\t%3d\t%4d\t%.2f\t%s\n", name, kor, eng, math, sum, avg, result);
		System.out.println("===================================================");

	}// end of main

}
