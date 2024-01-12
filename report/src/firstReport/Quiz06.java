package firstReport;

public class Quiz06 {

	public static void main(String[] args) {
		/*
		 * 문6) 다음과 같이 출력하는 프로그램을 작성하시오. firstNum = 5; secondNum = 7; <출력형태> 변경전 firstNum
		 * = 5 변경전 firstNum = 7 변경후 secondNum = 7; 변경후 secondNum = 5;
		 */

		// 정수형 변수 초기화
		int firstNum = 5;
		int secondNum = 7;
		int temp = 0;

		temp = firstNum;
		firstNum = secondNum;
		secondNum = temp;

		System.out.println(firstNum + "," + secondNum);

	}// end of main

}// end of class
