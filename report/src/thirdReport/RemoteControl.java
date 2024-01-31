package thirdReport;

public interface RemoteControl {//역할 설정, 완성이아님, 리모컨 역할

	// 상수 초기화
	int MAX_VOLUME = 10;// = public static final int MAX_VOLUME = 10;
	int MIN_VOLIME = 0;// = public static final int MIN_VOLIME = 0;

	// 인터페이스는 생성자 사용 불가

	// 추상메소드
	void turnOn();// {}(바디)가 없으므로 추상메소드. 즉, 미완성 메소드

	void turnOff();// {}(바디)가 없으므로 추상메소드. 즉, 미완성 메소드

	void setVolume(int volume);// {}(바디)가 없으므로 추상메소드. 즉, 미완성 메소드

}// end of interface
