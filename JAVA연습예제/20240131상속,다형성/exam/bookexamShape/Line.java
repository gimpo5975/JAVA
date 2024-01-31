package exam.bookexamShape;

import java.util.Scanner;

public class Line implements Shape {
	Scanner sc = new Scanner(System.in);

	@Override
	public void draw() {
		System.out.println("원하시는 선의 스타일을 선택해 주세요.");
		System.out.println("[1] 수평선 | [2] 수직선");
		int num = sc.nextInt();

		if (num == 1) {
			HorizonLine horizonLine = new HorizonLine();
			horizonLine.draw();
		} else if (num == 2) {
			VerticalLine verticalline = new VerticalLine();
			verticalline.draw();
		} // end of if
	}// end of draw()

	@Override
	public void showInfo() {
		System.out.println("선을 그렸습니다.");

	}

	@Override
	public void printDraw() {
		draw();
		showInfo();
	}

}
