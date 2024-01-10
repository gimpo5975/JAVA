package exam.bookExam;

import java.util.Scanner; // import = java안에 util안에 Scanner를 클래스영역으로 꺼내라

public class BookExam4_4 {

	public static void main(String[] args) {
		// #1. Scanner 객체 생성
		Scanner sc = new Scanner(System.in);
		boolean run = true; // while문의 조건을 설정
		int balance = 0; // 잔고

		while (run) { // true
			// #2. 공통 출력부분
			System.out.println("--------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("--------------------------------");
			System.out.print("선택> ");

			// #3. 선택한 번호를 읽어오기
			int menuSelectNum = sc.nextInt();// 수정할 부분

			// #4. 읽어온 번호를 이용해 처리
			switch (menuSelectNum) {
			case 1:
				System.out.print("예금액> ");
				// 잔고는 기존잔고 + 현재입금받은 예금액
				balance += sc.nextInt();
				break;
			case 2:
				System.out.print("출금액> ");
				// 잔고는 기존잔고 - 현재 출금하는 출금액
				balance -= sc.nextInt();
				if(balance<0) {
					System.out.println("잔고를 확인해 주세요");
					run = false;
				}
				break;
			case 3:
				System.out.println("잔고> " + balance);
				// 잔고
				break;
			case 4:
				System.out.println("시스템을 종료합니다");
				run = false; // while문을 종료하기 위해 run = false처리
			}// end of switch
			System.out.println();// 줄바꿈
		} // end of while
	} // end of main

} // end of class
