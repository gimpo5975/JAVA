package interfaceExam.quiz;

public class Computer implements Controllable {

	@Override
	public void turnOn() {
		System.out.println("Computer를 켠다");

	}

	@Override
	public void turnOff() {
		System.out.println("Computer를 끈다");

	}

	@Override
	public void repair() {
		System.out.println("메모리의 부품에 이상이 있습니다.");
		System.out.println("공장에 보내 수리가 필요합니다.");
	}// end of repair()

}// end of class
