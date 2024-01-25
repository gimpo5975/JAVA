package class2;

public class StudentExam {

	public static void main(String[] args) {
		// #1. Student 객체생성

		// 1-1. 김원중 객체생성
		Student wj = new Student();
		wj.name = "김원중";
		wj.age = 28;
		wj.score = 100;

		// 1-2. 르브론 객체생성
		Student lb = new Student();
		lb.name = "르브론 제임스";
		lb.age = 43;
		lb.score = 99;

		// #2. 출력

		// 2-1. 김원중 자료 출력
		System.out.println("이름 : " + wj.name);
		System.out.println("나이 : " + wj.age);
		System.out.println("점수 : " + wj.score);
		
		System.out.println();
		
		// 2-2. 르브론 자료 출력
		System.out.println("이름 : " + lb.name);
		System.out.println("나이 : " + lb.age);
		System.out.println("점수 : " + lb.score);

	}// end of main

}// end of class
