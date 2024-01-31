package exam.inherited1;

public class Cat extends Animal {

	// #필드

	// #생성자
	public Cat(String name, int age) {
		super(name, age);

	}// end of constructor

	@Override
	public void cry() {
		System.out.println(name + "가 냐옹 냐옹");
	}// end of cry()

	@Override
	public String toString() {
		return "Cat [이름=" + name + ", 나이=" + age + "]";
	}

}// end of class
