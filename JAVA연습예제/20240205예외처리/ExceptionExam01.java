package exceptionexam;

public class ExceptionExam01 {

	// entry point
	public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
		int a = 5;
		int b = 0;
		int[] arr = { 10, 20 };
		int[] test;
		String arrTest = null; // 아직 참조하는 객체가 없다.

		// System.out.println(a / b);

		// for (int i = 0; i < arr.length; i++) {//실행 예외 RuntimeException
		// System.out.println(arr[i]);
		// arr[i + 1] = i + 30;
		//
		// } // end of for

		// for (int i = 0; i < test.length; i++) { //일반예외 - 컴파일전에 확인가능
		// test[i] = i + 20;
		// System.out.println(test[i]);
		// }

		// System.out.println(arrTest.toString());// java.lang.NullPointerException

	}// end of main

}// end of class
