package class2;

public class Student2Exam {

	public static void main(String[] args) {
		// #1. 객체생성
		Student2 kwj = new Student2("김원중", 28, 100);
		Student2 lbr = new Student2("르브론", 43, 99);

		// 2-1. 김원중 자료 출력
		System.out.println("이름 : " + kwj.name);
		System.out.println("나이 : " + kwj.age);
		System.out.println("점수 : " + kwj.score);

		System.out.println();

		// 2-2. 르브론 자료 출력
		System.out.println("이름 : " + lbr.name);
		System.out.println("나이 : " + lbr.age);
		System.out.println("점수 : " + lbr.score);

		
	}// end of main

}// end of class
