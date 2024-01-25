package abstract1;

public class AnimalMain {

	public static void main(String[] args) {
		// Animal ani = new Animal();	//추상클래스라 객체 생성을 못함 => 메소드가 미완성이라 힙에 객체를 생성할 수 없기 때문에.
		// Cat cat = new Cat();	//추상클래스라 객체 생성을 못함

		Dog dog = new Dog();
		dog.cry();
		dog.count = 1004;
		System.out.println(dog.count);
		
		Animal ani = new Dog();//자식은 부모타입이 될 수 있다.
		ani.cry();
		ani.count = 2000;
		System.out.println(ani.count);
		
	}// end of main

}// end of class
