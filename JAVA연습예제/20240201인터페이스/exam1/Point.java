package exam1;

public class Point extends Shape {

	public Point(String name) {
		super(name);// 부모를 자식이 오나성시켜 주기 위해
					// Point 객체를 생성할 때 (new Point("점"));
					// 먼저 Shape 클래슬르 초기화 시키고 난 후 자신인 Point를 초기화 시킴
	}// end of constructor

	@Override
	public void draw() {
		// 점만 하나 그리기
		System.out.println(".");
		System.out.println();

	}//// end of draw()

}// end of class
