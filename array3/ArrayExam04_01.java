package array3;

public class ArrayExam04_01 {

	public static void main(String[] args) {
		int[][] num = new int[5][5];

		for (int i = 0; i < num.length; i++) {
			for (int k = 0; k < num[i].length; k++) {
				num[i][k] = (i * 5) + (k + 1);
				System.out.print(num[i][k]+ "\t");
			} // end of for in
			System.out.println();
		} // end of for out
	}// end of main

}// end of class
