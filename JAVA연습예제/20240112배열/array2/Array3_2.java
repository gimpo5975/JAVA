package array2;

import java.util.Scanner;

public class Array3_2 {

	public static void main(String[] args) {
		/*
		 * 정수를 하나 입력 받아 배열에서 같은 값이 몇 번째 요소인지 구하기, 없으면 없다고 출력하기 
		 * number = { 79, 88, 33, 100, 50, 90 };
		 */

		// #1. 변수선언
		int[] number = { 79, 88, 33, 100, 50, 90 };
		int num = 0, count = 0;

		// #2. 정수 하나 입력 받기
		Scanner sc = new Scanner(System.in);
		System.out.printf("정수를 입력해 주세요 >>");
		num = Integer.parseInt(sc.nextLine());

		// #3. 입력 받은 정수 존재여부 확인하고 출력하기
		for (int i = 0; i < number.length; i++) {
			count++;
			if (num == number[i]) {//입력한 값이 number배열의 i번째 요소와 같으면 출력
				System.out.printf("찾는 값 : %d\n배열의 요소 위치 : %d번째", num, count);
				break;
			} else if (count == (number.length)) {
				System.out.println("찾는 값이 없습니다");
			} // end of if
		} // end of for

	}// end of main

}// end of class
