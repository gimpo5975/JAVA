package array3_2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ArrayExam8Refactor {

	// #1. Scanner 객체 생성 => 모든 메소드에서 사용하기 위해
	static Scanner sc = new Scanner(System.in);
	// #2. 정적 변수선언
	static String[] beverage = { "아메리카노", "라떼", "콜라", "홍차" };// 음료 종류
	static int[] price = { 2500, 4500, 1500, 5500 };// 음료가격
	static int[] numberOfOrders = new int[4];// 음료가 4개 이기때문에 공간은 4개만 필요 / 주문 수량을 누적할 변수
	static int[] amountOfMoney = new int[4];// 개별 주문금액을 누적할 공간
	static int beverageChoice = 0; // 음료 선택 번호를 담을 변수
	static int continuingOrNot = 0;// 주문 계속할지 여부
	static boolean run = true;

	public static void main(String[] args) {
		while (run) {
			// 음료번호를 선택하는 메소드 호출
			orderReceive();

			// 주문 여부를 물어보는 메소드
			orderQuestion();

			// 주문을 받은 음료의 수량과 가격을 누적하는 메소드 호출
			// 매개값으로 음료번호를 넘겨 줌
			eachOrder(beverageChoice - 1);

			// 주문 지속여부를 물어보는 메소드
			orderGo();

		} // end of while

		// 결과를 출력하는 부분을 작성한 메소드 호출
		showPrint();

	}// end of main

	// 음료번호를 선택하고 선택한번호를 변수에 담는 메소드
	public static void orderReceive() {
		// 주문 받는 메세지
		System.out.println("음료 번호를 선택하세요");
		System.out.println("========================================================================");
		System.out.println("1.아메리카노(2500)|2.라떼(4500)|3.콜라(1500)|4.홍차(5500)|0.종료");
		System.out.println("========================================================================");
		System.out.print("음료선택 : ");

		// 선택한 번호를 변수에 담기
		beverageChoice = sc.nextInt();
	}// end of orderReceive()

	// 주문 여부를 물어봐서 종료하는 메소드
	public static boolean orderQuestion() {
		// 종료를 선택했을 때 프로그램을 종료 / 주문 종료이면 다른 것을 실행하지 않기 위해서
		if (beverageChoice == 0) {
			// break; //반복문을 종료
			System.out.println("주문 종료를 선택하셨습니다");
			System.out.println("주문 종료합니다");
		} // end of if
		return false;
	}// end of orderQuestion()

	// 주문지속여부를 물어봐서 주문을 그만하고 결제 하거나 계속 주문을 이어가는 메소드
	public static boolean orderGo() {
		System.out.println();
		// 주문 지속여부 묻기
		System.out.println("주문을 계속하시겠습니까?");
		System.out.println("=========================");
		System.out.println(" 1.주문계속 | 2.결제하기");
		System.out.println("=========================");
		System.out.print("번호 선택 : ");
		continuingOrNot = sc.nextInt();
		System.out.println();

		// 2번을 선택하면 주문종료
		if (continuingOrNot == 2) {
			run = false;
		} // end of if
		return run;
	}// end of orderGo()

	// 결제할 금액을 계산하고 주문수량을 계산한 후 출력하기
	public static void showPrint() {
		int totalPayment = 0;// 총 주문금액을 담을 변수
		int totalOrderAmount = 0;// 총 주문 수량을 담을 변수
		// 금액과 수량을 표시하는 형식을 설정
		DecimalFormat df1 = new DecimalFormat("0잔");// 수량의 패턴 => 숫자를 문자열로 표시
		DecimalFormat df2 = new DecimalFormat("#,###원");// 수량의 패턴 => 숫자를 문자열로 표시

		// 결제할 금액을 계산하고 주문수량을 계산하고 출력하기
		System.out.println("=====================================================");
		System.out.printf("%-7s\t %s\t %s\n", "음료명", "주문수량", "주문금액");
		System.out.println("=====================================================");

		// 수량과 개별금액을 출력 배열 공간에 있는 값을 꺼내서 출력
		// 배열은 시작과 끝이 있고, 시작~끝까지 검토한 후 출력
		// for문
		// 만약 주문이 없을 시 그것을 출력하지 못하게 할 필요 :if
		// 주문 수량이 0이면 || 주문 금액이 0이면 출력에서 제외
		for (int i = 0; i < numberOfOrders.length; i++) {
			// 음료와 주문수량과 개별주문금액을 출력
			// 한번도 주문하지 않은 것은 제외 시켜야함, 주문수량이 0이면 제외되게
			if (numberOfOrders[i] == 0 || amountOfMoney[i] == 0) {
				continue;// for문의 증감부분으로 되돌아가기
			} // end of if

			System.out.printf("%s\t %s\t %s\n", beverage[i], df1.format(numberOfOrders[i]),
					df2.format(amountOfMoney[i]));

			// 주문 수량 합계 계산
			totalOrderAmount += numberOfOrders[i];
			totalPayment += amountOfMoney[i];
			// 결제 금액 총액 계산

		} // end of for

		// 총 주문수량 합계와 결제 금액 총액 출력
		System.out.println("=====================================================");
		System.out.println("주문 수량 합계 : " + df1.format(totalOrderAmount));
		System.out.println("결제 금액 합계 : " + df2.format(totalPayment));
	}// end of showPrint()

	// 주문을 받아서 개별 계산
	public static void eachOrder(int beverageChoice) {// 매개값으로 음료번호를 넘겨 받았음
		// 주문 종료가 아니면 주문 수량을 입력받기
		System.out.println("주문 수량 입력 : ");
		int numbers = sc.nextInt();
		numberOfOrders[beverageChoice] += numbers; // 주문 수량 누적
		amountOfMoney[beverageChoice] = numberOfOrders[beverageChoice] * price[beverageChoice];// 주문 금액을 누적

	}// end of eachOrder()

}// end of class
