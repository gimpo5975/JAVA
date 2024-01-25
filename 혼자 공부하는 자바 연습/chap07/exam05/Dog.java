package honggongja.sec07.exam05;

public class Dog extends Animal {

	// #1. 필드

	// #2. 생성자
	public Dog() {
		this.kind = "포유류";
	}// end of Dog()

	// #3. 메소드
	// 추상 메소드 재정의
	@Override
	public void sound() {
		System.out.println("왈왈!!");
	}// end of sound()

}// end of class
