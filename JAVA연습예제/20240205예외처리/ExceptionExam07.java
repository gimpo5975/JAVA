package exceptionexam;

public class ExceptionExam07 {

	// entry point
	public static void main(String[] args) throws ClassNotFoundException {//jvm한테 전가

		findClass();
	}// end of main

	static void findClass() throws ClassNotFoundException {// 예외를 떠넘기기
		Class c = Class.forName("java.lang.String2");
	}// end of showA

}// end of class
