package firstReport;

import java.util.Scanner;

public class Quiz16 {

	public static void main(String[] args) {
		// 문16) 정수형 숫자를 두번 입력받아서 출력하는 프로그램을 작성

		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 두번 입력하세여");
		int num1 = Integer.parseInt(sc.next());
		int num2 = Integer.parseInt(sc.next());
		
		System.out.printf("첫 번째 숫자 : %d\n두번째 숫자: %d",num1,num2);
	}// end of main

}// end of class
