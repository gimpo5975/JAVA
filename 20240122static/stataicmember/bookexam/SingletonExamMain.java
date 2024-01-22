package stataicmember.bookexam;

public class SingletonExamMain {

	public static void main(String[] args) {
		// 에러 => 생성자가 private으로 선언되어서 외부에서 객체를 생성할 수 없다.
		// SingltonExam sg = new SingltonExam();

		SingltonExam sg = SingltonExam.getInstance();
		SingltonExam sg2 = SingltonExam.getInstance();

		if (sg == sg2) {
			System.out.println("같은 객체");
		} else {
			System.out.println("다른 객체");
		} // end of if

	}// end of main

}// end of class
