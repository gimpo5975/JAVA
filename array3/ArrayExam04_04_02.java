package array3;

import java.util.Scanner;

public class ArrayExam04_04_02 {

	// Scanner 객체 생성
	static Scanner sc = new Scanner(System.in);

	// 정적변수 초기화
	static int students = 0;
	static boolean run = true;
	static int num = 0;
	static int[] scores = null;

	// entry point
	public static void main(String[] args) {
		while (run) {
			showPrint();

			switch (num) {
			case 1:
				inputStudents();
				break;
			case 2:
				scores = new int[students];
				inputScore(scores);
				break;
			case 3:
				scoreList(scores);
				break;
			case 4:
				scorePrint(scores);
				break;
			case 5:
				end();
			}// end of switch
		} // end of while
	}// end of main

	// 안내문구와 번호선택 메소드
	public static void showPrint() {
		System.out.println("****************************************************************");
		System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
		System.out.println("****************************************************************");
		System.out.println("번호선택 >>");
		num = Integer.parseInt(sc.nextLine());
	}// end of showPrint

	// 학생수를 입력하는 메소드
	public static void inputStudents() {
		System.out.println("학생 수 입력 >>");
		students = Integer.parseInt(sc.nextLine());
	}// end of inputStudents()

	// 학생 점수입력 메소드
	public static void inputScore(int[] scores) {
		for (int i = 0; i < scores.length; i++) {
			System.out.println((i + 1) + "번째 학생 점수 입력 >>");
			scores[i] = Integer.parseInt(sc.nextLine());
		} // end of for
	}// end of inputScore()

	// 학생 점수출력 메소드
	public static void scoreList(int[] scores) {
		for (int i = 0; i < scores.length; i++) {
			System.out.println((i + 1) + "번 학생 점수 = " + scores[i]);
		} // end of for
	}// end of scoreList()

	// 학생 점수분석 메소드
	public static void scorePrint(int[] scores) {
		int sum = 0, max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
		double avg = 0.0;
		for (int i = 0; i < scores.length; i++) {
			if (max < scores[i]) {
				max = scores[i];
			} // end of if
			if (min > scores[i]) {
				min = scores[i];
			} // end of if
			sum += scores[i];
		} // end of for
		avg = (double) sum / scores.length;
		System.out.printf("최고점수 : %d\n최저 점수 : %d\n평균 : %.2f\n", max, min, avg);
	}// end of scorePrint()

	// 프로그램 종료 메소드
	public static void end() {
		System.out.printf("종료 선택하셨습니다\n종료합니다.");
		run = false;
	}// end of end()
}// end of class
