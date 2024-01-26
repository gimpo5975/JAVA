package interfaceExam;

public class AnimalMain {

	public static void main(String[] args) {

		// 객체 생성
		Cat cat = new Cat("냥냥", 1);
		Dog dog = new Dog("장군이", 3);

		// 메소드 호출
		cat.cry();
		dog.cry();
		dog.run();
		dog.showInfo();

		// 부모타입 배열에 자식 객체들 담기
		Animal[] aniArr = { cat, dog };

		// 부모타입 자식객체의 부모타입 메소드 선언 하지만, 재정의 된 자식객체의 메소드 호출
		aniArr[0].showInfo();
		// 부모타입 자식객체의 부모타입 메소드 선언
		aniArr[0].print();

		// 향상된 for문
		System.out.println("***향상된 for문 출력***");
		for (Animal aniArray : aniArr) {
			aniArray.cry();
		} // end of for

		System.out.println("***********************");

		// 부모타입이 된 자식객체의 다시 자식타입으로의 강제타입 변환
		if (aniArr[0] instanceof Cat cat2) {
			// name 변경
			cat2.setName("솜털이");
			System.out.println("다시 자식타입으로 강제 타입변환");
			// 변경된 name 출력
			System.out.println(cat2.getName());
			cat2.showInfo();
			// 자식타입 객체의 부모 메소드 호출
			cat2.print();
		} else {// 강제 타입 변환이 안된 경우
			System.out.println("자식타입으로 강제 타입변환 불가능");
		} // end of if

		System.out.println("***********************");

	}// end of main

}// end of class
