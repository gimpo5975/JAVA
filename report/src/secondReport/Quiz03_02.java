package secondReport;

import java.util.Arrays;

// num = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10}을 임으로 섞어서 출력출력하는 프로그램 작성(shuffle)하시오.
public class Quiz03_02 {
	// 배열 초기화
	static int[] num = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

	// 변수 초기화
	static int temp = 0;
	static int randomNum = 0;

	// entry point
	public static void main(String[] args) {

		// 배열을 섞는 메소드 호출
		shuffleNumPrint();

	}// end of main

	// 배열을 섞는 메소드
	public static void shuffleNumPrint() {
		for (int i = 0; i < num.length; i++) {
			randomNum = (int) (Math.random() * 10);
			temp = num[0];// temp에 1이 담긴다.
			num[0] = num[randomNum];// num[0]에 1~10중 무작위 수가 남긴다.
			num[randomNum] = temp;// num의 무작위 요소에 1이 담긴다.
		} // end of for
		System.out.println(Arrays.toString(num));
	}// end of shuffleNumPrint()

}// end of class
