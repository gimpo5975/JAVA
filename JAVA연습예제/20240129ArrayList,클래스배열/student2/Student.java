package exam.student2;

public class Student {

	// #필드
	String ssn;// 학번
	String name;// 학생이름
	// 과목을 받아서 배열에 저장 => 과목타입의 배열 생성
	// 과목과 점수를 담고 있는 배열은 여러곳에서 사용할 것, 필드
	// 수강과목의 수는 객체를 생성해서 따로 공간을 확보
	Subject[] subject;// Subject 타입의 객체의 주소를 담는 배열
	int subjectScoreSum = 0;// 과목별 점수 합계
	double subjectScoreAvg = 0.0;// 과목별 점수 평균

	// #생성자
	public Student(String ssn, String name, int subjectCount) {
		super();
		this.ssn = ssn;
		this.name = name;

		// 과목수를 입력받아 객체가 담기는 배열 공간 확보
		this.subject = new Subject[subjectCount];
	}// end of constructor

	// #메소드
	// 빈공간이 있다면 빈공간에 새로 입려된 과목과 점수를 담고있는 객체를 저장
	public void addSubject(String subjectName, int subjectScore) {
		// 외부에서 넘겨받은 과목과 점수로 객체 생성
		// 생성된 객체를 생성한 공간에 담는다
		// this.subject = new Subject[subjectCount];
		// subject 배열에 빈 공간이 있는지 확인하고 없으면 넘어가고 있으면 새로 생긴객체의 주소를 담는다
		// 배열 공간만큼 체크=> for문 이용
		// 배열 공간이 null인지 아닌지 => if문

		for (int i = 0; i < subject.length; i++) {
			if (subject[i] == null) {// 공간이 null이면 객체를 저장
				subject[i] = new Subject(subjectName, subjectScore);
				// 이미 생성한 객체를 빈 공간에 담았으면 더이상 for문을 돌필요가 없다
				break;
			} // end of if
		} // end of for

	}// end of addSubject()

	// #메소드
	private void calculate() {// 과목과 과목정보
		// 합계
		for (int i = 0; i < subject.length; i++) {
			subjectScoreSum += subject[i].subjectScore;
		} // end of for

		// 평균
		subjectScoreAvg = (double) subjectScoreSum / subject.length;
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
