package exam.student3;

public class Subject {

	// #필드
	private String subjectName;// 과목명
	private int subjectScore;// 과목점수

	// #생성자

	// #메소드
	// 과목명 : 점수 출력
	public void subjectInfo() {
		System.out.println(subjectName + " : " + subjectScore);
	}// end of subjectInfo()

	// getter/setter
	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public int getSubjectScore() {
		return subjectScore;
	}

	public void setSubjectScore(int subjectScore) {
		this.subjectScore = subjectScore;
	}

}// end of class
