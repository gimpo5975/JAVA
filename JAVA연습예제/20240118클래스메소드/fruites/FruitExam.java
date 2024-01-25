package fruites;

import java.util.Scanner;

public class FruitExam {

	public static void main(String[] args) {
		// #1. Scanner 객체 생성
		Scanner sc = new Scanner(System.in);

		// #2. 변수선언
		// 과일은 2차원 배열로
		// fruits[0][0] => 한글 과일이름
		// fruits[0][1] => 영어 과일이름
		String[][] fruits = { { "사과", "apple" }, { "수박", "watermelon" }, { "복숭아", "peach" }, { "딸기", "strawberry" },
				{ "귤", "tangerine" } };// 2차원 배열 선언 끝
		int count = 0;

		// #3. 질문
		for (int i = 0; i < fruits.length; i++) {
			String userResponse = "";// 질문에 대한 사용자의 응답

			// 질문
			System.out.println();
			System.out.printf("질문%d) '%s'를(을) 영어로하면 무엇인가?\n", (i + 1), fruits[i][0]);
			System.out.printf("정답 입력 >>");
			userResponse = sc.nextLine();

			// 정답여부를 판단
			if (userResponse.equals(fruits[i][1])) {
				count++;
				System.out.println("정답입니다!!");
			} else {
				System.out.println("오답입니다ㅜㅜ");
				System.out.println("정답은 '" + fruits[i][1] + "'입니다");
			}

		} // end of for
		System.out.println("\n총 정답횟수 : " + count + "회");
	}// end of main

}// end of class
