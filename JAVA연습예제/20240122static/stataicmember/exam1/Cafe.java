package stataicmember.exam1;

public class Cafe {
	/// #1. 필드
	// 인스턴스 필드
	private String beverage;

	// static 필드
	// static int count;
	// static int allCount;

	// static필드, private이 붙어 있어서 이클래스 내에서만 호출, 외부에서는 사용 불가능
	private static int count;
	private static int allCount;

	// #2. 생성자
	public Cafe(String beverage) {
		// 인스턴스 필드는 this 붙임
		// 인스턴스 필드 = 매개변수
		this.beverage = beverage;

		// static(정적필드)
		// 전체 음료개수 누적
		allCount++;

		// if의 조건식이 길경우 변수를 활용해 간소화
		boolean eq = beverage.equals("커피") || beverage.equalsIgnoreCase("coffee");

		// 커피 주문개수 누적
		if (eq) {
			count++;
		} // end of if
	}// end of Cafe()
	
	//#3. 메소드
	public String getBeverage() {
		return beverage;
	}

	public static int getCount() {
		return count;
	}

	public static int getAllCount() {
		return allCount;
	}

}// end of class
