package array;

import java.util.Scanner;

public class ArrayExam05 {

	public static void main(String[] args) {
		// 학생수를 입력 받아 학생수 만큼의 공간을 입력한 후 확보한 공간에 +1을 입력해서 번호를 만들어 출력하기(배열이용)

		Scanner sc = new Scanner(System.in);// Scanner 객체 생성
		System.out.print("학생수를 입력 하세요: ");
		int students = sc.nextInt();// 학생 수 입력 받기
		int[] num = new int[students];// 입력받은 학생수 만큼 배열생성

		for (int i = 0; i < num.length; i++) {// 배열에 +1을 해서 값을 담기
			num[i] = i + 1;
		} // end of for

		for (int i = 0; i < num.length; i++) {// 배열 출력
			System.out.println("num[" + i + "]: " + num[i]);
		} // end of for

	}// end of main

}// end of class
