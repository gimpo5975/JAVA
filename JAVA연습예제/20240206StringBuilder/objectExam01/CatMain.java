package objectExam01;

public class CatMain {

	// entry point
	public static void main(String[] args) {

		Cat cat = new Cat("야옹이");
		Cat cat2 = new Cat("야옹이");
		String name = "김원중";
		String name2 = new String("김원중");
		String name3 = new String("김원중");

		System.out.println(cat == cat2);// false
		System.out.println(cat);// 주소
		System.out.println(cat2);// 주소
		System.out.println(cat.equals(cat2));// false

		System.out.println("=====================================");

		System.out.println(name == name2);// false
		System.out.println(name);// 김원중
		System.out.println(name2);// 김원중
		System.out.println(name.equals(name2));// true, 내용 비교
		System.out.println(name2.equals(name3));// true, 내용 비교

		System.out.println("=====================================");

		Dog dog = new Dog("바둑이");
		Dog dog2 = new Dog("바둑이");

		System.out.println(dog == dog2);//false
		System.out.println(dog);//Dog 클래스에서 toString을 재정의해서 이름을 반환함.
		System.out.println(dog2);
		System.out.println(dog.equals(dog2));//false

	}// end of main

}// end of class
