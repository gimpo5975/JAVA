package thirdReport;

import java.text.DecimalFormat;

public class ItemMainExam {

	public static void main(String[] args) {
		int totalOrderAmount = 0;
		DecimalFormat decimalFormat = new DecimalFormat("#,###원");

		// 부모타입 배열에 자식 객체들 담기
		Item[] items = { new Cosmetic("미샤", "블랙", "비비크림", 35000), new Jeans("배기바지", 55000, 77),
				new Book("혼자공부하는자바", 32000, "신용권", "한빛미디어") };

		// 방법1. 물건 가격들의 합
//		System.out.println("물건이름 나열");
//		for (int i = 0; i < items.length; i++) {
//			totalOrderAmount += items[i].getPrice();
//			System.out.print(items[i].getName() + "\t");
//		} // end of for

		// 방법2 향상된 for문 물건 가격들의 합
		System.out.println("물건이름 나열");
		System.out.println();
		for (Item item : items) {
			totalOrderAmount += item.getPrice();
			item.print();
			System.out.println();
		} // end of for

		// 출력
		System.out.println();
		System.out.println("총 주문 금액 : " + decimalFormat.format(totalOrderAmount));

	}// end of main

}// end of class
