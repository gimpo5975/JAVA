package firstReport;

import java.util.Scanner;

public class Quiz17 {

	public static void main(String[] args) {
		// 문17) 정수형 숫자 2개를 입력받아서 다음과 같이 출력하는 프로그램을 작성

		Scanner sc = new Scanner(System.in);
		
		System.out.println("값이 다른 숫자를 두번 입력하세요");
		int num1 = Integer.parseInt(sc.next());
		int num2 = Integer.parseInt(sc.next());
		int result = 0;
		
		if(num1>num2) {
			result = num1;
		}else if(num1<num2) {
			result = num2;
		}//end of if
		System.out.println("첫 번째 숫자는 : " + num1);
		System.out.println("두 번째 숫자는 : " + num2);
		System.out.println("두 수 중 큰값은 " + result + "입니당");
		
	}//end of main

}
