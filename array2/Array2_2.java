package array2;

public class Array2_2 {

	public static void main(String[] args) {
		/*
		 * 1. 다음은 홍길동반 학생들의 성적입니다. 총점과 평균을 구하는 프로그램을 작성하시오. 
		 * 성적(score) = {80,70,90,60,100} 
		 * 이름(studentName) = {"커리", "르브론", "요키치", "돈치치", "자모란트"} 
		 * 출력형태
		 * ====================== 
		 * 번호 이름 성적 
		 * ====================== 
		 * 1 르브론 70 
		 * .....
		 * ====================== 
		 * 인원수 : 5명 
		 * 전체 합계 : ?? 
		 * 전체 평균 : ??.??
		 */

		// #1. 변수선언
		String[] studentName = { "스픈커리", "르르브론", "요키치치", "루돈치치", "자모란트" };
		int[] score = { 100, 88, 95, 90, 50 };
		int count = 0; // 인원수 체크(배열 길이로 인원수를 사용해도 됨)
		int sum = 0;// 합계
		double avg = 0.0;// 평균

		// #2. 총점 구하기
		for (int i = 0; i < score.length; i++) {
			count++;// 인원수, count = count + 1; count += 1;
			sum += score[i];// 합계 누적
		} // end of for

		// #3. 평균 구하기
		avg = (double) sum / score.length;

		// #4. 출력
		System.out.println("================================");
		System.out.printf("번호\t이름\t\t성적\n");
		System.out.println("================================");
		for (int i = 0; i < score.length; i++) {
			System.out.printf("%d\t%s\t%d\n", (i + 1), studentName[i], score[i]);
		} // end of for
		System.out.println("================================");
		System.out.println("인원수 : " + count + "명");
		System.out.println("전체 합계 : " + sum);
		System.out.printf("전체 평균 : %.2f", avg);

	}// end of main

}// end of class
