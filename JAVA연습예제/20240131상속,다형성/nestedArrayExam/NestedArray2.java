package nestedArrayExam;

import java.util.Scanner;

public class NestedArray2 {

	// entry point
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("원하는 행열의 길이 입력 : ");
		int size = sc.nextInt();
		int count = 0;
		int[][] nestedArray = new int[size][size];

		for (int i = 0; i < nestedArray.length; i++) {
			for (int k = 0; k < nestedArray[i].length; k++) {
				if (i >= 1 && i <= 3) {
					System.out.print("\t");
				} else {
					count++;
					nestedArray[i][k] += count;
					System.out.print(nestedArray[i][k] + "\t");
				} // end of if
			} // end of for
			System.out.println();
		}

	}// end of main

}// end of class
