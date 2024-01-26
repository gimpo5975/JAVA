package interfaceExam;

public class InterfaceCat implements InterfaceAnimal {

	// #3. 메소드
	@Override // 부모 클래스의 메소드를 재정의
	public void cry() {
		System.out.println("냐옹");
	}// end of cry()

	@Override
	public void run() {
		System.out.println("껑충껑충");
	}// end of showInfo()
}// end of class
