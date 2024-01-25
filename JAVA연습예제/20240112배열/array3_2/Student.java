package class1;

//설계도
public class Student {
	// #1. 필드(=멤버변수) : 속성

	String name;
	int age;
	int score;

	// #2. 생성자 : 객체를 초기화, 기본생성자는 생략가능=> 생략하면 컴파일시 JVM이 만들어 사용
	public Student() {// 생성자의 이름은 클래스명과 동일해야한다
		// 초기화 필요한 문장
	}

	// #3. 메소드 : 동작방식, 기능처리, 처리역할
	public void gotoSchool() {
		System.out.println(name + "이(가) 학교에 간다.");
	}// end of gotoSchool()

}// end of class
