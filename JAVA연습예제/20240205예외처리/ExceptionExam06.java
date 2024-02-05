package exceptionexam;

public class ExceptionExam06 {

	// entry point
	public static void main(String[] args) {

		// 전가 받아서 처리
		try {
			showA();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} // end of try
		
	}// end of main

	static void showA() throws InterruptedException {// 예외를 떠넘기기
		System.out.println("안녕~~~");
		Thread.sleep(2000);// 2초간 실행을 멈춤
		System.out.println("즐거운 시간");
	}// end of showA

}// end of class
