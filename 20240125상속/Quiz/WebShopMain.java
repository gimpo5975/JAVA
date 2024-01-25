package practice;

import java.text.DecimalFormat;

public class WebShopMain {

	public static void main(String[] args) {
		int sum = 0;

		// 자식객체 생성
		Cosmetics cos = new Cosmetics("선크림", 30000, "미샤", "흰색");
		Jeans jean = new Jeans("조거팬츠", 55000, 77);
		Book book = new Book("혼자 공부하는 자바", 32000, "신용권", "한빛미디어");

		// 자식객체 마다 재정의된 메소드호출
		cos.printInfo();
		jean.printInfo();
		book.printInfo();

		// 총합 구하기
		sum = cos.getPrice() + jean.getPrice() + book.getPrice();
		DecimalFormat df = new DecimalFormat("#,###원");

		// 총합 출력
		System.out.println("****************************");
		System.out.printf("오늘 전체 판매 금액: %s", df.format(sum));

	}// end of main
}// end of class
