package exceptionexam;

public class ExceptionExam03 {

	// entry point
	public static void main(String[] args) {

		int[] arr = { 10, 20 };

		
		try {
			for (int i = 0; i < arr.length; i++) {
				System.out.println(arr[i]);
				arr[i+1] = i+30;
			} // end of for
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {//예외와 상관없이 반드시 실행
			System.out.println("배열에서 발생할 수 있는 예외 연습");
		}//end of try

		System.out.println("즐거운 시간");
		
	}// end of main

}// end of class
