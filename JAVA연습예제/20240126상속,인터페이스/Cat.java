package interfaceExam;

public class Cat extends Animal {

	// #2. 생성자
	public Cat(String name, int age) {
		super(name, age);
	}// end of Cat()

	// #3. 메소드
	@Override // 부모 클래스의 메소드를 재정의
	public void cry() {
		System.out.println("으아앙아앙냐옹");
	}// end of cry()

	@Override
	public void showInfo() {
		System.out.println("자식 클래스입니다");
	}// end of showInfo()
}// end of class
