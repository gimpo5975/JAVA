package class2;

public class Student2 {
	// 필드
	String name;
	int age;
	int score;

	// 생성자
	//생성자 오버로딩(이름이 같고 매개변수 타입이 다르거나, 타입이 같고 매개변수의 개수가 다른것
	public Student2() {// 기본생성자
						// 기본생성자는 다른 생성자가 하나라도 있으면
						// 컴파일러가 자동으로 만들지 않기 때문에
						// 기본생성자는 생략하면 안됨
	}

	public Student2(String name, int age, int score) {// 지역변수 즉, 중괄호를 벗어나면 메모리에서 삭제된다
														// 그래서 메소드의 매개변수가 필드와 이름이 같아도 상관없다.
		this.name = name;// this => 자신의 객체
							// this.name => 필드의 name
		this.age = age;// this => 자신의 객체
						// this.age => 필드의 age
		this.score = score;// this => 자신의 객체
							// this.score => 필드의 score

	}// end of Student()

	// 메소드

}// end of class
