package polymorphism.animal;

public class Dog extends Animal{

	String name;
	int age;

	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
	}// end of Cat()

	public void showInfo() {
		System.out.println(name + "의 나이는 " + age + "살");
	}// end of showInfo()

	@Override//어노테이션 재정의(overriding)
	//오버라이딩, 부모의 메소드를 상속받아 자식이 자기에 맞게 고쳐 쓰는 것
	public void cry() {
		System.out.println("갈갈!!!");
	}// end of cry()

}// end of class
