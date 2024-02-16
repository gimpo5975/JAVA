package practice2024_02_15;

import java.util.Scanner;

//. 월에 해당하는 영어 단어 맞추기 게임을 작성하시오.
//{ "January", "February", "March", "April", "May", "June", "July", "August",
//  "September","October", "November", "December" }
//
//<입력 형태>
//1. 5월에 해당하는 영어 단어를 쓰세요...
//5월 >> 
//
//<출력 형태>
//<오답을 입력한 경우>
//     입력하신 단어는 ~~입니다. 오답입니다.
//
//2. 다시 입력하시겠습니까?
//     ---------------
//1. Yes | 2. No
//---------------
//번호 입력>> 2
//
//게임 종료를 선택하셨습니다. 
//게임을 종료합니다.
//
//     
//     <정답을 입력한 경우>
//입력하신 단어는 ~~입니다. 정답입니다.   
//
//3. 게임을 계속하시겠습니까?
//     -----------------
//1. 계속 | 2. 종료
//-----------------
//번호 입력>>2
//
//게임 종료를 선택하셨습니다. 
//게임을 종료합니다.

public class GuessTheWord {
	private static Scanner sc = new Scanner(System.in);
	public static String[] engWords = { "January", "February", "March", "April", "May", "June", "July", "August",
			"September", "October", "November", "December" };
	public static String[] korWords = { "1월", "2월", "3월", "4월", "5월", "6월", "7월", "8월", "9월", "10월", "11월", "12월" };

	// entry point
	public static void main(String[] args) {
		game();
	}// end of main

	public static void game() {
		boolean run = true;
		while (run) {
			int month = (int) (Math.random() * 11) + 1;
			System.out.println(month + "에 해당하는 영어 단어를 쓰세요");
			System.out.print(month + "월 >> ");
			// 정답 입력
			String answer = sc.nextLine();

			// 정답일 경우
			if (answer.equals(engWords[month - 1])) {
				System.out.println();
				System.out.println("짞짞짞짞짞!!!입력하신 단어는 " + month + "입니다! 정답입니다.");
				run = false;
			}
			// 오답일 경우
			else {
				System.out.println();
				System.out.println("떙떙떙떙떙!!!입력하신 단어는 " + month + "입니다! 오답입니다.");
				System.out.println("다시 입력하시겠습니까?");
				System.out.println("[1]네 | [2]아니오");
				System.out.print("번호 입력 >> ");
				// 게임 진행여부 선택
				int num = Integer.parseInt(sc.nextLine());

				// 게임 중단
				if (num == 2) {
					System.out.println("게임 종료를 선택하셨습니다.");
					System.out.println("게임을 종료합니다");
					run = false;
				}
				// 정답 재도전
				else if (num == 1) {
					System.out.print(month + "월 >> ");
					// 정답 입력
					String reAnswer = sc.nextLine();
					// 정답일 경우
					if (reAnswer.equals(engWords[month - 1])) {
						System.out.println();
						System.out.println("짞짞짞짞짞!!!입력하신 단어는 " + month + "입니다! 정답입니다.");
						run = false;
					}
					// 오답일 경우
					else {
						System.out.println();
						System.out.println("떙떙떙떙떙!!!입력하신 단어는 " + month + "입니다! 오답입니다.");
						System.out.println("게임을 계속 진행하시겠습니까?");
						System.out.println("[1]진행 | [2]중단");
						System.out.print("번호 입력 >> ");
						// 게임 진행여부 선택
						int reNum = Integer.parseInt(sc.nextLine());
						// 게임 종료
						if (reNum == 2) {
							System.out.println("게임 종료를 선택하셨습니다.");
							System.out.println("게임을 종료합니다");
							run = false;
						}
						// 게임 재진행
						else if (reNum == 1) {

						}
						// 잘못된 번호입력
						else {
							System.out.println("잘못된 입력입니다. 종료합니다");
							run = false;
						} // end of if-in-in-in

					} // end of if-in-in
				} // end of if -in
			} // end of if

		} // end of while
	}// end of game

}// end of class
