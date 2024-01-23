package inheritance.exam2;

public class AnimalExam {

	public static void main(String[] args) {
		// #1. 객체생성
//		Animal animal = new Animal();// Animal 객체 생성
//		Cat cat = new Cat("치즈냥", 1, "생선"); // cat 객체 생성
//		Dog dog = new Dog("바둑이"); // dog 객체 생성
//		Bird bird = new Bird("독수리", 3, "도마뱀"); // bird 객체 생성
//
//		cat.cry();
//		cat.jump();
//		System.out.println("*************************************");
//		dog.cry();
//		dog.run();
//		System.out.println("*************************************");
//		bird.cry();
//		bird.fly();

		Animal[] animal = {
				new Dog("바둑이"),
				new Cat("치즈냥", 1, "생선"),
				new Bird("독수리", 3, "도마뱀")
		};
		
		for(int i=0; i<animal.length; i++) {
			animal[i].cry();
		}//end of for
		
	}// end of main

}// end of class
