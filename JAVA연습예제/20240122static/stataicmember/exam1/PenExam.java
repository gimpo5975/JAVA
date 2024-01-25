package stataicmember.exam1;

public class PenExam {

	public static void main(String[] args) {
		// #1. pen객체 생성
		Pen red = new Pen("red");
		Pen green = new Pen("green");
		Pen red2 = new Pen("RED");
		Pen blue = new Pen("blue");
		Pen red3 = new Pen("Red");

		System.out.println(red3.getCount());
		System.out.println(red3.getAllCount());
		
	}// end of main

}// end of class
