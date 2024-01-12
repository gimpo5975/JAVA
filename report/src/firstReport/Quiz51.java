package firstReport;

import java.util.Scanner;

public class Quiz51 {

	public static void main(String[] args) {
		// 문51) 숫자 맞추기 게임을 작성하시오.

		Scanner sc = new Scanner(System.in);

		int com = (int) (Math.random() * 100) + 1;
		int count=0;

		do {
			count++;// 시도 횟수 증가, 누적
			// 4. 사용자로부터 입력 값 받기
			System.out.print("1과 100사이의 값을 입력하세요>> \n");
			int num = sc.nextInt();// 사용자의 입력값

			// 5. 컴퓨터가 생각하는 값과 사용자의 입력 값을 비교하기
			if (num == com) {// 컴퓨터가 생각하는 값과 사용자 입력 값이 같은 경우
				System.out.printf("짜짜짠!!정답입니다!!!\n%d번 만에 성공하셨군요!!\n", count);
				break;// 반복문 종료
			} else if (num > com) {// 사용자 입력 값이 컴퓨터가 생각하는 값 보다 큰경우
				System.out.println("숫자를 조금 더 낮춰보세요!");
			} else if (num < com) {// 사용자 입력 값이 컴퓨터가 생각하는 값 보다 낮은 경우
				System.out.println("숫자를 조금 더 높혀보세요!!");
			} // end of if

		} while (true);// end of while

	}// end of main

}
