package firstReport;

public class Quiz08 {

	public static void main(String[] args) {
		/*
		 * 문2) 숫자가 756이 있습니다. 1의 자리의 값을 버리는 프로그램을 작성하시오. 즉, 결과가 750이 되게 하시오.
		 * 
		 * 1의 자리 버리기 -> 10으로 나누고 나머지는 버리고 곱하기 10
		 */

		int num = 756;
		System.out.println(num-num%10);
		
	}//end of main

}//end of class
