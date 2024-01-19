package secondReport;

import java.util.Scanner;
//다음과 같이 출력되도록 프로그램을 작성하시오.
//출력형태 1)  
//숫자를 입력하세요>>
//2
//1=>    1   3
//2=>    5   7  
//
//출력형태 2) 
//3
//1=>    1   4   7
//2=>   10  13  16
//3=>   19  22  25
//
//출력형태 3) 
//숫자를 입력하세요>>
//5
//1=>    1   6  11  16  21
//2=>   26  31  36  41  46
//3=>   51  56  61  66  71
//4=>   76  81  86  91  96
//5=>  101 106 111 116 121
//---------------------------------------------
public class Quiz06 {
	// SCanner 객체 생성
	static Scanner sc = new Scanner(System.in);

	// 배열 선언
	static int[][] arr;

	// 변수 초기화
	static int inputNum = 0;
	static int count = 1;

	// entry point
	public static void main(String[] args) {
		// 입력한 숫자만큼 행과 열이 생성되고 배열 요소가 1부터 입려력한 숫자만큼 증가하는 메소드
		arrPrint();

	}// end of main

	// 입력한 숫자만큼 행과 열이 생성되고 배열 요소가 1부터 입려력한 숫자만큼 증가하는 메소드
	public static void arrPrint() {
		System.out.print("숫자를 입력하세요 >> ");
		//숫자입력
		inputNum = sc.nextInt();
		
		//입력한 숫자만큼 2중배열 생성
		arr = new int[inputNum][inputNum];

		for (int i = 0; i < arr.length; i++) {
			for (int k = 0; k < arr[i].length; k++) {
				arr[i][k] += count;
				System.out.print(arr[i][k] + "\t");
				
				//입력한 숫자만큼 증가
				count += inputNum;
			} // end of for in
			System.out.println();
		} // end of for out
	}// end of arrPrint()

}// end of class
