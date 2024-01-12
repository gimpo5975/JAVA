package array;

import java.util.Scanner;

public class ArrayExam10 {

	public static void main(String[] args) {
		/*
		 * 윤년 구하기 윤년은 해당 연도를 4로 나눈 값이 0인 것을 의미한다. 그중 100으로 나눈 값이 0인 것은 윤년에서 제외하나, 400으로
		 * 나눈 값이 0인 것은 윤년으로 포함된다. 그 외의 나머지 연도는 평년이다. 400으로 나눈 값이 0이거나 또는 100으로 나눈 값이 0이
		 * 아니고 4로 나눈 값은 0
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("올해가 몇년인가요??");
		int year = sc.nextInt();

		if (year % 400 == 0 || year % 100 != 0 && year % 4 == 0) {
			System.out.println("윤년");
		} else {
			System.out.println("평년");
		}

	}// end of main

}// end of class
