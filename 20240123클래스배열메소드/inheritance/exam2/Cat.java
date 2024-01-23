package inheritance.exam2;

public class Cat extends Animal {//Animal class를 상속받는 Cat class

	// #1. 필드
	String eat;

	// #2. 생성자
	public Cat(String name, int age, String eat) {
		super();//부모의 기본 생성자 호출, 생략 가능
		this.name = name;
		this.age = age;
		this.eat = eat;
	}// end of Cat()

	// #3. 메소드
	public void jump() {
		System.out.println(name + "이(가) 껑충 뛴다.");
	}// end of jump()

	@Override // 재정의, 부모것을 자식이 고쳐서 쓴다.
	public void cry() {
		System.out.println(name + "(이)가 냐옹냐옹 운다ㅠㅠ");
		System.out.println(name + "(이)는 " + age + "짤이다.");
		System.out.println(name + "(이)가 " + eat + "를 냠냠 먹는다.");
		System.out.println();
	}// end of cry()

}// end of class
