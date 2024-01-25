package practice;

public class Cosmetics extends Item {

	// #1. 필드
	private String brand;
	private String color;

	// #2. 생성자 => 부모 생성자를 호출, 부모를 초기화시킬 필드값과 자신을 초기화시킬 필드값을 매개값으로 받을 수 있도록 설정
	public Cosmetics(String name, int price, String brand, String color) {
		super(name, price);// 부모 생성자 호출
		this.brand = brand;
		this.color = color;
	}// end of Cosmetics()

	// #3. 메소드
	@Override // 부모 메소드 재정의
	// 부모의 printInfo()메소드를 호출하여 자식의 출력내용을 추가
	public void printInfo() {
		System.out.println("****************************");
		System.out.println("*화장품*");
		super.printInfo();
		System.out.println("브랜드 : " + brand);
		System.out.println("색상 : " + color);
	}// end of printInfo()

}// end of class
