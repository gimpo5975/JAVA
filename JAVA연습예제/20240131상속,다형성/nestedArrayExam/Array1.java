package nestedArrayExam;

public class Array1 {

	public static void main(String[] args) {

		int[][] arr = new int[5][5];
		int value = 1; // 시작값

		// 값을 배열에 누적
		for (int i = 0; i < arr.length; i++) {
			for (int k = i; k < arr[i].length; k++) {
				arr[i][k] += value;
				value++;
			} // end of for in
		} // end of for

		// 출력
		for (int i = 0; i < arr.length; i++) {
			for (int k = 0; k < arr[i].length; k++) {
				if (arr[i][k] == 0) {
					System.out.printf("%2s \t ", " ");
				} else {
					System.out.print(arr[i][k] + "\t");
				}
			} // end of for in
			System.out.println();
			System.out.println("------------------------------------");
		} // end of for

		// 출력
		for (int i = 0; i < arr.length; i++) {
			for (int k = i; k < arr[i].length; k++) {
				if (arr[i][k] == 0) {
					System.out.printf("%2s \t ", " ");
				} else {
					System.out.print(arr[i][k] + "\t");
				}
			} // end of for in
			System.out.println();
			System.out.println("------------------------------------");
		} // end of for

	}// end of main

}// end of class
