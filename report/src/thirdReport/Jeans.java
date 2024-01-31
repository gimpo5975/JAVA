package thirdReport;

public class Jeans extends Item {

	// #필드
	private int size;

	// #생성자
	public Jeans(String name, int price, int size) {
		super(name, price);
		this.size = size;
	}

	// #메소드
	@Override
	public void print() {
		System.out.println("이름 " + getName());
		System.out.println("가격 " + getPrice());
		System.out.println("사이즈 " + size);
	}// end of print()
}// end of class
