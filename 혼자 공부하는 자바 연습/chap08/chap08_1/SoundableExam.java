package chap08_1;

public class SoundableExam {

	// 인터페이스 변수를 매개값으로 가져 변수의 sound90메소드를 실행하는 메소드
	private static void printSound(Soundable soundable) {
		System.out.println(soundable.sound());
	}// end of printSound

	public static void main(String[] args) {

		// 메소드의 매개변수로 구현객체 대입
		printSound(new Cat());
		printSound(new Dog());

	}// end of main

}// end of class
