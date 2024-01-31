package thirdReport;

public class Book extends Item {

	// #필드
	private String author;
	private String publisher;

	// #생성자
	public Book(String name, int price, String author, String publisher) {
		super(name, price);
		this.author = author;
		this.publisher = publisher;
	}

	// #메소드
	@Override
	public void print() {
		System.out.println("이름 " + getName());
		System.out.println("가격 " + getPrice());
		System.out.println("저자 " + author);
		System.out.println("출판사 " + publisher);
	}// end of print()
}// end of class
