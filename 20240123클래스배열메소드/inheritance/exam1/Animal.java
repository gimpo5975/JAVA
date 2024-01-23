package inheritance.exam1;

public class Animal {
	// #1. 필드 생성
	String name;// 동물의 이름
	int age;// 동물의 나이

	// #2. 생성자 => 객체 초기화
	public Animal() {

	}

	// #3. 메소드 => 기능, 동작
	public void cry() {
		System.out.println(name + "(이)가 소리를 낸다");
		System.out.println(name + "(이)는 " + age + "살이다.");
		System.out.println();
	}// end of cry()

}// end of class
