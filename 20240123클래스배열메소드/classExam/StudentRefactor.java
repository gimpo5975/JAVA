package classExam;

public class StudentRefactor {

	// #1. 필드
	String name;// 이름
	String ssn;// 학번
	int kor;// 국어
	int eng;// 영어
	int mat;// 수학
	int sum;// 합계
	double avg;// 평균

	// #2. 생성자
	public StudentRefactor(String name, String ssn, int kor, int eng, int mat) {
		this.name = name;
		this.ssn = ssn;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}// end of StudentRefactor

	// #3. 성적 계산 및 점수 출력 메소드
	public void scoreCalc() {

		sum = kor + eng + mat;
		avg = (double) sum / 3;

		System.out.println("***" + name + "님 수강과목과 점수 확인 ***");
		System.out.println("수강과목\t점수");
		System.out.println("국어\t" + kor);
		System.out.println("영어\t" + eng);
		System.out.println("수학\t" + mat);
	}// end of scoreCalc()

	// #4. 성적 출력 메소드
	public void studentInfo() {
		System.out.println("***" + name + "님 성적 ***");
		System.out.println("학번: " + ssn);
		System.out.println("총점: " + sum);
		System.out.println("평균: " + avg);
		System.out.println("국어: " + kor);
		System.out.println("영어: " + eng);
		System.out.println("수학: " + mat);
	}// end of studentInfo()

}// end of class
