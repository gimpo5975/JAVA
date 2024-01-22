package stataicmember.exam1;

public class StaticPenExam2 {

	public static void main(String[] args) {
		// #1. pen객체 생성
		PenStatic red = new PenStatic("red");
		PenStatic green = new PenStatic("green");
		PenStatic red2 = new PenStatic("RED");
		PenStatic blue = new PenStatic("blue");
		PenStatic red3 = new PenStatic("Red");

		// static 필드 호출 : 클래스명.필드명
		System.out.println(PenStatic.count);

		// static 메소드 호출 : 클래스명.메소드명()
		System.out.println(PenStatic.getCount());
		System.out.println(PenStatic.getAllCount());

	}// end of main

}// end of class
