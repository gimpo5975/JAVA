package collectionexam;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExam01 {

	// entry point
	public static void main(String[] args) {

		// create instance for save 'Board' instance
		// create ArrayList collection
		List<Board> list = new ArrayList<Board>();

		// input value into list
		list.add(new Board("안녕", "나는 자바얌", "Java"));
		list.add(new Board("안녕2", "나는 파이썬이얌", "Python"));
		list.add(new Board("안녕3", "나는 MySQL이얌", "MySQL"));
		list.add(new Board("안녕4", "나는 Oracle이얌", "Oracle"));

		showPrint(list);

		list.add(new Board("안녕5", "나는 C얌", "C"));
		showPrint(list);

	}// end of main

	public static void showPrint(List<Board> list) {
		System.out.println("총 객체 수 : " + list.size());
		System.out.println(list);
	}// end of showPrint

}// end of class
