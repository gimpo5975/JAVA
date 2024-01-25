package honggongja.sec07.exam05;

public class AnimalExam {

	public static void main(String[] args) {

		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.sound();
		cat.sound();
		System.out.println("****************");

		// 변수의 자동 타입 변환
		Animal animal = null;

		// 자동타입 변환 및 재정의된 메소드 호출
		animal = new Dog();
		animal.sound();

		// 자동타입 변환 및 재정의된 메소드 호출
		animal = new Cat();
		animal.sound();
		System.out.println("****************");

		// 메소드의 다형성
		animalSound(new Dog());
		animalSound(new Cat());
		
	}// end of main

	public static void animalSound(Animal animal) {
		animal.sound();
	}// end of animalSound

}// end of class
