package secondReport;

import java.util.Scanner;
//아래와 같이 음료 주문 프로그램 작성
//변수 :  
//	1) 음료 종류를 담을 배열 : String[] beverage
//	2) 음료의 가격을 담을 배열 : int[] price
//	3) 주문 수량을 담을 배열 : int[] numberOfOrders
//	4) 개별 주문금액을 담을 배열 : int[] amountOfMoney 
//	5) 주문 수량을 변수 : int numbers
//	6) 진행 여부 변수  : int continuingOrNot
//	7) 총판매금액을 담을 변수 : totalPaymentAmount
//	8) 총 주문수량을 담을 변수 : totalOrderAmount
//	9) 음료 선택 : int beverageChoice
//
//조건문 : 주문 여부 (yes/no) - if ~ else
//	 주문을 판단해서 처리기 : if ~ else if ~ else, switch
//
//반복문 : 주문을 여러번 받을 수 있기에 - while(true),do ~ while,for(;;){}
//
//
//출력 형태)
//	음료 번호를 선택하세요....
//	========================================================================
//	1.아메리카노(2500)|2.라떼(4500)|3.콜라(1500)|4.홍차(5500)|0. 종료  
//	=======================================================================
//	음료선택>> 1
//	주문 수량을 입력 >> 2
//
//	주문을 계속하시겠습니까?  
//	=========================
// 	1.주문계속 | 2.주문취소
//	========================
//	1
//	
//	음료 번호를 선택하세요....
//	========================================================================
//	1.아메리카노(2500)|2.라떼(4500)|3.콜라(1500)|4.홍차(5500)|0.주문 취소  
//	=======================================================================
//	음료선택>> 2
//	주문 수량을 입력 >> 3
//
//	주문을 계속하시겠습니까?
// 	=========================
// 	1. 주문계속 | 2. 주문종료
//	========================
//	선택>> 2
//	주문을 종료합니다.
//
//	
//	====================================
//	음료명	 	주문수량   주문금액
//	=====================================
//	아메리카노     	    2잔	     5,000원
//	라떼        	    3잔	    13,500원
//	======================================
//	주문 수량 합계 : 5잔
//	결제 금액 총계 : 18,500원
public class Quiz08 {

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
