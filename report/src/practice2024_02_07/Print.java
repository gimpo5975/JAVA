package practice2024_02_07;

import java.util.Scanner;

//프린트할 용지를 입력 받아 출력하는 프로그램 작성
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
	private static int printAmount;// 인쇄할 용지
	private static int lastpaper;// 남은 용지
	private static int printPaper = 100;// 기본 셋팅되어있는 용지

	// entry point
	public static void main(String[] args) {
		inputPrint();
	}// end of main

	// 인쇄할 용지 매수를 입력하는 메소드
	private static void inputPrint() {
		System.out.println("인쇄할 용지 매수를 입력하세요.");
		System.out.print("인쇄 수량 >> ");
		printAmount = Integer.parseInt(sc.nextLine());

		// 제약 조건 인쇄할 용지는 기존에 있는 용지보다 크면 안됨
		if (printAmount > 100) {
			System.out.println("용지가 부족합니다");
			System.out.println(printPaper + "장 인쇄했습니다. ");
			System.out.println("인쇄하지 못한 매수 : " + (printAmount - printPaper));
			return;
		} // end of if

		printShow(printAmount);
	}// end of inputPrint

	private static void printShow(int printAmount) {
		printPaper -= printAmount;
		lastpaper = printPaper;

		showResult();
	}// end of printShow

	private static void showResult() {
		System.out.println("인쇄한 용지 : " + printAmount);
		System.out.println("남은 용지 : " + lastpaper);
	}// end of showResult

}// end of class
