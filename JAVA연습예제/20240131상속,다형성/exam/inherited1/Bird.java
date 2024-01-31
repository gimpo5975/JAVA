package exam.inherited1;

public class Bird extends Animal {
	// #필드

	// #생성자
	public Bird(String name, int age) {
		super(name, age);

	}// end of constructor

	@Override
	public void cry() {
		System.out.println(name + "가 삐요용");
	}// end of cry()

}// end of class
