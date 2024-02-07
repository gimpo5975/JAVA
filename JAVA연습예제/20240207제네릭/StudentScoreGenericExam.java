package genericExam;

public class StudentScoreGenericExam {

	public static void main(String[] args) {
		// 1) 이름, 영어 성적을 보고 최고 점수를 출력하는 프로그램
		// 영어 성적을 비교하는 클래스 => EnglishScore
		// 성적을 비교, 이름과 점수를 출력할 수 있도록 toString()
		// 학생 객체 : {홍길동, 90}. {우영우, 89}, {최수현, 90}, {이준호, 67}, {정명석, 48}

		// 실행 클래스 => 최고점수를 찾는 메소드 findBest(EnglishScore[] a)
		// 영어 성적을 비교하는 클래스 => EnglishScore

		EnglishScore[] engArr = { new EnglishScore("김원중", 100), new EnglishScore("우영우", 89),
				new EnglishScore("최수현", 90), new EnglishScore("이준호", 67), new EnglishScore("정명석", 48),

		};

		MathScore[] mathArr = { new MathScore("김원중", 100), new MathScore("우영우", 89), new MathScore("최수현", 90),
				new MathScore("이준호", 67), new MathScore("정명석", 48),

		};

		// 최고 점수를 찾는 메소드를 호출해서 출력
		System.out.println("영어 최고 점수" + findBest(engArr));
		System.out.println("수학 최고 점수" + findBest(mathArr));

	}// end of main

	// 최고 점수를 찾는 메소드
	public static <T extends Comparable<T>> T findBest(T[] t) {

		T max = t[0]; // 최고 점수 찾기
		for (int i = 0; i < t.length; i++) {
			if (max.compareTo(t[i]) < 0) {
				max = t[i];
			}
		} // end of for
		return max;

	}// end of findBest

}// end of class
