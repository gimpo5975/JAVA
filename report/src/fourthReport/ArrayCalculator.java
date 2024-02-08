package fourthReport;

import java.text.DecimalFormat;

//8. 다음에 제시된 배열의 합과 평균을 구하는 프로그램을 작성
//배열 score = {55, 96, 78, 83}
//메소드 : private void calcArray(int[] score)
//         showInfo(int[] score)
//
//<출력화면>
// 성적 합계 : ~~
// 성적 평균 : ~~ 
public class ArrayCalculator {
	private static final int[] SCORE = { 52, 96, 88, 87 };

	// entry point
	public static void main(String[] args) {
		// 출력 메소드 호출
		showCalcArray();
	}// end of main

	// 출력 메소드
	public static void showCalcArray() {
		// 배열 합계를 scoreSum에 담기
		int scoreSum = sumArray(SCORE);
		// 배열 평균을 scoreAvg에 담기
		double scoreAvg = avgArray(scoreSum);

		// 예쁜 출력
		DecimalFormat df = new DecimalFormat("##.##점");

		// 출력
		System.out.println("성적 합계 : " + df.format(scoreSum));
		System.out.println("성적 평균 : " + df.format(scoreAvg));
	}// end of showCakcArray

	// 배열의 총합을 구하는 메소드
	public static int sumArray(int[] score) {
		int sum = 0;
		for (int i = 0; i < score.length; i++) {
			sum += score[i];
		} // end of for
		return sum;
	}// end of sumArray

	// 배열의 평균을 구하는 메소드
	public static double avgArray(int sum) {
		double avg = 0;
		avg = (double) sum / SCORE.length;
		return avg;
	}// end of avgArray

}// end of class
