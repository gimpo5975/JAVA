package honggongja.sec06;

public class Person {
	//final 필드 선언과 초기화
	
	//필드
	final String nation = "대한민국";
	final String ssn;
	String name;
	
	//생성자
	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}//end of Person
}//end of class
