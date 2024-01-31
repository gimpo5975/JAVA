package thirdReport;

public class Cosmetic extends Item {

	// #필드
	private String brand;
	private String color;

	// #생성자
	public Cosmetic(String brand, String color, String name, int price) {
		super(name, price);
		this.brand = brand;
		this.color = color;
	}

	// #메소드
	@Override
	public void print() {
		System.out.println("이름 " + getName());
		System.out.println("가격 " + getPrice());
		System.out.println("브랜드 " + brand);
		System.out.println("색상 " + color);
	}// end of print()
}// end of class
