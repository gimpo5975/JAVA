package exam.arrayList.book560;

import java.util.ArrayList;
import java.util.List;

public class BoardExam {

	public static void main(String[] args) {

		// Board타입 ArrayList 생성
		List<Board> list = new ArrayList<Board>();

		list.add(new Board("국어", "비문학", "김원중"));
		list.add(new Board("수학", "적분", "김이중"));
		list.add(new Board("영어", "문법", "김삼중"));

		System.out.println("기본 for문 이용");
		for (int i = 0; i < list.size(); i++) {
			Board bd = list.get(i);
			System.out.println(bd);
		} // end of for

		System.out.println("향상된 for문 이용");
		// 향상된 포문
		for (Board bd : list) {
			// print나 println메소드는 매개값으로 객체나 배열 ,참조변수를 넣으면 toString을 호출한다.
			System.out.println(bd);
		} // end of for-each

	}// end of main

}// end of class
