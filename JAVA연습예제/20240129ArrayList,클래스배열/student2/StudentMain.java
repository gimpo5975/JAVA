package exam.student2;

public class StudentMain {

	public static void main(String[] args) {

		// 객체생성
		Student kwj = new Student("22011050", "김원중", 3);

		kwj.addSubject("국어", 100);
		kwj.addSubject("수학", 99);
		kwj.addSubject("영어", 100);

		kwj.showInfo();
		kwj.checkScore();
		
	}// end of main

}// end of class
