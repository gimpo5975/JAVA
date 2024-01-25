package abstract1;

public class AnimalMainChild {

	public static void main(String[] args) {

		Dog dog = new Dog();
		Animal ani = new Dog();// 자식은 부모타입이 될 수 있다.

		// Animal ani = new Animal() => 컴파일 에러, 미완성 클래스이기 때문에

		// Cat cat = new Cat("흰색"); => 컴파일 에러, 미완성 클래스이기 때문에

		CatChild catchild = new CatChild("냥냥");

		Animal aniChilde = new CatChild("뇽뇽");
		Cat catChild = new CatChild("야옹");

		// 타입변환 검사는 필수
		// 조상조상이 자손으로 타입변환
		if (aniChilde instanceof CatChild cat) {
			System.out.println("타입변환 가능");
		} else {
			System.out.println("타입변환 불가능");
		}

		if (aniChilde instanceof CatChild) {
			CatChild ccat = (CatChild) aniChilde;
			System.out.println("타입변환 가능");
		} else {
			System.out.println("타입변환 불가능");
		}

		// 조상이 자손으로 타입변환
		if (catChild instanceof CatChild catt) {
			System.out.println("타입변환 가능");
		} else {
			System.out.println("타입변환 불가능");
		}

		if (aniChilde instanceof CatChild) {
			CatChild caat = (CatChild) aniChilde;
			System.out.println("타입변환 가능");
		} else {
			System.out.println("타입변환 불가능");
		}

		//자식객체를 생성해서 부모타입으로 자동타입변환 후 부모타입 배열에 저장
		Animal[] aniArray = { new Dog(), new CatChild("냐옹") };
		//부모타입 배열에서 원하는 자식객체를 뽑아서 자식타입으로 강제타입변환
		CatChild cc = (CatChild) aniArray[1];

	}// end of main

}// end of class
