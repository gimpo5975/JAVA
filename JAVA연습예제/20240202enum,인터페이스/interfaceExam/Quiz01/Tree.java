package interfaceExam.Quiz01;

public class Tree implements Countable {

	// #필드
	String name;
	int num;

	// #생성자
	public Tree(String name, int num) {
		super();
		this.name = name;
		this.num = num;
	}// end of constructor

	public void ripen() {
		System.out.println(num + "그루의 " + name + "나무 열매가 잘 익었다.");
	}// end of fly

	@Override
	public void count() {
		System.out.println(num + "그루 " + name + "나무가 있다.");
	}// end of count

}// end of class
