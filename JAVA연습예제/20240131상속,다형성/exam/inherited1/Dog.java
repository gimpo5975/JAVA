package exam.inherited1;

public class Dog extends Animal {

	// #필드

	// #생성자
	public Dog(String name, int age) {
		super(name, age);

	}// end of constructor

	public void showInfo() {
		System.out.println(name + "가 자고 있다.");
	}// end of showInfo()

	@Override
	public void cry() {
		System.out.println(name + "가 멍멍멍멍멍");
	}// end of cry()

	@Override
	public String toString() {
		return "Dog [이름=" + name + ", 나이=" + age + "]";
	}// end of toString()

}// end of class
