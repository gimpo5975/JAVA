package practice;

public class Book extends Item {

	// #1. 필드
	String author;
	String publisher;

	// #2. 생성자 => 부모 생성자를 호출, 부모를 초기화시킬 필드값과 자신을 초기화시킬 필드값을 매개값으로 받을 수 있도록 설정
	public Book(String name, int price, String author, String publisher) {
		super(name, price);
		this.author = author;
		this.publisher = publisher;
	}// end of Book()

	// #3. 메소드
	@Override // 부모 메소드 재정의
	// 부모의 printInfo()메소드를 호출하여 자식의 출력내용을 추가
	public void printInfo() {
		System.out.println("****************************");
		System.out.println("*책*");
		super.printInfo();
		System.out.println("저자 : " + author);
		System.out.println("출판사 : " + publisher);
	}// end of printInfo()
}// end of class
