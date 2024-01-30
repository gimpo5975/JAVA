package exam.scoreobjectification;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ScoreExam {
	// 입력 받기 위한 Scanner 객체 생성
	private static Scanner sc = new Scanner(System.in);
	static List<Score> scoreArr = new ArrayList<Score>();// Score타입의 ArrayList생성
	private static final int NUM_SUBJECTS = 3;// 평균을 구하기 위한 과목수 정의

	// entry point
	public static void main(String[] args) {
		inputStudentInfo();
		calculate();
		printStudentInfo();
	}// end of main

	// 학생 정보입력 메소드(학생 수, 이름, 학과, 점수)
	private static void inputStudentInfo() {

		System.out.print("학생 수를 입력하세용 : ");// 안내 및 설명
		int studentNum = Integer.parseInt(sc.nextLine());// 학생 수 입력 받기

		for (int i = 0; i < studentNum; i++) {// 학생 수 만큼 정보 입력을 위한 반복문
			System.out.println("******************");// 구분선
			System.out.println((i + 1) + "번째 학생 정보입력");// 안내 및 설명
			System.out.print("이름을 입력해 주세용 : ");// 안내 및 설명
			String studentName = sc.nextLine();// 학생 이름 입력 받기

			System.out.print("학과 입력해 주세용 : ");// 안내 및 설명
			String subject = sc.nextLine();// 학생 학과 입력 받기

			System.out.print("DB 점수를 입력하세용 : ");// 안내 및 설명
			int scoreDB = Integer.parseInt(sc.nextLine());// DB점수 입력받기
			System.out.print("SW 점수를 입력하세용 : ");// 안내 및 설명
			int scoreSW = Integer.parseInt(sc.nextLine());// SW점수 입력받기
			System.out.print("PG 점수를 입력하세용 : ");// 안내 및 설명
			int scorePG = Integer.parseInt(sc.nextLine());// PG점수 입력받기
			System.out.println();// 구분 공백

			// Score 객체 생성하여 입력 받은 정보로 객체 생성
			Score score = new Score(studentName, studentName, subject, scoreDB, scoreSW, scorePG);

			// 생성한 객체를 ArrayList에 담기
			scoreArr.add(score);
		} // end of for

	}// end of inputStudentInfo()

	// 합계, 평균, 학점, 석차 계산하는 메소드
	public static void calculate() {
		for (int i = 0; i < scoreArr.size(); i++) {
			// 점수 합계 => get(i)로 Score클래스의 scoreSum에 과목별 점수를 더한 값을 저장
			scoreArr.get(i).setScoreSum(
					scoreArr.get(i).getScoreDB() + scoreArr.get(i).getScoreSW() + scoreArr.get(i).getScorePG());
			// 점수 평균
			scoreArr.get(i).setScoreAvg(scoreArr.get(i).getScoreSum() / NUM_SUBJECTS);

			// 학점 판정
			if (scoreArr.get(i).getScoreAvg() >= 90) {
				scoreArr.get(i).setGrade("A");
			} else if (80 <= scoreArr.get(i).getScoreAvg() && scoreArr.get(i).getScoreAvg() < 90) {
				scoreArr.get(i).setGrade("B");
			} else if (70 <= scoreArr.get(i).getScoreAvg() && scoreArr.get(i).getScoreAvg() < 80) {
				scoreArr.get(i).setGrade("C");
			} else if (60 <= scoreArr.get(i).getScoreAvg() && scoreArr.get(i).getScoreAvg() < 70) {
				scoreArr.get(i).setGrade("D");
			} else {
				scoreArr.get(i).setGrade("F");
			} // end of if

			// 석차 계산
			for (int j = 0; j < scoreArr.size(); j++) {
				if (scoreArr.get(i).getScoreAvg() < scoreArr.get(j).getScoreAvg()) {
					scoreArr.get(i).setRank(scoreArr.get(i).getRank() + 1);
				} // end of if
			} // end of for

		} // end of for

	}// end of calculate()

	// 학생 정보 출력 메소드
	public static void printStudentInfo() {
		DecimalFormat df = new DecimalFormat("#.##");// 평균을 정형화해서 출력
		// 전체 학생의 성적 출력
		System.out.println("===================================================================================");
		System.out.println("번호\t 이름\t 학과\t DB\t SW\t PG\t 합계\t 평균\t 학점\t 석차");
		System.out.println("===================================================================================");
		for (int i = 0; i < scoreArr.size(); i++) {
			scoreArr.get(i).setNum(i + 1);// 번호
			System.out.printf("%d\t %s\t %s\t %d\t %d\t %d\t %d\t %s\t %s\t %d\n", scoreArr.get(i).getNum(),
					scoreArr.get(i).getStudentName(), scoreArr.get(i).getSubject(), scoreArr.get(i).getScoreDB(),
					scoreArr.get(i).getScoreSW(), scoreArr.get(i).getScorePG(), scoreArr.get(i).getScoreSum(),
					df.format(scoreArr.get(i).getScoreAvg()), scoreArr.get(i).getGrade(), scoreArr.get(i).getRank());
		} // end of for

		System.out.println();// 구분 공백
		System.out.print("개인성적을 보고 싶은 학생의 번호를 입력 하세용 : ");// 안내 및 설명
		int hopeStudent = Integer.parseInt(sc.nextLine());// 개인성적을 확인하기를 희망하는 학생의 번호

		// 개인 학생의 성적 출력
		for (int i = 0; i < scoreArr.size(); i++) {
			if (hopeStudent == scoreArr.get(i).getNum()) {
				System.out.println("***" + scoreArr.get(i).getStudentName() + "***의 개인 성적표");// 안내 및 설명
				System.out
						.println("===================================================================================");
				System.out.println("번호\t 이름\t 학과\t DB\t SW\t PG\t 합계\t 평균\t 학점\t 석차");
				System.out
						.println("===================================================================================");
				System.out.printf("%d\t %s\t %s\t %d\t %d\t %d\t %d\t %s\t %s\t %d\n", scoreArr.get(i).getNum(),
						scoreArr.get(i).getStudentName(), scoreArr.get(i).getSubject(), scoreArr.get(i).getScoreDB(),
						scoreArr.get(i).getScoreSW(), scoreArr.get(i).getScorePG(), scoreArr.get(i).getScoreSum(),
						df.format(scoreArr.get(i).getScoreAvg()), scoreArr.get(i).getGrade(),
						scoreArr.get(i).getRank());
			} // end of if
		} // end of for

	}// end of printStudentInfo()

}// end of class
