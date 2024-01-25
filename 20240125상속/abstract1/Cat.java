package abstract1;

public abstract class Cat extends Animal {

	// #1. 필드
	String name;

	// #2. 생성자
	public Cat(String name) {
		this.name = name;
	}

	// #3. 메소드
	public void showInfo() {
		System.out.println("치즈냥이입니다옹~");
	}// end of showInfo()

}// end of class
