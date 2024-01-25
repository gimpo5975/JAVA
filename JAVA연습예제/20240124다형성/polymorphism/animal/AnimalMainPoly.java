package polymorphism.animal;

public class AnimalMainPoly {

	public static void main(String[] args) {

//		Animal animal = new Animal();
//		Cat cat = new Cat("치즈냥", 1);
//		Dog dog = new Dog("누렁이", 3);
//		Bird bird = new Bird("수리수리독수리", 3);
//
//		animal.cry();
//		cat.cry();
//		dog.cry();
//		bird.cry();

		// ********************************************************************

		// 배열은 같은 타입의 자료를 저장하는 공간
		Animal[] aniArry = { // 자식은 부모타입에 담을 수 있다. 부모는 자식 타입에 담을 수 없다.
				new Animal(), new Cat("치즈냥", 1), new Dog("누렁이", 3), new Bird("수리수리독수리", 3) };

		// 출력하기
		for (int i = 0; i < aniArry.length; i++) {
			aniArry[i].cry();
		} // end of for

		System.out.println("*******************************");
		// aniArry.showInfo();
		// 에러 : aniArry는 부모타입이고 showInfo()메소드는 자식에 있기에 실핼할 수 없음
		// 자식이 부모타입을 이미 타입변환을 한 상태라 부모것만 사용할 수 있음
		// 단 오버라이딩 된 메소드는 자식것을 사용

		// 자식 => 부모 => 자식
		// 부모가 자식이 될 수 있는지 검토 : instanceOf
		// 객체 instanceOf 타입 => 타입변환이 가능하면 true, 불가능하면 false
		// 자식타입 참조변수 = (자식타입)부모타입;

		// java12버전 부터
		// 객체 instanceOf 자식타입 참조변수;

		// Cat의 자료를 사용하기 위한 작업
		// 현재는 Cat 부모타입으로 타입변환되어 있어서
		// 순수Cat의 메소드와 필드를 사용할 수 없는 상태
		// Cat만이 가지고있는 메소드와 필드, 부모의 메소드와 필드를 사용하고 싶을 때

		// #1. 방법 1
		if (aniArry[1] instanceof Cat) {
			Cat cat = (Cat) aniArry[1]; // 강제 타이변환, down casting
			cat.showInfo();
		} else {
			System.out.println("형변환 불가");
		} // end of if

		// #2. 방법2.
		if (aniArry[1] instanceof Cat cat) {
			cat.showInfo();
			System.out.println();
		} else {
			System.out.println("타입변환 불가");
		} // end of if

	}// end of main

}// end of class
