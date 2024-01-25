package classExam;
//몸무게의 변화를 구하는 프로그램 작성

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
// 
//
//5) 메인 메소드 :  몸무게 변화를 입력해주세요
//        변화된 몸무게 >>
//      weightInfo(변화된 몸무게 넘겨주기)메소드 호출
//
//
//
// < 출력 형태 >
//6) 증가 감소에 대한 정보 호출 했을 때 :
//   a) gainWeight(double gainweight, double weight) 호출시
//   . 몸무게 증가전 몸무게  :  ~~ kg
//   . 몸무게가 ~~만큼 증가하여 현재 ~~kg 입니다.
//   
//   b)reduceWeight(double reduceWeight, double weight) : 호출시
//
//   . 몸무게 감소전 몸무게  :  ~~ kg
//   . 몸무게가 ~~만큼 감소하여 현재 ~~kg 입니다.
//
//7) 전제 정보를 출력하려고 할 때  - weightInfo(double weight)

public class Weight_refactor {

	// #1. 필드 => 이름, 몸무게, 키 private
	private String name;// 이름, 인스턴스 변수
	private double height;// 키, 인스턴스 변수
	private double weight;// 몸무게, 인스턴스 변수

	// #2. 생성자 => Weight_refactor(이름, 몸무게, 키)
	public Weight_refactor() {
	}

	public Weight_refactor(String name, double height, double weight) {
		this.name = name;// this : 자기 자신 객체, this.name => 필드, name => 지역변수(매개변수)
		this.height = height;
		this.weight = weight;
	}// end of Weight_refactor()

	// #.3 메소드 => getter/setter => private으로 선언된 필드를 외부에서 사용할 수 있도록

	// #4. 메소드 몸무게 변화를 체크 => weightInfo(변화된 몸무게를 받아서 처리)
	public void weightInfo(double weight) {
		if (weight == 0) {
			System.out.println("몸무게 변화 없습니다.");

		} else if (weight > 0) {
			// 몸무게가 증가했을 때
			gainWeight(weight);
		} else {
			// 몸무게 감소했을 때
			reduceWeight(weight);
		} // end of if
	}// end of weightInfo()

	// #5. 메소드 몸무게 증감 정보를 출력 => showPrintInfo()
	public void showMemberInfo() {
		System.out.println("***" + name + "님의 건강정보***");
		System.err.println("키 : " + height);
		System.out.printf("몸무게 : %.2fkg\n", weight);
	}// end of showPrintInfo()

	public void gainWeight(double weight) {
		System.out.printf("몸무게 증가 전 몸무게 : %.2fkg 입니다.", this.weight);
		this.weight += weight;
		System.out.printf("%.2f 만큼 증가해서 현재 %.2fkg 입니다", weight, this.weight);
	}// end of gainWeight()

	public void reduceWeight(double weight) {
		System.out.printf("몸무게 감소 전 몸무게 : %.2fkg 입니다.", this.weight);
		this.weight += weight;
		System.out.printf("%.2f 만큼 감소해서 현재 %.2fkg 입니다", weight, this.weight);
	}// end of reduceWeight()

}// end of class
