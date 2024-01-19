package secondReport;

import java.util.Scanner;
//정수를 하나 입력 받아 배열에서 같은 값이 몇 번째 요소인지 구하기, 없으면 없다고 출력하기
//number = { 79, 88, 33, 100, 50, 90 };
//
//출력형태)
// 1) 찾는 값 있을 때
// 	찾는 값 : ~~
// 	배열의 요소 위치 : ~~
// 2) 찾는 값 없을 때
//	찾은 값이 없습니다.
public class Quiz02_02 {
	// Scanner 객체 생성
	static Scanner sc = new Scanner(System.in);

	// 배열 초기화
	static int[] number = { 79, 88, 33, 100, 50, 90 };

	// 변수 초기화
	// 입력받은 숫자를 담는 변수
	static int inputNum = 0;
	// 찾은 값의 위치를 담는 변수
	static int location = 0;

	public static void main(String[] args) {
		matchnumPrint();

	}// end of main

	public static void matchnumPrint() {
		System.out.printf("찾을 숫자를 입력하세요 >> ");
		// 찾을 숫자 입력
		inputNum = sc.nextInt();

		for (int i = 0; i < number.length; i++) {
			// 찾은 배열 요소의 위치
			location++;

			// 찾았을 때 출력
			if (inputNum == number[i]) {
				System.out.printf("찾는 값 : %d \n배열 요소의 위치 : %d", number[i], location);
				return;

				// 찾는 값이 없을 때 출력
			} else if (location == number.length) {
				System.out.println("찾는 값이 없습니다.");
			} // end of if

		} // end of for

	}// end of matchnumPrint()

}// end of class
