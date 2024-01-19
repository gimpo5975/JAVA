package secondReport;

import java.util.Arrays;

//로또 번호 출력하는 프로그램작성하시오.
public class Quiz04 {
	// 배열 초기화
	static int[] lotto = new int[45];
	static int[] draw = new int[6];

	// 변수 초기화
	static int temp = 0;
	static int randomNum = 0;

	// entry point
	public static void main(String[] args) {
		// 로또 추첨 번호들 생성

		// 로또 추첨 번호들 생성 메소드 호출
		createLottoNum();

		// 로또 배열 무작위로 섞기 메소드 호출
		shuffleNum();

		// 로또 추첨 메소드 호출
		lottoDraw();
	}// end of main

	// 로또 추첨 번호들 생성
	public static void createLottoNum() {
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] += i + 1;
		} // end of for
	}// end of createLottoNum()

	// 로또 배열 무작위로 섞기
	public static void shuffleNum() {
		for (int i = 0; i < 99999; i++) {
			randomNum = (int) (Math.random() * 45);
			temp = lotto[0];
			lotto[0] = lotto[randomNum];
			lotto[randomNum] = temp;
		} // end of for
	}// end of shuffleNum()

	// 로또 추첨
	public static void lottoDraw() {
		for (int i = 0; i < 6; i++) {
			draw[i] = lotto[i];
		} // end of for
		System.out.println("추첨번호 : " + Arrays.toString(draw));
	}// end of lottoDraw()
}// end of class
