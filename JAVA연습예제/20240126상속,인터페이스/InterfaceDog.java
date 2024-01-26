package interfaceExam;

public class InterfaceDog implements InterfaceAnimal {

	// #3. 메소드
	@Override // 부모 클래스의 메소드를 재정의
	public void cry() {
		System.out.println("으르르렁");
	}// end of cry()

	@Override
	public void run() {
		System.out.println("밟라발발바발");
	}// end of showInfo()

}// end of class
