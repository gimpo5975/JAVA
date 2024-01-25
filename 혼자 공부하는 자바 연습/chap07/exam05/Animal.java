package honggongja.sec07.exam05;

//추상 메소드 선언
public abstract class Animal {// 추상 클래스 선언

	// #1. 필드
	public String kind;

	// #2. 생성자

	// #3. 메소드
	public void breath() {
		System.out.println("숨을 쉰다");
	}// end of breath()

	public abstract void sound();// 추상 메소드

}// end of class
