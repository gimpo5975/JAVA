package fourthReport;

import java.util.Scanner;

//4. 점수를 입력받아 합계와 평균를 구하는 프로그램을 작성
//showPrint() :  
//			이름 : 홍길동
//		국어 : 70
//		영어 : 85
//		합계 : 155
//		평균 : 77.5
//calculator(int kor, int eng) : 넘겨받은 국어점수와
//	영어 점수를 이용하여 합계와 평균을 구하기
public class SumAvg {

	private static Scanner sc = new Scanner(System.in);
	private static final int SUBJECTS = 2;

	public static void main(String[] args) {
		// 학생 정보를 입력받고 출력해주는 메소드 호출
		showPrint();
	}// end of main

	// 정보를 입력 받아서 출력하는 메소드
	public static void showPrint() {
		System.out.println("학생 이름과 성적을 입력하세요");
		System.out.print("이름 입력 >> ");
		String name = sc.nextLine();
		System.out.print("국어점수 입력 >> ");
		int kor = Integer.parseInt(sc.nextLine());
		System.out.print("영어점수 입력 >> ");
		int eng = Integer.parseInt(sc.nextLine());

		int scoreSum = sumCalculator(kor, eng);
		double scoreAvg = avgCalculator(scoreSum, SUBJECTS);

		System.out.println("\n***정보 출력***");
		System.out.println("이름 : " + name);
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("총합 : " + scoreSum);
		System.out.printf("평균 : %.2f", scoreAvg);
	}// end of showPrint

	// 국어와 영어 점수의 합을 구하는 메소드
	public static int sumCalculator(int kor, int eng) {
		return kor + eng;
	}// end of sumCalculator

	// 평균을 구하는 메소드
	public static double avgCalculator(int sum, int SUBJECTS) {
		return (double) sum / SUBJECTS;
	}// end of avgCalculator

}// end of class
