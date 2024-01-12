package firstReport;

public class Quiz11 {

	public static void main(String[] args) {
		/*
		 * 문11) 홍길동은 국어 80점 영어 65점 수학 70점을 받았습니다. 세과목 모두 60점 이상이면 이번 시험에서 "통과"를 하고 그렇지 않은
		 * 경우 "탈락"을 하게 됩니다. 홍길동의 결과를 출력하는 프로그램을 작성하세요.
		 */

		int kor = 80, eng = 65, math = 70;// 정수형 변수 초기화

		if (kor >= 60 && eng >= 60 && math >= 60) {
			System.out.println("통과");
		} else {
			System.out.println("탈락");
		}

	}// end of main

}// end of class
