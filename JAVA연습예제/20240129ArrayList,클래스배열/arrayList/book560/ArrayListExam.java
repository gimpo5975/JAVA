package exam.arrayList.book560;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExam {

	public static void main(String[] args) {

		// List는 인터페이스라 객체 생성 불가
		// ArrayList가 List를 구현하기 때문에 가능.
		List<String> list = new ArrayList<String>();

		list.add("java");
		list.add("홍길동");
		list.add("김자바");

		for (String st : list) {
			System.out.println(st);
		} // end of for

		System.out.println("크기 : " + list.size());
		System.out.println("********************");

		System.out.println("**2번인덱스에 이강산 추가 나머지는 뒤로 밀려남**");
		// 2번인덱스에 이강산 추가 나머지는 뒤로 밀려남
		list.add(2, "이강산");
		for (String st : list) {
			System.out.println(st);
		} // end of for

		System.out.println("크기 : " + list.size());
		System.out.println("********************");

		System.out.println("**list에서 java 삭제**");
		// list에서 java 삭제
		list.remove(0);
		for (String st : list) {
			System.out.println(st);
		} // end of for

		System.out.println("크기 : " + list.size());

		list.clear();
		for (String st : list) {
			System.out.println(st);
		} // end of for

		System.out.println("********************");
		System.out.println("**list 완전삭제**");
		// list 완전삭제
		System.out.println("크기 : " + list.size());
	}// end of main

}// end of class
