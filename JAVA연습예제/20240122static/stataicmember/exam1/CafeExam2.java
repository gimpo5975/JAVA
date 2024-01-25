package stataicmember.exam1;

public class CafeExam2 {

	public static void main(String[] args) {
		Cafe2 cf = new Cafe2("커피");
		Cafe2 cf1 = new Cafe2("키퍼");
		Cafe2 cf2 = new Cafe2("캐피");
		Cafe2 cf3 = new Cafe2("녹차");
		Cafe2 cf4 = new Cafe2("COFFEE");
		Cafe2 cf5 = new Cafe2("CoffEe");
		Cafe2 cf6 = new Cafe2("coffee");
		Cafe2 cf7 = new Cafe2("콜라");
		
		int coffeeCount = CoffeeStaticCount.coffeeCount;
		int allCount = CoffeeStaticCount.allCount;
		
		System.out.println("커피 주문 수량 : " + coffeeCount);
		System.out.println("총 주문 수량 : " + allCount);
		
	}// end of main

}// end of class
