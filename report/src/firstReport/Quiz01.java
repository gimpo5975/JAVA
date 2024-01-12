package firstReport;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		/*
		 * 문1) 홍길동 중간고사 성적 출력
		 * <요구사항> 홍길동의 중간고사 성적을 출력하려고 합니다. 홍길동은 국어 80점, 영어 70점 , 수학 90점을 받았습니다. 중간고사
		 * 성적출력은 아래와 같습니다. 
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

		System.out.println("**" + name + "의 중간고사 성적 **");
		System.out.println("===============================================");
		System.out.printf("이름\t국어\t영어\t수학\t합계\t평균\n");
		System.out.println("===============================================");
		System.out.printf("%s\t%1d\t%2d\t%3d\t%4d\t%.2f\n", name, kor, eng, math, sum, avg);
		System.out.println("===============================================");
	}// end of main

}// end of class
