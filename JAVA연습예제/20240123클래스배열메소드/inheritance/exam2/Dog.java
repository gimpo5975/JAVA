package inheritance.exam2;

public class Dog extends Animal {// Animal class를 상속받는 Cat class

	// #1. 필드
	String eat = "사료";
	int age = 5;

	// #2. 생성자
	public Dog(String name) {
		super();// 부모의 기본 생성자 호출, 생략 가능
		this.name = name;
	}// end of Cat()

	// #3. 메소드
	public void run() {
		System.out.println(name + "이(가) 초스피드로 달린다.");
	}// end of jump()

	@Override // 재정의, 부모것을 자식이 고쳐서 쓴다.
	public void cry() {
		System.out.println(name + "(이)가 멍멍! 용맹하게 짖느다!!");
		System.out.println(name + "(이)는 " + age + "살이다.");
		System.out.println(name + "(이)가 " + eat + "를 와구와구 먹는다.");
		System.out.println();
	}// end of cry()

}// end of class
