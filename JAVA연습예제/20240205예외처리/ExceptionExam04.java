package exceptionexam;

public class ExceptionExam04 {

	// entry point
	public static void main(String[] args) {

		int a = 10;
		int b = 0;
		int[] arr = { 10, 20 };
		String arrTest = null;

		try {
			// ArithmeticException
			System.out.println(a / b);

			// ArrayIndexOutOfBoundsException
			for (int i = 0; i < arr.length; i++) {
				System.out.println(arr[i]);
				arr[i + 1] = i + 30;
			} // end of for

			// NullPointerException
			System.out.println(arrTest.toString());

		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없음");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 공간이 부족함");
		} catch (NullPointerException e) {
			System.out.println("참조되는 곳이 없음 ");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}//end of try

		System.out.println("하윙");
		
	}// end of main

}// end of class
