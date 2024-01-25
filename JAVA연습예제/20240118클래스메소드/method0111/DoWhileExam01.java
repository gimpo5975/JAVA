package method;

import java.util.Scanner;

public class DoWhileExam01 {
	// 난수를 생성해서 컴퓨터가 생각하는 숫자 맞추기
	public static void main(String[] args) {

		// 1. 화면으로 부터 사용자입력을 받기 위해서 Scanner클래스를 사용
		Scanner sc = new Scanner(System.in);// Scanner객체 생성

		// 2. 변수 선언
		int answer = 0;
		int input = 0; // 사용자 입력을 저장할 공간
		int count = 0; // 시도횟수를 세기 위한 변수

		// 3. 컴퓨터가 생각하는 값 만들기(1~100)
		answer = (int) (Math.random() * 100 + 1);
		// 컴퓨터가 가지고 있는 값 확인 => 프로그램 확인 끝나면 주석 처리
		// System.out.println("answer : " + answer);

		do {
			count++;// 시도 횟수 증가, 누적
			// 4. 사용자로부터 입력 값 받기
			System.out.print("1과 100사이의 값을 입력하세요>> \n");
			input = sc.nextInt();// 사용자의 입력값

			// 5. 컴퓨터가 생각하는 값과 사용자의 입력 값을 비교하기
			if (input == answer) {// 컴퓨터가 생각하는 값과 사용자 입력 값이 같은 경우
				System.out.printf("짜짜짠!!정답입니다!!!\n%d번 만에 성공하셨군요!!\n", count);
				break;// 반복문 종료
			} else if (input > answer) {// 사용자 입력 값이 컴퓨터가 생각하는 값 보다 큰경우
				System.out.println("숫자를 조금 더 낮춰보세요!");
			} else if (input < answer) {// 사용자 입력 값이 컴퓨터가 생각하는 값 보다 낮은 경우
				System.out.println("숫자를 조금 더 높혀보세요!!");
			} // end of if

		} while (true);// end of while

	}// end of main

}// end of class
