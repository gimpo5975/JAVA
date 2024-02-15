package listexam01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExam02 {
	public static void main(String[] args) {

		List<Integer> arrayList = new ArrayList<Integer>();

		arrayList.add(3);
		arrayList.add(30);

		for (int arr : arrayList) {
			System.out.println(arr);
		}

		List<Student> std = new ArrayList<Student>();

		std.add(new Student("김금자", 60));
		std.add(new Student("김은자", 50));
		std.add(new Student("김동자", 40));

		for (int i = 0; i < std.size(); i++) {
			std.get(i).showInfo();
			System.out.println();
		}

		for (Student st : std) {
			st.showInfo();
			System.out.println();
		}

		Iterator<Student> stIt = std.iterator();
		while (stIt.hasNext()) {
			stIt.next().showInfo();
		}

	}// end of main

}// end of class
