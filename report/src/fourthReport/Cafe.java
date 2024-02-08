package fourthReport;

import java.text.DecimalFormat;
import java.util.Scanner;
import static fourthReport.DrinkPrice.*;

//5. 음료 종류와 주문 수량을 입력 받아 아래 '출력화면 예시'와 같이 출력하는 프로그램을 작성하시오.
//계산 메소드 : calc(int amount, int price)
//화면 출력 메소드 : showInfo()
//
//<입력 화면>
//1. 음료 번호를 선택해 주세요.
//-------------------------------------------------------------------------------------
//   1. coffe(3,000)| 2.greentea(4,500) | 3. coke(1,500)| 4. latte(5,500) | 5. 주문종료
//-------------------------------------------------------------------------------------
//번호 선택>>
//
//2. 주문 수량을 입력 하세요.
//  주문 수량>>
//
//<출력화면 예시>
//주문하신 음료 : 커피(coffee)
//주문하신 수량 : 3잔
//주문 금액 : 9,000원
public class Cafe {

	private static Scanner sc = new Scanner(System.in);// 입력받기 위한 스캐너 객체
//	private static final int COFFEE = 3000;// 커피가격
//	private static final int GREENTEA = 4500;// 녹차가격
//	private static final int COKE = 1500;// 콜라가격
//	private static final int LATTE = 5500;// 라떼가격

	// entry point
	public static void main(String[] args) {
		order();
	}// end of main

	private static void order() {
		System.out.println("음료번호를 선택해 주세용.");
		System.out.println(
				"🍷🍸🍹🍺🧋🥤🍷🍸🍹🍺🧋🥤🍷🍸🍹🍺🧋🥤🍷🍸🍹🍺🧋🥤🍷🍸🍹🍺🧋🥤🍷🍸🍹🍺🧋🥤🍸🍹🍺🧋🥤🍸🍹🍺🧋🥤🍸🍹🍺🧋🥤");
		System.out.println("[1]coffee(3,000) | [2]greentea(4,500) | [3]coke(1,500) | [4]latte(5,500) | [5]종료");
		System.out.println(
				"🍷🍸🍹🍺🧋🥤🍷🍸🍹🍺🧋🥤🍷🍸🍹🍺🧋🥤🍷🍸🍹🍺🧋🥤🍷🍸🍹🍺🧋🥤🍷🍸🍹🍺🧋🥤🍸🍹🍺🧋🥤🍸🍹🍺🧋🥤🍸🍹🍺🧋🥤");
		// 음료 선택
		System.out.print("번호 선택 >> ");
		int selectNum = sc.nextInt();

		// 보기에 없는 번호를 누르거나 종료를 누르면 종료
		if ((selectNum < 1 || selectNum > 5)) {
			System.out.println("잘못 누르셨습니다.  반성하세요!!");
			return;
		} else if (selectNum == 5) {
			System.out.println("종료합니다. 잘가요~");
			return;
		} // end of if

		// 수량 선택
		System.out.println("주문수량을 선택해 주세요.");
		System.out.print("주문 수량 >> ");
		int amount = sc.nextInt();
		System.out.println();

		// 주문수량은 무조건 1이상 이어야 한다.
		if (amount <= 0) {
			System.out.println("잘못된 수량 선택입니다. 반성하세요!!");
			return;
		} // end of if

		Drink drink = null;
		int price = 0;
		switch (selectNum) {
		case 1:// 커피 선택
			drink = Drink.커피;
			price = COFFEE;
			break;
		case 2:// 녹차 선택
			drink = Drink.녹차;
			price = GREENTEA;
			break;
		case 3:// 콜라 선택
			drink = Drink.콜라;
			price = COKE;
			break;
		case 4:// 라떼 선택
			drink = Drink.라떼;
			price = LATTE;
			break;
		}// end of switch

		// 최종 주문금액을 totalPrice에 저장
		int totalPrice = calculateDrinks(amount, price);

		// 예쁜 출력을 위한 데시멀 포맷사용
		DecimalFormat df = new DecimalFormat("#,###잔");
		DecimalFormat f = new DecimalFormat("#,###원");

		// 영수증 출력
		System.out.println("🧾영수증🧾");
		System.out.println("주문하신 음료 : " + drink);
		System.out.println("주문 수량 : " + df.format(amount));
		System.out.println("주문 금액 : " + f.format(totalPrice));

	}// end of order

	// 최종금액을 계산해주는 메소드
	private static int calculateDrinks(int amount, int price) {
		return price * amount;
	}// end of caculateDrinks

}// end of class
