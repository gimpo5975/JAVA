package thirdReport;

public class Item {

	// #필드
	private String name;
	private int price;

	// #생성자
	public Item(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	// getter

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	// #메소드
	public void print() {
		System.out.println("이름 " + name);
		System.out.println("가격 " + price);
	}// end of print()

}// end of interface
