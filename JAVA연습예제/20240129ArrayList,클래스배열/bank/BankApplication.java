package exam.bank;

import java.util.Scanner;

public class BankApplication {

	private static Scanner sc = new Scanner(System.in);

	// 계좌를 담을 배열 => 모든 메소드애서 공통으로 사용
	private static Account[] arrayAcount = new Account[100];

	public static void main(String[] args) {

		while (true) {

			int listSelectNo = 0;
			System.out.println("-----------------------------------");
			System.out.println("[1]계좌생성 | [2]계좌목록 | [3]예금 | [4]출금 | [5]종료");
			System.out.println("-----------------------------------");
			System.out.printf("선택 >> ");
			listSelectNo = Integer.parseInt(sc.nextLine());

			if (listSelectNo == 5) {
				System.out.println("종료를 선택하셨습니다. 종료합니다..");
				break;
			} // end of if

			switch (listSelectNo) {

			case 1:// 계좌생성
				break;
			case 2:// 계좌목록
				break;
			case 3:// 예금
				break;
			case 4:// 출금
				break;

			}// end of switch

		} // end of while

	}// end of main

	// #1. 계좌생성
	private void createAccount() {

	}// end of createAccount()

	// #2. 계좌리스트
	private void accountList() {

	}// end of accountList()

	// #3. 예금
	private void deposit() {

	}// end of deposit()

	// #4. 출금
	private void withdraw() {

	}// end of withdraw()

	// #5. 계좌번호 찾기
	private Account findAccount(String accountNO) {

	}// end of findAccount()

}
// end of class
