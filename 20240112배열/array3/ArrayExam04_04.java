package array3;

import java.util.Scanner;

public class ArrayExam04_04 {

	public static void main(String[] args) {
		// Scanner 객체 생성
		Scanner sc = new Scanner(System.in);
		// 변수 초기화
		int num = 0, students = 0, sum = 0;
		int[] scores = null;
		double avg = 0.0;
		boolean run = true;
		
		while (run) {
			System.out.println("****************************************************************");
			System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("****************************************************************");
			System.out.println("번호선택 >>");
			num = Integer.parseInt(sc.nextLine());

			switch (num) {
			case 1:
				System.out.println("학생 수 입력 >>");
				students = Integer.parseInt(sc.nextLine());
				break;
			case 2:
				scores = new int[students];
				for (int i = 0; i < scores.length; i++) {
					System.out.println((i + 1) + "번째 학생 점수 입력 >>");
					scores[i] = Integer.parseInt(sc.nextLine());
				} // end of for
				break;
			case 3:
				for (int i = 0; i < scores.length; i++) {
					System.out.println((i + 1) + "번 학생 점수 = " + scores[i]);
				} // end of for
				break;
			case 4:
				int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
				for (int i = 0; i < scores.length; i++) {
					if (max < scores[i]) {
						max = scores[i];
					} // end of if
					if (min > scores[i]) {
						min = scores[i];
					} // end of if
					sum += scores[i];
				} // end of for
				avg = (double)sum / scores.length;
				System.out.printf("최고점수 : %d\n최저 점수 : %d\n평균 : %.2f\n",max, min, avg);
				break;
			case 5:
				System.out.printf("종료 선택하셨습니다\n종료합니다.");
				run = false;
			}// end of switch

		} // end of while

	}// end of main

}// end of class
