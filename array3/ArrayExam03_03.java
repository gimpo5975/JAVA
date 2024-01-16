package array3;

public class ArrayExam03_03 {

	public static void main(String[] args) {

		int[] scores;
		scores = new int[] { 83, 90, 87 };
		int sum1 = 0;
		for (int i = 0; i < scores.length; i++) {
			sum1 += scores[i];
		} // end of for

		System.out.println("총합 : " + sum1);
		System.out.println("----------------------------------");

		
		// 메소드 호출 => 메소드명(매개값);
		int[] scores1 = new int[] { 83, 90, 87 };
		int sum2 = add(scores1);
		System.out.println("총합 : " + sum2);
		System.out.println();

	}// end of main

	public static int add(int[] scores) {
		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		} // end of for
		return sum;
	}// end of add()

}// end of class
