package firstReport;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Quiz34 {

	public static void main(String[] args) {
		// 문34) 음료의 주문번호를 입력 받아, 주문음료와 금액을 출금하는 프로그램을 작성하시오. switch 사용
		DecimalFormat df = new DecimalFormat("##,###");
		Scanner sc = new Scanner(System.in);
		System.out.println("주문하시겠습니까?");
		System.out.println("[1]커피(3500) [2]라떼(5500)  [3]콜라(1500)  [4]녹차(3500)");
		String order = sc.nextLine();
		System.out.println("주문 수량을 입력해 주세요");
		int quantity = Integer.parseInt(sc.nextLine());
		final int COFFIE = 3500, LATTE = 5500, COKE = 1500, GREEN_TEA = 3500;
		int price = 0;
		String drink="";
		switch (order) {
		case "1":
			drink="커피";
			price=COFFIE;
			break;
		case "2":
			drink="라떼";
			price=LATTE;
			break;
		case "3":
			drink="콜라";
			price=COKE;
			break;
		default:
			drink="녹차";
			price=GREEN_TEA;
			break;
		}//end of switch
		price = quantity * price;
		System.out.println("주문한 음료 : "+drink);
		System.out.println("주문 수량 : "+quantity);
		System.out.println("결재금액 : "+df.format(price));

	}// end of main

}// end of class
