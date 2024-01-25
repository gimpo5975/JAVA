package practice;

public class Item {
	// #1.필드 => 외부에 노출하지 않으려고 캡슐화 함
	private String name;
	private int price;

	// #2. 생성자 => 생성자를 통해 가격과 이름을 초기화 시키기
	// 상속을 시킬 부모이기에 자식에서 생성자를 호출하면서 name, price 넘겨 받을 수 있도록 처리
	// 자식 super(name, price)
	public Item(String name, int price) {
		this.name = name;
		this.price = price;
	}// end of Item()

	// #3. getter => private으로 설정된 필드의 값을 읽어 외부에 전달
	// private은 자신의 클래스 내에서는 자유롭게 사용하지만 외부에서는 사용할 수 없다
	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	// #4. 메소드 => 전체가 아닌 부모인 Item이 가진 필드만 출력할 수 있는 프린트 메소드
	public void printInfo() {
		System.out.println("이름 : " + name);// this.name
		System.out.println("가격 : " + price);// this.price
	}// end of printInfo()

}// end of class
