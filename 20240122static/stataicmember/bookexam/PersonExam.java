package stataicmember.bookexam;

public class PersonExam {

	public static void main(String[] args) {
		Person pr = new Person("1234", "김원중");

		System.out.println(pr.nation);
		System.out.println(pr.name);
		System.out.println(pr.ssn);

		// pr.nation = "usa"; //nation이 final이므로 초기화 시킨 후에는 값을 변경할 수 없음
		// pr.name = "kimwonjung"; //인스턴스 필드 => 언제든 변경 가능
		// pr.ssn = "5678"; //ssn이 final이므로 초기화 시킨 후에는 값을 변경할 수 없음

		Person pr2 = new Person("9101112", "wonjungkim");
		System.out.println(pr2.nation);
		System.out.println(pr2.name);
		System.out.println(pr2.ssn);

	}// end of main

}// end of class
