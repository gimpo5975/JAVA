package interfaceExam;

public class Dog extends Animal {

	// #2. 생성자
	public Dog(String name, int age) {
		super(name, age);
	}// end of Cat()

	// #3. 메소드
	@Override // 부모 클래스의 메소드를 재정의
	public void cry() {
		System.out.println("으르르르릉와오아!");
	}// end of cry()

	@Override // 부모 클래스의 메소드를 재정의
	public void showInfo() {
		System.out.println("자식 클래스입니다");
	}// end of showInfo()

	public void run() {
		System.out.println(getName() + " 개뛴다");
	}// end of run()

}// end of class
