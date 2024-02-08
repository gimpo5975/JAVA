package fourthReport;

import java.util.Scanner;

//3. 숫자를 매개값을 넘겨 받아 그 숫자만큼 문자을 출력하는 프로그램을 작성
//예) 숫자 : 3
//	안녕!
//	안녕!
//	안녕!
public class PrintForNum {

	private static Scanner sc = new Scanner(System.in);

	// entry point
	public static void main(String[] args) {
		// 프린트 메소드 호출
		showPrint();
	}// end of main

	// 원하는 출력 횟수와 문구를 입력 받아 결과를 띄우는 메소드
	public static void showPrint() {
		System.out.println("원하는 출력 횟수와 문구를 입력해주세용");
		System.out.print("출력 횟수 입력 >> ");
		int num = Integer.parseInt(sc.nextLine());
		System.out.print("출력 문구 입력 >> ");
		String str = sc.nextLine();

		print(num, str);
	}// end of showPrint

	// 원하는 출력 횟수와 문구를 출력해주는 메소드
	public static void print(int num, String str) {
		for (int i = 0; i < num; i++) {
			System.out.println(str);
		} // end of for
	}// end of print

}// end of class
