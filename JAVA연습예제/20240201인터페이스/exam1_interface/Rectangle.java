package exam1_interface;

public class Rectangle implements Shape {

	// #필드
	private String name;
	private int width;
	private int height;

	// #생성자
	public Rectangle(String name, int width, int height) {
		this.name = name;
		setWidth(width);
		setHeight(height);
	}// end of constructor

	// # getter / setter
	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	// 유효성 검사
	public void setWidth(int width) {
		if (width > 0) {
			this.width = width;// 입력받은 width가 0보다 크면 this.width = width;
		} else {
			System.out.println("가로의 길이는 0보다 큰 값을 입력해야 합니다");
			this.width = 0;
		} // end of if
	}// end of setWidth(int width)

	public void setHeight(int height) {
		if (height > 0) {
			this.height = height;// 입력받은 height가 0보다 크면 this.height = height;
		} else {
			System.out.println("세로의 길이는 0보다 큰 값을 입력해야 합니다");
			this.height = 0;

		} // end of if
	}// end of setHeight(int height)

	// #메소드
	@Override
	public void draw() {
		System.out.println("가로의 길이 : " + width);
		System.out.println("세로의 길이 : " + height);
		for (int i = 0; i < height; i++) {
			for (int k = 0; k < width; k++) {
				System.out.print("🍔");
			} // end of for in
			System.out.println();
		} // end of for
	}// end of draw()

	@Override
	public void showInfo() {
		System.out.println(name + "을 그립니다");

	}

	@Override
	public void printDraw() {
		showInfo();
		draw();

	}

}// end of class
