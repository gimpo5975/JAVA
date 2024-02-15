package listexam01;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExam01 {

	public static void main(String[] args) {

		List<String> strArray = new ArrayList<String>();

		// 자료를 추가 add(데이터)
		strArray.add("Hi");
		strArray.add("Java");
		strArray.add("MySQL");

		// 저장된 자료의 개수를 확인
		int size = strArray.size();
		System.out.println("자료의 크기 : " + size);

		// 자료의 내용을 출력, for-each
		for (String arr : strArray) {
			System.out.println(arr);
		}

		strArray.add(1, "Oracle");

		int size2 = strArray.size();
		System.out.println("add한 자료의 크기 : " + size2);

		for (String arr2 : strArray) {
			System.out.println(arr2);
		}

		strArray.remove(1);

		int size3 = strArray.size();
		System.out.println("remove한 자료의 크기 : " + size3);

		for (String arr3 : strArray) {
			System.out.println(arr3);
		}

		strArray.clear();

		int size4 = strArray.size();
		System.out.println("clear한 자료의 크기 : " + size4);

		for (String arr4 : strArray) {
			System.out.println(arr4);
		}

	}// end of main

}// end of class
