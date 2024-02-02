package exam1_interface;

public interface Shape {

	// #어떤 도형을 그리는지 안내하는 문구, 인스턴스 메소드
	void showInfo();

	// 자식에서는 마음대로 불러 사용할 수 있되, 재정의(오버라이딩 불가)를 못하게 하기
//	public final void showInfo() {
//		System.out.println();
//		System.out.println(name + "을 그립니다");
//	}// end of showInfo

	// 그리기 작업 => 각 도형마다 알아서 그리도록 설정, 추상메소드
	public abstract void draw();// {}부분(body)가 없는 것을 추상메소드 즉, 미완성 메소드라고 한다.

	void printDraw();

}// end of abstract class
