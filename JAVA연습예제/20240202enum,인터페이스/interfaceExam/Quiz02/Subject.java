package interfaceExam.Quiz02;

public class Subject extends Student implements Calculate {

	// #필드
	private int DB;
	private int SW;
	private int PG;
	private int sum;
	private double avg;
	private Grade grade;
	private int rank = 1;
	private static final int NUM_SUBJECTS = 3;// 평균을 구하기 위한 과목수 정의
	private int num;

	// #생성자
	public Subject(String name, String department, int dB, int sW, int pG) {
		super(name, department);
		DB = dB;
		SW = sW;
		PG = pG;
	}// end of constructor

	// #getter / setter
	public int getDB() {
		return DB;
	}

	public void setDB(int dB) {
		DB = dB;
	}

	public int getSW() {
		return SW;
	}

	public void setSW(int sW) {
		SW = sW;
	}

	public int getPG() {
		return PG;
	}

	public void setPG(int pG) {
		PG = pG;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	public Grade getGrade() {
		return grade;
	}

	public void setGrade(Grade grade) {
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

	// #메소드
	@Override
	public void sum() {
		sum = DB + SW + PG;
	}// end of sum

	@Override
	public void avg() {
		avg = (double) sum / NUM_SUBJECTS;
	}// end of avg

	@Override
	public void grade() {
		if (avg >= 90) {
			grade = Grade.A;
		} else if (80 <= avg && avg < 90) {
			grade = Grade.B;
		} else if (70 <= avg && avg < 80) {
			grade = Grade.C;
		} else if (60 <= avg && avg < 70) {
			grade = Grade.D;
		} else if (avg < 60) {
			grade = Grade.F;
		} // end of if
	}// end of grade

	@Override
	public void rank() {

	}

	public void showInfo() {
		System.out.println("===========================================================================");
		System.out.println("번호\t이름\t학과\tDB\tSW\tPG\t합계\t평균\t학점\t석차");
		System.out.println("===========================================================================");
	}// end of showInfo

}// end of class
