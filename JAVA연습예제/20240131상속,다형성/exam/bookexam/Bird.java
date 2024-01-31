package exam.bookexam;

public class Bird implements Countable {

	// #필드
	String name;

	// #생성자
	public Bird(String name) {
		super();
		this.name = name;
	}// end of constructor

	// #메소드
	void fly() {
		System.out.println("2마리 "+name+"가 날아간다.");
	}// end of fly

	@Override
	public void count() {
		System.out.println(name+"가 2마리 있다.");

	}

}// end of class
