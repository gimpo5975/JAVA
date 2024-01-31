package thirdReport;

import java.text.DecimalFormat;

public class Student {
	// #1. 필드
	String sn; // 학번
	String name; // 이름
	Subject[] subject; // 수강과목별 점수 선언, 초기화는 생성자에서

	// #2. 생성자
	public Student(String name, String sn, int subjectCount) {
		super();
		this.name = name;
		this.sn = sn;
		this.subject = new Subject[subjectCount]; // 배열을 초기화
	}// end of constructor

	DecimalFormat df = new DecimalFormat("0.0");

	// #3. 메소드 - 과목 총점과 평균, 성적 정보 출력
	public void showInfo(Subject[] subject) {
		this.subject = subject; // 수강과목별 점수
		int scoreSum = 0; // 합계
		double avg = 0.0;

		// #3-1. 합계
		for (int i = 0; i < subject.length; i++) {
			scoreSum += subject[i].subScore; // 개별 과목 점수 누적
		}
		avg = (double) scoreSum / subject.length;

		// #4. 성적 정보 출력
		System.out.println("*** " + name + "님 성적 ***");
		System.out.println("학 번 : " + sn);
		System.out.println("총 점 : " + scoreSum);
		System.out.println("평 균 : " + df.format(avg));
		System.out.println();
	}// end of showInfo

	// #4. 메소드 - 수강과목과 점수 확인
	public void checkScore(Subject[] subject) {
		System.out.println("*** " + name + "님 수강과목과 점수 확인 ***");
		for (Subject arraySub : subject) {
			arraySub.subjectInfo();
		}
		System.out.println();
	}// end of checkScore

}// end of class
