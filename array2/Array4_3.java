package array2;

public class Array4_3 {

	public static void main(String[] args) {
		// 0~9까지의 숫자를 임으로 출력하는 프로그램 작성(shuffle)하시오.

		// #1. 정수형 변수 초기화
		int[] score = new int[10];

		// #2. 배열의 값에 0~9까지의 무자위 수 저장후 출력
		for (int i = 0; i < score.length; i++) {
			int num = (int) (Math.random() * 10);// 0~10사이의 난수 생성
			score[i] = num;// i번째 배열의 요소에 난수 저장
			System.out.println(i + "번째 : " + score[i]);
		} // end of for
	}// end of main

}// end of class
