package collectionexam;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExam {
	// entry point
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new LinkedList<String>();

		long startTime; // 시스템의 나노초 단위의 시간을 담을 변수
		long endTime;// 시스템의 나노초 단위의 시간을 담을 변수

		startTime = System.nanoTime();
		for (int i = 0; i < 1000; i++) {
			list1.add(0, String.valueOf(i));// String.valueOf(i) => 정수 i의 값을 문자열로 변환
		} // end of for
		endTime = System.nanoTime();
		System.out.println("ArrayList가 걸린 시간 : " + (endTime - startTime) + "ns");
		System.out.println();

		startTime = System.nanoTime();
		for (int i = 0; i < 1000; i++) {
			list2.add(0, String.valueOf(i));// String.valueOf(i) => 정수 i의 값을 문자열로 변환
		} // end of for
		endTime = System.nanoTime();
		System.out.println("LinkedList가 걸린 시간 : " + (endTime - startTime) + "ns");

	}// end of main
}// end of class
