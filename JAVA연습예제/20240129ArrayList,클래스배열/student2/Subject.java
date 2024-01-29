package exam.student2;

public class Subject {

	// #필드
	String subjectName;// 과목명
	int subjectScore;// 과목점수

	// #생성자
	public Subject(String subjectName, int subjectScore) {
		super();
		this.subjectName = subjectName;
		this.subjectScore = subjectScore;
	}// end of constructor

	// #메소드
	public void subjectInfo() {
		System.out.println(subjectName + " : " + subjectScore);
	}// end of subjectInfo()

}// end of class
