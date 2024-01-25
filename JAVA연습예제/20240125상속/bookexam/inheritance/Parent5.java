package bookexam.inheritance;

public class Parent5 {
	// #1. 필드
	public String nation;

	// #2. 생성자
	public Parent5() {
		this("대한민국");
		System.out.println("Parent() call");
	}// end of Parent()

	public Parent5(String nation) {
		this.nation = nation;
		System.out.println("Parent(String nation) call");
	}// end of Parent

}// end of class
