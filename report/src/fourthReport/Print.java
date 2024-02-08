package fourthReport;

import java.text.DecimalFormat;
import java.util.Scanner;

//6.  프린트할 용지를 입력 받아 출력하는 프로그램 작성
//기본 용지는 100장이 프린트에 남아있으며,
//단면 인쇄만 가능한 프린터 입니다.
//
//메소드 : printShow(int printAmount)
//
//<입력화면>
//인쇄할 용지 매수를 입력하세요.
//인쇄수량>>  10
//
//<출력 화면>
//인쇄 : 10매
//남은 용지 : 90매
public class Print {

	private static Scanner sc = new Scanner(System.in);
	private static final int PAPER = 100;

	public static void main(String[] args) {
		selectPrintAmount();
	}// end of main

	private static void selectPrintAmount() {
		// 인쇄할 용지 입력 받기
		System.out.println("인쇄할 용지 매수를 입력하세요.");
		System.out.print("인쇄 수량 >> ");
		int printAmount = sc.nextInt();

		// 기존 용지보다 인쇄하려는 용지가 더 많을 경우 기존용지는 다 인쇄되고 인쇄되지 못한 매수를 알려줌
		if (printAmount > PAPER) {
			System.out.println("용지가 부족합니다.");
			System.out.println(PAPER + "장 인쇄, " + (printAmount - PAPER) + "장 인쇄 안됨");
			return;
			// 인쇄할려는 용지매수는 0보다 작을 수 없음
		} else if (printAmount < 0) {
			System.out.println("잘못된 인쇄 매수입니다. 확신 해보세요!!");
			return;
		} // end of if

		// 인쇄하고 남은 용지 매수
		int lastPaper = PAPER - printAmount;

		// 예쁜 글씨
		DecimalFormat df = new DecimalFormat("#장");

		// 출력
		System.out.println("인쇄 : " + df.format(printAmount));
		System.out.println("남은 용지 : " + df.format(lastPaper));

	}// end of selectPrintAmount()

}// end of class
