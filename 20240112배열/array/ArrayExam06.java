package array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExam06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("숫자를 입력해보세요 2 or 3");
		int select = sc.nextInt();
		int plus = 0;
		if (select == 2) {
			int[][] twoArg = new int[select][select];//배열 초기화
			for (int i = 0; i < twoArg.length; i++) {
				for (int y = 0; y < twoArg.length; y++) {
					plus += 1;
					twoArg[i][y] = plus;
					System.out.print(twoArg[i][y]);
				} // end of for in
				System.out.println();
			} // end of for out
		} else if (select == 3) {
			int[][] threeArg = new int[select][select];
			for (int i = 0; i < threeArg.length; i++) {
				for (int y = 0; y < threeArg[i].length; y++) {
					plus += 1;
					threeArg[i][y] = plus;
					System.out.print(threeArg[i][y]);
				} // end of for in
				System.out.println();
			} // end of for out
		}

	}// end of main

}// end of class
