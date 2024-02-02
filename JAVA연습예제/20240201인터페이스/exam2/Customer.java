package exam2;

public class Customer {

	// #필드
	private String cid;// 고객 아이디
	private String name;// 고객명
	private String grade;// 등급
	int point;// 보너스 포인트
	int paymentAmount;// 결제 금액
	double ratio;// 적립률
	double discountRate;// 할인율

	// #생성자
	public Customer(String cid, String name, String grade, double ratio, double discountRate) {
		super();
		this.cid = cid;
		this.name = name;
		this.grade = grade;
		this.ratio = ratio;
		this.discountRate = discountRate;
	}// end of constructor

	// #포인트 계산 메소드
	private void calcPoint(int price) {
		point += (int) (price * ratio);
		System.out.println(name + "님의 현재 포인트 누적액은 " + point + "입니다,");
	}// end of calcPoint(int price)

	// #결제 금액 계산 메소드
	private void calcPrice(int price) {
		paymentAmount = price - (int) (price * discountRate);
	}// end of calcPrice(int price)

	// #고객정보 보여주는 메소드
	public void showInfo(int price) {
		calcPoint(price);
		calcPrice(price);

		System.out.println(name + "님의 등급은 " + grade + "입니다.");
		System.out.println(name + "님의 결제금액은 " + paymentAmount + "입니다.");
		System.out.println();
	}// end of showInfo(int price)

}// end of class
