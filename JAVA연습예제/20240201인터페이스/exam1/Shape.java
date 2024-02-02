package exam1;

public abstract class Shape {

	private String name; // 도형의 종류

	public Shape(String name) {
		super();
		this.name = name;
	}


	// #어떤 도형을 그리는지 안내하는 문구, 인스턴스 메소드
	private void showInfo() {// 자식(외부)에서 부를 수 없음, 숨겨져 있기 때문
		System.out.println();
		System.out.println(name + "을 그립니다");
	}// end of showInfo

	// 자식에서는 마음대로 불러 사용할 수 있되, 재정의(오버라이딩 불가)를 못하게 하기
//	public final void showInfo() {
//		System.out.println();
//		System.out.println(name + "을 그립니다");
//	}// end of showInfo

	// 그리기 작업 => 각 도형마다 알아서 그리도록 설정, 추상메소드
	public abstract void draw();// {}부분(body)가 없는 것을 추상메소드 즉, 미완성 메소드라고 한다.

	public void printDraw() {
		showInfo();// private이라 같은 클래스에서는 자유롭게 호출하지만 외부에서는 호출 못함. 자신의 클래스인 이곳에서 호출
		draw(); // 재정의(오버라이딩)한 자식의 draw() 메소드를 호출
	}// end of printDraw();

}// end of abstract class
