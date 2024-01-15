package array2;

public class Array4_1 {

	public static void main(String[] args) {
		// #1. 로또번호를 담을 변수 선언
		int[] lotto = new int[45]; // 45개의 정수값을 담을 배열 공간 생성

		// #2. for문을 이용하여 로또 번호 담기
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = i + 1;
		} // end of for

		// #3. lotto 배열에 담긴 값 확인
		// System.out.println(Arrays.toString(lotto));

		// #4. 로또 번호 섞기
		for (int i = 0; i < 99999; i++) {
			int n = (int) (Math.random() * 45);
			int temp = 0;

			temp = lotto[0];
			lotto[0] = lotto[n];
			lotto[n] = temp;
		} // end of for

		for (int i = 0; i <= 6; i++) {
			System.out.print(lotto[i] + " ");
		} // end of for
		System.out.println();
	}// end of main

}// end of class
