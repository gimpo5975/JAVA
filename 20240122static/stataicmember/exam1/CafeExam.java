package stataicmember.exam1;

public class CafeExam {

	public static void main(String[] args) {
		Cafe cafe1 = new Cafe("커피");
		Cafe cafe2 = new Cafe("coffee");
		Cafe cafe3 = new Cafe("COFFEE");
		Cafe cafe4 = new Cafe("greenTea");
		Cafe cafe25 = new Cafe("coke");

		int coffee = Cafe.getCount();
		int beverage = Cafe.getAllCount();

		System.out.println("커피 주문 수량 : " + coffee);
		System.out.println("전체 주문 수량 : " + beverage);

	}// end of main

}// end of class
