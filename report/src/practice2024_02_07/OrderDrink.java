package practice2024_02_07;

import java.text.DecimalFormat;
import java.util.Scanner;

//5. 음료 종류와 주문 수량을 입력 받아 아래 '출력화면 예시'와 같이 출력하는 프로그램을 작성하시오.
//계산 메소드 : calc(int amount, int price)
//화면 출력 메소드 : showInfo()
//
//<입력 화면>
//1. 음료 번호를 선택해 주세요.
//-------------------------------------------------------------------------------------
//   1. coffe(3,000)| 2.greentea(4,500) | 3. coke(1,500)| 4. latte(5,500) | 5. 주문종료
//          -------------------------------------------------------------------------------------
//번호 선택>>
//
//2. 주문 수량을 입력 하세요.
//  주문 수량>>
//
//<출력화면 예시>
//주문하신 음료 : 커피
//주문하신 수량 : 3잔
//주문 금액 : 9,000원

public class OrderDrink {

	private static Scanner sc = new Scanner(System.in);// 입력 받기 위한 스캐너 객체 생성
	private static final int COFFEE_PRICE = 3000; // 커피 가격 상수 선언
	private static final int GREEN_TEA_PRICE = 4500; // 녹차 가격 상수 선언
	private static final int COKE_PRICE = 1500; // 콜라 가격 상수 선언
	private static final int LATTE_PRICE = 5500; // 라떼 가격 상수 선언

	private static int selectNum;// 번호 선택
	private static int amount;// 주문 수량
	private static int price;// 음료 금액
	private static int totalPrice;// 총 주문 금액

	private static Drink drink;// 음료 이름

	// entry point
	public static void main(String[] args) {

		selectDrink();

	}// end of main

	// 총 주문 금액 계산하는 메소드
	private static void calc(int amount, int price) {// 매개변수로 수량과 가격을 넘겨줌
		totalPrice = amount * price;// 최종 금액 => 수량 X 금액
	}// end of calc

	// 번호 선택 메소드 음료 주문 또는 주문종료
	private static void showInfo() {
		System.out.println("음료 번호를 선택해 주세요");
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println("1. coffe(3,000)| 2.greentea(4,500) | 3. coke(1,500)| 4. latte(5,500) | 5. 주문종료");
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.print("번호 선택 >> ");
		selectNum = Integer.parseInt(sc.nextLine());

		// 제약 조건 보기안에있는 번호를 선택해야함
		if (selectNum < 1 || 5 < selectNum) {
			System.out.println("잘못된 번호를 입력하셨습니다.");
			return;
		} // end of if

		if (selectNum == 5) {
			System.out.println("주문을 종료합니다.");
			return;
		} // end of if

		// 제약 조건 주문 수량은 0보다 작을 수 없음
		System.out.print("수량 선택 >> ");
		amount = Integer.parseInt(sc.nextLine());
		if (amount < 0) {
			System.out.println("잘못된 수량을 입력하셨습니다.");
			return;
		} // end of if

	}// end of showInfo

	// 음료 선택하는 메소드
	private static void selectDrink() {
		showInfo();
		switch (selectNum) {
		case 1:
			price = COFFEE_PRICE;
			drink = Drink.커피;
			break;
		case 2:
			price = GREEN_TEA_PRICE;
			drink = Drink.녹차;
			break;
		case 3:
			price = COKE_PRICE;
			drink = Drink.콜라;
			break;
		case 4:
			price = LATTE_PRICE;
			drink = Drink.라떼;
			break;
		case 5:
			if (drink == null) {
				drink = Drink.없음;
			}
			break;
		}// end of switch
		calc(amount, price);
		showBill();
	}// end of order

	// 영수증 보여주는 최종 출력 메소드
	private static void showBill() {
		DecimalFormat df = new DecimalFormat("#,###원");
		DecimalFormat f = new DecimalFormat("#,###잔");

		System.out.println();
		System.out.println("주문하신 음료 : " + drink);
		System.out.println("주문하신 수량 : " + f.format(amount));
		System.out.println("주문하신 금액 : " + df.format(totalPrice));
	}// end of showBill

}// end of class
