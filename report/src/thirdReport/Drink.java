package thirdReport;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Drink {

	// #필드
	private final Scanner sc = new Scanner(System.in);// 입력을 받기위한 Scanner 객체 생성
	private int drinkPick;// 선택한 음료번호 저장용
	private int orderGlass;// 주문수량 저장용
	private int continueOrderChoice;// 주문 지속여부 저장(주문계속 or 주문취소)
	private int sumPrice;// 주문 금액 합게
	private int sumOrder;// 주문 수량 합게
	private final String[] drinkNames = { "아메리카노", "라떼", "콜라", "홍차" };// 음료 이름 배열
	private final int[] orderQuantity = new int[drinkNames.length];// 주문수량을 담을 배열
	private final int[] orderPrice = new int[drinkNames.length];// 주문금액을 담을 배열
	private final int[] prices = { 2500, 4500, 1500, 5500 };// 음료 가격 배열
	private boolean run = true;
	private final DecimalFormat df = new DecimalFormat("#,###원");

	// #메소드
	// 전체 실행 메소드
	public void order() {

		while (run) {

			menuSelect();// 메뉴,수량,주문지속 여부 선택 메소드
			arraySum();// 배열에 값을 담는 메소드
			showReceipt();// 영수증 출력 메소드
		} // end of while

	}// end of order()

	// 메뉴,수량,주문지속 여부 선택 메소드
	public void menuSelect() {
		System.out.println("음료 번호를 선택하세요");
		System.out.println("==========================================================================");
		System.out.println("[1]아메리카노(2500)|[2]라떼(4500)|[3]콜라(1500)|[4]홍차(5500)|[0]종료");
		System.out.println("==========================================================================");
		System.out.print("번호 선택 >> ");
		drinkPick = sc.nextInt();// 음료번호 선택
		if (drinkPick == 0) {// 주문 종료
			System.out.println("주문을 종료합니다.");
			run = false;
			return;
		} // end of if
		System.out.print("주문 수량을 입력 >> ");
		orderGlass = sc.nextInt();// 음료 주문수량 입력
		if (orderGlass == 0 || orderGlass < 0) {
			System.out.println("주문수량을 제대로 입력해주세요");
			run = false;
			return;
		} // end of if
		System.out.println();
		System.out.println("주문을 계속하시겠습니까?");
		System.out.println("================================");
		System.out.println("[1]주문 계속|[2]주문 종료");
		System.out.println("================================");
		System.out.print("번호 선택 >> ");
		System.out.println();
		continueOrderChoice = sc.nextInt();

		if (continueOrderChoice == 2) {
			run = false;
			return;
		} // end of if
	}// end of menuSelect()

	// 배열에 값을 담는 메소드
	public void arraySum() {
		switch (drinkPick) {
		case 1:// 아메리카노
			caculate(drinkPick);
			break;
		case 2:// 라떼
			caculate(drinkPick);
			break;
		case 3:// 콜라
			caculate(drinkPick);
			break;
		case 4:// 홍차
			caculate(drinkPick);
			break;

		}// end of switch
	}// end of arraySum()

	// 선택한 음료의 수량과 주문금액을 저장하는 메소드
	public void caculate(int drinkPick) {
		orderQuantity[drinkPick - 1] += orderGlass;// 음료배열 0번에 주문수량 저장
		orderPrice[drinkPick - 1] += prices[drinkPick - 1] * orderGlass;// 음료배열 0번에 주문금액 저장
	}// end of caculate()

	// 영수증 출력
	public void showReceipt() {
		if (!run) {
			System.out.println("=====================================");
			System.out.println("음료명\t주문수량\t주문금액");
			System.out.println("=====================================");

			for (int i = 0; i < drinkNames.length; i++) {
				if (orderQuantity[i] == 0) {// 주문 수량이 0인 것은 출력되지 않도록 증가식으로 이동
					continue;
				} // end of if
				System.out.printf("%s\t%d잔\t%s\n", drinkNames[i], orderQuantity[i], df.format(orderPrice[i]));
				sumPrice += orderPrice[i];// 주문금액 총합
				sumOrder += orderQuantity[i];// 주문수량 총합
			} // end of for

			System.out.printf("주문 수량 합계 : %d 잔\n", sumOrder);
			System.out.printf("주문 수량 합계 : %s \n", df.format(sumPrice));
		} // end of if
	}// end of showReceipt()
}// end of class
