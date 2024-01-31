package exam.bookexamShape;

import java.util.Scanner;

public class Point implements Shape {
	Scanner sc = new Scanner(System.in);

	// #메소드
	@Override
	public void draw() {
		System.out.print("원하시는 점의 개수를 입력해 주세요 >> ");
		int num = sc.nextInt();

		for (int i = 0; i <= num; i++) {
			System.out.print(".");
		} // end of for
		System.out.println();
	}

	@Override
	public void showInfo() {
		System.out.println("점을 그렸습니다.");

	}

	@Override
	public void printDraw() {
		draw();
		showInfo();
	}

}// end of class
