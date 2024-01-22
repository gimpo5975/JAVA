package stataicmember.bookexam;

public class SingltonExam {
	// #1. 생성자 => 생성자의 이름은 클래스명과 같다
	// 생성자의 제한 타입이 private이면 외부에서는 객체를 생성할 수 없음
	// 내부에서는 객체 생성
	private SingltonExam() { // 기본 생성자
	}

	// #2. 필드 => 정적필드(static필드)
	private static SingltonExam instance = new SingltonExam();
	// 접근제한자 static 참조타입      참조변수

	// #3. 메소드

	// 반환타입
	static SingltonExam getInstance() {
		return instance;// 반환값이 참조변수이므로 위에 반환타입에는 참조타입이 들어간다
						// SingltonExam 클래스를 가지고 만든 인스턴스를 반환
	}// end of getInstance()

}// end of class
