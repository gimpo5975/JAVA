package array3_2;

public class MemoryExam01 {

	public static void main(String[] args) {
		int a = 3;
		String name = new String("홍길동"); // 질문: 왜 주소가 안나오고 문자열이 저장되었는가?
		int[] score = { 10, 20, 30 };

		String irum = null;
		int[] jumsu = null;
		int b = 0;

		System.out.println("a => " + a);
		System.out.println("name => " + name);
		System.out.println("score => " + score);
		System.out.println("***************************");

		irum = name;
		jumsu = score;
		b = a;
		System.out.println("b => " + b);
		System.out.println("irum => " + irum);
		System.out.println("jumsu => " + jumsu);
		
		name = "김원중";
		System.out.println("name => " + name);
		System.out.println("irum => " + irum);
		
		irum = "한사랑";
		System.out.println("name => " + name);
		System.out.println("irum => " + irum);
	}// end of main

}// end of class
