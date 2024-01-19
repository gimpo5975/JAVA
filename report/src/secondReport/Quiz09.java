package secondReport;

import java.util.Scanner;

//단어 맞추기 게임을 작성하시오.
//한글 단어 과일의 이름을 제시하고 영어로 그 뜻을 맞추기
//
//. 한국어 과일 : 사과, 수박, 복숭아, 딸기, 귤
//. 영어 과일 : "apple","watermelon", "peach", "strawberry", "tangerine"
//   => 2차원 배열
//   => String[][] fruits    행의 i번째 열[0]-한글단어, 열[1]-영문단어
//	fruits[0][0] - 한글 과일이름
//	fruits[0][1] - 영어 과일 이름
//. 질문은 한글로 하기
//. 질문에 답 영어로 받기 : String userResponse
//          
//. 정답일때 / 오답일때 => if ~ else
//            => if(userResponse.equals(fruits[i][1])){
// 	       
//		}else{      }
//
// . 반복해서 묻기 : 가지고 있는 단어 범위에서만 반복 => for문, 과일개수
//
//
//
//출력형태 )
//질문 >> "apple"의 한국어 과일 이름은?
//
//정답일 경우 : 정답입니다.
//오답일 경우 : 오답입니다.
//	      정답은 '사과' 입니다.
//
//
//----------------------
public class Quiz09 {
	// Scanner 객체 생성
	static Scanner sc = new Scanner(System.in);

	// 배열 초기화
	static String[][] fruits = { { "사과", "apple" }, { "수박", "watermelon" }, { "복숭아", "peach" }, { "딸기", "strawberry" },
			{ "귤", "tangerine" } };

	// 변수 초기화
	static int count = 0;
	static String userResponse = "";

	// entry point
	public static void main(String[] args) {

		// 과일 영단어 맞추기 메소드 호출
		fruitQuizPrint();

	}// end of main

	// 과열 영단어 맞추는 메소드
	public static void fruitQuizPrint() {
		for (int i = 0; i < fruits.length; i++) {
			// 질문
			System.out.println();
			System.out.printf("질문%d) '%s'를(을) 영어로하면 무엇인가?\n", (i + 1), fruits[i][0]);
			System.out.printf("정답 입력 >>");

			// 정답 입력
			userResponse = sc.nextLine();

			// 정답여부를 판단
			if (userResponse.equals(fruits[i][1])) {
				count++;
				System.out.println("정답입니다!!");
			} else {
				System.out.println("오답입니다ㅜㅜ");
				System.out.println("정답은 '" + fruits[i][1] + "'입니다");
			} // end of if

		} // end of for

		// 정답횟수 출력
		System.out.println("\n총 정답횟수 : " + count + "회");
	}// end of fruitQuizPrint()

}// end of class