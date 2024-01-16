package array3;

import java.util.Scanner;

public class ArrayExam04_06 {
	// 단어 맞추기 게임을 작성하시오. 영어 단어 과일의 이름을 제시하고 한글로 그 뜻을 맞추기

	// Scanner 객체 생성
	static Scanner sc = new Scanner(System.in);

	// 영어 문제 선언
	static String[] eng = new String[] { "apple", "banana", "watermelon", "persimmon", "tangerine", "coconut",
			"grape", "oriental melon", "fig", "pomegranate", "jujube" };

	// 한국어 정답 선언
	static String[] kor = new String[] { "사과", "바나나", "수박", "곶감", "귤", "코코넛", "포도", "참외", "무화과", "석류", "대추" };

	// 무작위 문제 출제를 위한 난수생성
	static int num = (int) (Math.random() * 5);

	// entry point
	public static void main(String[] args) {
		question();
	}// end of main

	public static void question() {
		System.out.println("\"" + eng[num] + "\"의 한국어 과일 이름은?!");
		String answer = sc.nextLine();// 정답입력

		if (answer.equals(kor[num])) {
			System.out.println("정답입니다!! 똑똑하시군요");
		} else {
			System.out.printf("땡~ 오답입니다\n정답은 '%s'입니다!", kor[num]);
		} // end of if
	}// end of question()

}// end of class
