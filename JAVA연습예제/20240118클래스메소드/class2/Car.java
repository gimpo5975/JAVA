package class2;

public class Car {
	// 필드 => 객체 안에 생성 된다.
	String company = "원중모터스";
	String model = "원중570s";
	String color = "검흰";
	int maxSpeed = 500;
	int speed;//0 default값으로 초기화 된다. why? 변수가 아니라 객체 안에 저장되는 필드이므로 값이 없으면 default값으로 초기화된다.
			  //하지만 편의를 위해 인스턴스 변수, 멤버변수라고 부른다.
			  // 클래스안에 들어간거는 필드, 생성자,메소드 안에 들어간거는 지역변수
	
	// 생성자
	// 생략하면 컴파일러가 컴파일시 자동으로 생성, 생성자의 이름은 클래스와 같아야 한다.
	public Car() {// 기본 생성자, 작성하지 않아도 컴파일시 자동으로 생성된다.

	}// end of Car()

	// 메소드
	public void show() {
		System.out.println("자동차 제조사명 : " + company);
		if (speed > maxSpeed) {
			System.out.println(model + "의 속도가 최대치를 초과했습니다.");
			System.out.println("속도를 다시 설정해 주세요.");
		} // end of if
		System.out.println(model + "이(가) 달립니다. 현재속도 : " + speed);
	}// end of show()
}// end of class
