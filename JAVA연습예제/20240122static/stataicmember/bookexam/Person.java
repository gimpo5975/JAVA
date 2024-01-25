package stataicmember.bookexam;

public class Person {
	// #1. 인스턴스 필드
	final String nation = "Korea"; // final 필드
	// final static String NATION = "Korea";// final 상수
	final static int test = 10;//클래스 영역에 생성
	final String ssn;// final 필드
	// final 필드는 선언만하면 생성자가 초기화를 안시켜주나?
	String name;

	// #2. 생성자
	public Person(String ssn, String name) {
		super();
		this.ssn = ssn;
		this.name = name;
	}// end of constructor

	// nation은 이미 선언과 동시에 초기화가 되어 있어서 이것을 변경할 수 없음
//	public Person(String nation,String ssn, String name) {
//		super();
//		this.nation = nation;
//		this.ssn = ssn;
//		this.name = name;
//	}// end of constructor

}// end of class
