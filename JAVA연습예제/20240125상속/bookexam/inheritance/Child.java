package bookexam.inheritance;

public class Child extends Parent5 {
	// #1. 필드
	private int studentNum;

	// #2. 생성자
	public Child(String name, int studentNum) {
		// super(); =>부모의 기본생성자 호출, 생략
		// 컴파일 에러 업래는법 : 부모생성자 호출을 부모 클래스에 있는 생성자를 보고 만들어 준다
		// 부모 클래스에는 매개변수를 하나 가진 생성자가 있다, 따라서 자식도 매개값 하나를 전달하는 super()를 호출한다

		super(name);
		this.studentNum = studentNum;
	}// end of Child()

}// end of class
