package stataicmember.exam1;

public class Car {
	// #1. 필드
	String model;
	int speed;// Integer speed;

	// #2. 생성자 => 클래스 이름과 같은
	public Car() {
	}

	public Car(String model) {
		this.model = model;

	}// end of Car()

	// #3. 메소드
	private void setSpeed(int speed) {
		this.speed = speed;
	}// end of setSpeed()

	public void run() {
		for (int i = 10; i <= 50; i++) {
			this.setSpeed(i);// setSpeed() 메소드 호출해서 매개값으로 i 넘겨 줌.
			System.out.println(this.model + "가 달립니다.(시속 : " + this.speed + "km/h)");
		} // end of for
	}// end of run()
}// end of class
