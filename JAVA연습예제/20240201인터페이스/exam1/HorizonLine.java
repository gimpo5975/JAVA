package exam1;

public class HorizonLine extends Line {

	// #생성자
	public HorizonLine(String name, int length) {
		super(name, length);
	}// end of constructor

	// #메소드
	@Override
	public void draw() {
		System.out.println("수평선의 길이 : " + getLength());
		for (int i = 0; i < getLength(); i++) {
			System.out.print("—");
		} // end of for
		System.out.println();
	}// end of draw()

}// end of class
