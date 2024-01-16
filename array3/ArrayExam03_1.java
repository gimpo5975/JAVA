package array3;

public class ArrayExam03_1 {

	public static void main(String[] args) {
		int[] name = new int[10]; // 1차원 배열
		int[][] num = new int[2][3]; // 2차원 배열
		// new 타입[행의길이][열의길이]
		num[0][0] = 5;
		num[0][1] = 10;
		num[0][2] = 20;
		num[1][0] = 25;
		num[1][1] = 30;
		num[1][2] = 35;

		// #1. 배열 선언
		int[][] num2 = new int[2][];// 행의 길이는 생략 불가
		num2[0] = new int[3];// 1행에 3열
		num2[1] = new int[3];// 2행에 2열

		// #2. 배열에 값을 담기
		num2[0][0] = 5;
		num2[0][1] = 10;
		num2[0][2] = 20;
		num2[1][0] = 25;
		num2[1][1] = 30;
		num2[1][2] = 35;

		// #3. 배열의 내용을 출력
		for (int i = 0; i < num2.length; i++) {// num2의 열의 수만큼 반복
			for (int k = 0; k < num2[i].length; k++) {// num2의 i번째 열이 가르키는 행의 수만큼 반복
				System.out.println("[" + i + "}, {" + k + "} = " + num2[i][k]);
			} // end of for in
		} // end of for out

		System.out.println("---------------------------------------------------------");

		int[][] scores = new int[][] { { 10, 20, 30 }, // 0행 0열
				{ 40, 50, 60 } // 1행 1열
		};

		for (int i = 0; i < scores.length; i++) {
			for (int k = 0; k < scores[i].length; k++) {
				System.out.println("[" + i + "}, {" + k + "} = " + scores[i][k]);
			} // end of for in
		} // end of for out
 
		
		
	}// end of main

}// end of class
