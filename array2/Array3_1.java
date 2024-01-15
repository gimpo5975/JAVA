package array2;

public class Array3_1 {

	public static void main(String[] args) {
		/*
		 * 2. 다음 자료의 최댓값과 최솟값을 구하는 프로그램을 작성하시오. 점수(score01) { 79, 88, 33, 100, 50, 90 }
		 */

		// #1. 변수선언
		int[] score = { 79, 88, 33, 100, 50, 90 };
		int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;

		// #2. 최댓값 최솟값 구하기
		for (int i = 0; i < score.length; i++) {
			if (max < score[i]) {
				/*
				 * max 변수에 담긴 값이 벼열의 i번째 요소값보다 작으면 max 변수에 i번째 요소의 값을 저장
				 */
				max = score[i];
			} // end of if
			if (min > score[i]) {
				/*
				 * min 변수에 담긴 값이 배열의 i번째 보다 크면 작은 값이 배열의 i번째 이므로, min에 더 작은 값을 담아줌
				 */
				min = score[i];
			} // end of if

		} // end of for
			// #3. 출력
		System.out.println("최댓값 : " + max + " || 최솟값 : " + min);

	}// end of main

}// end of class
