package exam.bookexam;

public class Tree implements Countable {

	// #필드
	String name;

	// #생성자
	public Tree(String name) {
		super();
		this.name = name;
	}// end of constructor

	// #메소드
	void ripen() {
		System.out.println(name+"에 열매가 잘 익었다");
	}// end of ripen()

	@Override
	public void count() {
		System.out.println(name+"가 5그루 있다.");

	}

}// end of class
