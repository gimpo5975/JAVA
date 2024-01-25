package bookexam.inheritance;

public class Child5 extends Parent5 {
	// #1. 필드
	private String name;

	// #2. 생성자
	public Child5() {
		this("홍길동");
		System.out.println("child() call");
	}// end of Child5()

	public Child5(String name) {
		this.name = name;
		System.out.println("child(String name) call");
	}// end of Child5()

}// end of class
