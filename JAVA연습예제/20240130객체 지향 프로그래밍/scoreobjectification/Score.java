package exam.scoreobjectification;

public class Score {

	// #필드
	private String studentNum;// 학생 수
	private String studentName;// 학생 이름
	private String subject;// 학과
	private String grade;// 학점
	private int scoreDB;// DB점수
	private int scoreSW;// SW점수
	private int scorePG;// PG점수
	private int scoreSum;// 점수 합계
	private double scoreAvg;// 점수 평균
	private int rank = 1;// 석차
	private int num = 0;// 번호

	// #생성자
	public Score(String studentNum, String studentName, String subject, int scoreDB, int scoreSW, int scorePG) {
		super();
		this.studentNum = studentNum;
		this.studentName = studentName;
		this.subject = subject;
		this.scoreDB = scoreDB;
		this.scoreSW = scoreSW;
		this.scorePG = scorePG;
	}// end of constructor

	// getter / setter
	public String getStudentNum() {
		return studentNum;
	}

	public void setStudentNum(String studentNum) {
		this.studentNum = studentNum;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getScoreDB() {
		return scoreDB;
	}

	public void setScoreDB(int scoreDB) {
		this.scoreDB = scoreDB;
	}

	public int getScoreSW() {
		return scoreSW;
	}

	public void setScoreSW(int scoreSW) {
		this.scoreSW = scoreSW;
	}

	public int getScorePG() {
		return scorePG;
	}

	public void setScorePG(int scorePG) {
		this.scorePG = scorePG;
	}

	public int getScoreSum() {
		return scoreSum;
	}

	public void setScoreSum(int scoreSum) {
		this.scoreSum = scoreSum;
	}

	public double getScoreAvg() {
		return scoreAvg;
	}

	public void setScoreAvg(double scoreAvg) {
		this.scoreAvg = scoreAvg;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

}// end of class
