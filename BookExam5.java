package exam.bookExam;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BookExam5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int menu=0,quantity = 0, price = 0, totalPrice = 0, order=0;
		final int COFFE_PRICE = 3500, COKE_PRICE = 1000, LATTE_PRICE = 5500, GREANTEA_PRICE = 4300;
		DecimalFormat df = new DecimalFormat("##,###");
		
		while (true) {
			System.out.printf("메뉴를 선택해 주세요>> [1]커피\t[2]콜라\t[3]라떼\t[4]녹차");
			menu = Integer.parseInt(sc.nextLine());
			
			switch (menu) {
			case 1:
				price = COFFE_PRICE;
				break;
			case 2:
				price = COKE_PRICE;
				break;
			case 3:
				price = LATTE_PRICE;
				break;
			case 4:
				price = GREANTEA_PRICE;
				break;
			}// end of switch

			System.out.print("수량을 선택해 주세요>> ");
			quantity = sc.nextInt();
			totalPrice = quantity * price;

			System.out.println("계속 주문하시겠습니까? ([1]네, [2]아니오)");
			order = sc.nextInt();

			if (order==1) {
				break;
			} else if (order==2) {
				System.out.printf("주문한음료: %s\n주문 수량:%d\n주문 금액: %s원", menu, quantity, df.format(totalPrice));
				break;
			} // end of if

		} // end of while

	}// end of main
}// end of class
