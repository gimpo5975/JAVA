package thirdReport;

public class StudentMain {

	public static void main(String[] args) {
		// #1. 학생 객체 생성
		Student hong = new Student("김원중", "202222", 3);

		// #2. 홍길동 과목과 점수 넣기
		hong.subject = new Subject[] { new Subject("국어", 70), new Subject("영어", 80), new Subject("수학", 80) };

		// #3. 홍길동의 과목과 총점, 평균 정보 확인
		hong.showInfo(hong.subject);
		System.out.println();

		// #4. 홍길동의 수강과목과 점수 확인
		hong.checkScore(hong.subject);
	}// end of main

}// end of class