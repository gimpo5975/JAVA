package thirdReport;

public interface Controllable {

	void turnOn();

	void turnOff();

	// 처음부터 미리 구현해 놓아야 한다. default, static
	default void repair() { // 자식이 오버라이딩(=재정의 할 수 있음)
		System.out.println("제품을 공장에 보내서 수리해야합니다");
	}// end of repair()

	static void reset() {
		System.out.println("제품을 초기화 시킵니다.");
	}// end of reset()
}// end of interface
