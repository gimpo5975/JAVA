package exam1_interface;

public abstract class Line implements Shape {
	// 선의 종류 : 수평선, 수직선이 있음
	// 하나로 처리하기보다는 둘로 처리하는 것이 좋음
	// 수평선과 수직선이 그리기 다르고 기능이 다르다면 분할하는 것이 좋음

	// Line => 부모 VerticalLine/HorizonLIne => 자식
	// VerticalLine/HorizonLIne의 공통점 부모인 라인에 잡기
	// 공통점은 선의 길이
	// 부모의 추상메소드를 자식이 완성하지 않으면 자식도 추상 클래스가 된다. 손자가 구현해야 함.

	// #필드
	private String name;
	private int length;

	// #생성자
	public Line(String name, int length) {// name, length는 자식들로부터 넘겨 받음
		this.name = name;
		if (length > 0) {
			this.length = length;// 입력받은 length가 0보다 크면 this.length = length;
		} else {
			System.out.println("길이는 0보다 큰 값을 입력해야 합니다");
			this.length = 0;
		} // end of if
	}// end of constructor

	// #getter
	// 선의 길이를 외부에서 부르려면
	public int getLength() {
		return length;
	}

	public String getName() {
		return name;
	}
}// end of class
