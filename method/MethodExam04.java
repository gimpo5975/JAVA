package method;

import java.util.Scanner;

public class MethodExam04 {

	public static void main(String[] args) {
		printer(100);
	}// end of main

	public static void printer(int paperNum) {
		Scanner sc = new Scanner(System.in);

		int totalPaper = paperNum, paper = 0, choise = 0;
		boolean run = true;

		while (run) {
			System.out.printf("인쇄 타입을 선택해주세요\n[1]단면인쇄	[2]양면인쇄	[3]종료");
			choise = sc.nextInt();
			if (choise == 1) {
				System.out.println("단면인쇄를 몇장 하시겠습니까?");
				paper = sc.nextInt();
				if(paper>totalPaper) {
					System.out.println("허용된 용지를 초과하였습니다.");
					break;
				} else if(paper % 2 == 1) {
					totalPaper -= (paper / 2 + 1);
				} else {
					totalPaper -= paper / 2;
				}
				System.out.println(paper + "장을 인쇄합니다, " + totalPaper + "장 남았습니다.");
			} else if (choise == 2) {
				System.out.println("양면인쇄를 몇장 하시겠습니까?");
				paper = sc.nextInt();
				if(paper>totalPaper) {
					System.out.println("허용된 용지를 초과하였습니다.");
					break;
				}
				totalPaper -= paper;
				System.out.println(paper + "장을 인쇄합니다, " + totalPaper + "장 남았습니다.");
			} else if (choise == 3) {
				System.out.println("인쇄를 종료합니다");
				run = false;
			} else {
				System.out.println("잘못입력하셨습니다");
			} // end of if
			System.out.println();
		} // end of while
	}// end of printer

}// end of class
