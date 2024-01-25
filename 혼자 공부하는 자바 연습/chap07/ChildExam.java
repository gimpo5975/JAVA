package honggongja.sec07;

public class ChildExam {

	public static void main(String[] args) {
		// 자식 클래스 객체 생성
		Child child = new Child();

		// 부모타입으로 자동타입변환
		Parent parent = child;

		// 부모클래스의 메소드
		parent.method1();
		// 자식클래스에서 재정의 된 메소드
		parent.method2();
		// 부모타입로 자동타입 변환을 하면 자식클래스로 접근 불가.
		// parent.method3();

	}// end of main

}// end of class
