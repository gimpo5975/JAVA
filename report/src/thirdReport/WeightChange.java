package thirdReport;
//2. 몸무게의 변화를 구하는 프로그램 작성

//< 요구사항 >
//1) 몸무게 변화 체크하기(WeightChange, WeightCangeMain) - 클래스
//2) 이름, 키, 몸무게를 제시하고("홍길동", 170.8, 70.3)  -> 생성자로 초기화
//3) 이름, 키, 몸무게 필드는 모두  private로 처리  -> 필드
//     4) 몸무게의 변화를 입력 받아서(증가/감소)  
//   . 변화된 몸무게 입력 받기 - 메소드의 매개값으로 전달
//   . 메소드 하나 만들어서 증가와 감소를 계산 (증감값을 넘겨 받기 2kg, -2kg, 0)
//   . 입력은 메인,  처리는 다른 클래스
//   . weightInfo(double weight)   
//   . showPrintInfo( )  - 전제 정보 보여주기
//   . 계산하는 메소드 - gainWeight(double weight) - 증가
//   .          reduceWeight(double weight) - 감소

public class WeightChange {

	// #1. 필드
	private String name;
	private double height;
	private double weight;

	// #2. 생성자
	public WeightChange(String name, double height, double weight) {
		super();
		this.name = name;
		this.height = height;
		this.weight = weight;
	}// end of constructor

	// #3. 메소드
	// 몸무게 변화출력 메소드
	public void weightInfo(double weight) {
		if (weight > 0) {
			gainWeight(weight);
		} else if (weight < 0) {
			reduceWeight(weight);
		} else {
			System.out.println("몸무게 변화가 없습니다.");
		} // end of if

		showPrintInfo();
	}// end of weightInfo()

	// 몸무게가 증가했을때 메소드
	public void gainWeight(double weight) {
		System.out.println("몸무게 증가전 몸무게 " + this.weight + "kg");
		this.weight += weight;
		System.out.println("몸무게가 " + weight + "만큼 증가하여 현재" + this.weight + "kg입니다");
	}// end of gainWeight()

	// 몸무게가 감소했을대 메소드
	public void reduceWeight(double weight) {
		System.out.println("몸무게 감소전 몸무게 " + this.weight + "kg");
		this.weight += weight;
		System.out.println("몸무게가 " + weight + "만큼 감소하여 현재" + this.weight + "kg입니다");
	}// end of reduceWeight()

	// 건강정보 출력 메소드
	public void showPrintInfo() {
		System.out.println("***" + name + "님의 건강 정보***");
		System.out.println("키 : " + height);
		System.out.println("몸무게 : " + this.weight);
	}// end of showPrintInfo()

}// end of class
