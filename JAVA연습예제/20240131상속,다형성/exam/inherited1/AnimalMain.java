package exam.inherited1;

public class AnimalMain {

	public static void main(String[] args) {

		Dog dog = new Dog("바둑이", 7);
		Cat cat = new Cat("야옹이", 1);

		dog.cry();
		dog.showInfo();
		System.out.println(dog);// print, println은 참조변수를 주면 toString()을 호출한다

		System.out.println("=======================");

		cat.cry();
		System.out.println(cat);// print, println은 참조변수를 주면 toString()을 호출한다

	}// end of main

}// end of class
