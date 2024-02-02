package exam2;

public class Vip extends Customer {
	// 10% 할인, 포인트 0.5%
	final static double RATIO = 0.05;
	final static double DISCOUNT_RATE = 0.1;

	// 생성자
	public Vip(String cid, String name, String grade) {
		super(cid, name, grade, RATIO, DISCOUNT_RATE);
	}// end of constructor

}// end of class
