package abstract1;

public abstract class Animal {

	// #1. 필드
	int count;

	// #2. 생성자
	public Animal() {
	}

	public Animal(int count) {
		this.count = count;
	}

	// #3. 일반 메소드
	public void info() {
		System.out.println(count + "번 접속");
	}// end of info()

	public void show() {
	}// end of show() => 완성 메소드

	// #4. 추상 메소드 => 미완성 메소드, 메소드의 body가 없는 것
	// public void cry(){} => 완성메소드, 중괄호({})가 있으면 내용이 없어도 완성 메소드
	//[접근제한자] abstract 리턴타입 메소드명(매개변수,...);
	public abstract void cry();//추상 메소드, 미완성 메소드
	
}// end of class
