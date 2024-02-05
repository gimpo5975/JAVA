package exceptionexam;

public class ExceptionExam05 {

	// entry point
	public static void main(String[] args) {

		// 직접 처리하는 경우
		showA();
	}// end of main

	static void showA() {
		try {
			System.out.println("안녕~~~");
			Thread.sleep(2000);// 2초간 실행을 멈춤
			System.out.println("즐거운 시간");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // end of try
	}// end of showA

}// end of class
