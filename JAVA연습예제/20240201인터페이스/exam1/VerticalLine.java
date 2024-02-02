package exam1;

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

}// end of class
