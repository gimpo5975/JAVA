package exam.bookExam;

import java.util.Scanner;

public class BookExam4_4Refactor {

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
			int menuSelectNum = Integer.parseInt(sc.nextLine());// 수정할 부분

			// #4. 읽어온 번호를 이용해 처리
			if(menuSelectNum == 1) {
				balance += Integer.parseInt(sc.nextLine());
			}else if(menuSelectNum == 2) {
				balance -= Integer.parseInt(sc.nextLine());
			}else if(menuSelectNum == 3) {
				System.out.println("잔고> " + balance);
			}else if(menuSelectNum == 4) {
				break;
			}
			
			System.out.println();// 줄바꿈
		} // end of while
	} // end of main

} // end of class
