package interfaceExam.Quiz01;

public class Bird implements Countable {

	// #필드
	String name;
	int num;

	// #생성자
	public Bird(String name, int num) {
		super();
		this.name = name;
		this.num = num;
	}// end of constructor

	public void fly() {
		System.out.println(num+"마리 "+name+"가 날아간다.");
	}// end of fly

	@Override
	public void count() {
		System.out.println(num+"마리 "+name+"가 있다.");
	}// end of count

}// end of class
