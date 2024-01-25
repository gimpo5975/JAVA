package stataicmember.exam1;

public class Pen {
	// #1. 필드
	private String color;
	private int count;
	private int allCount;

	// #2. 생성자
	public Pen(String color) {
		this.color = color;

		// 소문자 - color.equals("red")
		// 대소문자 구분하지 않고 비교 - color.equalsIgnoreCase("red")
		if (color.equalsIgnoreCase("red")) {
			count++;// red pen의 개수를 누적, red pen 객체 개수
		}

		allCount++;// 전체 pen의 개수 누적, 전체 객체 생성 개수

	}// end of pen()

	// #3. 메소드
	public String getColor() {// private으로 설정된 필드 외부에서 읽어서 이용할 수 있도록
								// private 필드 호출해서 리턴
		return color;
	}// end of getColor()

	// 개별 pen 개수
	public int getCount() {
		return count;
	}// end of getCount;

	// 전체 pen 개수
	public int getAllCount() {
		return allCount;
	}// end of getAllcount()

}// end of class
