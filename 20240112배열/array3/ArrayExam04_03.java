package array3;

import java.util.Scanner;

public class ArrayExam04_03 {

	public static void main(String[] args) {
		// Scanenr 객체 생성
		Scanner sc = new Scanner(System.in);

		// 안내문구
		System.out.print("숫자를 입력하세요 : ");
		// 숫자 받기
		int num = Integer.parseInt(sc.nextLine());
		// 변수 초기화
		int count = 1;
		int num2[][] = new int[num][num];
		// 배열에 값 담고 출력하기
		for (int i = 0; i < num2.length; i++) {//행의 반복
			for (int k = 0; k < num2[i].length; k++) {//행 하나의 값 속의 열의 반복
				num2[i][k] += count; // i=0, k=0일때 num2[i][k] = 1
				System.out.printf(num2[i][k] + "\t");
				count += num;// count에 입력 받은 num 값 더하기
			}
			System.out.println();
		}

	}// end of main

}// end of class
