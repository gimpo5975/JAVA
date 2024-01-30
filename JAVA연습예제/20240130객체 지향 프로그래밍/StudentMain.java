package exam;

import java.util.Scanner;

public class StudentMain {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		String grade = "";
		int studentNum = 0;
		int num = 0;

		System.out.print("학생 수를 입력하세요 >> ");
		studentNum = Integer.parseInt(sc.nextLine());

		Student[] students = new Student[studentNum];

		for (int i = 0; i < students.length; i++) {
			Student student = new Student();

			System.out.println("이름과 학과 순으로 입력");
			student.name = sc.nextLine();
			student.subject = sc.nextLine();

			System.out.println("DB, SW, PG 성적 차례로 입력");
			student.DB = Integer.parseInt(sc.nextLine());
			student.SW = Integer.parseInt(sc.nextLine());
			student.PG = Integer.parseInt(sc.nextLine());

			students[i] = student;

			student.sum = students[i].DB + students[i].SW + students[i].PG;
			student.avg = (double) student.sum / students.length;
			grade = "";

			if (student.avg >= 90) {
				grade = "A";
			} else if (80 <= student.avg && student.avg < 90) {
				grade = "B";
			} else if (70 <= student.avg && student.avg < 80) {
				grade = "C";
			} else if (60 <= student.avg && student.avg < 70) {
				grade = "D";
			} else {
				grade = "F";
			} // end of if

		} // end of for

		System.out.println(
				"=================================================================================================");
		System.out.println("번호\t이름\t학과\tDB\tSW\tPG\t합계\t평균\t학점\t석차");
		System.out.println(
				"=================================================================================================");
		for (int i = 0; i < students.length; i++) {
			num = i + 1;
			System.out.printf("%d\t%s\t%s\t%d\t%d\t%d\t%d\t%.2f\t%s\n", num, students[i].name, students[i].subject,
					students[i].DB, students[i].SW, students[i].PG, students[i].sum, students[i].avg, grade);
		} // end of for

	}// end of main

}// end of class
