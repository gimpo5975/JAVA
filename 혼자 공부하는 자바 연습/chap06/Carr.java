package honggongja.sec06;
	
public class Carr {
	//인스턴스 멤버와 this
	// 필드
	String model;
	int speed;

	// 생성자
	Carr(String model) {
		this.model = model;
	}// end of Carr

	// 메소드
	void setSpeed(int speed) {
		this.speed = speed;
	}// end of setSpeed()

	void run() {
		for (int i = 10; i <= 100; i += 10) {
			this.setSpeed(i);
			System.out.println(this.model + "가 달립니다.(시속: " + this.speed + "km/h)");
		} // end of for
	}// end of run()

}// end of class
