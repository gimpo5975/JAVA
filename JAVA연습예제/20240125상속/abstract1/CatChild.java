package abstract1;

public class CatChild extends Cat {

	// #1. 생성자
	// public CatChild() {
	// super(this.name)
	// }
	// 자식은 부모먼저 객체를 만들고 자신의 객체를만든다 그런데 부모한테 내 객체의 name을 준것이라 안된다

	public CatChild(String name) {
		super(name);// String타입의 매개변수를 하나 가진 부모생성자 호출
	}// end of catChild()

	// #2. 메소드
	public void cry() {
		System.out.println("냐아아아오오오오오오오옹");
	}// end of cry()

}// end of class
