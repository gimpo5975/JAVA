package secondReport;

import java.util.Scanner;

//한글 요일을 단어로 제시하고 영문 요일을 맞추기
public class Quiz10 {

	// Scanner 객체 생성
	static Scanner sc = new Scanner(System.in);

	// 배열 초기화
	static String[][] days = { { "월요일", "monday" }, { "화요일", "tuesday" }, { "수요일", "wednesday" }, { "목요일", "thursday" },
			{ "금요일", "	friday" }, { "토요일", "saturday" }, { "일요일", "sunday" } };

	// 변수 초기화
	static int count = 0;
	static String userResponse = "";

	// entry point
	public static void main(String[] args) {

		// 과일 영단어 맞추기 메소드 호출
		daysQuizPrint();

	}// end of main

	// 과열 영단어 맞추는 메소드
	public static void daysQuizPrint() {
		for (int i = 0; i < days.length; i++) {
			// 질문
			System.out.println();
			System.out.printf("질문%d) '%s'를(을) 영어로하면 무엇인가?\n", (i + 1), days[i][0]);
			System.out.printf("정답 입력 >>");

			// 정답 입력
			userResponse = sc.nextLine();

			// 정답여부를 판단
			if (userResponse.equals(days[i][1])) {
				count++;
				System.out.println("정답입니다!!");
			} else {
				System.out.println("오답입니다ㅜㅜ");
				System.out.println("정답은 '" + days[i][1] + "'입니다");
			} // end of if

		} // end of for

		// 정답횟수 출력
		System.out.println("\n총 정답횟수 : " + count + "회");
	}// end of daysQuizPrint()

}// end of class