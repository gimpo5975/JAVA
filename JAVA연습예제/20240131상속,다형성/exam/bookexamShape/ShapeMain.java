package exam.bookexamShape;

import java.util.Scanner;

public class ShapeMain {
	static Scanner sc = new Scanner(System.in);
	static Shape[] shape = { new Point(), new Line(), new Rectangle() };
	static boolean run = true;

	public static void main(String[] args) {

		selectShape();

	}// end of main

	private static void selectShape() {
		while (run) {
			System.out.print("원하는 작업을 선택 하세요\n");
			System.out.println("[1]점 | [2]선 | [3]사각형 | [4] 종료");
			int shapeNum = sc.nextInt();

			if (shapeNum == 1) {
				shape[0].printDraw();
			} else if (shapeNum == 2) {
				shape[1].printDraw();
			} else if (shapeNum == 3) {
				shape[2].printDraw();
			} else if (shapeNum == 4) {
				System.out.println("종료합니당.");
				run = false;
				return;
			} // end of if

		} // end of while

	}// end of selectShape()
}// end of class
