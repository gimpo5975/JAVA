package fourthReport.cat;

public class CatMain {

	// entry point
	public static void main(String[] args) {

		//cat 객체 생성
		Cat cat = new Cat();

		//cat 객체의 메소드 호출~
		cat.catInfo("야옹이", "고양이", 3);
		cat.run("야옹이");

	}// end of main

}// end of class
