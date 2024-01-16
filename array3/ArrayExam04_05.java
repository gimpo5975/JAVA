package array3;

import java.util.Scanner;

public class ArrayExam04_05 {
	// Scanner 객체 생성
	static Scanner sc = new Scanner(System.in);
	
	// 고정된 음료 가격 파이널정수로 선언
	static final int COFFE_PRICE = 2500, LATTE_PRICE = 4500, COKE_PRICE = 1500, RED_TEA = 5500;
	
	// 변수 초기화
	static String order = "";
	static int num = 0, quantity = 0, price = 0, sum = 0;
	
	// while문 제어용 변수 초기화
	static boolean run = true;
	
	public static void main(String[] args) {
		// 배열 초기화
		String[] beverage = new String[4];
		int quantity1[] = new int[4];
		int price1[] = new int[4];
		
		while (run) {
			System.out.printf("음료 번호를 선택하세요 \n1.아아(2500) | 2.라떼(4500) | 3.콜라(1500) | 4.홍차(5500) | 0.주문 취소 >>");// 안내문구
			num = Integer.parseInt(sc.nextLine());// 음료 번호 받기

			switch (num) {
			case 1:// 1번 아아
				System.out.printf("주문 수량을 입력 >> ");
				quantity = Integer.parseInt(sc.nextLine());// 주문수량 받기
				quantity1[0] = quantity;// 아메리카노 주문수량 배열에 저장
				price = quantity * COFFE_PRICE;// 금액 연산
				price1[0] = price;// 금액배열에 금액 저장
				beverage[0] = "아아";// 음료배열에 아아 저장
				System.out.printf("주문을 계속하시겠습니까? \nY:주문계속 | N:주문취소");// 주문여부 물어보기
				order = sc.nextLine();// 주문여부 입력

				if (order.equals("n") || order.equals("N")) {// 주문을 그만하고 영수증 출력
					System.out.println("주문을 종료합니다");
					run = false;
					break;
				} else if (order.equals("y") || order.equals("Y")) {// 계속 주문
					break;
				} // end of if
			case 2:// 2번 라떼
				System.out.printf("주문 수량을 입력 >> ");
				quantity = Integer.parseInt(sc.nextLine());// 주문수량 받기
				quantity1[1] = quantity;// 라떼 주문수량 배열에 저장
				price = quantity * LATTE_PRICE;// 금액 연산
				price1[1] = price;// 금액배열에 금액 저장
				beverage[1] = "라떼";// 음료배열에 라떼 저장
				System.out.printf("주문을 계속하시겠습니까? \nY:주문계속 | N:주문취소");// 주문여부 물어보기
				order = sc.nextLine();// 주문여부 입력

				if (order.equals("n") || order.equals("N")) {// 주문을 그만하고 영수증 출력
					System.out.println("주문을 종료합니다");
					run = false;
					break;
				} else if (order.equals("y") || order.equals("Y")) {// 계속 주문
					break;
				} // end of if
			case 3:// 3번 콜라
				System.out.printf("주문 수량을 입력 >> ");
				quantity = Integer.parseInt(sc.nextLine());// 주문수량 받기
				quantity1[2] = quantity;// 콜라 주문수량 배열에 저장
				price = quantity * COKE_PRICE;// 금액 연산
				price1[2] = price;// 금액배열에 금액 저장
				beverage[2] = "콜라";// 음료배열에 콜라 저장
				System.out.printf("주문을 계속하시겠습니까? \nY:주문계속 | N:주문취소");// 주문여부 물어보기
				order = sc.nextLine();// 주문여부 입력

				if (order.equals("n") || order.equals("N")) {// 주문을 그만하고 영수증 출력
					System.out.println("주문을 종료합니다");
					run = false;
					break;
				} else if (order.equals("y") || order.equals("Y")) {// 계속 주문
					break;
				} // end of if
			case 4:// 4번 홍차
				System.out.printf("주문 수량을 입력 >> ");
				quantity = Integer.parseInt(sc.nextLine());// 주문수량 받기
				quantity1[3] = quantity;// 홍차 주문수량 배열에 저장
				price = quantity * RED_TEA;// 금액 연산
				price1[3] = price;// 금액배열에 금액 저장
				beverage[3] = "홍차";// 음료배열에 홍차 저장
				System.out.printf("주문을 계속하시겠습니까? \nY:주문계속 | N:주문취소");// 주문여부 물어보기
				order = sc.nextLine();// 주문여부 입력

				if (order.equals("n") || order.equals("N")) {// 주문을 그만하고 영수증 출력
					System.out.println("주문을 종료합니다");
					run = false;
					break;
				} else if (order.equals("y") || order.equals("Y")) {// 계속 주문
					break;
				} // end of if
			case 0:
				System.out.println("주문을 취소합니다");// 주문취소 종료
				run = false;
				break;
			}// end of switch
		} // end of while
			// 출력
		System.out.println("****************************************************");
		for (int i = 0; i < price1.length; i++) {
			if (beverage[i] == null || quantity1[i] == 0 || price1[i] == 0) { // 주문안한 음료는 출력에서 제외
				continue;
			} // end of if
			System.out.printf("%s\t%d잔 주문\t주문금액\t%,3d원\n", beverage[i], quantity1[i], price1[i]);
		} // end of for
		System.out.println("****************************************************");

		for (int i = 0; i < price1.length; i++) {// 금액 총합계산
			sum += price1[i];
		} // end of for

		// 총 금액 출력
		System.out.printf("총 주문 금액 : %,3d원", sum);
	}// end of main

	public static void orederSelect() {
		
	}
}// end of class
