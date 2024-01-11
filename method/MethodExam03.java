package method;

import java.util.Scanner;

public class MethodExam03 {

	public static void main(String[] args) {
		printer();
	}// end of main

	public static void printer() {
		Scanner sc = new Scanner(System.in);

		int totalPaper = 1000, paper = 0;
		System.out.println("몇장을 인쇄 할까요?");

		paper = sc.nextInt();
		totalPaper -= paper;
		System.out.println(paper + "장을 인쇄합니다, " + totalPaper + "장 남았습니다.");
	}// end of printer

}// end of class
