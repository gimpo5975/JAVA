package interfaceExam;

public interface InterfaceAnimal {

	// #1. 상수
	public static final int A = 3;// static 객체 생성없이 클래스명.필드이름으로 바로 사용가능
									// final 값을 변경할 수 없다.
	String name = "나야나";// 생략하면 컴파일러가 public static final를 자동으로 붙임

	public abstract void cry();// 추상 메소드

	void run();// 권장, 생략하면 컴파일러가 public abstract를 자동으로 붙임

	//public void test(){}: 인터페이스 안에는 완성 메소드 올 수 없음
	
}// end of interface
