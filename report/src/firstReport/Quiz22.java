package firstReport;

import java.util.Scanner;

public class Quiz22 {

	public static void main(String[] args) {
		// 문22) 숫자를 입력받아 숫자가 홀수이면 숫자의 2배의 값을 출력하시오.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 입력하세여");
		int num = sc.nextInt();
		
		if(num%2 == 1) {
			num*=2;
		}
		
		System.out.println(num);
	}// end of main

}
