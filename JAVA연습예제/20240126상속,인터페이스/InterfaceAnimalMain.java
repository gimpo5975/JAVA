package interfaceExam;

public class InterfaceAnimalMain {

	public static void main(String[] args) {

		// 미완성이라 객체 생성불가
		// InterfaceAnimal ani = new InterfaceAnimal();

		// 인터페이스타입 자식 객체 생성
		InterfaceAnimal cat = new InterfaceCat();
		InterfaceAnimal dog = new InterfaceDog();

		// 인터페이스타입 배열에 자식객체 담기 => 자식이 부모에 담긴다
		InterfaceAnimal[] aniArr = { cat, dog };

		// 향상된 for문으로 메소드 출력
		for (InterfaceAnimal ani : aniArr) {
			ani.cry();
			ani.run();
		} // end of for

	}// end of main

}// end of class
