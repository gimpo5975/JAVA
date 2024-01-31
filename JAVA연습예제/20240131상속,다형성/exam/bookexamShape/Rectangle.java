package exam.bookexamShape;

import java.util.Scanner;

public class Rectangle implements Shape {
	Scanner sc = new Scanner(System.in);

	@Override
	public void draw() {
		System.out.println("원하시는 정사각형의 크기를 입력해주세요");
		int num = sc.nextInt();
		String[][] ractangle = new String[num][num];

		for (int i = 0; i < ractangle.length; i++) {
			for (int k = 0; k < ractangle[i].length; k++) {
				ractangle[i][k] = "*";
				System.out.print(ractangle[i][k]);
			}
			System.out.println();
		}
	}

	@Override
	public void showInfo() {
		System.out.println("정사각형을 그렸습니다.");
	}

	@Override
	public void printDraw() {
		draw();
		showInfo();
	}

}// end of class
