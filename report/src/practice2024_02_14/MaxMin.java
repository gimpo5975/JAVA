package practice2024_02_14;

//4. 다음 자료의 최댓값과 최솟값을 구하는 프로그램을 작성
//score ={ 35, 25, 88, 33, 100, 50, 15 }
public class MaxMin {
	// 배열 선언
	static int[] score = { 35, 25, 88, 33, 100, 50, 15 };

	public static void main(String[] args) {
		// 결과 메소드 호출
		resultScore();

	}// end of main

	// 배열을 넘겨받아 최댓값을 구하는 메소드
	public static int MaxScore(int[] score) {

		int max = Integer.MIN_VALUE;
		for (int i = 0; i < score.length; i++) {
			if (max < score[i]) {
				max = score[i];
			} // end of if
		} // end of for
		return max;
	}// end of MaxScore
		// 배열을 넘겨받아 최솟값을 구하는 메소드

	public static int MinScore(int[] score) {

		int min = Integer.MAX_VALUE;
		for (int i = 0; i < score.length; i++) {
			if (min > score[i]) {
				min = score[i];
			} // end of if
		} // end of for
		return min;
	}// end of MaxScore

	// 최댓값, 최솟값 메소드를 호출해 리턴값을 변수에 담아 출력
	public static void resultScore() {
		int max = MaxScore(score);
		int min = MinScore(score);
		System.out.println("최댓값 : " + max);
		System.out.println("최솟값 : " + min);
	}// end of resultScore

}// end of class
