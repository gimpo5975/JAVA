package practice2024_02_06;

import java.util.Scanner;

//4. 점수를 입력받아 합계와 평균를 구하는 프로그램을 작성
//showPrint() :  
//       이름 : 홍길동
//      국어 : 70
//      영어 : 85
//      합계 : 155
//      평균 : 77.5
//calculator(int kor, int eng) : 넘겨받은 국어점수와
//   영어 점수를 이용하여 합계와 평균을 구하기
public class CaculatePrint {

	private static Scanner sc = new Scanner(System.in);
	private static String name; // 이름
	private static int kor;// 국어점수
	private static int eng;// 영어점수
	private static int scoreSum;// 점수 총합
	private static double scoreAvg;// 점수 평균
	private static final int SUBJECT_NUM = 2;// 평균을 구하기 위한 과목수 선언

	// entry point
	public static void main(String[] args) {

		// 정보를 입력 받기 위한 안내문구
		System.out.println("시험 성적을 출력합니다. 정보를 입력하세요.");
		System.out.print("이름 >> ");
		name = sc.nextLine();// 이름 입력 받아서 name에 저장
		System.out.print("국어점수 >> ");
		kor = Integer.parseInt(sc.nextLine());// 국어점수 입력 받아서 kor에 저장
		System.out.print("영어점수 >> ");
		eng = Integer.parseInt(sc.nextLine());// 영어점수 입력 받아서 eng에 저장

		calculator(kor, eng);// 국어점수와 영어점수 매개변수로 넘겨줘서 총합과 평균 구하기
		showPrint();// 모든 정보 출력

	}// end of main

	// 모든 정보 출력
	public static void showPrint() {
		System.out.println("이름 : " + name);
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("총합 : " + scoreSum);
		System.out.println("평균 : " + scoreAvg);
	}// end of showPrint

	// 국어 점수와 영어 점수를 매개값으로 받아 총합과 평균 구하는 메소드
	public static void calculator(int kor, int eng) {
		scoreSum = kor + eng;
		scoreAvg = (double) scoreSum / SUBJECT_NUM;

	}// end of calculator

}// end of class
