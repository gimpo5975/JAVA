package exam.student;

public class StudentMain {

	public static void main(String[] args) {

		// #객체 생성
		Student kwj = new Student("22011050", "김원중");
		Student kdb = new Student("22011051", "김덕배");

		// #생성된 객체의 배열에 과목과 과목점수 넘겨주기
		kwj.subject = new Subject[] { new Subject("java", 100), new Subject("sql", 98), new Subject("jsp", 99) };
		kdb.subject = new Subject[] { new Subject("java", 88), new Subject("sql", 77), new Subject("jsp", 66) };

		// 과목의 합계와 평균 출력
		kwj.showInfo();
		kdb.showInfo();
		System.out.println("**********************");

		// 과목별 점수
		kwj.checkScore();
		kdb.checkScore();

	}// end of main

}// end of class
