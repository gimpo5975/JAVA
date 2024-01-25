package inheritance.exam1;

public class AnimalExam {

	public static void main(String[] args) {
		// #1. 객체생성
		Animal am = new Animal(); // animal 객체 생성
		Cat cat = new Cat(); // cat객체 생성
		Dog dog = new Dog(); // dog객체 생성
		Bird bird = new Bird(); // bird객체 생성

		// #2. 객체를 이용
		am.name = "동물들";
		am.age = 5;

		am.cry();
		System.out.println("*************************************");

		cat.name = "치즈냥";
		cat.age = 1;
		cat.cry();
		cat.jump();
		System.out.println("*************************************");

		dog.name = "바둑이";
		dog.age = 2;
		dog.cry();
		dog.run();

		System.out.println("*************************************");

		bird.name = "파닭이";
		bird.age = 3;
		bird.cry();
		bird.fly();

	}// end of main

}// end of class
