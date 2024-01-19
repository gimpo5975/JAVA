package secondReport;

public class Quiz01 {
	// 배열 초기화
	static int[] score = { 100, 88, 100, 90, 50 };
	static String[] studentName = { "홍길동", "김자바", "이자바", "박디비", "송디비" };

	// 변수 초기화
	// 번호와 전체 합계
	static int count = 0, sum = 0;
	// 전체 평균
	static double avg = 0.0;

	public static void main(String[] args) {
		// 다음은 홍길동반 학생들의 성적입니다. 총점과 평균을 구하는 프로그램을 작성하시오.
		// 성적(score) = {100, 88,100,90,50}
		// 이름(studentName = {"홍길동","김자바","이자바","박디비","송디비"}

		showPrint();

	}// end of main

	// 출력메소드
	public static void showPrint() {
		System.out.println("================================");
		System.out.println("번호\t 이름\t 성적");

		// 인원수, 이름, 성적, 전체 합계를 출력할 for문 작성
		scorePrint();

		System.out.println("================================");
		System.out.println("인원수 : " + studentName.length + "명");
		System.out.println("전체 합계 : " + sum);

		// 전체 평균 구하는 메소드
		average();

		System.out.println("전체 평균 : " + avg);
	}// end of showPrint()

	// 인원수, 이름, 성적, 전체 합계를 출력할 for문 작성하는 메소드
	public static void scorePrint() {
		for (int i = 0; i < score.length; i++) {
			// 번호
			count++;
			System.out.printf("%d\t %s\t %d\n", count, studentName[i], score[i]);
			// 전체 합계
			sum += score[i];
		} // end of for
	}// end of method

	// 전체 평균 구하는 메소드
	public static void average() {
		avg = (double) sum / score.length;
	}// end of average()

}// end of class
