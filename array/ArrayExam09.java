	package array;

import java.util.Scanner;

public class ArrayExam09 {

	public static void main(String[] args) {
		// 3명의 학생이름과 성적을 입력 받아 출력하세요(1차원 배열 이용)
		Scanner sc = new Scanner(System.in);

		String[] names = new String[3];
		int[] scores = new int[3];

		// 입력받기
		for (int i = 0; i < names.length; i++) {
			System.out.print("이름 입력>> ");
			names[i] = sc.nextLine();

			System.out.print("점수를 입력>> ");
			scores[i] = Integer.parseInt(sc.nextLine());
		} // end of for

		// 총합 구하기
		int sum = 0;
		for (int i = 0; i < names.length; i++) {
			sum += scores[i];
		}
		;

		// 평균 구하기
		double avg = (double) sum / names.length;

		// 학생 일름과 성적 출력하기
		for (int i = 0; i < names.length; i++) {
			System.out.println("------------------------");
			System.out.println("학생 이름 : " + names[i]);
			System.out.println("학생 성적 : " + scores[i]);
			System.out.println("------------------------");
		} // end of for

		// 학생 총점과 평균 출력하기
		System.out.println("총점 : " + sum + " 평균 : " + avg);

	}// end of main

}// end of class
