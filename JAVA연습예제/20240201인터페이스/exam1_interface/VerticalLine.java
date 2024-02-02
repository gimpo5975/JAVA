package exam1_interface;

public class VerticalLine extends Line {

	// #생성자
	public VerticalLine(String name, int length) {
		super(name, length);
	}// end of constructor

	// 메소드
	@Override
	public void draw() {
		System.out.println("수직선의 길이 : " + getLength());

		// 선 그리기
		for (int i = 0; i < getLength(); i++) {
			System.out.println("|");
		} // end of for
		System.out.println();
	}// end of draw()

	@Override
	public void showInfo() {
		System.out.println(getName() + "을 그립니다");

	}

	@Override
	public void printDraw() {
		showInfo();
		draw();

	}

}// end of class
