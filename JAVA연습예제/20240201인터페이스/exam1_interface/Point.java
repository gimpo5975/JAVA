package exam1_interface;

public class Point implements Shape {

	private String name;

	public Point(String name) {
		this.name = name;// 부모를 자식이 오나성시켜 주기 위해
		// Point 객체를 생성할 때 (new Point("점"));
		// 먼저 Shape 클래슬르 초기화 시키고 난 후 자신인 Point를 초기화 시킴
	}// end of constructor

	@Override
	public void draw() {
		// 점만 하나 그리기
		System.out.println(".");
		System.out.println();

	}//// end of draw()

	@Override
	public void showInfo() {
		System.out.println(name + "을 그립니다.");

	}

	@Override
	public void printDraw() {
		showInfo();
		draw();

	}

}// end of class
