package genericexam2.score;

public class ScoreGenericMain {

	// 1. Generic 메소드 활용
	// [접근제한자] <타입> 반환타입 메소드명(매개변수)

	public static void main(String[] args) {
		EnglishScore[] engArr = { new EnglishScore("홍길동", 90), new EnglishScore("우영우", 89), new EnglishScore("최수현", 97),
				new EnglishScore("이준호", 67), new EnglishScore("정명석", 48) };
		MathScore[] mathArr = { new MathScore("홍길동", 90), new MathScore("우영우", 89), new MathScore("최수현", 97),
				new MathScore("이준호", 67), new MathScore("정명석", 48) };

		System.out.println("영어 최고점수 : " + findBest(engArr));
		System.out.println("수학 최고점수 : " + findBest(mathArr));

	}// end of main

	public static <T extends Comparable<T>> T findBest(T[] score) {
		// 1. max를 찾기 위해 배열의 처음 값을 max에 담기
		T max = score[0];

		// 2. 최고 점수 찾기
		for (int i = 0; i < score.length; i++) {
			if (max.compareTo(score[i]) < 0) {
				// 음수가 나온다는 것은 비교값인 max가 더 작다는것
				// max에 매개값을 담기
				max = score[i];
			} // end of if
		} // end of for

		return max; // 최고 값을 가지고 있는 객체 리턴
	}// enf of findBest
}// end of class
