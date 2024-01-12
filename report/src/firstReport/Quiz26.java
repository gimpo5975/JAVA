package firstReport;

import java.util.Scanner;

public class Quiz26 {

	public static void main(String[] args) {
		/*
		 * 문5) 숫자를 입력 받고, 입력 받은 숫자가 3과 같지 않으면 " 입력한 숫자는 '3'이 아닙니다. 입력한 숫자는 ~~ 입니다. " 로
		 * 출력하는 프로그램 작성
		 */

		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();
		
		if(num != 3) {
			System.out.println("입력한 숫자는 \'3\'이 아닙니다. 입력한 숫자는 " + num + "입니다");
		}
		
	}//end of main

}
