package exam.inherited1;

public class AnimalMainPolymorphism {

	public static void main(String[] args) {
		Animal[] animal = { new Dog("바둑이", 4), new Cat("야옹이", 1), new Bird("독수리", 1) };

		for (int i = 0; i < animal.length; i++) {
			animal[i].cry();

			if (animal[i] instanceof Dog dog) {
				System.out.println("이름 : " + dog.name);
			} else if (animal[i] instanceof Cat cat) {
				System.out.println("이름 : " + cat.name);

			} else if (animal[i] instanceof Bird bird) {
				System.out.println("이름 : " + bird.name);

			} // end of if

		} // end of for

	}// end of main

}// end of class
