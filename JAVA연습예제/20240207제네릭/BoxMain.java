package genericExam;

public class BoxMain {

	public static void main(String[] args) {

		Box box = new Box();

		box.set("김원중");
		System.out.println(box.get());
		if (box.get() instanceof String str) {
			System.out.println("문자열로 변환 가능");
		}

		box.set(50);
		System.out.println(box.get());
		if (box.get() instanceof Integer it) {
			System.out.println("정수타입으로 변환 가능");
		}

		box.set(new Apple());
		System.out.println(box.get());
		if (box.get() instanceof Apple apple) {
			apple.showApple();
		}

		box.set(new Cat());
		System.out.println(box.get());
		if (box.get() instanceof Cat cat) {
			cat.show();
		}

	}// end of main

}// end of class
