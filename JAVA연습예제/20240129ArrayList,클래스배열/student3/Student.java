package exam.student3;

import java.util.ArrayList;

//	★ArrayList☆
//
//	-메모리 공간을 동적으로 확보
//	-배열은 한번 공간을 확모하면 바꿀 수 없다.
//
//	☆메소드
//		.add(요소) : 주어진 객체를 맨 끝에 추가
//		.get(int index) : 주어진 인덱스에 저장된 객체를 가져온다.	
//		.size(): 저장되어 있는 전체 객체 수(=배열의 길이)
//		.remove(int index) : 주어진 인덱스의 객체를 삭제

public class Student {

	// #필드
	String ssn;// 학번
	String name;// 학생이름

	// 과목별 점수의 저장공간을 ArrayList
	// 동적인 배열공간을 설정할 것이고, 이곳에는 Subject타입 객체가 저장될 것이다.
	ArrayList<Subject> subject;

	// #생성자
	public Student(String ssn, String name) {
		super();
		this.ssn = ssn;
		this.name = name;
		subject = new ArrayList<Subject>();
	}// end of constructor

	int subjectScoreSum = 0;
	double subjectScoreAvg = 0.0;

	// 메소드
	public void addSubject(String subjectName, int subjectScore) {
		// 수강과목 객체 생성
		Subject newSubject = new Subject();
		newSubject.setSubjectName(subjectName);
		newSubject.setSubjectScore(subjectScore);

		// 배열에 저장
		// ArrayList로 생성된 공간에 저장
		subject.add(newSubject);

	}// end of addSubject()

	private void calculate() {// 과목과 과목 점수
		// ArrayList의 길이 : size()
		// 과목 총합
		for (int i = 0; i < subject.size(); i++) {
			subjectScoreSum += subject.get(i).getSubjectScore();
		} // end of for

		// 과목 평균
		subjectScoreAvg = (double) subjectScoreSum / subject.size();

	}// end of calculate()

	// 정보출력
		public void showInfo() {
			calculate();// 총점과 평균 계산
			// 계산이 끝난 후 정보출력
			System.out.println("***" + name + "님의 성적 ***");
			System.out.println("학번 : " + ssn);
			System.out.println("총점 : " + subjectScoreSum);
			System.out.printf("평균 : %.2f\n", subjectScoreAvg);
			System.out.println();
		}// end of showInfo()

		// *** ~님 수강과목과 점수 확인
		public void checkScore() {
			System.out.println(name + "님의 수강과목과 점수확인");
			for (Subject checkArr : subject) {
				checkArr.subjectInfo();
			} // end of for
			System.out.println();
		}// end of checkScore()
	
}// end of class
