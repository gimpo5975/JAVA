package practice2024_02_13;

import java.text.DecimalFormat;
import java.util.Scanner;

//2. 3명의 학생 성적을 입력 받아 jumsu 배열에 저장한 후
//3명 학생의 총점과 평균을 구하시오.
//
//<출력 형태>
//1번 학생 점수 : ~~ 
//2번 학생 점수 : ~~
//3번 학생 점수 : ~~
//     ----------------
//3명 점수 총점 : ~
public class InputScoreArray {

	private static Scanner sc = new Scanner(System.in);
	private static final int STUDENT_NUM = 3;
	private static int[] scores = new int[STUDENT_NUM];

	// entry point
	public static void main(String[] args) {

		// 성적 입력받는 메소드 호출
		int[] studentsScores = inputScores();
		// 학생 성적 배열을 매개변수로 넘겨줘서 합계를 구하는 메소드
		int scoreSum = scoreSum(studentsScores);
		// 점수 합계를 넘겨줘서 총점을 출력하는 메소드
		scorePrint(scoreSum);

	}// end of main

	// 성적을 입력받는 메소드
	public static int[] inputScores() {
		for (int i = 0; i < STUDENT_NUM; i++) {
			System.out.println((i + 1) + "번 학생 점수를 입력 하세요.");
			System.out.print("점수 입력 >> ");
			scores[i] = sc.nextInt();
			System.out.println();
		} // end of for
		return scores;
	}// end of inputScores

	// 성적 합계를 구하는 메소드
	public static int scoreSum(int[] studentsScores) {
		int sum = 0;
		for (int i = 0; i < STUDENT_NUM; i++) {
			sum += studentsScores[i];
		} // end of for
		return sum;
	}// end of scoreSum

	// 성적을 출력하는 메소드
	public static void scorePrint(int scoreSum) {
		System.out.println();
		DecimalFormat df = new DecimalFormat("#점");
		System.out.println(STUDENT_NUM + "명 점수 총점 : " + df.format(scoreSum));
	}// end of scorePrint

}// end of class
