package interfaceExam.Quiz02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentMain {
	private static Scanner sc = new Scanner(System.in);
	private static List<Calculate> list = new ArrayList<Calculate>();

	public static void main(String[] args) {
		// 학생수 입력
		System.out.print("학생 수를 입력하세요 : ");
		int studentNum = Integer.parseInt(sc.nextLine());

		int count = 0;
		while (count < studentNum) {
			count++;

			System.out.println("이름과 학과를 순서대로 입력");

			String name = sc.nextLine();
			String department = sc.nextLine();

			System.out.println("성적 입력 DB,SW,PG 순으로");
			int DB = Integer.parseInt(sc.nextLine());
			int SW = Integer.parseInt(sc.nextLine());
			int PG = Integer.parseInt(sc.nextLine());

			Calculate student = new Subject(name, department, DB, SW, PG);
			list.add(student);

			for (Calculate cc : list) {
				cc.sum();
				cc.avg();
				cc.grade();
			} // end of for-each

			if (student instanceof Subject subject) {
				subject.setNum(count);
			} // end of if

		} // end of while

		for (int i = 0; i < list.size(); i++) {
			// 부모타입인 list를 자식타입인 Subject 타입으로 강제타입 변화해서 자식타입인 Subject 클래스의 showInfo() 호출
			if (list.get(i) instanceof Subject subject) {
				subject.showInfo();
				// 전체 학생 성적 출력
				for (int k = 0; k < list.size(); k++) {
					System.out.printf("%d\t %s\t %s\t %d\t %d\t %d\t %d\t %.2f\t %s\t %d", subject.getNum(),
							subject.getName(), subject.getDepartment(), subject.getDB(), subject.getSW(),
							subject.getPG(), subject.getSum(), subject.getAvg(), subject.getGrade(), subject.getRank());
				} // end of for in
				System.out.println();
			} else {
				System.out.println("타입 변환 불가");
			} // end of if
		} // end of for

		System.out.print("\n개인성적을 보고 싶은 학생의 번호 입력 : ");
		int personalScore = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < list.size(); i++) {
			
			if (personalScore == ) {
				if (list.get(personalScore) instanceof Subject subject) {
					System.out.println(subject.getName() + "님의 개인 성적표");
					subject.showInfo();
					System.out.printf("%d\t %s\t %s\t %d\t %d\t %d\t %d\t %.2f\t %s\t %d", subject.getNum(),
							subject.getName(), subject.getDepartment(), subject.getDB(), subject.getSW(),
							subject.getPG(), subject.getSum(), subject.getAvg(), subject.getGrade(), subject.getRank());
				} else {
					System.out.println("타입 변환 불가");
				} // end of if in
				break;
			} else {
				System.out.println("해당번호의 학생은 존재하지 않음");
			} // end of if

		} // end of for

	}// end of main

}// end of class
