package bookexam.inheritance;

class Tire {
	void run() {
		System.out.println("일반 타이어가 굴러갑니다");
	}// end of run()
}// end of class

class SnowTire extends Tire {
	@Override
	void run() {
		System.out.println("스노우 타이어가 굴러갑니다");
	}// end of run()
}// end of class

public class SnowExam {

	public static void main(String[] args) {

		SnowTire snowTire = new SnowTire();
		// 자식타입의 객체 부모에 담기
		// 자식은 부모가 될 수 있다.
		Tire tire = snowTire;

		snowTire.run();
		// 부모의 메소드가 자식에서 재정의되면
		// super.run()메소드가 있지 않는한 재정의 된 자식의 메소드를 호출한다
		tire.run();

	}// end of main

}// end of class
