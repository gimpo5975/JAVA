package practice2024_02_14;

import java.text.DecimalFormat;

//3. 다음은 국어와 영어 점수이다. 두 과목의 합계와

//두 과목의 평균을 구하기
//score = { {75, 80}, {63, 96}, {73, 85}}
//
//<출력 형태>
//두 과목 합계 : ~~ 
//두 과목 평균 : ~~

public class KorEngSumAvgArray {
	static int[][] score = { { 75, 80 }, { 63, 96 }, { 73, 85 } };
	private static final int SUBJETS = score.length;

	// entry point
	public static void main(String[] args) {

		print();

	}// end of main

	public static int scoreSum(int[][] score) {
		int sum = 0;
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				sum += score[i][j];
			} // end of for in
		} // end of for
		return sum;
	}// end of scoreSum

	public static double scoreAvg(int sum) {
		return (double) sum / SUBJETS;
	}// end of scoreAvg

	public static void print() {
		DecimalFormat df = new DecimalFormat("#.##점");
		DecimalFormat f = new DecimalFormat("#점");

		int sum = scoreSum(score);
		double avg = scoreAvg(sum);

		System.out.println("두 과목 합계 : " + f.format(sum));
		System.out.println("두 과목 평균 : " + df.format(avg));

	}// end of print

}// end of class
