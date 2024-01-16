package array3;

import java.util.Scanner;

public class ArrayExam04_05_01 {
	// Scanner 객체 생성
	static Scanner sc = new Scanner(System.in);

	// 변수 초기화
	static String order = "";
	static int num = 0, quantity = 0, price = 0, sum = 0;

	// while문 제어용 변수 초기화
	static boolean run = true;

	// 배열 초기화
	static String[] beverage = { "커피", "라떼", "콜라", "홍차" };
	static int[] beveragePrice = { 2500, 4500, 1500, 5500 };
	static int arrayQuantity[] = new int[4];
	static int arrayPrice[] = new int[4];

	// entry point
	public static void main(String[] args) {
		while (run) {
			choiseOrder();
			switch (num) {
			case 1:// 1번 커피
				inputQuantity();
				order(num - 1);
				orederSelect();
				break;
			case 2:// 2번 라떼
				inputQuantity();
				order(num - 1);
				orederSelect();
				break;
			case 3:// 3번 콜라
				inputQuantity();
				order(num - 1);
				orederSelect();
				break;
			case 4:// 4번 홍차
				inputQuantity();
				order(num - 1);
				orederSelect();
				break;
			case 0:
				closeOrder();
				break;
			}// end of switch
		} // end of while
		print();
	}// end of main

	public static int choiseOrder() {
		System.out.printf("음료 번호를 선택하세요 \n1.커피(2500) | 2.라떼(4500) | 3.콜라(1500) | 4.홍차(5500) | 0.주문 취소 >>");// 안내문구
		num = Integer.parseInt(sc.nextLine());// 음료 번호 받기
		return num;
	}// end of choiseOrder()

	public static int inputQuantity() {
		System.out.printf("주문 수량을 입력 >> ");
		quantity = Integer.parseInt(sc.nextLine());// 주문수량 받기
		return quantity;
	}// end of inputQuantity

	public static void order(int num) {
		arrayQuantity[num] += quantity;// 주문수량 배열에 저장
		price = quantity * beveragePrice[num];// 금액 연산
		arrayPrice[num] += price;// 금액배열에 금액 저장
		beverage[num] = beverage[num];// 음료배열에 주문음료 저장
	}// end of order()

	public static boolean orederSelect() {
		System.out.printf("주문을 계속하시겠습니까? \nY:주문계속 | N:주문취소");// 주문여부 물어보기
		order = sc.nextLine();// 주문여부 입력
		if (order.equals("n") || order.equals("N")) {// 주문을 그만하고 영수증 출력
			System.out.println("주문을 종료합니다");
			run = false;
		} else if (order.equals("y") || order.equals("Y")) {// 계속 주문
		} // end of if
		return run;
	}// end of orderSelect()

	public static void print() {
		// 출력
		System.out.println("****************************************************");
		for (int i = 0; i < arrayPrice.length; i++) {
			if (beverage[i] == null || arrayQuantity[i] == 0 || arrayPrice[i] == 0) { // 주문안한 음료는 출력에서 제외
				continue;
			} // end of if
			System.out.printf("%s\t%d잔 주문\t주문금액\t%,3d원\n", beverage[i], arrayQuantity[i], arrayPrice[i]);
		} // end of for
		System.out.println("****************************************************");

		for (int i = 0; i < arrayPrice.length; i++) {// 금액 총합계산
			sum += arrayPrice[i];
		} // end of for

		// 총 금액 출력
		System.out.printf("총 주문 금액 : %,3d원", sum);
	}// end of print()

	public static boolean closeOrder() {
		System.out.println("주문을 취소합니다");// 주문취소 종료
		run = false;
		return run;
	}// end of closeOrder()
}// end of class
