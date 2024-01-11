package honggongja.sec06;

public class PersonExample {

	public static void main(String[] args) {
		// final 필드 테스트

		Person pr = new Person("970206-1111111", "김원중");// 객체 생성

		System.out.println(pr.nation);
		System.out.println(pr.ssn);
		System.out.println(pr.name);
	}// end of main

}// end of class
