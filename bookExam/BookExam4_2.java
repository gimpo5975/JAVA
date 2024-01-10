package exam.bookExam;

public class BookExam4_2 {

	public static void main(String[] args) {

		// 1부터 100까지 3의배수 총합 : 숫자 % 3 == 0
		// 범위가 정해져있고 규칙적인 규칙이라면 for문을 이용하는것이 좋다

		// #1. 변수선언
		int sum = 0;// 정수형 변수 초기화 => sum에 0을 저장

		for (int i = 1; i <= 100; i++) {// i 1부터 100까지 증가
			if (i % 3 == 0) {// 3의 배수이면 조건문 실행
				sum += i;// 3의 배수의 총합
			}
			
		} // end of for
		System.out.println(sum);
	}// end of main

}// end of class
