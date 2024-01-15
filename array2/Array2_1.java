package array2;

public class Array2_1 {

	public static void main(String[] args) {
		/*
		 * 1. 다음은 홍길동반 학생들의 성적입니다. 총점과 평균을 구하는 프로그램을 작성하시오. 
		 * 성적(score) = {100,88,100,90,50}
		 */

		// #1. 변수선언
		int[] score = { 100, 88, 100, 90, 50 };
		int sum = 0;
		double avg = 0.0;

		// #2. 총점 구하기
		for (int i = 0; i < score.length; i++) {
			sum += score[i];
		} // end of for

		// #3. 평균 구하기
		avg = (double) sum / score.length;

		// #4. 출력
		System.out.println("총점 : " + sum + "점 || 평균: " + avg + "점");

		//# 4-1. 향상된 for문을 이용한 출력
		for(int num : score) {
			System.out.println(num);
		}
		
	}// end of main

}// end of class
