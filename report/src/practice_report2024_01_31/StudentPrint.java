package practice2024_01_31;

import java.util.Scanner;

//3.  학생의 이름과 점수를 연속하여 3번 입력받아 <출력형태>와 같이 출력하는 프로그램 작성

//(for문, while, do ~ while문 구현)
//       do{
//   실행문장
//}while(조건);
//
// <입력화면>
//    이름과 점수를 입력 하세요.     
//이름 >>
//점수 >>
//     
// <출력화면>
//1번째 입력 : 홍길동 : 90
//--------------------------
//
//2번째 입력 : 이자바 : 85
//--------------------------
//
//3번째 입력 : 한사랑 : 83
//--------------------------

public class StudentPrint {

	// entry point
	public static void main(String[] args) {
		// #1. 입력을 받기 위한 객체 생성
		Scanner sc = new Scanner(System.in);
		// #2. 학생수를 입력받아 배열의 크기 생성
		System.out.print("학생 수를 입력하세요 >>");
		int studentNum = Integer.parseInt(sc.nextLine());// 학생수 입력
		// #3. 배열 생성
		String[] name = new String[studentNum];
		int[] score = new int[studentNum];

		int num = 0;// do~while문 통제용 변수

		// #4.반복문 실행
		do {
			// #4. 입력 안내 및 입력

			System.out.println("이름과 점수를 입력하세요");
			System.out.print("이름 >> ");

			name[num] = sc.nextLine();// 이름 입력해서 배열에 저장
			System.out.print("점수 >> ");

			score[num] = Integer.parseInt(sc.nextLine());// 점수 입력해서 배열에 저장

			num++;// 몇 번째 입력인지 카운트

		} while (num < studentNum);// end of while

		// #5. 출력
		for (int i = 0; i < name.length; i++) {
			System.out.printf("%s번째 입력 : %s : %d\n", (i + 1), name[i], score[i]);
			System.out.println("----------------------------------------------");
		} // end of for

	}// end of main

}// end of class
