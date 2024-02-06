package practice2024_02_06;

import java.util.Scanner;

//3. 숫자를 매개값을 넘겨 받아 그 숫자만큼 문자을 출력하는 프로그램을 작성
//예) 숫자 : 3
//안녕!
//안녕!
//안녕!
public class PrintsByNum {

	private static Scanner sc = new Scanner(System.in);

	// entry point
	public static void main(String[] args) {

		// 입력받기 위한 안내문구
		System.out.println("원하시는 문장을 원하시는 만큼 출력해드립니다!! 마음껏 입력하세요!");
		System.out.print("원하는 문장 입력하기 >> ");
		// 출력을 원하는 문장을 입력받아 str 변수에 저장
		String str = sc.nextLine();
		System.out.print("원하는 출력횟수 입력 >> ");
		// 원하는 출력횟수를 입력받아 repeat 변수에 저장
		int repeat = Integer.parseInt(sc.nextLine());
		
		//출력해주는 메소드 호출
		print(repeat, str);

	}// end of main

	//원하는 문장과 횟수가 매개변수에 담겨져서 넘어와 출력해주는 메소드
	public static void print(int repeat, String str) {
		for (int i = 0; i < repeat; i++) {
			System.out.println(str);
		} // end of for
	}// end of print

}// end of class
