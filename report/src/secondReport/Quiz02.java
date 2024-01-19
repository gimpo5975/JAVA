package secondReport;

//다음 자료의 최댓값과 최솟값을 구하는 프로그램을 작성하시오.
//점수(score) { 79, 88, 33, 100, 50, 90 }

public class Quiz02 {
	// 배열 초기화
	static int[] score = { 79, 88, 33, 100, 50, 90 };

	// 변수 초기화
	static int max = Integer.MIN_VALUE;
	static int min = Integer.MAX_VALUE;

	// entry point
	public static void main(String[] args) {
		maxMin();
		showPrint();
	}// end of main

	// 최댓값, 최솟값 구하는 메소드
	public static void maxMin() {
		for (int i = 0; i < score.length; i++) {
			// 최댓값 계산
			if (max < score[i]) {
				max = score[i];
				// 최솟값 계산
			} else if (min > score[i]) {
				min = score[i];
			} // end of if
		} // end of for
	}// end of maxMin()

	// 콘솔창 출력메소드
	public static void showPrint() {
		System.out.println("최댓값 : " + max + " 최솟값 : " + min);
	}// end of showPrint()

}// end of class
