package accessmodifier;

public class StudentMainExam1 {

	public static void main(String[] args) {
		// Student 객체 생성
		Student std = new Student();

		std.name = "김원중";
		std.age = 28;
		std.score = 100;

		System.out.println(std.name);
		System.out.println(std.age);
		System.out.println(std.score);
		System.out.println();
		
		
		
	}// end of main

}// end of class
