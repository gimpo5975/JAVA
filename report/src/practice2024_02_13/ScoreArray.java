package practice2024_02_13;

import java.text.DecimalFormat;

//	1. 다음 성적을 이용하여 합계와 평균을 구하시오.

//	   Score = {75,83,96,58,63}
//
//	   <출력 형태>
//	   성적 총합 : ~~
//	   성적 평균 : ~~

public class ScoreArray {
	static final int SUBJECTS = 5;

	// entry point
	public static void main(String[] args) {

		// 학생 성적
		int[] score = { 75, 83, 96, 58, 63 };

		// 성적 합계 메소드, 매개변수로 학생 성적 배열을 넘겨줌
		int scoreSum = scoreSum(score);
		// 성적 평균 메소드, 매개변수로 성적 합계를 넘겨줌
		double scoreAvg = scoreAvg(scoreSum);

		// 합계와 평균을 출력하는 메소드
		showInfo(scoreSum, scoreAvg);

	}// end of main

	// 성적 합계 메소드
	public static int scoreSum(int[] score) {
		int sum = 0;
		for (int i = 0; i < score.length; i++) {
			sum += score[i];
		} // end of for
		return sum;
	}// end of scoreSum

	// 성적 평균 메소드
	public static double scoreAvg(int scoreSum) {
		return scoreSum / SUBJECTS;
	}// end of scoreAvg

	// 출력 메소드
	public static void showInfo(int scoreSum, double scoreAvg) {
		DecimalFormat df = new DecimalFormat("###점");
		DecimalFormat f = new DecimalFormat("#.##점");

		System.out.println("성적 총합 : " + df.format(scoreSum));
		System.out.println("성적 평균 : " + f.format(scoreAvg));
	}// end of showInfo

}// end of class
