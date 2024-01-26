package interfaceExam;

public abstract class Animal {

	// #1. 필드 => 인스턴스 필드
	private String name;
	private int age;

	// #2. 생성자
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}// end of Animal()

	// getter
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	// setter
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	// #3. 메소드
	// 완성 메소드 => 완성 메소드, 바디가 있다
	public void showInfo() {
		System.out.println("추상 클래스입니다");
	}// end of showInfo()

	public void print() {
		System.out.println("안녕하세요");
	}// end of print()

	// 추상 메소드 => 미완성 메소드, 바디가 없다
	public abstract void cry();

}// end of class
