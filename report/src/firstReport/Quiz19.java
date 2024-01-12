package firstReport;

import java.util.Scanner;

public class Quiz19 {

	public static void main(String[] args) {
		// 문19) 이름, 전화번호, 주소를 입력받아서 화면에 출력하는 프로그램 작성

		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();
		System.out.print("전화번호를 입력하세요 : ");
		String phone = sc.nextLine();
		System.out.print("주소를 입력하세요 : ");
		String address = sc.nextLine();
		
		System.out.println("이름: " + name);
		System.out.println("전화번호: " + phone);
		System.out.println("주소: " + address);
		
	}//end of main

}
