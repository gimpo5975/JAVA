package exam.student3;

public class StudentArrayListMain {

	public static void main(String[] args) {

		// #객체 생성
		Student kwj = new Student("22011050", "김원중");

		kwj.addSubject("국어", 98);
		kwj.addSubject("영어", 97);
		kwj.addSubject("수학", 97);

		kwj.showInfo();
		kwj.checkScore();

		System.out.println("**************************************");

		Student kdb = new Student("22011051", "김덕배");

		kdb.addSubject("국어", 88);
		kdb.addSubject("영어", 87);
		kdb.addSubject("수학", 87);

		kdb.showInfo();
		kdb.checkScore();
	}// end of main

}// end of class
