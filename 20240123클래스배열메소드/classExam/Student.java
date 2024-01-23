package classExam;

import java.util.Scanner;

public class Student {

	// #1.필드
	Scanner sc = new Scanner(System.in);
	String[] subject = new String[3];
	int[] score = new int[3];
	String name;
	int studentNum;
	int sum;
	double avg;

	// #2. 생성자
	public Student(String name, int studentNum) {
		this.name = name;
		this.studentNum = studentNum;
	}// end of Student()

	// #3. 메소드

	// 과목 성적입력 메소드
	public void inputSubjectScore() {
		for (int i = 0; i < score.length; i++) {
			// 과목 입력받기
			System.out.print("과목을 입력하세요 : ");
			subject[i] = sc.nextLine();

			// 점수 입력받기
			System.out.print("점수를 입력해주세요 : ");
			score[i] = Integer.parseInt(sc.nextLine());
		} // end of for
		sumAvg();
	}// end of inputSubjectScore()

	// 총점 평균 구하는 메소드
	public void sumAvg() {
		for (int i = 0; i < score.length; i++) {
			sum += score[i];
		} // end of for
		avg = (double) sum / score.length;
	}// end of sumAvg()

	// 출력 메소드
	public void showInfo() {
		System.out.println();
		System.out.printf("***%s님 수강과목과 점수 확인***\n", name);
		System.out.println("수강과목\t점수");
		for (int i = 0; i < score.length; i++) {
			System.out.printf("%s\t%d\n", subject[i], score[i]);
		} // end of for
		System.out.println();
		System.out.printf("***%s님의 성적 확인\n", name);
		System.out.println("학번 : " + studentNum);
		System.out.println("총점 : " + sum);
		System.out.printf("평균 : %.2f", avg);
		System.out.println();
	}// end of showInfo()
}// end of class
