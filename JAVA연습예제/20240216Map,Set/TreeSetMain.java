package setexam;

import java.util.TreeSet;

public class TreeSetMain {

	// entry point
	public static void main(String[] args) {

		// 객체 생성
		TreeSet<Person> personTree = new TreeSet<>();

		// 값 넣기
		personTree.add(new Person("김원중", 28));
		personTree.add(new Person("원중짱", 27));
		personTree.add(new Person("원중킹", 21));
		personTree.add(new Person("크하하", 30));
		personTree.add(new Person("중중중", 28));
		personTree.add(new Person("김원중", 23));

		for (Person ps : personTree) {
			System.out.println(ps);
		} // end of for-each

	}// end of main

}// end of class
