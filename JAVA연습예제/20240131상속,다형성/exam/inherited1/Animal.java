package exam.inherited1;

public abstract class Animal {// 추상 클래스

//	void cry() {	//일반 메소드
//		System.out.println("동물의 울음 소리");
//	}//end of cry()

	// #필드
	String name;
	int age;

	// #생성자
	public Animal(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}// end of constructor

	// 일반 메소드
	public void show() {
		System.out.println("부모의 것 ");
	}// end of constructor

	public abstract void cry();// 추상 메소드

}// end of class
